package mooc_JavaProgramming_II.part_09.herds;

/*
        Part 1: Implementing the Organism Class
        Создайте класс с именем Organism, реализующий интерфейс Movable. Организм должен знать свое
        собственное местоположение (в виде координат x, y). API для класса Organism должен быть следующим:

        1. public Organism (int x, int y)
           Конструктор класса, который получает координаты x и y начальной позиции в качестве параметров.
        2. public String toString ()
           Создает и возвращает строковое представление организма. Это представление должно напомнить
           следующее: "x: 3; y: 6". Обратите внимание, что координаты разделяются точкой с запятой.
        3. public void move (int dx, int dy)
           Перемещает объект на значения, которые он получает в качестве параметров. Переменная dx содержат
           изменения для координации x, а dy переменная содержит изменения в координате y. Например,
           если значение dx равно 5, значение объектной переменной x должно быть увеличено на пять.

 */
public class Organism implements Movable {
    private int x;
    private int y;

    public Organism(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x: " + x + "; y: " + y;
    }

    @Override
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }
}
