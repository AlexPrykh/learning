package codingBat.string1;

/*
    8. Для данной строки вернуть версию без первого и последнего символов,
       поэтому «Hello» дает «ell». Длина строки будет не менее 2.
 */
public class Task8 {
    public String withoutEnd(String str) {
        int length = str.length();
        return str.substring(1, length - 1);
    }
}
