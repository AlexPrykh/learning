package mooc_JavaProgramming_II.part_09.onlineShop;

/*
        Part 4: Item
        Товары могут быть добавлены в корзину (которую мы добавим в ближайшее время). Item - это товар
        с количеством. Например, вы добавляете в корзину элемент, представляющий один хлеб, или
        добавляете элемент, представляющий 24 кофе.

        Создайте класс Item и следующие методы:

        1. public Item(String product, int qty, int unitPrice); конструктор, который создает элемент,
           соответствующий продукту, указанному в качестве параметра.
           qty сообщает нам, сколько товаров находится в элементе,
           а unitPrice - это цена одного товара.
        2. public int price() вазвращает цену товара. Вы получаете цену товара, умножая его цену за
           единицу на его количество.
        3. public void increaseQuantity() увеличивает количество на единицу.
        4. public String toString() возвращает строковое представление элемента. который должен\
           соответствовать формату, показанному в примере ниже.

           Пример использования класса Item:

        Item item = new Item("milk", 4, 2);
        System.out.println("an item that contains 4 milks has the total price of " + item.price());
        System.out.println(item);
        item.increaseQuantity();
        System.out.println(item);
 */
public class Item {
    private String product;
    private int quantity;
    private int unitPrice;

    public Item(String product, int quantity, int unitPrice) {
        this.product = product;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public int price() {
        return quantity * unitPrice;
    }

    public void increaseQuantity() {
        quantity++;
    }

    @Override
    public String toString() {
        return product + ": " + quantity;
    }
}
