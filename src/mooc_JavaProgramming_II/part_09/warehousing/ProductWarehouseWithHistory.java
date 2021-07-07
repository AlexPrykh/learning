package mooc_JavaProgramming_II.part_09.warehousing;

/*
        Part 5: Product warehouse with history, step 1
        Реализовать ProductWarehouseWithHistory как подкласс ProductWarehouse. В дополнение ко всем
        предыдущим функциям этот новый склад также предоставляет услуги, связанные с историей изменений
        складских запасов. История управляется с помощью ChangeHistory объекта.

        Публичные конструкторы и методы:

        1. public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance)
           создает склад продуктов. Название продукта, емкость и начальный баланс указываются в качестве
           параметров. Установите начальный баланс как начальный баланс склада, а также первое значение
           истории изменений.
        2. public String history() возвращает историю продукта следующим образом [0.0, 119.2, 21.2].
           Используйте строковое представление объекта ChangeHistory как есть.
     В этой начальной версии история еще не работает должным образом; в настоящее время он запоминает
     только начальный баланс.

        Пример использования:

        // the usual:
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName()); // Juice
        juice.addToWarehouse(1.0);
        System.out.println(juice);           // Juice: balance = 989.7, space left 10.3

        // etc

        // however, history() still doesn't work properly:
        System.out.println(juice.history()); // [1000.0]
        // so we only get the initial state of the history set by the constructor...

        Part 6: Product warehouse with history, step 2
        Пора творить историю! Первая версия ничего не знала, кроме исходного состояния истории.
        Разверните класс следующими методами:

        3. public void addToWarehouse(double amount) работает так же, как метод в Warehouse классе,
           но мы также записываем измененное состояние в историю. NB: значение, записанное в истории,
           должно быть балансом склада после добавления, а не добавленной суммой!
        4. public double takeFromWarehouse(double amount) работает так же, как метод в Warehouse классе,
           но мы также записываем измененное состояние в историю. NB: значение, записанное в истории,
           должно быть остатком на складе после удаления, а не удаленной суммой!
        Пример использования:

        // the usual:
        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juice.takeFromWarehouse(11.3);
        System.out.println(juice.getName()); // Juice
        juice.addToWarehouse(1.0);
        System.out.println(juice);           // Juice: balance = 989.7, space left 10.3

        // etc

        // and now we have the history:
        System.out.println(juice.history()); // [1000.0, 988.7, 989.7]

        Part 7: Product warehouse with history, step 3
        Разверните класс с помощью метода:

        5. public void printAnalysis () , который печатает информацию, связанную с историей продукта,
           как показано в примере.
        Пример использования:

        ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
        juice.takeFromWarehouse(11.3);
        juice.addToWarehouse(1.0);
        //System.out.println(juice.history()); // [1000.0, 988.7, 989.7]

        juice.printAnalysis();
 */
public class ProductWarehouseWithHistory extends ProductWarehouse {
    private ChangeHistory history;

    public ProductWarehouseWithHistory(String name, double capacity, double initialBalance) {
        super(name, capacity);
        this.setBalance(initialBalance);
        this.history = new ChangeHistory();
        this.history.add(initialBalance);
    }

    public String history() {
        return this.history.toString();
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.history.add(this.getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount) {
        double realAmount = super.takeFromWarehouse(amount);
        this.history.add(this.getBalance());
        return realAmount;
    }

    public void printAnalysis() {
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + this.history.toString());
        System.out.println("Largest amount of product: " + this.history.maxValue());
        System.out.println("Smallest amount of product: " + this.history.minValue());
        System.out.println("Average: " + this.history.average());
    }
}
