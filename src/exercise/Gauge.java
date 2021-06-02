package exercise;

/*
    Создайте класс Gauge. Датчик имеет переменную экземпляра
    private int value, конструктор без параметров (устанавливает начальное значение
    переменной счетчика равным 0), а также следующие четыре метода:

    Метод public void increase() увеличивает значение value переменной экземпляра на единицу.
    Но не увеличивает значение выше пяти.

    Метод public void decrease() уменьшает значение value переменной экземпляра на единицу.
    Но не уменьшает значение до отрицательных чисел.

    Метод public int value() возвращает значение value переменной.

    Метод public boolean full() возвращает значение true, если переменная экземпляра value
    имеет значение пять. В противном случае возвращается false.

 */
public class Gauge {
    private int value;

    public Gauge() {
        this.value = 0;
    }

    public static void main(String[] args) {
        Gauge g = new Gauge();

        while (!g.full()) {
            System.out.println("Not full! Value: " + g.value());
            g.increase();
        }

        System.out.println("Full! Value: " + g.value());
        g.decrease();
        System.out.println("Not full! Value: " + g.value());
    }

    private boolean full() {
        if (value == 5) {
            return true;
        } else {
            return false;
        }
    }

    private int value() {
        return this.value;
    }

    private void decrease() {
        this.value -= 1;
        if (value < 0) {
            this.value = 0;
        }
    }

    private void increase() {
        this.value += 1;
    }
}
