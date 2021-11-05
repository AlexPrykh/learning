package library.controller.test;

import library.controller.FileBasedLibrary;
import library.model.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
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
    void testLoadWithSpaces() throws IOException {
        String path = "/home/shteyn/IdeaProjects/my-first-project/learning/src/library/controller/test/withSpaces.txt";

        library = new FileBasedLibrary(path);

        Book expectedBook = new Book("testBook2", 1998, "Some author", 12312342528L);

        library.addBook(expectedBook.getName(), expectedBook.getPublicationYear(),
                expectedBook.getAuthorName(), expectedBook.getIsbn());

        library.write();
        List<Book> actualBook = library.searchBooks(null, null, null, null);
        assertTrue(actualBook.contains(expectedBook));
        FileBasedLibrary library2 = new FileBasedLibrary(path);
        library2.load();
        List<Book> actualBook2 = library2.searchBooks(null, null, null, null);
        assertTrue(actualBook2.contains(expectedBook));
        assertEquals(1, actualBook2.size());
    }

//    not sure if this test is correct
    @Test
    void testLoadFileHasEmptyFields() throws IOException {
        String path = "/home/shteyn/IdeaProjects/my-first-project/learning/src/library/controller/test/fileHasEmptyFields.txt";

        library = new FileBasedLibrary(path);
        library.load();

        List<Book> actualBook = library.searchBooks(null, null, null, null);
        assertEquals(4, actualBook.size());
    }

//    not sure if this test is correct
    @Test
    void testLoadIfTheSeparatorIsNotAComma() throws IOException {
        String path = "/home/shteyn/IdeaProjects/my-first-project/learning/src/library/controller/test/ifTheSeparatorIsNotAComma.txt";

        library = new FileBasedLibrary(path);
        library.load();

        List<Book> actualBook = library.searchBooks(null, null, null, null);
        assertEquals(0, actualBook.size());
    }

//    not sure if this test is correct
    @Test
    void testLoadIfThereIsNoIsbnInTheLine() throws IOException {
        String path = "/home/shteyn/IdeaProjects/my-first-project/learning/src/library/controller/test/ifThereIsNoIsbnInTheLine.txt";

        library = new FileBasedLibrary(path);
        library.load();

        List<Book> actualBook = library.searchBooks(null, null, null, null);
        assertEquals(0, actualBook.size());
    }

    @Test
    void testLoadIfFileIsEmpty() throws IOException {
        String path = "/home/shteyn/IdeaProjects/my-first-project/learning/src/library/controller/test/emptyFile.txt";

        library = new FileBasedLibrary(path);
        library.load();

        List<Book> actualBook = library.searchBooks(null, null, null, null);
        assertEquals(0, actualBook.size());
    }

