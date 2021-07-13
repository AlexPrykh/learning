package mooc_JavaProgramming_II.part_09.animals;

/*
        Part 1: Animal
        Сначала реализуйте абстрактный класс с именем Animal. У класса должен быть конструктор,
        который принимает имя животного в качестве параметра. Класс Animal также имеет непараметрические
        методы еды и сна, которые ничего не возвращают (void), и непараметрический метод getName,
        который возвращает имя животного.

        Метод сна должен печатать «(имя) спит», а метод eat должен печатать «(имя) ест».
        Здесь (имя) - название рассматриваемого животного.
 */
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sleep() {
        if (name.isEmpty()) {
            return;
        }
        System.out.println(name + " sleep.");
    }

    public void eat() {
        if (name.isEmpty()) {
            return;
        }
        System.out.println(name + "eat.");
    }
}
