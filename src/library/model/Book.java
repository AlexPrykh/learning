package library.model;

import java.util.Objects;

// model
public class Book {
    private String name;
    private int publicationYear;
    private String authorName;
    private long isbn;

    public Book(String name, int publicationYear, String authorName, long isbn) {
        this.name = name;
        this.publicationYear = publicationYear;
        this.authorName = authorName;
        this.isbn = isbn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isbn == book.isbn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("name='").append(name).append('\'');
        sb.append(", publicationYear=").append(publicationYear);
        sb.append(", authorName='").append(authorName).append('\'');
        sb.append(", isbn=").append(isbn);
        sb.append('}');
        return sb.toString();
    }

    public String toCSVString() {
        return String.format("%s,%d,%s,%d", name, publicationYear, authorName, isbn);
    }
}
