package exercise;

import java.util.Scanner;

/*
    Создайте класс Film с переменными экземпляра
    name(String) и ageRating(int). Напишите конструктор
    public Film(String filmName, int filmAgeRating) для класса,
    а также методы public String name()и public int ageRating().
    Первый из них возвращает название фильма, а второй - его рейтинг.
 */
public class Film {
    String name;
    int ageRating;

    public Film(String filmName, int filmAgeRating) {
        this.name = filmName;
        this.ageRating = filmAgeRating;
    }

    public static void main(String[] args) {
        Film chipmunks = new Film("Alvin and the Chipmunks: The Squeakquel", 0);

        Scanner reader = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = Integer.valueOf(reader.nextLine());

        System.out.println();
        if (age >= chipmunks.ageRating()) {
            System.out.println("You may watch the film " + chipmunks.name());
        } else {
            System.out.println("You may not watch the film " + chipmunks.name());
        }
    }

    private int ageRating() {
        return this.ageRating;
    }

    private String name() {
        return this.name;
    }
}
