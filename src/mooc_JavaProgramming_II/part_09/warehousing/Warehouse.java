package mooc_JavaProgramming_II.part_09.warehousing;

/*
        Шаблон упражнения содержит класс Warehouse, в котором есть следующие конструкторы и методы:

        1. public Warehouse(double capacity) - создает пустой склад, вместимость которого указана в
           качестве параметра; недопустимая емкость (<= 0) создает бесполезный склад с емкостью 0.

        2. public double getBalance() - возвращает баланс склада, то есть емкость, которая занята
           товарами на складе.
        3. public double getCapacity() - возвращает общую емкость склада (то есть ту, которая была
           указана в конструкторе).
        4. public double howMuchSpaceLeft() - возвращает значение, показывающее, сколько места осталось
           на складе.
        5. public void addToWarehouse (double amount) - добавляет нужную сумму на склад; если сумма
           отрицательная, ничего не меняется, а если все не влезает, то склад заполняется, а
           остальное «выбрасывается» / «переливается».
        6. public double takeFromWarehouse(double amount) - забрать нужную сумму со склада. Метод
           возвращает то, что мы действительно получаем. Если желаемая сумма отрицательна, ничего
           не меняется, и мы возвращаем 0. Если желаемая сумма больше, чем сумма, содержащаяся на
           складе, мы получаем все, что можно взять, и склад опустошается.
        7. public String toString () - возвращает состояние объекта, представленного в виде строки,
           подобной этой balance = 64.5, space left 123.5

    В этом упражнении мы строим варианты склада на основе класса Warehouse.
 */
public class Warehouse {
    private double capacity;
    private double balance;

    public Warehouse(double capacity) {
        if (capacity > 0.0) {
            this.capacity = capacity;
        } else {
            this.capacity = 0.0;
        }
        this.balance = 0.00;
    }

    public double getBalance() {
        return balance;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double howMuchSpaceLeft() {
        return this.capacity - this.balance;
    }

    public void addToWarehouse(double amount) {
        if (amount < 0.0) {
            return;
        }

        if (amount <= howMuchSpaceLeft()) {
            this.balance += amount;
        } else {
            this.balance = this.capacity;
        }
    }

    public double takeFromWarehouse(double amount) {
        if (amount < 0.0) {
            return 0.0;
        }

        if (amount > this.balance) {
            double allThatWeCan = this.balance;
            this.balance = 0.0;
            return allThatWeCan;
        }

        this.balance -= amount;
        return amount;
    }

    @Override
    public String toString() {
        return "balance = " + this.balance + ", space left " + howMuchSpaceLeft();
    }
}
