package mooc_JavaProgramming_II.part_09.animals;

/*
        Part 2: Dog
        Реализуйте класс Dog, наследуемый от Animal. Dog должен иметь параметризованный конструктор,
        который можно использовать для присвоения ему имени. Класс также должен иметь непараметрический
        конструктор, который дает собаке имя «Собака». Другой метод, который должен иметь Dog, - это
        непараметрический "лай" (barking), и он не должен возвращать никакого значения (void). Как и
        всем животным, собаке нужно научиться есть и спать.
 */
public class Dog extends Animal implements NoiseCapable {

    public Dog(String name) {
        super(name);
    }

    public Dog() {
        super("Dog");
    }

    public void bark() {
        System.out.println(this.getName() + " barks.");
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
        this.bark();
    }
}
