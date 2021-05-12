package week3;

import java.sql.SQLOutput;

/*
    10. Видалити з речення слова, що повторюються.
 */
public class Task10 {
    public static void main(String[] args) {
        String text = "Ide bebra Ide na prirodu i ta jere korinnya jere i glodu.";
        System.out.println("Original string:");
        System.out.println(text);
        System.out.println();
        System.out.println(removingDuplicateWords(text));

    }

    private static String removingDuplicateWords(String string) {
        String[] words = string.split(" ");
        String result = "";
        for (String word : words) {
            if (!result.contains(word)) {
                result += word + " ";
            }
        }
        return result;
    }
}
