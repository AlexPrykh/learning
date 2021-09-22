package library.controller;

import library.model.Book;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FileBasedLibrary {
    private List<Book> books = new ArrayList<>();
    private String fileName;

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public FileBasedLibrary(String fileName) throws IOException {
        this.fileName = fileName;
        load();
    }

    public void load() throws IOException {
        try (Reader reader = new BufferedReader(new FileReader(fileName))) {

            char[] theChars = new char[1024];
            int charsRead = reader.read(theChars, 0, theChars.length);
            StringBuilder fileContent = new StringBuilder();
            while (charsRead != -1) {
                fileContent.append(new String(theChars, 0, charsRead));
                charsRead = reader.read(theChars, 0, theChars.length);
            }

            String content = fileContent.toString();
            String[] rawBooks = content.split("\n");
            List<Book> parsedBooks = new ArrayList<>();

            for (String rawBook : rawBooks) {
                String[] bookValues = rawBook.split(",");
                String name = bookValues[0];
                int publicationYear = Integer.parseInt(bookValues[1]);
                String author = bookValues[2];
                long isbn = Long.parseLong(bookValues[3]);
                parsedBooks.add(new Book(name, publicationYear, author, isbn));
            }

            this.books = parsedBooks;
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
            // todo handle
            System.err.println("Failed to writes contents! Exception has been caught.");
        }

    }

    public boolean addBook(String name, int publicationYear, String authorName, long isbn) {
        Book book = new Book(name, publicationYear, authorName, isbn);
        if (books.contains(book)) {
            return Boolean.FALSE;
        }
        boolean add = books.add(book);
        write();
        return add;
    }

    public boolean removeBook(int index) {
        if (books.size() > index && index >= 0) {
            books.remove(index);
            write();
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }

    public boolean removeBook(long isbn) {
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
