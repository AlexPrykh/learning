package mooc_JavaProgramming_II.part_09.herds;
/*
        В этом упражнении мы собираемся создать организмы и стада организмов, которые могут перемещаться.
        Чтобы представить местонахождение организмов, мы будем использовать двумерную систему координат.
        Каждая позиция включает в себя два числа: x и y координаты. Координата x указывает на то, как
        далеко она от начала координат (т.е. точка ноль, где х = 0, у = 0), её положение по горизонтали.
        Координата y указывает расстояние от начала координат по вертикали.


        База упражнений включает интерфейс Movable, который представляет собой то, что можно перемещать
        из одной позиции в другую. Интерфейс включает метод void move(int dx, int dy). Параметр dx сообщает,
        насколько объект перемещается по оси x, а dy указывает расстояние по оси y.

        Это упражнение включает в себя реализацию классов Organism и Herd, оба из которых
        являются подвижными.
 */
public interface Movable {
    void move (int dx, int dy);
}