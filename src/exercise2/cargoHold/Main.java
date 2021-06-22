package exercise2.cargoHold;

public class Main {
    public static void main(String[] args) {
        System.out.println("Part 1:");
        Item book = new Item("The lord of the rings", 2);
        Item phone = new Item("Nokia 3210", 1);

        System.out.println("The book's name: " + book.getName());
        System.out.println("The book's weight: " + book.getWeight());

        System.out.println("Book: " + book);
        System.out.println("Phone: " + phone);
        System.out.println();

        System.out.println("Part 2, 3:");
        Item brick = new Item("Brick", 4);

        Suitcase suitcase = new Suitcase(5);
        System.out.println(suitcase);

        suitcase.addItem(book);
        System.out.println(suitcase);

        suitcase.addItem(phone);
        System.out.println(suitcase);

        suitcase.addItem(brick);
        System.out.println(suitcase);
        System.out.println();

        System.out.println("Part 4:");
        Suitcase suitcase2 = new Suitcase(10);
        suitcase2.addItem(book);
        suitcase2.addItem(phone);
        suitcase2.addItem(brick);

        System.out.println("The suitcase contains the following items:");
        suitcase2.printItems();
        System.out.println("Total weight: " + suitcase2.totalWeight() + " kg");
        System.out.println();

        System.out.println("Part 5:");
        Item heaviest = suitcase2.heaviestItem();
        System.out.println("Heaviest item: " + heaviest);
        System.out.println();

        System.out.println("Part 6:");
        Suitcase adasCase = new Suitcase(10);
        adasCase.addItem(book);
        adasCase.addItem(phone);

        Suitcase pekkasCase = new Suitcase(10);
        pekkasCase.addItem(brick);

        Hold hold = new Hold(1000);
        hold.addSuitcase(adasCase);
        hold.addSuitcase(pekkasCase);

        System.out.println(hold);
        System.out.println();

        System.out.println("Part 7:");
        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();
    }
}
