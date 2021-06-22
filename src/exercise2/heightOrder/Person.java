package exercise2.heightOrder;

/*
    Класс Person включен в шаблоне упражнения. У человека есть имя и рост.
    В этом упражнении мы реализуем Room класс, который можно использовать для
    добавления людей и упорядочивания их в соответствии с их ростом - когда
    человек выходит из комнаты, всегда возвращается самый низкий человек.
 */
public class Person {
    private String name;
    private int height;

    public Person(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.height + " cm)";
    }
}
