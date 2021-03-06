package mooc_JavaProgramming_II.part_09.ABC;
/*
        Part 1: Creating classes
        Попрактикуемся в создании и наследовании классов.

        Создание классов
        Создайте следующие три класса:

        1. Класс A. Класс не должен иметь объектных переменных, и вам не следует указывать
           для него конструктор. У него есть только метод public void a(), который печатает строку «А».

        Part 2: Class inheritance
        Измените классы так, чтобы класс B наследовал класс A, а класс C наследует класс B.
        Другими словами, класс A будет суперклассом для класса B, а класс B будет суперклассом
        для класса C.
 */
public class A {
    public void a() {
        System.out.println("A");
    }
}
