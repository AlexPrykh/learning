package codingBat.string1;

/*
    7. Учитывая строку четной длины, верните первую половину.
       Таким образом, строка «WooHoo» дает «Woo».
 */
public class Task7 {
    public String firstHalf(String str) {
        int half = str.length() / 2;
        return str.substring(0, half);
    }
}
