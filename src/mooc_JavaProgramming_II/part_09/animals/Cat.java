package mooc_JavaProgramming_II.part_09.animals;

/*
        Part 3: Cat
        Следующим для реализации является класс Cat, который также наследуется от класса Animal.
        У Cat должно быть два конструктора: один с параметром, который используется для присвоения
        кошке имени в соответствии с параметром, и один без параметров, и в этом случае имя просто «Cat».
        Другой метод для Cat - это непараметрический метод под названием purr, который не возвращает
        значения (void). Кошки должны уметь есть и спать, как в первой части.
 */
public class Cat extends Animal implements NoiseCapable {

    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super("Cat");
    }

    public void purr() {
        System.out.println(this.getName() + " purrs.");
    }

    @Override
    public void sleep() {
        System.out.println(this.getName() + " sleep.");
    }

    @Override
    public void eat() {
        System.out.println(this.getName() + " eat.");
    }

    @Override
    public void makeNoise() {
        this.purr();
    }
}
