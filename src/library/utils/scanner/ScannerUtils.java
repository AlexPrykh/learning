package library.utils.scanner;

import java.util.Scanner;

public class ScannerUtils {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static String readString(String fieldName, boolean emptyAllowed) {
        String stringValue = null;
        while (stringValue == null || stringValue.trim().isEmpty()) {
            System.out.println("Please, enter a " + fieldName);
            stringValue = SCANNER.nextLine();
            if (stringValue.trim().isEmpty() && !emptyAllowed) {
                System.err.println(fieldName + " cannot be empty!");
            } else if (stringValue.isEmpty()) {
                return null;
            }
        }
        return stringValue;
    }

    public static Integer readInteger(String fieldName, boolean emptyAllowed) {
        Integer intValue = null;
        while (intValue == null || intValue <= 0) {
            System.out.println("Please, enter a " + fieldName);
            String intString = SCANNER.nextLine();
            if (intString.trim().isEmpty() && !emptyAllowed) {
                System.err.println(fieldName + " cannot be negative or empty!");
            } else if (intString.trim().isEmpty()) {
                return null;
            }
            intValue = Integer.parseInt(intString);
        }
        return intValue;
    }

    public static Long readLong(String fieldName, boolean emptyAllowed) {
        Long isbn = null;
        while (isbn == null || isbn <= 0) {
            System.out.println("Please, enter a " + fieldName);
            String isbnString = SCANNER.nextLine();
            if (isbnString.trim().isEmpty() && !emptyAllowed) {
                System.err.println("identifier serial book number cannot be 0 or negative!");
            } else if (isbnString.trim().isEmpty()) {
                return null;
            }
            isbn = Long.parseLong(isbnString);
        }
        return isbn;
    }
}
