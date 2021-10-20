package library.controller.test;

import library.controller.FileBasedLibrary;
import library.model.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FileBasedLibraryTest {
    private FileBasedLibrary library;
    private static final String PATH = "/home/shteyn/IdeaProjects/my-first-project/learning/src/library/controller/test/booksIsOk.txt";


    @BeforeEach
    void setUp() throws Exception {
        library = new FileBasedLibrary(PATH);
        library.load();

    }

    @Test
    void testReassignFileName() throws IOException {
        library.reassignFileName("/home/shteyn/IdeaProjects/my-first-project/learning/src/library/controller/test/reFile.txt");
        library.load();
        List<Book> actualBook = library.searchBooks(null, null, null, null);
        assertNotNull(actualBook);
        assertEquals(1, actualBook.size());
        assertEquals("Baba Clyacha", actualBook.get(0).getName());
    }

    @Test
    void testLoad() throws IOException {
        Book expectedBook = new Book("testBook", 1998, "RacaMaka",
                12312342525L);

        library.addBook(expectedBook.getName(), expectedBook.getPublicationYear(),
                expectedBook.getAuthorName(), expectedBook.getIsbn());

        library.write();
        List<Book> actualBook = library.searchBooks(null, null, null, null);
        assertTrue(actualBook.contains(expectedBook));
        FileBasedLibrary library2 = new FileBasedLibrary(PATH);
        library2.load();
        List<Book> actualBook2 = library2.searchBooks(null, null, null, null);
        assertTrue(actualBook2.contains(expectedBook));
    }

    @Test
    void testWrite() throws IOException {
        Book expectedBook = new Book("testBook", 1998, "RacaMaka",
                12312342525L);

        library.addBook(expectedBook.getName(), expectedBook.getPublicationYear(),
                expectedBook.getAuthorName(), expectedBook.getIsbn());

        library.write();
        List<Book> actualBook = library.searchBooks(null, null, null, null);
        assertTrue(actualBook.contains(expectedBook));
        FileBasedLibrary library2 = new FileBasedLibrary(PATH);
        library2.load();
        List<Book> actualBook2 = library2.searchBooks(null, null, null, null);
        assertTrue(actualBook2.contains(expectedBook));

    }

    @Test
    void testAddBook() {
        // todo add Random
        Book expectedBook = new Book("testBook", 1998, "RacaMaka",
                12312342525L);

        library.addBook(expectedBook.getName(), expectedBook.getPublicationYear(),
                expectedBook.getAuthorName(), expectedBook.getIsbn());

        List<Book> actualBook = library.searchBooks(null, null, null, null);
        assertTrue(actualBook.contains(expectedBook));
    }

    @Test
    void testRemoveBook() {
        long isbn = 1241242354245L;

        library.addBook("testBook", 1998,
                "RacaMaka", isbn);

        List<Book> actualBook = library.searchBooks(null, null, null, isbn);
        assertEquals(1, actualBook.size());
        library.removeBook(isbn);
        List<Book> actualBook2 = library.searchBooks(null, null, null, isbn);
        assertEquals(0, actualBook2.size());
    }

    @Test
    void testSearchBooks() throws IOException {
        library.load();
        String searchName = "Harry Potter";
        List<Book> actualBook = library.searchBooks(searchName, null, null, null);
        assertNotNull(actualBook);
        assertEquals(2, actualBook.size());
        for (Book book : actualBook) {
            assertNotNull(book);

            assertTrue(book.getName().contains(searchName));
        }

        int searchPublicationYear = 2001;
        List<Book> actualBook2 = library.searchBooks(null, searchPublicationYear, null, null);
        assertNotNull(actualBook2);
        assertEquals(1, actualBook2.size());
        for (Book book : actualBook2) {
            assertNotNull(book);

            assertEquals(book.getPublicationYear(), (searchPublicationYear));
        }

        String searchAuthor = "Joan Rouling";
        List<Book> actualBook3 = library.searchBooks(null, null, searchAuthor, null);
        assertNotNull(actualBook3);
        assertEquals(2, actualBook3.size());
        for (Book book : actualBook3) {
            assertNotNull(book);

            assertTrue(book.getAuthorName().contains(searchAuthor));
        }

        long searchIsbn = 123123123123L;
        List<Book> actualBook4 = library.searchBooks(null, null, null, searchIsbn);
        assertNotNull(actualBook4);
        assertEquals(1, actualBook4.size());
        for (Book book : actualBook2) {
            assertNotNull(book);

            assertEquals(book.getIsbn(), (searchIsbn));
        }

        List<Book> actualBook5 = library.searchBooks(null, null, null, null);
        assertNotNull(actualBook5);
        assertEquals(4, actualBook5.size());
        for (Book book : actualBook5) {
            assertNotNull(book);
        }
    }

    @Test
    void testToCSVString() {
        Book book = new Book("Harry Potter 1", 2001, "Joan Rouling", 123123123123L);
        String expected = book.toCSVString();
        String actual = book.toCSVString();
        Assertions.assertEquals(expected, actual);
    }
}