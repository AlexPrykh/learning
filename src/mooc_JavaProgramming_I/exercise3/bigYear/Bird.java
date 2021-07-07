package mooc_JavaProgramming_I.exercise3.bigYear;

/*
        В этом упражнении вы разработаете и внедрите базу данных для орнитологов. База данных
        содержит птиц, каждая из которых имеет имя (строка) и имя на латинице (строка). В базе
        данных также учитываются наблюдения за каждой птицей.

        В программе должны быть реализованы следующие команды:

        Add - добавляет птицу
        Observation - добавляет наблюдение
        All - печатает всех птиц
        One - печатает одну птицу
        Quit - завершает программу
    Также необходимо обработать неправильный ввод.
 */
public class Bird {
    private String name;
    private String latinName;
    private int observations;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getObservations() {
        return observations;
    }

    public void increaseObservationCount() {
        this.observations++;
    }

    @Override
    public String toString() {
        return String.format("%s (%s): %d observations.", name, latinName, observations);
    }
}
