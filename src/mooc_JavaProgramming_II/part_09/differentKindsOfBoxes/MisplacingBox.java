package mooc_JavaProgramming_II.part_09.differentKindsOfBoxes;

import java.util.ArrayList;

/*
        Затем реализуйте класс MisplacingBox, наследующий класс Box. MisplacingBox имеет конструктор
        public MisplacingBox(). Вы можете добавить любые предметы в упущенную коробку, но предметы
        никогда не могут быть найдены при поиске. Другими словами, добавление в поле всегда должно
        выполняться успешно, но вызов метода isInBox всегда должен возвращать false.
 */
public class MisplacingBox extends Box {
    private ArrayList<Item> list;

    public MisplacingBox() {
        this.list = new ArrayList<>();
    }

    @Override
    public void add(Item item) {
        this.list.add(item);
    }

    @Override
    public boolean isInBox(Item comparedItem) {
        return false;
    }
}
