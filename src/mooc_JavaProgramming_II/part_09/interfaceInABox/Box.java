package mooc_JavaProgramming_II.part_09.interfaceInABox;

import java.util.ArrayList;

/*
        Part 2: Box
        Сделайте класс с именем Box. Элементы, реализующие Packable интерфейс, можно упаковать в коробку.
        Конструктор Box принимает максимальную емкость коробки в килограммах в качестве параметра.
        Общий вес всех предметов в ящике не может превышать максимальную вместимость ящика.

        Part 3: Box weight
        Если вы создали переменную класса double weight в классе Box, замените ее методом, вычисляющим
        вес коробки:

        public class Box {
        //...

        public double weight() {
        double weight = 0;
        // calculate the total weight of the items in the box
        return weight;
       }
    }
        Когда вам нужен вес коробки, например, при добавлении нового предмета в коробку, вы можете
        просто вызвать метод weight().

        Метод также может возвращать значение объектной переменной. Однако здесь мы практикуем ситуацию,
        когда нам не нужно явно поддерживать объектную переменную, но мы можем вычислить ее значение
        по мере необходимости. После следующего упражнения сохранение weight как объектной переменной
        все равно не будет работать. После выполнения упражнения есть время подумать, почему это так.

        Part 4: A Box is packable too!
        Для реализации Packable интерфейса требуется, чтобы у класса был метод double weight().
        Мы только что добавили этот метод в класс Box. Это означает, что мы можем сделать коробку
        также упаковываемой!

        Боксы - это объекты, которые могут содержать объекты, реализующие Интерфейс packable. Коробки
        также реализуют этот интерфейс. Таким образом, коробка может содержать другие коробки!

        Попробуйте это. Сделайте несколько коробок, содержащих некоторые предметы, и добавьте несколько
        коробок поменьше в коробку побольше. Попробуйте, что получится, когда вы поместите коробку в себя.
        Почему это происходит?
 */
public class Box implements Packable {
    private ArrayList<Packable> list;
    private double capacity;

    public Box(double capacity) {
        this.list = new ArrayList<>();
        this.capacity = capacity;
    }

    @Override
    public double weight() {
        double weight = 0.0;
        for (Packable item : list) {
            weight += item.weight();
        }
        return weight;
    }

    public void add(Packable packable) {
        if (packable.weight() <= (this.capacity - this.weight())) {
            this.list.add(packable);
        }
    }

    @Override
    public String toString() {
        return "Box: " + list.size() + " items, total weight " + this.weight() + " kg";
    }
}
