package codingBat.string2;

/*
    2. Возвращает количество раз, когда строка «привет»
       встречается где-нибудь в данной строке.
 */
public class Task2 {
    public int countHi(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {

            if (str.startsWith("hi", i)) {
                count++;
            }
        }
        return count;
    }
}
