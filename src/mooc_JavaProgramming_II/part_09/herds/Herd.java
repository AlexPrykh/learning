package mooc_JavaProgramming_II.part_09.herds;

import java.util.ArrayList;

/*
        Part 2: Implementing the Herd
        Создайте класс с именем Herd, реализующий интерфейс Movable. Herd состоит из нескольких объектов,
        реализующих интерфейс Movable. Они должны храниться, например, в структуре данных списка.

        У Herd класса должен быть следующий API.

        1. public String toString ()
           Возвращает строковое представление позиций членов стада, каждого в отдельной строке.
        2. public void addToHerd(Movable movable)
           Добавляет объект, реализующий Movable интерфейс к стаду.
        3. public void move (int dx, int dy)
           Перемещает стадо на количество, указанное в параметрах. Обратите внимание, что здесь вы
           должны перемещать каждого члена стада.
 */
public class Herd implements Movable {
    private ArrayList<Movable> herd;

    public Herd() {
        this.herd = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        herd.add(movable);
    }

    public void move(int dx, int dy) {
        for (Movable movable : herd) {
            movable.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String list = "";
        for (Movable movable : herd) {
            list += movable.toString() + "\n";
        }
        return list;
    }
}
