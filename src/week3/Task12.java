package week3;

import array.ArrayUtils;

import java.util.Scanner;

/*
    12. Написати програму для введеня паролю користувача.
        Користувач вводить пароль 2 рази. Пароль має задовольняти наступні вимоги:
	    - довжина 8-20 символів
	    - мають бути і великі, і малі букви
	    - мають бути цифри
	    - не має містити слів 'password', 'pass', 'gfhjkm'
       Також програма має вміти генерувати випадковий пароль, використовуючи символи a-z A-Z 0-9.
 */
public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a password, please:");
        String password = sc.nextLine();
        System.out.println("Re-enter the password, please:");
        String repeatPassword = sc.nextLine();
        boolean passwordCheck = ArrayUtils.checkPassword(password, repeatPassword);
        if (passwordCheck) {
            System.out.println("Your password is OK!");
        }
        System.out.println();
        System.out.println("You can also use the generated password:");
        String generatedPassword = ArrayUtils.generatePassword();
        while (!ArrayUtils.checkPassword(generatedPassword, generatedPassword)) {
            generatedPassword = ArrayUtils.generatePassword();
        }
        System.out.println("Your generated password - " + generatedPassword);
    }
}
