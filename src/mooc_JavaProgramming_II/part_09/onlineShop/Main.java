package mooc_JavaProgramming_II.part_09.onlineShop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Part 1:");
        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("milk", 3, 10);
        warehouse.addProduct("coffee", 5, 7);

        System.out.println("prices:");
        System.out.println("milk: " + warehouse.price("milk"));
        System.out.println("coffee: " + warehouse.price("coffee"));
        System.out.println("sugar: " + warehouse.price("sugar"));
        System.out.println();

        System.out.println("Part 2:");
        Warehouse warehouse2 = new Warehouse();
        warehouse2.addProduct("coffee", 5, 1);

        System.out.println("stock:");
        System.out.println("coffee:  " + warehouse2.stock("coffee"));
        System.out.println("sugar: " + warehouse2.stock("sugar"));

        System.out.println("taking coffee " + warehouse2.take("coffee"));
        System.out.println("taking coffee " + warehouse2.take("coffee"));
        System.out.println("taking sugar " + warehouse2.take("sugar"));

        System.out.println("stock:");
        System.out.println("coffee:  " + warehouse2.stock("coffee"));
        System.out.println("sugar: " + warehouse2.stock("sugar"));
        System.out.println();

        System.out.println("Part 3:");
        Warehouse warehouse3 = new Warehouse();
        warehouse3.addProduct("milk", 3, 10);
        warehouse3.addProduct("coffee", 5, 6);
        warehouse3.addProduct("buttermilk", 2, 20);
        warehouse3.addProduct("yogurt", 2, 20);

        System.out.println("products:");

        for (String product : warehouse3.products()) {
            System.out.println(product);
        }
        System.out.println();

        System.out.println("Part 4:");
        Item item = new Item("milk", 4, 2);
        System.out.println("An item that contains 4 milks has the total price of " + item.price());
        System.out.println(item);
        item.increaseQuantity();
        System.out.println(item);
        System.out.println();

        System.out.println("Part 5:");
        ShoppingCart cart = new ShoppingCart();
        cart.add("milk", 3);
        cart.add("buttermilk", 2);
        cart.add("cheese", 5);
        System.out.println("cart price: " + cart.price());
        cart.add("computer", 899);
        System.out.println("cart price: " + cart.price());
        System.out.println();

        System.out.println("Part 6-7:");
        ShoppingCart cart2 = new ShoppingCart();
        cart2.add("milk", 3);
        cart2.print();
        System.out.println("cart price: " + cart2.price() + "\n");

        cart2.add("buttermilk", 2);
        cart2.print();
        System.out.println("cart price: " + cart2.price() + "\n");

        cart2.add("milk", 3);
        cart2.print();
        System.out.println("cart price: " + cart2.price() + "\n");

        cart2.add("milk", 3);
        cart2.print();
        System.out.println("cart price: " + cart2.price() + "\n");
        System.out.println();

        System.out.println("Part 8:");
        Warehouse warehouse4 = new Warehouse();
        warehouse4.addProduct("coffee", 5, 10);
        warehouse4.addProduct("milk", 3, 20);
        warehouse4.addProduct("cream", 2, 55);
        warehouse4.addProduct("bread", 7, 8);

        Scanner scanner = new Scanner(System.in);

        Store store = new Store(warehouse4, scanner);
        store.shop("John");
    }
}
