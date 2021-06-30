package mooc_JavaProgramming_II.part_08.printMeMyHashMap;

import java.util.HashMap;

/*
        Шаблон упражнения содержит класс Program. Реализуйте в классе следующие методы класса:

    1. public static void printKeys(HashMap<String,String> hashmap), печатает все ключи в хэш-карте,
       заданной в качестве параметра.
    2. public static void printKeysWhere(HashMap<String,String> hashmap, String text) печатает ключи
       в хэш-карте, заданной в качестве параметра, которые содержат строку, заданную в качестве параметра.
    3. public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text), печатает
       значения в данной хэш-карте, ключи которой содержат данную строку.

 */
public class Program {
    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
    }

    private static void printKeys(HashMap<String, String> hashmap) {
        for (String key : hashmap.keySet()) {
            System.out.println(key);
        }
    }

    private static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(key);
            }
        }
    }

    private static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (key.contains(text)) {
                System.out.println(hashmap.get(key));
            }
        }
    }
}
