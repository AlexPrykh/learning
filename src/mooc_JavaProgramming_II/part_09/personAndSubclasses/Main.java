package mooc_JavaProgramming_II.part_09.personAndSubclasses;

import java.util.ArrayList;

/*
        Part 5: List all Persons
        Напишите метод public static void printPersons(ArrayList<Person> persons) в классе Main.
        Метод печатает всех людей в списке, указанном в качестве параметра. При вызове из main метода
        метод должен действовать следующим образом :

    public static void main(String[] args) {
    ArrayList<Person> persons = new ArrayList<Person>();
    persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
    persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

    printPersons(persons);
}
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Part 1:");
        Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
        System.out.println(ada);
        System.out.println(esko);
        System.out.println();

        System.out.println("Part 2:");
        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);
        System.out.println("Study credits " + ollie.credits());
        ollie.study();
        System.out.println("Study credits " + ollie.credits());
        System.out.println();

        System.out.println("Part 3:");
        Student ollie2 = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie2);
        ollie2.study();
        System.out.println(ollie2);
        System.out.println();

        System.out.println("Part 4:");
        Teacher ada2 = new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN",
                1200);
        Teacher esko2 = new Teacher("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki",
                5400);
        System.out.println(ada2);
        System.out.println(esko2);

        Student ollie3 = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");

        for (int i = 0; i < 25; i++) {
            ollie3.study();
        }
        System.out.println(ollie3);
        System.out.println();

        System.out.println("Part 5:");
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN",
                1200));
        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));

        printPersons(persons);
    }

    private static void printPersons(ArrayList<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
