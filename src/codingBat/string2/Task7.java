package codingBat.string2;

/*
    7. Вернуть true, если данная строка содержит строку «bob»,
       но где средний символ 'o' может быть любым символом.
 */
public class Task7 {
    public boolean bobThere(String str) {

        for (int i = 0; i < str.length() - 2; i++) {

            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }
}
