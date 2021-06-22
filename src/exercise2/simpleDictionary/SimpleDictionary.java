package exercise2.simpleDictionary;

import java.util.HashMap;

public class SimpleDictionary {
    private HashMap<String, String> translatingWord;

    public SimpleDictionary() {
        this.translatingWord = new HashMap<>();
    }

    public String translate(String word) {
        return this.translatingWord.get(word);
    }

    public void add(String word, String translation) {
        this.translatingWord.put(word, translation);
    }
}
