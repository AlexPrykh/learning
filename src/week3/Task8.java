package week3;

import java.util.Scanner;

/*
    8. Напишіть програму, яка дозволяє користувачу ввести з консолі стрічку,
       переводить перший символ кожного слова в верхній регістр і результат виводить на консоль.
	   Вхід: іван васильович
	   Вихід: Іван Васильович
 */
public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter a text:");
        String text = sc.nextLine();
        System.out.println("First letter to uppercase:");
        System.out.println(firstLetterToUpperCase(text));

    }

    private static String firstLetterToUpperCase(String text) {
        String[] words = text.split(" ");
        String resultString = "";
        for (String word : words) {
            String first = word.substring(0, 1).toUpperCase();
            String all = word.substring(1) + " ";
            resultString += first + all;
        }
        return resultString;
    }
}
