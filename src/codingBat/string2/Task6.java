package codingBat.string2;

/*
    6. Верните true, если данная строка содержит вид «xyz»,
       где перед xyz не ставится точка (.).
       Таким образом, «xxyz» считается, а «x.xyz» - нет.
 */
public class Task6 {
    public boolean xyzThere(String str) {
        int count = 0;

        if (str.length() < 3) {
            return false;
        }

        for (int i = 0; i < str.length() - 2; i++) {

            if (str.charAt(i) == '.') {
                i++;
            } else if (str.substring(i, i + 3).equals("xyz")) {
                count++;
                return true;
            }
        }
        return false;
    }
}
