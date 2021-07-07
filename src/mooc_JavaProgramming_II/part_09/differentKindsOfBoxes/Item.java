package mooc_JavaProgramming_II.part_09.differentKindsOfBoxes;

/*
        В шаблоне упражнения вы найдете классы Item и Box. Box - это абстрактный класс, в котором
        добавление нескольких элементов реализуется путем многократного вызова add метода. Метод add,
        предназначенный для добавления одного элемента, является абстрактным, так что каждый класс,
        который наследует его, необходимо реализовать. Ваша задача - отредактировать класс Box и
        реализовать различные типы блоков на основе Box класса.

        Part 1: Editing the Item class
        Реализовать equals и hashCode методы Item-класса. Они нужны, чтобы вы могли использовать
        contains методы различных списков и коллекций. Реализуйте методы таким образом, чтобы
        значение weight переменной экземпляра Item класса не учитывалось.
 */
public class Item {
    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }

        if (!(object instanceof Item)) {
            return false;
        }

        Item comparedItem = (Item) object;

        if (this.name.equals(comparedItem.name)) {
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}
