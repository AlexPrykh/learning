package mooc_JavaProgramming_II.part_09.ABC;

public class Main {
    public static void main(String[] args) {
        System.out.println("Part 1:");
        A a = new A();
        B b = new B();
        C c = new C();

        a.a();
        b.b();
        c.c();
        System.out.println();

        System.out.println("Part 2:");
        C c2 = new C();

        c2.a();
        c2.b();
        c2.c();
    }
}
