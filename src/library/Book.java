package library;

public class Book {
    private String nameBook;
    private int yearOfPublication;
    private String authorName;
    private int ISBN;

    public Book(String nameBook, int yearOfPublication, String authorName, int ISBN) {
        this.nameBook = nameBook;
        this.yearOfPublication = yearOfPublication;
        this.authorName = authorName;
        this.ISBN = ISBN;
    }

    public String getNameBook() {
        return nameBook;
    }

    public int getYearOfPublication() {
        if (this.yearOfPublication < 0) {
            System.err.println("Error! The year of publication is not correct!");
        }
        return yearOfPublication;
    }

    public String getAuthorName() {
        return authorName;
    }

    public int getISBN() {
        if (this.ISBN < 0) {
            System.err.println("Error! The unique number of the book should not be negative!");
        }
        return ISBN;
    }

    public void setISBN(int ISBN) {
        if (ISBN > 0) {
            this.ISBN = ISBN;
        } else {
            System.err.println("Error! The unique number of the book should not be negative!");
        }
    }

    public String searchingBook(String mode) {
        if (mode != null) {
            if ("everything".equalsIgnoreCase(mode)) {
                return "Title of the book: " + getNameBook() +
                        "\nAuthor name: " + getAuthorName() +
                        "\nPublication year: " + getYearOfPublication() +
                        "\nISBN: " + getISBN();
            }

            if ("name".equalsIgnoreCase(mode)) {
                return "Title of the book: " + getNameBook();
            }

            if ("author".equalsIgnoreCase(mode)) {
                return "Author name: " + getAuthorName();
            }

            if ("PY".equalsIgnoreCase(mode)) {
                return "Publication year: " + getYearOfPublication();
            }

            if ("ISBN".equalsIgnoreCase(mode)) {
                if (this.ISBN > 0) {
                    return "ISBN: " + getISBN();
                } else {
                    System.err.println("Error! The unique number of the book should not be negative!");
                }
            }
        }
        return "Couldn't find anything :(";
    }

    @Override
    public String toString() {
        return "Book: " + nameBook +
                "\nYear of publication: " + yearOfPublication +
                "\nAuthor name: " + authorName +
                "\nISBN: " + ISBN;
    }
}
