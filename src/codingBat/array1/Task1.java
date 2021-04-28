package codingBat.array1;

/*
    1. Учитывая массив целых чисел, верните true, если 6 появляется либо как первый,
       либо как последний элемент в массиве. Массив будет иметь длину 1 или более.
 */
public class Task1 {
    public boolean firstLast6(int[] number) {
        return number[0] == 6 || number[number.length - 1] == 6;
    }
}
