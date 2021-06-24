package mooc_JavaProgramming_I.exercise;

import java.util.ArrayList;

public class Sum {
    public static double sum(ArrayList<Integer> numbers) {
        if (numbers.size() == 0) {
            return -1.0;
        }

        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        System.out.println(sum(numbers));

        numbers.add(5);
        numbers.add(1);
        System.out.println(sum(numbers));
    }
}