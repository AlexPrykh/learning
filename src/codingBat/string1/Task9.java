package codingBat.string1;

/*
    9. Учитывая 2 строки, a и b, верните строку вида короткая + длинная + короткая,
       причем более короткая строка находится снаружи,
       а более длинная - внутри. Строки не будут одинаковой длины,
       но могут быть пустыми (длина 0).
 */
public class Task9 {
    public String comboString(String str1, String str2) {
        int str1Length = str1.length();
        int str2Length = str2.length();

        if (str1Length > str2Length) {
            return (str2 + str1 + str2);
        } else {
            return (str1 + str2 + str1);
        }
    }
}
//return str1.length() < str2.length() ? str1 + str2 + str1 : str2 + str1 + str2;