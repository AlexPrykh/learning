package mooc_JavaProgramming_I.exercise2.cargoHold;

/*
        Part 1: Item-класс
        Создайте Item класс, из которого можно создавать экземпляры объектов для представления
        различных элементов. Информация для сохранения - это название и вес предмета (кг).

    Добавьте в класс следующие методы:

    Конструктор, который принимает имя и вес элемента в качестве параметров
    Метод public String getName(), возвращающий название предмета
    Метод public int getWeight(), возвращающий вес предмета
    Метод public String toString(), возвращающий строку «имя (вес, кг)»

 */
public class Item {
    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.weight + " kg)";
    }
}
