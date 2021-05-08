package week3;

import array.MatrixUtils;

/*
    3. Написати метод, що перевіряє, чи є стрічка паліндромом.
 */
public class Task3 {
    public static void main(String[] args) {
        String str1 = "Baba bigala po polyu i nakakala v kvasolyu.";
        System.out.println(str1);
        System.out.println("Is a string a palindrome? - " + isPalindrome(str1));
        System.out.println();
        String str2 = "aba";
        System.out.println(str2);
        System.out.println("Is a string a palindrome? - " + isPalindrome(str2));
    }

    private static boolean isPalindrome(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            char leftChar = word.charAt(i);
            char rightChar = word.charAt(word.length() - 1 - i);
            if (leftChar != rightChar) {
                return false;
            }
        }
        return true;
    }
}
