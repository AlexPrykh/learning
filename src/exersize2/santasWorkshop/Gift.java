package exersize2.santasWorkshop;
/*
    В этом упражнении мы попрактикуемся в упаковке подарков. Создадим классы Gift и Package.
    У подарка есть название и вес, а в упаковке есть подарки.

    Part 1: Gift-класс
    Создайте Gift класс, в котором объекты, созданные из него, представляют различные
    виды подарков. Записываемая информация - это название и вес предмета (кг).

    Добавьте в класс следующие методы:

    Конструктор, для которого в качестве параметров указаны название и вес подарка.
    Метод public String getName(), возвращающий название подарка
    Метод public int getWeight(), возвращающий вес подарка
    Метод public String toString(), возвращающий строку в виде «имя (вес, кг)».
 */
public class Gift {
    private String name;
    private int weight;

    public Gift(String name, int weight) {
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
        return this.name + " (" + this.weight + " kg).";
    }
}
