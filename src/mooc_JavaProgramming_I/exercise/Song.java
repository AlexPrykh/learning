package mooc_JavaProgramming_I.exercise;

/*
        Создайте класс с именем Song. Песня имеет переменные экземпляра
        name(строка) и length секунды (целое число). Оба устанавливаются в
        public Song(String name, int length) конструкторе.
        Кроме того, добавьте к объекту методы public String name(),
        которые возвращают название песни и public int length(), которые возвращают длину песни.
 */
public class Song {
    String name;
    int length;

    public Song(String name, int length) {
        this.name = name;
        this.length = length;
    }

    private String name() {
        return this.name;
    }

    public int getLength() {
        return this.length;
    }

    public static void main(String[] args) {
        Song garden = new Song("In The Garden", 10910);
        System.out.println("The song " + garden.name() + " has a length of " +
                garden.getLength() + " seconds.");
    }
}
