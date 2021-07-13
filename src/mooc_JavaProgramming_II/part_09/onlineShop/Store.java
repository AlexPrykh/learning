package mooc_JavaProgramming_II.part_09.onlineShop;

import java.util.Scanner;

/*
        Part 8: Store
        Теперь у нас есть все необходимые детали для нашего «интернет-магазина», кроме самого магазина.
        Сделаем это дальше. В нашем магазине есть склад, на котором представлена вся наша продукция.
        Для каждого «посещения» у нас есть корзина. Каждый раз, когда покупатель выбирает товар,
        он добавляется в корзину, если он есть на складе. При этом запас на складе уменьшается на единицу.

        Ниже вы найдете шаблон текстового пользовательского интерфейса для нашего магазина.
        Создайте Store класс для своего проекта и скопируйте туда код ниже.

        Ниже приводится основной метод, при котором Джона пополняется на складе и отправляется в магазин
        за покупками.

        Warehouse warehouse = new Warehouse();
        warehouse.addProduct("coffee", 5, 10);
        warehouse.addProduct("milk", 3, 20);
        warehouse.addProduct("cream", 2, 55);
        warehouse.addProduct("bread", 7, 8);

        Scanner scanner = new Scanner(System.in);

        Store store = new Store(warehouse, scanner);
        store.shop("John");

        Магазин почти готов. В методе public void shop(String customer) есть часть, которую нужно
        заполнить, отмеченная комментариями. В отмеченной части добавьте код, который проверяет,
        доступен ли продукт, запрошенный клиентом, и есть ли его запас на складе. В таком случае
        уменьшите количество товаров на складе и добавьте товар в корзину.
 */
public class Store {
    private Warehouse warehouse;
    private Scanner scanner;

    public Store(Warehouse warehouse, Scanner scanner) {
        this.warehouse = warehouse;
        this.scanner = scanner;
    }

    // the method that handles the customers visit to the store.
    public void shop(String customer) {
        ShoppingCart cart = new ShoppingCart();
        System.out.println("Welcome to the store " + customer);
        System.out.println("our selection:");

        for (String product : this.warehouse.products()) {
            System.out.println(product);
        }

        while (true) {
            System.out.print("What to put in the cart (press enter to go to the register): ");
            String product = scanner.nextLine();
            if (product.isEmpty()) {
                break;
            }
            // Add code here that adds the product to the cart,
            // If there is any in the warehouse, and reduces the stock in the warehouse
            // Don't touch any of the other code!
            if (warehouse.stock(product) != 0) {
                warehouse.take(product);

                cart.add(product, warehouse.price(product));
            }
        }

        System.out.println("your shopping cart contents:");
        cart.print();
        System.out.println("total: " + cart.price());
    }
}
