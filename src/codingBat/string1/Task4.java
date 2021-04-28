package codingBat.string1;

/*
    4. Учитывая длину строки «out» 4, например «<< >>», и слово, верните новую строку,
       в которой слово находится в середине строки вывода, например, «<<word>>».
       Примечание: используйте str.substring (i, j)
       для извлечения строки, начиная с индекса i и доходя до индекса j, но не включая его.
 */
public class Task4 {
    public String makeOutWord(String out, String word) {
        return out.substring(0, 2) + word + out.substring(2, 4);
    }
}