//    finish the test
    @Test
    void testLoadIfTheFileDoesNotExist() throws IOException {
        String path = "/home/shteyn/IdeaProjects/my-first-project/learning/src/library/controller/test/fileDoesNotExist.txt";

        library = new FileBasedLibrary(path);
        library.load();

        File file = new File(path);

        if (file.exists() && !file.isDirectory()) {
            assertTrue(file.exists());
            assertFalse(file.isDirectory());
        }
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
        Book expectedBook = new Book("testBook", 1998, "RacaMaka",
                12312342525L);

        library.addBook(expectedBook.getName(), expectedBook.getPublicationYear(),
                expectedBook.getAuthorName(), expectedBook.getIsbn());

        List<Book> actualBook = library.searchBooks(null, null, null, null);
        assertTrue(actualBook.contains(expectedBook));
    }

    @Test
    void testForAddingDuplicateBooks() {
        String path = "/home/shteyn/IdeaProjects/my-first-project/learning/src/library/controller/test/addingDuplicateBooks.txt";

        library = new FileBasedLibrary(path);

        Book book1 = new Book("testBook1", 1998, "Some author", 12312342521L);
        Book book2 = new Book("testBook2", 1998, "Some author", 12312342522L);
        Book book3 = new Book("testBook3", 1998, "Some author", 12312342523L);
        Book book4 = new Book("testBook4", 1998, "Some author", 12312342524L);

        library.addBook(book1.getName(), book1.getPublicationYear(),
                book1.getAuthorName(), book1.getIsbn());

        library.addBook(book2.getName(), book2.getPublicationYear(),
                book2.getAuthorName(), book2.getIsbn());

        library.addBook(book3.getName(), book3.getPublicationYear(),
                book3.getAuthorName(), book3.getIsbn());

        library.addBook(book4.getName(), book4.getPublicationYear(),
                book4.getAuthorName(), book4.getIsbn());

        library.write();
        List<Book> actualBook1 = library.searchBooks(null, null, null, null);
        assertTrue(actualBook1.contains(book1));
        assertTrue(actualBook1.contains(book2));
        assertTrue(actualBook1.contains(book3));
        assertTrue(actualBook1.contains(book4));
        assertEquals(4, actualBook1.size());

        Book book5 = new Book("testBook5", 1998, "Some author", 12312342524L);

        library.addBook(book5.getName(), book5.getPublicationYear(),
                book5.getAuthorName(), book5.getIsbn());
        assertEquals(4, actualBook1.size());
    }

    @Test
    void testAddingABookIfOneOfTheArgumentsIsNull() {
//        name -> null
        Book expectedBook = new Book(null, 1998, "Some Author",
                12312342526L);

        library.addBook(expectedBook.getName(), expectedBook.getPublicationYear(),
                expectedBook.getAuthorName(), expectedBook.getIsbn());

        List<Book> actualBook = library.searchBooks(null, null, null, null);
        assertFalse(actualBook.contains(expectedBook));
        assertEquals(4, actualBook.size());

//        publicationYear -> null
        Book expectedBook2 = new Book("Some name", null, "Some Author",
                12312342527L);

        library.addBook(expectedBook2.getName(), expectedBook2.getPublicationYear(),
                expectedBook2.getAuthorName(), expectedBook2.getIsbn());

        List<Book> actualBook2 = library.searchBooks(null, null, null, null);
        assertFalse(actualBook2.contains(expectedBook2));
        assertEquals(4, actualBook2.size());

//        author name -> null
        Book expectedBook3 = new Book("Some name", 1998, null,
                12312342528L);

        library.addBook(expectedBook3.getName(), expectedBook3.getPublicationYear(),
                expectedBook3.getAuthorName(), expectedBook3.getIsbn());

        List<Book> actualBook3 = library.searchBooks(null, null, null, null);
        assertFalse(actualBook3.contains(expectedBook3));
        assertEquals(4, actualBook3.size());

//        isbn -> null
        Book expectedBook4 = new Book("Some name", 1998, "Some Author",
                null);

        library.addBook(expectedBook4.getName(), expectedBook4.getPublicationYear(),
                expectedBook4.getAuthorName(), expectedBook4.getIsbn());

        List<Book> actualBook4 = library.searchBooks(null, null, null, null);
        assertFalse(actualBook4.contains(expectedBook4));
        assertEquals(4, actualBook4.size());
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
    void testRemoveBookByNullIsbn() {
        Long isbn = null;

        library.addBook("Some name", 2000, "Some author", isbn);

        List<Book> actualBook = library.searchBooks(null, null, null, null);
        assertEquals(4, actualBook.size());
        library.removeBook(isbn);
        List<Book> actualBook2 = library.searchBooks(null, null, null, isbn);
        assertEquals(4, actualBook2.size());
    }

    @Test
    void testRemovalOfNonExistentIsbn() {
        long isbn = 1223456354245L;

        library.removeBook(isbn);
        List<Book> actualBook = library.searchBooks(null, null, null, null);
        assertEquals(4, actualBook.size());
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
        assertEquals("Harry Potter 1,2001,Joan Rouling,123123123123", book.toCSVString());
    }
}