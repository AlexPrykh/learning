package mooc_JavaProgramming_I.exercise;

/*
        Шаблон упражнения определяет класс агента, имеющий имя и фамилию.
        Для print класса определен метод, который создает следующее строковое представление.

        Agent bond = new Agent("James", "Bond");
        bond.print();

        Удалите метод класса print и создайте public String toString()
        для него метод, который возвращает строковое представление, показанное выше.
 */
public class Agent {
    String name;
    String surname;

    public Agent(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "My name is " + this.name + ", " + this.name + " " + this.surname;
    }

    public static void main(String[] args) {
        Agent bond = new Agent("James", "Bond");

        bond.toString();
        System.out.println(bond);

        Agent ionic = new Agent("Ionic", "Bond");
        System.out.println(ionic);
    }
}
