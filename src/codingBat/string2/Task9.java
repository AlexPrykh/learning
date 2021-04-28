package codingBat.string2;

/*
    9. Учитывая две строки, a и b , создайте большую строку,
       состоящую из первого символа a, первого символа b,
       второго символа a, второго символа b и т. Д.
       Любые оставшиеся символы помещаются в конец результата.
 */
public class Task9 {
    public String mixString(String a, String b) {
        String letter = "";

        for (int i = 0; i < Math.max(a.length(), b.length()); i++) {

            if (i < a.length()) {
                letter += a.substring(i, i + 1);
            }
            if (i < b.length()) {
                letter += b.substring(i, i + 1);
            }
        }
        return letter;
    }
}
