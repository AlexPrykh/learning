package array;

import java.util.Arrays;

public class ArrayUtils {
    //Создание массива и заполнение его рандомными числами.
    public static int[] generateArrayInRange(int length, int from, int to) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = from + (int) (Math.random() * (to - from));
        }
        return array;
    }

    //Вывод массива в консоль.
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //Метод которой считает сумму массива.
    public static int arraySum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    //Метод определяющий парные елементы.
    public static int countEvenElements(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    //Метод, который инвертирует (разворачивает) массив.
    public static void reverse(int[] array) {
        System.out.println("original array : " + Arrays.toString(array));
        // handling null, empty and one element array
        if (array == null || array.length <= 1) {
            return;
        }
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            // swap numbers
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println("reversed array : " + Arrays.toString(array));
    }

    //Метод который создаёт временный массив.
    public static int[] returnReversArray(int[] array) {
        int j = 0;
        int[] res = new int[array.length]; //Создаём временный массив
        for (int i = array.length - 1; i >= 0; i--, j++) {
            res[j] = array[i];
            System.out.print(res[j] + " ");
        }
        return res;
    }

    //Метод проверяет присутствуют ли буквы и цыфры в строке.
    public static boolean checkSymbols(String password, String symbols) {
        for (int i = 0; i < password.length(); i++) {
            String symbol = password.substring(i, i + 1);
            if (symbols.contains(symbol)) {
                return true;
            }
        }
        return false;
    }

    //Метод проверяет правильно ли ввндён пароль.
    public static boolean checkPassword(String password, String repeatPassword) {
        String lowerCaseLetters = "abcdefjhijklmnopqrstuvwxyz";
        String digits = "0123456789";

        if (password.equals(repeatPassword)) {
            if (password.length() < 8 || password.length() > 20) {
                System.out.println("Password length must be from 8 to 20!");
                return false;
            }
            if (!checkSymbols(password, lowerCaseLetters)) {
                System.out.println("Password must contain lowercase Letters!");
                return false;
            }
            if (!checkSymbols(password, lowerCaseLetters.toUpperCase())) {
                System.out.println("Password must contain uppercase Letters!");
                return false;
            }
            if (!checkSymbols(password, digits)) {
                System.out.println("Password must contain digits!");
                return false;
            }
        } else {
            System.out.println("Password do not match!");
            return false;
        }
        return true;
    }

    //Метод который генерирует уникальный пароль.
    public static String generatePassword() {
        String lowerCaseLetters = "abcdefjhijklmnopqrstuvwxyz";
        String upperCaseLetters = lowerCaseLetters.toUpperCase();
        String digits = "0123456789";
        String specialSymbols = "!@#$%^&*()-_+=;<>/?.,|'[]";
        String[] symbolsArray = {lowerCaseLetters, upperCaseLetters, digits, specialSymbols};

        int passwordLength = (int) ((20 - 8) * Math.random()) + 8;
        String password = "";
        for (int i = 0; i < passwordLength; i++) {
            int symbolsIndex = (int) (Math.random() * symbolsArray.length);
            String symbols = symbolsArray[symbolsIndex];
            int random = (int) (Math.random() * symbols.length());
            password += symbols.charAt(random);
        }
        return password;
    }
}