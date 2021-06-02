package exercise;

/*
    Создайте класс Product, представляющий товар в магазине.
    У товара должна быть цена (double), количество (int) и имя (String).

    В классе должны быть:

    конструктор public Product (String initialName, double initialPrice, int initialQuantity)
    метод, public void printProduct()который распечатывает информацию о продукте в следующем формате:

    Банан, цена 1.1, 13 шт.
 */
public class Product {
    private String name;
    private double price;
    private int quantity;

    public Product(String initialName, double initialPrice, int initialQuantity) {
        this.name = initialName;
        this.price = initialPrice;
        this.quantity = initialQuantity;
    }

    public void printProduct() {
        System.out.println("Product: " + this.name + ", price " + this.price +
                ", quantity of " + this.quantity);
    }
}
