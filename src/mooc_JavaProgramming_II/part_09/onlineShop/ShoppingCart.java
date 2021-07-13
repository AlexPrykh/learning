package mooc_JavaProgramming_II.part_09.onlineShop;

import java.util.HashMap;
import java.util.Map;

/*
        Part 5: Shopping cart
        Наконец-то мы реализовали класс корзины покупок!

        Внутри ShoppingCart хранит продукты, добавленные туда как Item-объекты. В ShoppingCart должна быть
        переменная экземпляра либо с типом Map<String, Item>, либо с типом List<Item>. Не добавляйте
        никакие другие переменные экземпляра в класс ShoppingCart, кроме List или Map, используемых
        для хранения элементов.

        NB: если вы сохраните элементы в переменной типа Map, вы обнаружите, что этот метод values()
        весьма полезен для просмотра всех объектов элементов, хранящихся в нем, как для этой части
        упражнения, так и для следующей.

        Сначала давайте создадим ShoppingCart конструктор без параметров, со следующими методами:

        1. public void add(String product, int price) добавляет в корзину элемент, который соответствует
           продукту, указанному в качестве параметра, с ценой, указанной в качестве параметра.
        2. public int price() возвращает полную стоимость корзины.

        Part 6: Printing the cart
        Реализуйте метод public void print() корзины покупок. Метод печатает Item-объекты в корзине.
        Порядок, в котором они печатаются, не имеет значения.
        NB: напечатанное число - это количество в корзине, а не цена!

        Prt 7: One item per product
        Давайте изменим нашу корзину так, чтобы, если добавляется продукт, который уже находится в корзине,
        мы не добавляем новый элемент, а вместо этого обновляем элемент, уже находящийся в корзине,
        вызывая его метод увеличения Quantity().
 */
public class ShoppingCart {
    private Map<String, Item> list;

    public ShoppingCart() {
        this.list = new HashMap<>();
    }

    public void add(String product, int price) {
        list.putIfAbsent(product, new Item(product, 0, price));
        list.get(product).increaseQuantity();
    }

    public int price() {
        int price = 0;
        for (Item item : list.values()) {
            price += item.price();
        }
        return price;
    }

    public void print() {
        for (Item item : list.values()) {
            System.out.println(item.toString());
        }
    }
}
