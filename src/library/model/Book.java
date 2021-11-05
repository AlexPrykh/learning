package library.model;

import java.util.Objects;

// model
public class Book {
    private String name;
    private Integer publicationYear;
    private String authorName;
    private Long isbn;

    public Book(String name, Integer publicationYear, String authorName, Long isbn) {
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
        if (publicationYear == null) {
            return 0;
        }
        return publicationYear;
    }

    public void setPublicationYear(Integer publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public long getIsbn() {
        if (isbn == null) {
            return 0;
        }
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Book)) {
            return false;
        }
        Book book = (Book) o;
        return Objects.equals(getIsbn(), book.getIsbn());
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
