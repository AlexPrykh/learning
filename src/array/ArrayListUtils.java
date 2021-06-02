package array;

import java.util.ArrayList;

public class ArrayListUtils {
    //метод, который печатает числа личта в заданном диапазоне
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {
        for (int number : numbers) {
            if (number >= lowerLimit && number <= upperLimit) {
                System.out.println(number);
            }
        }
    }

    //метод, который вычисляет среднеее арифметическое листа
    public static double average(ArrayList<Integer> numbers) {
        if (numbers.size() == 0) {
            return -1.0;
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        return 1.0 * sum / numbers.size();
    }

    //метод, который считает сумму листа
    public static double sum(ArrayList<Integer> numbers) {
        if (numbers.size() == 0) {
            return -1.0;
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
