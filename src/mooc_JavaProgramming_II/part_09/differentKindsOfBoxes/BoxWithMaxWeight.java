package mooc_JavaProgramming_II.part_09.differentKindsOfBoxes;

import java.util.ArrayList;

/*
        Part 2: Box with a max weight
        Реализуйте класс BoxWithMaxWeight, наследующий Box класс. BoxWithMaxWeight имеет конструктор
        public BoxWithMaxWeight(int capacity), который определяет максимальный вес, разрешенный для
        этого бокса. Вы можете добавить элемент в BoxWithMaxWeight тогда и только тогда, когда
        добавление элемента не приведет к превышению максимальной грузоподъемности ящиков.
 */
public class BoxWithMaxWeight extends Box {
    private ArrayList<Item> list;
    private int capacity;

    public BoxWithMaxWeight(int capacity) {
        this.list = new ArrayList<>();
        this.capacity = capacity;
    }

    @Override
    public void add(Item item) {
        int actualWeight = this.capacity;

        for (Item addedItem : list) {
            actualWeight -= addedItem.getWeight();
        }

        if (item.getWeight() <= actualWeight) {
            this.list.add(item);
        }
    }

    @Override
    public boolean isInBox(Item comparedItem) {
        for (Item item : list) {
            if (item.equals(comparedItem)) {
                return true;
            }
        }
        return false;
    }
}
