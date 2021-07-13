package mooc_JavaProgramming_II.part_09.tacoBoxes;

/*
        Part 1: Triple taco box
        Реализуйте класс TripleTacoBox, реализующий TacoBox интерфейс. TripleTacoBox имеет конструктор
        без параметров. TripleTacoBox имеет объектную переменную, tacos которая инициализируется значением
        3 при вызове конструктора.
 */
public class TripleTacoBox implements TacoBox {
    private int tacos;

    public TripleTacoBox() {
        this.tacos = 3;
    }

    @Override
    public int tacosRemaining() {
        return this.tacos;
    }

    @Override
    public void eat() {
        if (this.tacos < 0) {
            System.out.println("The tacos is over!");
            return;
        }
        this.tacos -= 1;
    }
}
