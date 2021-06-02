package exercise;

import java.util.ArrayList;

/*
   Создайте метод
   public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit)
   в шаблоне упражнения. Метод печатает числа в данном списке, значения которых находятся в диапазоне
   [lowerLimit, upperLimit]. Ниже приведены несколько примеров использования этого метода.


 */
public class PrintInRange {
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int number : numbers) {
            if (number >= lowerLimit && number <= upperLimit) {
                System.out.println(number);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        numbers.add(5);
        numbers.add(1);

        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(numbers, 0, 5);

        System.out.println("The numbers in the range [3, 10]");
        printNumbersInRange(numbers, 3, 10);
    }
}