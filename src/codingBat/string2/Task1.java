package codingBat.string2;

/*
    1. Для данной строки вернуть строку,
       в которой для каждого символа в оригинале есть два символа.
 */
public class Task1 {
    public String doubleChar(String str) {
        int length = str.length();
        String result = "";

        for (int i = 0; i < length; i++) {
            //result = result + str.charAt(i) + str.charAt(i);
            result += str.substring(i, i + 1) + str.substring(i, i + 1);
        }
        return result;
    }
}
