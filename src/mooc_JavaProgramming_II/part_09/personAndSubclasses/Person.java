package mooc_JavaProgramming_II.part_09.personAndSubclasses;

/*
    Part 1: Person
    Создайте класс Person. Класс должен работать следующим образом:

    Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
    Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
    System.out.println(ada);
    System.out.println(esko);
 */
public class Person {
    private String name;
    private String placeOfResidence;

    public Person(String name, String placeOfResidence) {
        this.name = name;
        this.placeOfResidence = placeOfResidence;
    }

    @Override
    public String toString() {
        return this.name + "\n " + this.placeOfResidence;
    }
}
