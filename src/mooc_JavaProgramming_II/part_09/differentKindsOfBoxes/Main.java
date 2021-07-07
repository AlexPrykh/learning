package mooc_JavaProgramming_II.part_09.differentKindsOfBoxes;

public class Main {
    public static void main(String[] args) {
        System.out.println("Part 1-2:");
        BoxWithMaxWeight coffeeBox = new BoxWithMaxWeight(10);
        coffeeBox.add(new Item("Saludo", 5));
        coffeeBox.add(new Item("Pirkka", 5));
        coffeeBox.add(new Item("Kopi Luwak", 5));

        System.out.println(coffeeBox.isInBox(new Item("Saludo")));
        System.out.println(coffeeBox.isInBox(new Item("Pirkka")));
        System.out.println(coffeeBox.isInBox(new Item("Kopi Luwak")));
        System.out.println();

        System.out.println("Part 3:");

        OneItemBox box = new OneItemBox();
        box.add(new Item("Saludo", 5));
        box.add(new Item("Pirkka", 5));

        System.out.println(box.isInBox(new Item("Saludo")));
        System.out.println(box.isInBox(new Item("Pirkka")));
        System.out.println();

        System.out.println("Part 4:");

        MisplacingBox mispBox = new MisplacingBox();
        box.add(new Item("Saludo", 5));
        box.add(new Item("Pirkka", 5));

        System.out.println(mispBox.isInBox(new Item("Saludo")));
        System.out.println(mispBox.isInBox(new Item("Pirkka")));
    }
}
