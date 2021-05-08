package week3;

import java.util.Scanner;

/*
    7. Знайти найдовше слово в стрічці (розділене одним пробілом).
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a text:");
        String text = sc.nextLine();
        System.out.println("Longest word in text: " + maxWord(text));
        System.out.println("its length is: " + maxWord(text).length());

    }

    private static String maxWord(String text) {
        String[] words = text.split(" ");
        String resultString = "";
        for (String word : words) {
            if (word.length() > resultString.length()) {
                resultString = word;
            }
        }
        return resultString;
    }
}
