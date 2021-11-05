package library.controller;

import library.model.Book;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FileBasedLibrary {
    private List<Book> books = new ArrayList<>();
    private String fileName;

    public void reassignFileName(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        if (!file.exists() || file.isDirectory()) {
            throw new FileNotFoundException(fileName);
        }
        this.fileName = fileName;
    }

    public FileBasedLibrary(String fileName) {
        this.fileName = fileName;
    }

    public void load() throws IOException {
        try (Reader reader = new BufferedReader(new FileReader(fileName))) {
//            finish up
            File file = new File(fileName);

            if (file.exists() && !file.isDirectory()) {
                System.err.println("Error! No such file exists!");
            }

            char[] theChars = new char[1024];
            int charsRead = reader.read(theChars, 0, theChars.length);
            StringBuilder fileContent = new StringBuilder();
            while (charsRead != -1) {
                fileContent.append(new String(theChars, 0, charsRead));
                charsRead = reader.read(theChars, 0, theChars.length);
            }

            String content = fileContent.toString();
            if (content.isEmpty()) {
                System.err.println("You are uploading an empty file!");
            }
            String[] rawBooks = content.split("\n");
            List<Book> parsedBooks = new ArrayList<>();

            for (String rawBook : rawBooks) {
                if (rawBook.isBlank()) {
                    System.err.println("Error! Invalid file format!");
                    continue;
                }
                String[] bookValues = rawBook.split(",");
                if (bookValues != rawBook.split(",")) {
                    System.err.println("Error! Invalid file format! The separator is not a comma!");
                    continue;
                }
                String name = bookValues[0];
                int publicationYear = Integer.parseInt(bookValues[1]);
                String author = bookValues[2];
                long isbn = Long.parseLong(bookValues[3]);
                parsedBooks.add(new Book(name, publicationYear, author, isbn));
            }

            this.books = parsedBooks;
            System.out.println("Loaded library from file: " + fileName);
        }
    }

    public void write() {
        StringBuilder content = new StringBuilder();
        for (Book book : books) {
            String bookCSV = book.toCSVString();
            content.append(bookCSV).append("\n");
        }
        try (Writer writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content.toString());
        } catch (IOException e) {
            System.err.println("Failed to writes contents! Exception has been caught: " +
                    e.getMessage());
        }
    }

    public boolean addBook(String name, Integer publicationYear, String authorName, Long isbn) {
        if (name == null || publicationYear == null || authorName == null || isbn == null) {
            System.err.println("Unable to add book. Null values are nor allowed!");
            return Boolean.FALSE;
        }
        Book book = new Book(name, publicationYear, authorName, isbn);
        if (books.contains(book)) {
            System.out.println("Such a book already exists in the library.");
            return Boolean.FALSE;
        }
        if (publicationYear <= 0) {
            System.err.println("The publication year cannot be zero or negative!");
            return Boolean.FALSE;
        }
        if (isbn <= 0) {
            System.err.println("The unique serial number of the book cannot be zero or negative");
            return Boolean.FALSE;
        }
        boolean add = books.add(book);
        write();
        return add;
    }

    public boolean removeBook(Long isbn) {
        if (isbn == null) {
            return Boolean.FALSE;
        }
        Predicate<Book> isbnFilter = new Predicate<Book>() {
            @Override
            public boolean test(Book book) {
                return book.getIsbn() == isbn;
            }
        };
        boolean removed = books.removeIf(isbnFilter);
        if (removed) {
            write();
        }
        return removed;
    }

    public List<Book> searchBooks(String bookName, Integer publicationYear, String authorName, Long isbn) {
        List<Book> filteredBooks = new ArrayList<>();
        for (Book book : books) {
            if (bookName != null && !book.getName().toLowerCase().contains(bookName.toLowerCase())) {
                continue;
            }
            if (authorName != null && !book.getAuthorName().toLowerCase().contains(authorName.toLowerCase())) {
                continue;
            }
            if (publicationYear != null && book.getPublicationYear() != publicationYear) {
                continue;
            }
            if (isbn != null && book.getIsbn() != isbn) {
                continue;
            }
            filteredBooks.add(book);
        }

        return filteredBooks;
    }
}
