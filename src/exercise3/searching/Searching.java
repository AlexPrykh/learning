package exercise3.searching;

import java.util.ArrayList;
import java.util.Scanner;

/*
        Part 1: Linear search
        Алгоритм линейного поиска работает, проверяя каждое значение в списке или массиве по одному,
        начиная с индекса 0.

        В Main-классе реализуйте метод
        public static int linearSearch(ArrayList<Book> books, int searchedId), который ищет в списке,
        полученном в качестве параметра, книгу с id переменной, которая соответствует значению
        searchedId переменной, полученной в качестве параметра. Если эта книга найдена,
        метод должен вернуть индекс, в котором она находится, в списке, который он получил
        в качестве параметра. Если книга не найдена, метод должен вернуть значение -1.

       Part 2: Binary search
       В Main-классе реализуйте метод
       public static int binarySearch(ArrayList<Book> books, int searchedId), который ищет в списке,
       полученном в качестве параметра, книгу с id переменной, которая соответствует значению
       searchedId переменной, полученной в качестве параметра. Если эта книга найдена, метод должен
       вернуть индекс, в котором она находится, в списке, который он получил в качестве параметра.
       Если книга не найдена, метод должен вернуть значение -1.

        Метод должен быть реализован как двоичный поиск, который предполагает, что список упорядочен.
        Вы также должны предполагать, что id в начале списка всегда меньше, чем id в конце списка.
 */
public class Searching {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name for the book " + i));
        }

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.parseInt(scanner.nextLine());

        System.out.println();
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println();

        System.out.println();
        System.out.println("Searching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }
    }


    //Linear Search
    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        for (Book book : books) {
            if (book.getId() == searchedId) {
                return books.indexOf(book);
            }
        }
        return -1;
    }

    //Binary Search
    public static int binarySearch(ArrayList<Book> books, int searchedId) {
        int start = 0;
        int end = books.size() - 1;
        int middle = 0;

        while (start <= end) {
            middle = (start + end) / 2;

            Book book = books.get(middle);
            int bookId = book.getId();

            if (bookId == searchedId) {
                return middle;
            } else if (bookId < searchedId) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return -1;
    }
}
