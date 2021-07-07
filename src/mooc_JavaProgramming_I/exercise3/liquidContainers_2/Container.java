package mooc_JavaProgramming_I.exercise3.liquidContainers_2;

/*
        Part 1: Container
        Создайте класс под названием Container. У класса должен быть конструктор,
        который не принимает никаких параметров, и следующие методы:

    1. public int contains() который возвращает количество жидкости в контейнере в виде целого числа.
    2. public void add(int amount) который добавляет в контейнер количество жидкости,
       заданное в качестве параметра. Если сумма отрицательная, жидкость не добавляется.
       Емкость может вместить не более 100 единиц жидкости.
    3. public void remove(int amount) который удаляет количество жидкости, указанное в качестве
       параметра, из контейнера. Если сумма отрицательная, жидкость не удаляется. Контейнер
       никогда не может вместить менее 0 единиц жидкости.
    4. public String toString() который возвращает контейнер в виде строки в формате
       « количество жидкости / 100», например «32/100».
 */
public class Container {
    private int totalAmount;

    public Container() {
        this.totalAmount = totalAmount;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void add(int amount) {
        if (amount < 0) {
            return;
        }

        if (amount > 0) {
            totalAmount += amount;
        }

        if (totalAmount > 100) {
            totalAmount = 100;
        }
    }

    public void remove(int amount) {
        if (amount < 0) {
            return;
        }
        if (totalAmount - amount < 0) {
            totalAmount = 0;
        } else {
            totalAmount -= amount;
        }
    }

    @Override
    public String toString() {
        return totalAmount + "/" + "100";
    }
}
