package exercise3.searching;

/*
        В шаблоне упражнения вы найдете класс Book, готовый к использованию. Класс описывает объекты
        с числовым идентификатором id и именем name.
 */
public class Book {
    private int id;
    private String name;

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "(id: " + id + "; name: " + name + ")";
    }
}
