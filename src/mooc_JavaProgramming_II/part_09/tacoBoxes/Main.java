package mooc_JavaProgramming_II.part_09.tacoBoxes;

public class Main {
    public static void main(String[] args) {
        System.out.println("Part 1:");
        TripleTacoBox tripleTacoBox = new TripleTacoBox();
        tripleTacoBox.eat();
        tripleTacoBox.eat();
        System.out.println(tripleTacoBox.tacosRemaining());
        System.out.println();

        System.out.println("Part 2:");
        CustomTacoBox customTacoBox = new CustomTacoBox(4);
        customTacoBox.eat();
        customTacoBox.eat();
        System.out.println(customTacoBox.tacosRemaining());
    }
}
