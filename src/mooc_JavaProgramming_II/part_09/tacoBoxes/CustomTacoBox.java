package mooc_JavaProgramming_II.part_09.tacoBoxes;

/*
        Part 2: Custom taco box
        Реализуйте класс CustomTacoBox, реализующий TacoBox интерфейс. CustomTacoBox имеет конструктор
        с одним параметром, определяющим начальное количество тако в коробке (int tacos).
 */
public class CustomTacoBox implements TacoBox {
    private int tacos;

    public CustomTacoBox(int tacos) {
        this.tacos = tacos;
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
        tacos -= 1;
    }
}
