package codingBat.string1;

/*
    6. Для данной строки вернуть строку, состоящую из первых двух символов,
       поэтому строка «Hello» дает «He». Если строка короче 2,
       верните все, что есть, так что «X» дает «X»,
       а пустая строка «» дает пустую строку «».
       Обратите внимание, что str.length () возвращает длину строки.
 */
public class Task6 {
    public String firstTwo(String str) {
        int length = str.length();

        if (length <= 2) {
            return str;
        } else {
            return str.substring(0, 2);
        }
    }
}
