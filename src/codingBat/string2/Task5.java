package codingBat.string2;

/*
     5. Учитывая две строки, верните true, если одна из строк
        появляется в самом конце другой строки,
        игнорируя различия в верхнем и нижнем регистре (другими словами,
        вычисления не должны быть «чувствительными к регистру»).
        Примечание. Str.toLowerCase () возвращает строчную версию строки.
 */
public class Task5 {
    public boolean endOther(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        return str1.endsWith(str2) || str2.endsWith(str1);
    }
}
