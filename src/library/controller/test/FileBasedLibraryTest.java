package library.controller.test;

import library.controller.FileBasedLibrary;
import library.model.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileBasedLibraryTest {
    private FileBasedLibrary library;
    private static final String PATH = "/home/shteyn/IdeaProjects/my-first-project/learning/src/library/controller/test/booksIsOk.txt";


    @BeforeEach
    void setUp () throws Exception {
        library = new FileBasedLibrary(PATH);
        library.load();

    }

    @Test
    void reassignFileName() throws IOException {
        library.reassignFileName("/home/shteyn/IdeaProjects/my-first-project/learning/src/library/controller/test/reFile.txt");
        library.load();
        List<Book> actualBook =  library.searchBooks(null, null, null, null);
        assertNotNull(actualBook);
        assertEquals(1, actualBook.size());
        assertEquals("Baba Clyacha", actualBook.get(0).getName());
    }

    @Test
    void load() throws IOException {
        Book expectedBook = new Book("testBook", 1998, "RacaMaka",
                12312342525L);

        library.addBook(expectedBook.getName(), expectedBook.getPublicationYear(),
                expectedBook.getAuthorName(), expectedBook.getIsbn());

        library.write();
        List<Book> actualBook =  library.searchBooks(null, null, null, null);
        assertTrue(actualBook.contains(expectedBook));
        FileBasedLibrary library2 = new FileBasedLibrary(PATH);
        library2.load();
        List<Book> actualBook2 =  library2.searchBooks(null, null, null, null);
        assertTrue(actualBook2.contains(expectedBook));
    }

    @Test
    void write() throws IOException {
        Book expectedBook = new Book("testBook", 1998, "RacaMaka",
                12312342525L);

        library.addBook(expectedBook.getName(), expectedBook.getPublicationYear(),
                expectedBook.getAuthorName(), expectedBook.getIsbn());

        library.write();
        List<Book> actualBook =  library.searchBooks(null, null, null, null);
        assertTrue(actualBook.contains(expectedBook));
        FileBasedLibrary library2 = new FileBasedLibrary(PATH);
        library2.load();
        List<Book> actualBook2 =  library2.searchBooks(null, null, null, null);
        assertTrue(actualBook2.contains(expectedBook));

    }

    @Test
    void addBook() throws IOException {
        // todo add Random
        Book expectedBook = new Book("testBook" , 1998, "RacaMaka",
                12312342525L);

        library.addBook(expectedBook.getName(), expectedBook.getPublicationYear(),
                expectedBook.getAuthorName(), expectedBook.getIsbn());

        List<Book> actualBook =  library.searchBooks(null, null, null, null);
        assertTrue(actualBook.contains(expectedBook));
    }

    @Test
    void removeBook() {
       long isbn = 1241242354245L;

        library.addBook("testBook", 1998,
                "RacaMaka", isbn);

        List<Book> actualBook =  library.searchBooks(null, null, null, isbn);
        assertEquals(1, actualBook.size());
        library.removeBook(isbn);
        List<Book> actualBook2 =  library.searchBooks(null, null, null, isbn);
        assertEquals(0, actualBook2.size());
    }

    @Test
    void searchBooks() throws IOException {
        library.load();
        String searchName = "Harry Potter";
        List<Book> actualBook =  library.searchBooks(searchName, null, null, null);
        assertNotNull(actualBook);
        assertEquals(2, actualBook.size());
        for (Book book : actualBook) {
            assertNotNull(book);

            assertTrue(book.getName().contains(searchName));
        }
    }
}