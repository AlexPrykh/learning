package week2;

import java.util.Scanner;

/*
    11. Порахувати кількість букв "а" (або будь-який інший символ, вводиться користувачем)
        в заданому рядку (стрічці).
 */
public class Task12 {
    public static void main(String[] args) {
        String str1 = "Who ever reading this does not washes his feet!";
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a character:");
        char character = sc.nextLine().toCharArray()[0];
        int counter = 0;

        for (int i = 0; i < str1.length(); i++) {
            char currentChar = str1.charAt(i);

            if (currentChar == character) {
                counter++;
            }
        }
        System.out.printf("%s - %d", character, counter);
    }
}
