package codingBat.string1;

/*
    5. Для данной строки вернуть новую строку,
       состоящую из 3 копий последних 2 символов исходной строки.
       Длина строки будет не менее 2.
 */
public class Task5 {
    public String extraEnd(String str) {
        String lastTwo = str.substring(str.length() - 2);
        return lastTwo + lastTwo + lastTwo;
    }
}
