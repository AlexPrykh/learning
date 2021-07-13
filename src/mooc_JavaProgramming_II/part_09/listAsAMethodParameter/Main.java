package mooc_JavaProgramming_II.part_09.listAsAMethodParameter;

import java.util.ArrayList;
import java.util.List;

/*
        В классе mainProgram реализуйте метод класса returnSize, которому в качестве параметра
        передается объект List, который возвращает размер списка в виде целого числа.
 */
public class Main {
    private static int returnSize(List<String> list) {
        return list.size();
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("First");
        names.add("Second");
        names.add("Third");

        System.out.println(returnSize(names));
    }
}
