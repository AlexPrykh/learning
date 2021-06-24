package mooc_JavaProgramming_I.exercise;

import java.util.Scanner;

/*
        Part 1: Считать
      Создайте класс Statistics, обладающий следующими функциями
      (файл для класса предоставляется в шаблоне упражнения):

      метод addNumber добавляет в статистику новое число
      метод getCount сообщает количество добавленных чисел
      Классу не нужно нигде хранить добавленные числа, ему достаточно
      запомнить их количество. На этом этапе addNumber метод может даже пренебречь числами,
      добавляемыми к статистике, поскольку единственное, что сохраняется, - это количество
      добавленных чисел.

      Part 2: Сумма и среднее
      Расширьте класс со следующими функциями:

      метод sum указует сумму добавленных чисел (сумма пустого объекта статистики числа равно 0)
      метод average указует среднее значение добавленных чисел
      (среднее значение пустого числового объекта статистики равно 0)

      Part 3: Сумма пользовательского ввода
      Напишите программу, которая запрашивает у пользователя числа,
      пока пользователь не введет -1. Затем программа выдаст сумму чисел.

      Программа должна использовать Statistics объект для вычисления суммы.

      ПРИМЕЧАНИЕ. Не изменяйте класс статистики в этой части.
      Вместо этого реализуйте программу для вычисления суммы, используя ее.

      Part 4: Множественные суммы
      Измените предыдущую программу так, чтобы она также вычисляла сумму четных и нечетных чисел.

      ПРИМЕЧАНИЕ . Определите в программе три объекта статистики.
      Используйте первое для вычисления суммы всех чисел, второе для вычисления
      суммы четных чисел и третье для вычисления суммы нечетных чисел.

      Чтобы тест работал, объекты должны быть созданы в основной программе
      в том порядке, в котором они были упомянуты выше
      (то есть сначала объект, который суммирует все числа, затем тот,
      который суммирует четные, а затем, наконец, тот, который суммирует нечетные числа)!

      ПРИМЕЧАНИЕ. Ни в коем случае не изменяйте класс статистики!

 */
public class Statistics {
    private int count;
    private int sum;
    private int sumOfEven;
    private int sumOfOdd;
    private double average;

    public Statistics() {
    }

    public void addNumber(int number) {
        if (number % 2 == 0) {
            sumOfEven += number;
        } else {
            sumOfOdd += number;
        }
        this.sum += number;
        count++;
    }

    public int getCount() {
        return this.count;
    }

    public int getSum() {
        return sum;
    }

    public int getSumOfEven() {
        return sumOfEven;
    }

    public int getSumOfOdd() {
        return sumOfOdd;
    }

    public double average() {
        return this.average += (double) sum / count;
    }

    public void inputNumbers() {
        boolean stop = false;

        while (!stop) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Please, enter a number:");
            int number = sc.nextInt();
            if (number != -1) {
                addNumber(number);
            } else {
                stop = true;
            }
        }
    }


    public static void main(String[] args) {
        System.out.println("Part 1:");

        Statistics statistics = new Statistics();
        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
        System.out.println();

        System.out.println("Part 2:");

        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.getSum());
        System.out.println("Average: " + statistics.average());
        System.out.println();

        System.out.println("Part 3:");

        Statistics statistics2 = new Statistics();

        statistics2.inputNumbers();

        System.out.println("Sum: " + statistics2.getSum());
        System.out.println();

        System.out.println("Part 4:");

        Statistics statistics3 = new Statistics();

        statistics3.inputNumbers();

        System.out.println("Sum: " + statistics3.getSum());
        System.out.println("Sum of even: " + statistics3.getSumOfEven());
        System.out.println("Sum of odd: " + statistics3.getSumOfOdd());
    }
}
