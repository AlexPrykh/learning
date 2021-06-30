package mooc_JavaProgramming_II.part_08.dictionaryOfManyTranslations;

import java.util.ArrayList;
import java.util.HashMap;

/*
        Ваше задание - создать класс DictionaryOfManyTranslations. В нем может храниться один или
        несколько переводов для каждого слова. В классе реализованы следующие методы:

    1. public void add(String word, String translation) добавляет перевод слова и сохраняет
       старые переводы.
    2. public ArrayList<String> translate(String word) возвращает список переводов, добавленных
       для слова. Если у слова нет переводов, метод должен вернуть пустой список.
    3. public void remove(String word) удаляет слово и все его переводы из словаря.

    Вероятно, лучше всего добавить переводы к объектной переменной типа HashMap<String, ArrayList<String>>
 */
public class DictionaryOfManyTranslations {
    private HashMap<String, ArrayList<String>> dictionary;

    public DictionaryOfManyTranslations() {
        this.dictionary = new HashMap<>();
    }

    public void add(String word, String translation) {
        this.dictionary.putIfAbsent(word, new ArrayList<>());
        this.dictionary.get(word).add(translation);
    }

    public ArrayList<String> translate(String word) {
        return this.dictionary.getOrDefault(word, new ArrayList<>());
    }

    public void remove(String word) {
        this.dictionary.remove(word);
    }
}
