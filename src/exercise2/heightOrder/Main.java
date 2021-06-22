package exercise2.heightOrder;

public class Main {
    public static void main(String[] args) {
        System.out.println("Part 1:");
        Room room = new Room();
        System.out.println("Empty room? " + room.isEmpty());
        room.add(new Person("Lea", 183));
        room.add(new Person("Kenya", 182));
        room.add(new Person("Auli", 186));
        room.add(new Person("Nina", 172));
        room.add(new Person("Terhi", 185));
        System.out.println("Empty room? " + room.isEmpty());

        System.out.println("");
        for (Person person : room.getPersons()) {
            System.out.println(person);
        }
        System.out.println();

        System.out.println("Part 2:");
        System.out.println("Shortest: " + room.shortest());
        System.out.println("");
        for (Person person : room.getPersons()) {
            System.out.println(person);
        }
        System.out.println();

        System.out.println("Part 3:");
        System.out.println("Shortest: " + room.take());
        System.out.println("");
        for (Person person : room.getPersons()) {
            System.out.println(person);
        }
        System.out.println();

        System.out.println("In height:");
        Room room2 = new Room();
        room2.add(new Person("Lea", 183));
        room2.add(new Person("Kenya", 182));
        room2.add(new Person("Auli", 186));
        room2.add(new Person("Nina", 172));
        room2.add(new Person("Terhi", 185));

        while (!room2.isEmpty()) {
            System.out.println(room2.take());
        }
    }
}
