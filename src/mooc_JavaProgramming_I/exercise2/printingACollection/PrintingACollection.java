package mooc_JavaProgramming_I.exercise2.printingACollection;

/*
    В шаблоне упражнения есть предопределенный SimpleCollection класс, который используется
    для представления группы значений. В классе отсутствует toString метод,
    используемый для печати.

    Реализуйте toString метод для класса.
 */
public class PrintingACollection {
    public static void main(String[] args) {
        SimpleCollection s = new SimpleCollection("alphabet");
        System.out.println(s);

        System.out.println();

        s.add("a");
        System.out.println(s);

        System.out.println();

        s.add("b");
        System.out.println(s);

        System.out.println();

        s.add("c");
        System.out.println(s);
        System.out.println();

        System.out.println("Longest in Collection:");
        SimpleCollection j = new SimpleCollection("characters");
        System.out.println("Longest: " + j.longest());

        j.add("magneto");
        j.add("mystique");
        j.add("phoenix");

        System.out.println("Longest: " + j.longest());
    }
}
