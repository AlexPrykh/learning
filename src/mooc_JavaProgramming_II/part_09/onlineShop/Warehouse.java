package mooc_JavaProgramming_II.part_09.onlineShop;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
        Part 1: Warehouse
        Создайте класс Warehouse с помощью следующих методов:

        1. public void addProduct(String product, int price, int stock), который добавляет товар на склад
           с указанием цены и остатка на складе в качестве параметров.
        2. public int price(String product), который возвращает в качестве параметра цену полученного
           товара. Если товар не был добавлен на склад, метод должен вернуть -99.

    Товары на складе (а в следующей части их запасы) должны храниться в переменной типа
    Map<String, Integer>! Созданный объект может быть HashMap, но его тип должен быть интерфейсом Map,
    а не какой-либо реализацией этого интерфейса.

        Part 2: Products stock balance
        Сохраните остаток товаров на складе в переменной с типом Map<String, Integer>, точно так же,
        как сохранялись цены. Дополнять склад можно следующими способами:

        3. public int stock(String product) возвращает текущий остаток товара на складе. Если товар
           не был добавлен на склад, метод должен вернуть 0.
        4. public boolean take(String product) уменьшает на единицу оставшийся запас для продукта,
           который он получил в качестве параметра, и возвращает true, если оставшийся запас был.
           Если товара на складе не было, метод возвращает false. Запасы продуктов не могут опуститься
           ниже нуля.

        Part 3: Listing the products
        Добавим на склад еще один метод:

        5. public Set<String> products() возвращает наименования товаров на складе в виде набора
           Этот метод легко реализовать с помощью HashMap. Вы можете получить товары на складе либо
           с Карты, на которой хранятся цены, либо с карты с текущими запасами, используя метод keySet().

 */
public class Warehouse {
    private Map<String, Integer> prices;
    private Map<String, Integer> stocks;

    public Warehouse() {
        this.prices = new HashMap<>();
        this.stocks = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.prices.put(product, price);
        this.stocks.put(product, stock);
    }

    public int price(String product) {
        return prices.getOrDefault(product, -99);
    }

    public int stock(String product) {
        return stocks.getOrDefault(product, 0);
    }

    public boolean take(String product) {
        if (stocks.containsKey(product)) {
            int stock = stocks.get(product);
            if (stock > 0) {
                stock--;
                stocks.replace(product, stock);
                return true;
            }
        }
        return false;
    }

    public Set<String> products() {
        return prices.keySet();
    }
}
