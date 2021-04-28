package codingBat.array1;

/*
    2. Для массива целых чисел вернуть true, если длина массива
       равна 1 или больше, а первый и последний элемент равны.
 */
public class Task2 {
    public boolean sameFirstLast(int[] number) {
        return (number.length >= 1 && number[0] == number[number.length - 1]);
    }
}
