package exercise;

/*
    Создайте класс Multiplier, который имеет:

    Конструктор public Multiplier(int number).
    Метод, public int multiply(int number) который возвращает number переданное ему значение,
    умноженное на number предоставленное конструктору.

    В этом упражнении вам также необходимо создать переменную экземпляра.
 */
public class Multiplier {
    int number;

    public Multiplier(int number) {
        this.number = number;
    }

    public static void main(String[] args) {
        Multiplier multiplyByThree = new Multiplier(3);

        System.out.println("multiplyByThree.multiply(2): " + multiplyByThree.multiply(2));

        Multiplier multiplyByFour = new Multiplier(4);

        System.out.println("multiplyByFour.multiply(2): " + multiplyByFour.multiply(2));
        System.out.println("multiplyByThree.multiply(1): " + multiplyByThree.multiply(1));
        System.out.println("multiplyByFour.multiply(1): " + multiplyByFour.multiply(1));
    }

    private int multiply(int number) {
        return number * this.number;
    }
}
