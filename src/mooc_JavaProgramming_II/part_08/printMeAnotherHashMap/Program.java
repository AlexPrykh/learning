package mooc_JavaProgramming_II.part_08.printMeAnotherHashMap;

import java.util.HashMap;

/*
        В классе Program реализованы следующие методы класса:

    1. public static void printValues(HashMap<String,Book> hashmap), который печатает все значения
       в хэш-карте, заданной в качестве параметра, с помощью метода toString объектов Book.
    2. public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text),
       который печатает только книги в заданной хэш-карте, имя которой содержит заданную строку.
       Вы можете узнать название книги с помощью метода getName.
 */
public class Program {
    public static void main(String[] args) {
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");
    }

    private static void printValues(HashMap<String, Book> hashmap) {
        for (Book book : hashmap.values()) {
            System.out.println(book);
        }
    }

    private static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        for (Book book : hashmap.values()) {
            if (book.getName().contains(text)) {
                System.out.println(book);
            }
        }
    }
}
