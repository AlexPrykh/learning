package codingBat.array1;

/*
    4. Учитывая 2 массива целых чисел, a и b, верните true, если они имеют один
       и тот же первый элемент или один и тот же последний элемент.
       Оба массива будут иметь длину 1 или более.
 */
public class Task4 {
    public boolean commonEnd(int[] a, int[] b) {
        return (a[0] == b[0] || a[a.length - 1] == b[b.length - 1]);
    }
}
