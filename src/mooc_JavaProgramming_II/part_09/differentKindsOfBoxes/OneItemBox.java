package mooc_JavaProgramming_II.part_09.differentKindsOfBoxes;

import java.util.ArrayList;

/*
        Part 3; One item box and the misplacing box
        Затем реализуйте класс OneItemBox, наследующий класс Box. OneItemBox имеет конструктор
        public OneItemBox() и вмещает ровно один элемент. Если в коробке уже есть элемент,
        переключать его нельзя. Вес добавленного в коробку предмета не имеет значения.
 */
public class OneItemBox extends Box {
    private ArrayList<Item> list;
    private int capacity;

    public OneItemBox() {
        this.list = new ArrayList<>();
        this.capacity = 1;
    }

    @Override
    public void add(Item item) {
        if (this.list.isEmpty()) {
            this.list.add(item);
        }
    }

    @Override
    public boolean isInBox(Item comaredItem) {
        for (Item item : list) {
            if (item.equals(comaredItem)) {
                return true;
            }
        }
        return false;
    }
}