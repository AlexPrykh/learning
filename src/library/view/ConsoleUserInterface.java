package library.view;

import library.controller.FileBasedLibrary;
import library.model.Book;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import static library.scannerUtils.ScannerUtils.*;

public class ConsoleUserInterface {
    // MVC - model, view, controller

    //console commands
    public static final String START_INFO = "Use these commands to manipulate the library:" +
            "\n- commands info - shows information about commands;" +
            "\n- add - using this command you can add a book to the library;" +
            "\n- remove - using this command you can delete a book the library;" +
            "\n- load - load library from provided filename;" +
            "\n- search - using this command you can search a book the library.";

    public static final String COMMANDS_INFO = "commands info";
    public static final String COMMAND_LOAD = "load";
    public static final String COMMAND_QUIT = "quit";
    public static final String COMMAND_ADD = "add";
    public static final String COMMAND_REMOVE = "remove";
    public static final String COMMAND_SEARCH = "search";
    public static final String COMMAND_INDEX = "index";
    public static final String COMMAND_ISBN = "isbn";

    public static final Map<String, Comparator<Book>> COMPARATORS = new HashMap<>();
    public static final String SORT_FIELDS;

    static {
        COMPARATORS.put("book", new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        COMPARATORS.put("publicationYear", new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return Integer.compare(o1.getPublicationYear(), o2.getPublicationYear());
            }
        });
        COMPARATORS.put("author", new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getAuthorName().compareTo(o2.getAuthorName());
            }
        });
        COMPARATORS.put("isbn", new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return Long.compare(o1.getIsbn(), o2.getIsbn());
            }
        });

        Set<String> keys = COMPARATORS.keySet();
        StringBuilder keysString = new StringBuilder();
        for (String key : keys) {
            keysString.append(key).append(",");
        }
        SORT_FIELDS = keysString.substring(0, keysString.length() - 1);
    }

    private final Scanner scanner = new Scanner(System.in);
    private final FileBasedLibrary library;
    private List<Book> lastSearch;

    public ConsoleUserInterface(FileBasedLibrary library) {
        this.library = library;
    }

    public void start() {
        System.out.println("Welcome to our library!");
        printStartInfo();

        while (true) {
            // read user input
            System.out.print("Please, enter a command: ");
            String input = scanner.nextLine();

            if (COMMANDS_INFO.equalsIgnoreCase(input)) {
                printStartInfo();
            }

            if (COMMAND_LOAD.equalsIgnoreCase(input)) {
                load();
            }

            if (COMMAND_QUIT.equalsIgnoreCase(input)) {
                System.out.println("Happily! Have a productive day!");
                break;
            }

            if (input.isEmpty()) {
                System.err.println("Empty input! Unknown command!");
                continue;
            }

            if (COMMAND_ADD.equalsIgnoreCase(input)) {
                add();
            }

            if (COMMAND_REMOVE.equalsIgnoreCase(input)) {
                remove();
            }

            if (COMMAND_SEARCH.equalsIgnoreCase(input)) {
                search();
            }
        }
    }

    private void load() {
        System.out.println("Enter a file name to load:");
        String readFileName = scanner.nextLine();
        if (readFileName.trim().isEmpty() || readFileName.isEmpty()) {
            System.err.println("Error! Invalid file name");
        }
        try {
            library.reassignFileName(readFileName);
            library.load();
        } catch (FileNotFoundException e) {
            System.err.println("Error: file does not exist!");
        } catch (IOException e) {
            System.err.println("Error! Cannot load library from file: " + e.getMessage());
        }
    }

    private void search() {
        String bookName = readString("Book name", TRUE);
        Integer publicationYear = readInteger("Publication year", TRUE);
        String authorName = readString("Author name", TRUE);
        Long isbn = readLong("ISBN", TRUE);
        String sortField = readString("Sort by (available options: " + SORT_FIELDS + ")", TRUE);

        lastSearch = library.searchBooks(bookName, publicationYear, authorName, isbn);
        sort(sortField);
        for (int i = 0; i < lastSearch.size(); i++) {
            System.out.printf("#%d: %s\n", i + 1, lastSearch.get(i));
        }
    }

    private void sort(String sortField) {
        if (sortField == null) {
            return;
        }
        if (!COMPARATORS.containsKey(sortField)) {
            System.err.println("Unknown sorting option!");
            return;
        }
        lastSearch.sort(COMPARATORS.get(sortField));
    }

    private void remove() {
        printInformationHowDelete();

        String command = scanner.nextLine();
        if (COMMAND_INDEX.equalsIgnoreCase(command)) {
            removeByIndex();
        } else if (COMMAND_ISBN.equalsIgnoreCase(command)) {
            removeByIsbn();
        } else {
            System.err.println("Unknown command!");
        }
    }

    private void printInformationHowDelete() {
        System.out.println("How do you want to remove at this book - by index or by isbn?");
        System.out.println("Enter the command:\n" +
                "- index - deletes the book by the selected index;\n" +
                "- isbn - will delete the book by ISBN (identifier serial book number).");
    }

    private void removeByIndex() {
        if (lastSearch == null) {
            lastSearch = library.searchBooks(null, null, null, null);
        }
        Integer index = readInteger("Index", FALSE);
        if (index == null || index <= 0 || index > lastSearch.size()) {
            System.err.println("Invalid index!");
        } else {
            removeBook(lastSearch.get(index - 1).getIsbn());
        }
    }

    private void removeByIsbn() {
        Long isbn = readLong("ISBN", FALSE);
        removeBook(isbn);
    }

    private void removeBook(Long isbn) {
        boolean result = library.removeBook(isbn);
        if (result) {
            System.out.println("Book removed.");
        } else {
            System.out.println("Unable to delete book or book is missing!");
        }
    }

    private void printStartInfo() {
        System.out.println(START_INFO);
    }

    private void add() {
        String bookName = readString("Book name", FALSE);
        Integer publicationYear = readInteger("Publication year", FALSE);
        String authorName = readString("Author name", FALSE);
        Long isbn = readLong("ISBN", FALSE);

        boolean result = library.addBook(bookName, publicationYear, authorName, isbn);
        if (result) {
            System.out.println("Book added.");
        } else {
            System.out.println("Failed to add book! Try again!");
        }
    }
}