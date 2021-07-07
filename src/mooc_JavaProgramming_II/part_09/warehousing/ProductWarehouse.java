package mooc_JavaProgramming_II.part_09.warehousing;

/*
        Part 1: Product warehouse, step 1
        Класс Warehouse обрабатывает функции, связанные с количеством продукта. Теперь нам нужно название
        продукта и способ его обработки. Давайте напишем ProductWarehouse как подкласс Warehouse! Сначала
        мы просто создадим частную объектную переменную для имени продукта, конструктор и получатель
        для поля имени:

        1. public ProductWarehouse(String productName, double capacity) - создает пустой склад продуктов.
           В качестве параметров указывается наименование товара и вместимость склада.
        2. public String getName() - возвращает название продукта.

    Напомните себе, как конструктор может запустить конструктор суперкласса в качестве своего первого
    действия!

        Part 2: Product warehouse, step 2
        Как видно из предыдущего примера, toString() унаследованный от объекта ProductWarehouse
        объект (очевидно!) ничего не знает о названии продукта. Что-то нужно делать! Давайте также
        добавим сеттер для названия продукта, пока мы на нем:

        public void setName (String newName) - устанавливает новое имя для продукта.
        public String toString () - возвращает состояние объекта, представленного в виде строки,
        подобной этой Juice: balance = 64.5, space left 123.5

    Новый toString() метод может быть написан с использованием унаследованных от суперкласса геттеров,
    которые предоставят доступ к значениям унаследованных, но все еще скрытых полей. Однако суперкласс
    уже имеет желаемую функциональность для обеспечения строкового представления состояния хранилища,
    так зачем же воссоздавать эту функциональность? Просто воспользуйтесь преимуществом по наследству
    toString().

    Напомните себе, как вызвать переопределенный метод в подклассе!
 */
public class ProductWarehouse extends Warehouse {
    private String name;

    public ProductWarehouse(String name, double capacity) {
        super(capacity);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name + ": " + super.toString();
    }
}
