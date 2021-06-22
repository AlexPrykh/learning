package exercise2.cargoHold;

import java.util.ArrayList;

/*
        Part 2: Suitcase-класс
        Создайте Suitcase класс. В чемодане есть предметы, а максимальный вес определяет
        максимальный общий вес предметов.

        Добавьте в класс следующие методы:

    Конструктор, на который рассчитан максимальный вес
    Метод public void addItem(Item item), который добавляет в чемодан предмет, переданный
    в качестве параметра. Метод не возвращает значения.
    Метод public String toString(), возвращающий строку «x шт. (Y кг)».

    Желательно хранить предметы в ArrayList объекте:

    ArrayList<Item> items = new ArrayList<>();

    Класс Suitcase должен гарантировать, что общий вес предметов в нем не превышает
    максимально допустимого веса. Если этот предел будет превышен в результате добавления
    элемента, метод addItem не должен добавлять новый элемент в чемодан.

        Part 3: Форматирование языка
        Выражение «1 items» не совсем коректен - лучше было бы «1 item». Отсутствие предметов
        также может быть выражено как «нет предметов». Внесите это изменение в метод
        toString Suitcase класса.

        Part 4:
        Добавьте в Suitcase класс следующие методы:

    printItems метод, который печатает все элементы в чемодане
    totalWeight метод, который возвращает общий вес предметов

        Part 5:
        Добавьте в Suitcase класс метод heaviestItem, который возвращает самый большой
        элемент в зависимости от веса. Если несколько предметов имеют наибольший вес,
        метод может вернуть любой из них. Метод должен возвращать ссылку на объект.
        Если чемодан пустой, верните значение null.
 */
public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        if (this.totalWeight() + item.getWeight() <= maxWeight) {
            this.items.add(item);
        }
    }

    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        int sumOfWeights = 0;
        for (Item item : items) {
            sumOfWeights += item.getWeight();
        }

        return sumOfWeights;
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        Item heaviestObject = this.items.get(0);

        for (Item item : items) {
            if (heaviestObject.getWeight() < item.getWeight()) {
                heaviestObject = item;
            }
        }
        return heaviestObject;
    }

    @Override
    public String toString() {
        String itemString = "";

        if (items.size() == 0) {
            itemString = "no items" + " (" + this.totalWeight() + " kg)";
        } else if (items.size() == 1) {
            itemString = this.items.size() + " item (" + this.totalWeight() + " kg)";
        } else {
            itemString = this.items.size() + " items (" + this.totalWeight() + " kg)";
        }
        return itemString;
    }
}
