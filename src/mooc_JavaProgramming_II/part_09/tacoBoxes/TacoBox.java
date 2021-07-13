package mooc_JavaProgramming_II.part_09.tacoBoxes;

/*
    В шаблоне упражнения вы найдете интерфейс, TacoBox готовый к использованию. Он имеет следующие методы:

    1. метод int tacosRemaining() возвращает количество тако, оставшееся в коробке.
    2. метод void eat() уменьшает количество оставшихся тако на один. Количество оставшихся тако не может
    стать отрицательным.
 */
public interface TacoBox {
    int tacosRemaining();

    void eat();
}
