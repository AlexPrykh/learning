package mooc_JavaProgramming_I.exercise2.heightOrder;

import java.util.ArrayList;

/*
        Part 1: Номер
        Создать Room класс. Класс должен содержать список лиц в качестве переменной экземпляра
        и иметь конструктор без параметров. Кроме того, добавьте в класс следующие методы:

    public void add(Person person) - добавить человека, переданного параметром, в список.
    public boolean isEmpty()- возвращает boolean значение -типа true или false,
    который сообщает, пуста комната или нет.
    public ArrayList<Person> getPersons() - возвращает список людей в комнате.

        Part 2: Самый низкий человек
        Добавьте метод  public Person shortest() в класс Room, который возвращает самого
        короткого человека, добавленного в комнату. Если комната пуста, возвращается пустая
        ссылка. Метод не должен удалять человека из комнаты.

        Part 3: Взять из комнаты
        Добавьте метод public Person take() в класс Room, который принимает самого низкорослого
        человека в комнате. Когда комната пуста, она возвращает null ссылку.
 */
public class Room {
    private ArrayList<Person> persons;

    public Room() {
        this.persons = new ArrayList<>();
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean isEmpty() {
        return this.persons.size() == 0;
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    public Person shortest() {
        if (this.persons.isEmpty()) {
            return null;
        }
        Person returnPerson = this.persons.get(0);

        for (Person person : persons) {
            if (returnPerson.getHeight() > person.getHeight()) {
                returnPerson = person;
            }
        }
        return returnPerson;
    }

    public Person take() {
        if (this.persons.isEmpty()) {
            return null;
        }
        Person takePerson = this.persons.get(0);

        for (Person person : persons) {
            if (takePerson.getHeight() > person.getHeight()) {
                takePerson = person;
            }
        }
        //если сделать просто return shortest, будет бесконечный цыкл.
        this.persons.remove(takePerson);
        return takePerson;
    }
}
