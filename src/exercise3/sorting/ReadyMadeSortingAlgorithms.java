package exercise3.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
    Добавьте в класс Main следующие методы:

    public static void sort(int[] array) который сортирует массив целых чисел.
    public static void sort(String[] array) который сортирует массив строк.
    public static void sortIntegers(ArrayList<Integer> integers) который сортирует список целых чисел.
    public static void sortStrings(ArrayList<String> strings) который сортирует список строк.
    Обязательно используйте в своей реализации готовые библиотеки Java.
 */
public class ReadyMadeSortingAlgorithms {
    public static void main(String[] args) {
        //array of integers
        int[] array = {3, 1, 5, 99, 3, 12};
        //array of strings
        String[] stringArray = {"bobbity", "fobbity", "ribbity", "hobbity", "skip"};
        //ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(5);
        numbers.add(4);
        numbers.add(-4);
        numbers.add(2);
        numbers.add(9);
        //ArrayList of strings
        ArrayList<String> strings = new ArrayList<>();
        strings.add("x");
        strings.add("i");
        strings.add("k");
        strings.add("y");
        strings.add("j");
        strings.add("z");

        //array of integers sorting
        System.out.println("Array of integers");
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("");

        //Another sort method for sorting strings
        System.out.println("Array of strings");
        System.out.println(Arrays.toString(stringArray));
        sort(stringArray);
        System.out.println(Arrays.toString(stringArray));
        System.out.println("");

        //sorting an ArrayList of numbers
        System.out.println("ArrayList of numbers");
        System.out.println(numbers);
        sortIntegers(numbers);
        System.out.println(numbers);
        System.out.println("");

        //Another method to sort an ArrayList of strings
        System.out.println("ArrayList of strings");
        System.out.println(strings);
        sortStrings(strings);
        System.out.println(strings);
        System.out.println("");
    }

    //static method to sort array of integers
    public static void sort(int[] array) {
        Arrays.sort(array);
    }

    //static method to sort array of strings
    public static void sort(String[] array) {
        Arrays.sort(array);
    }

    //static method to sort ArrayList of numbers
    public static void sortIntegers(ArrayList<Integer> numbers) {
        Collections.sort(numbers);
    }

    //static method to sort ArrayList of strings
    public static void sortStrings(ArrayList<String> strings) {
        Collections.sort(strings);
    }
}
