package week2;

import java.util.Scanner;

/*
    14. Замінити в стрічці всі символи "а" на "@", вивести отриманий результат. Наприклад:
	    "array is a data type" -> "@rr@y is @ d@t@ type"
 */
public class Task14 {
    public static void main(String[] args) {
        String str = "Barabolya sere v poli, koromislo gnetsya, baba Sara vshe nesetsya!";
        System.out.println(str);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the letter do you want to replace:");
        String a = sc.nextLine();
        System.out.println("Enter a char to be changed to:");
        String b = sc.nextLine();

        System.out.println("All chars: " + a + "\nHave been replaced with symbols: " + b);
        System.out.println(replaceChars(str, a, b));
    }

    static String replaceChars(String source, String from, String to) {
        StringBuilder dest = new StringBuilder(source);
        for (int i = 0; i < source.length(); i++) {
            int foundAt = from.indexOf(source.charAt(i));

            if (foundAt >= 0) {
                dest.setCharAt(i, to.charAt(foundAt));
            }
        }
        return dest.toString();
    }
}
