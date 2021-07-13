package mooc_JavaProgramming_II.part_09.setAsMethodParameter;

import java.util.HashSet;
import java.util.Set;

/*
        В классе Main реализуйте статический метод returnSize, который получает объект Set в качестве
        параметра и возвращает его размер.
 */
public class Main {
    private static int returnSize(Set<String> set) {
        return set.size();
    }

    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("first");
        names.add("first");
        names.add("second");
        names.add("second");
        names.add("second");

        System.out.println(returnSize(names));
    }
}
