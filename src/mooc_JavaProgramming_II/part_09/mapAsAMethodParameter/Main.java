package mooc_JavaProgramming_II.part_09.mapAsAMethodParameter;

import java.util.HashMap;
import java.util.Map;

/*
        В классе MainProgram реализовать метод класса, returnSize который получает объект Map в качестве
        параметра и возвращает его размер в виде целого числа.
 */
public class Main {
    private static int returnSize(Map<String, String> map) {
        return map.size();
    }

    public static void main(String[] args) {
        Map<String, String> names = new HashMap<>();
        names.put("1", "first");
        names.put("2", "second");

        System.out.println(returnSize(names));
    }
}
