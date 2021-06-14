package exercise;

import java.util.ArrayList;
import java.util.Scanner;

/*
    После того, как пользователь ввел последний набор данных (он вводит пустое имя),
    выйдите из оператора повтора.

    Затем распечатайте собранную личную информацию, чтобы каждый введенный объект был
    напечатан в следующем формате: имя и фамилия, разделенные пробелом.

    Пример вывода
    Имя: Жан
    Фамилия: Бартик
    Идентификационный номер: 271224
    Имя: Бетти
    Фамилия: Холбертон
    Идентификационный номер: 070317

    Имя:
    Жан Бартик Бетти Холбертон
 */
public class PersonalInformation {
    private String name;
    private String surname;
    private int IdentificationNumber;

    public PersonalInformation(String name, String surname, int IdentificationNumber) {
        this.name = name;
        this.surname = surname;
        this.IdentificationNumber = IdentificationNumber;
    }

    @Override
    public String toString() {
        return this.name + " " + this.surname;
    }

    public static void main(String[] args) {
        ArrayList<PersonalInformation> personalInformation = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Please, enter a name:");
            String name = sc.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.println("Please, enter a surname");
            String surname = sc.nextLine();

            System.out.println("Please, enter your identification number:");
            int identificationNumber = sc.nextInt();

            sc.nextLine();

            personalInformation.add(new PersonalInformation(name, surname, identificationNumber));
        }
        for (PersonalInformation name : personalInformation) {
            System.out.println(name);
        }
    }
}
