package codingBat.string2;

/*
    4. Возвращает количество раз, когда строка «code»
       встречается в любом месте данной строки,
       за исключением того, что мы принимаем любую букву для «d»,
       поэтому учитываются «cope» и «cooe».
 */
public class Task4 {
    public int countCode(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 3; i++) {

            if (str.substring(i, i + 2).equals("co") && str.charAt(i + 3) == 'e') {
                count++;
            }
        }
        return count;
    }
}
