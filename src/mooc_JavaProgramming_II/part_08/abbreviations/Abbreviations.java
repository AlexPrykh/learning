package mooc_JavaProgramming_II.part_08.abbreviations;

import java.util.HashMap;

/*
        Создайте класс Abbreviations для управления общими сокращениями. У класса должен быть
        конструктор, который не принимает никаких параметров. Класс также должен предоставлять
        следующие методы:

        1. public void addAbbreviation(String abbreviation, String explanation) добавляет новую
           аббревиатуру и ее объяснение.
        2. public boolean hasAbbreviation(String abbreviation) проверяет, добавлено ли уже сокращение;
           возвращается true, если есть, а false если нет.
        3. public String findExplanationFor(String abbreviation) находит объяснение аббревиатуры;
           возвращается null, если сокращение еще не добавлено.
 */
public class Abbreviations {
    private HashMap<String, String> list;

    public Abbreviations() {
        this.list = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        this.list.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation) {
        if (this.list.containsKey(abbreviation)) {
            return true;
        }
        return false;
    }

    public String findExplanationFor(String abbreviation) {
        return this.list.get(abbreviation);
    }
}
