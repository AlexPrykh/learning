package mooc_JavaProgramming_I.exercise3.sorting;

import java.util.Arrays;

/*
        Part 1: Finding the smallest value
        Создайте в классе MainProgram метод класса smallest, который принимает в качестве
        параметра целочисленный массив. Он должен возвращать наименьшее значение в массиве.

        Part 2: Index of the smallest value
        Создайте метод, называемый indexOfSmallest в классе MainProgram. Он должен возвращать
        индекс наименьшего числа в массиве, который он получает в качестве параметра.

        part 3: Index of the smallest value after a certain value
        Создайте в классе MainProgram метод класса с именем indexOfSmallestFrom.
        Он работает аналогично методу из предыдущего раздела, но учитывает только значения
        таблицы из определенного индекса. В дополнение к таблице он получает этот начальный
        индекс в качестве параметра.

        Part 4: Swap numbers
        Создайте метод класса swap в классе MainProgram. Он получает в качестве параметров
        массив и два индекса внутри него. Метод меняет местами числа в этих индексах друг с другом.

        Part 5: Sorting
        Мы собрали набор полезных методов. С их помощью мы можем реализовать алгоритм сортировки,
        известный под названием selection sort.

        Идея сортировки выбора такова:

        Переместите наименьшее число в массиве в индекс 0.
        Переместите второе наименьшее число в индекс 1.
        Переместите третье маленькое число в массиве в индекс 2.
        И т.д.
        Другими словами:

        1. Изучите массив, начиная с индекса 0. Поменяйте местами следующие два числа друг с другом:
           число с индексом 0 и наименьшее число в массиве, начиная с индекса 0.
        2. Изучите массив, начиная с индекса 1. Поменяйте местами следующие два числа друг с другом:
           число с индексом 1 и наименьшее число в массиве, начиная с индекса 1.
        3. Изучите массив, начиная с индекса 2. Поменяйте местами следующие два числа друг с другом:
           число в индексе 2 и наименьшее число в массиве, начиная с индекса 2.
        И т.д.
        Реализуйте метод класса sort, вызываемый на основе идеи выше, в классе MainProgram.
        Он должен включать цикл, который перебирает индексы массива. Наверняка метод
        indexOfSmallestFrom и swap пригодится. Кроме того, распечатайте содержимое массива перед
        сортировкой и после каждой итерации цикла, чтобы гарантировать, что алгоритм работает так,
        как вы ожидаете.
 */
public class MainProgram {
    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int smallest = table[startIndex];
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < smallest) {
                smallest = table[i];
                startIndex = i;
            }
        }
        return startIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        System.out.println(Arrays.toString(array));
        int index = 0;

        while (index < array.length) {
            swap(array, index, indexOfSmallestFrom(array, index));
            System.out.println(Arrays.toString(array));
            index += 1;
        }
    }

    public static void main(String[] args) {
        System.out.println("Part 1:");
        int[] numbers = {6, 5, 8, 7, 11};
        System.out.println("Smallest: " + MainProgram.smallest(numbers));

        System.out.println();

        System.out.println("Part 2:");
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));
        System.out.println();

        System.out.println("Part 3:");
        int[] numbers2 = {-1, 6, 9, 8, 12};
        System.out.println(MainProgram.indexOfSmallestFrom(numbers2, 0));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers2, 1));
        System.out.println(MainProgram.indexOfSmallestFrom(numbers2, 2));
        System.out.println();

        System.out.println("Part 4:");
        int[] numbers3 = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(numbers3));

        MainProgram.swap(numbers3, 1, 0);
        System.out.println(Arrays.toString(numbers3));

        MainProgram.swap(numbers3, 0, 3);
        System.out.println(Arrays.toString(numbers3));
        System.out.println();

        System.out.println("Part 5:");
        int[] numbers4 = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers4);
    }
}
