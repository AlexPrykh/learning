package mooc_JavaProgramming_II.part_08.cubes;

import java.util.Scanner;

/*
        Напишите программу, которая считывает строки от пользователя до тех пор, пока пользователь
        не введет строку «end». Пока ввод не является "end", программа должна обрабатывать ввод как
        целое число и печатать куб целого числа (что означает number * number * number).
 */
public class Cubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Please, enter a number:");
            String input = sc.nextLine();
            if ("end".equals(input)) {
                break;
            }
            int number = Integer.parseInt(sc.nextLine());
            System.out.println((int) Math.pow(number, 3));
        }
    }
}
