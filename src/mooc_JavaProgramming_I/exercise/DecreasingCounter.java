package mooc_JavaProgramming_I.exercise;

/*
        Part 1: Реализация метода декремента ()
    Реализуйте decrement() метод в теле класса таким образом,
    чтобы он уменьшал value переменную вызываемого объекта на единицу.
    После того, как вы закончите работу с decrement() методом,
    основная программа из предыдущего примера должна работать для создания выходных данных примера.

        Part 2: Значение счетчика не может быть отрицательным
    Реализуйте decrement()так, чтобы значение счетчика никогда
    не становилось отрицательным. Это означает, что если значение
    счетчика равно 0, его нельзя уменьшить. Здесь полезен условный оператор.

        Part 3: Сброс значения счетчика
    Создайте метод public void reset() для счетчика,
    который сбрасывает значение счетчика на 0.

 */
public class DecreasingCounter {
    private int value;

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        if (value > 0) {
            this.value--;
        }
    }

    public void reset() {
        this.value = 0;
    }

    public static void main(String[] args) {
        System.out.println("Part 1:");
        DecreasingCounter counter = new DecreasingCounter(10);

        counter.printValue();

        counter.decrement();
        counter.printValue();

        counter.decrement();
        counter.printValue();

        System.out.println();

        System.out.println("Part 2:");
        DecreasingCounter counter2 = new DecreasingCounter(2);

        counter2.printValue();

        counter2.decrement();
        counter2.printValue();

        counter2.decrement();
        counter2.printValue();

        counter2.decrement();
        counter2.printValue();

        System.out.println();

        System.out.println("Part 3:");
        DecreasingCounter counter3 = new DecreasingCounter(100);

        counter3.printValue();

        counter3.reset();
        counter3.printValue();

        counter3.decrement();
        counter3.printValue();
    }
}
