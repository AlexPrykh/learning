package mooc_JavaProgramming_II.part_09.animals;

/*
        Part 4: NoiseCapable
        Наконец, создайте интерфейс с именем NoiseCapable. Он должен определять непараметрический метод
        makeNoise, который не возвращает значения (void). Реализуйте интерфейс в классах Dog и Cat.
        Интерфейс должен использовать методы bark и purr, которые вы определили ранее.
 */
public interface NoiseCapable {
    void makeNoise();
}
