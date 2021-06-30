package mooc_JavaProgramming_II.part_08.storageFacility;

import java.util.ArrayList;
import java.util.HashMap;

/*
        Part 1: Adding items and examining contents
        Ваша задача создать класс с именем, StorageFacility который можно использовать для
        отслеживания единиц хранения и их содержимого. В классе реализованы следующие методы:

        1. public void add(String unit, String item) добавляет элемент параметра в блок хранения,
           который также задается как параметр.
        2. public ArrayList<String> contents(String storageUnit) возвращает список, содержащий
           все элементы в блоке хранения, указанным параметром. Если такой единицы хранения нет
           или она не содержит элементов, метод должен вернуть пустой список.

        Part 2: Listing the units and removing from unit
        Теперь класс StorageFacility содержит функциональные возможности для добавления элемента в
        блок хранения и для вывода списка содержимого блока. Затем добавьте возможности удалить
        элемент из единицы хранения и перечислить все единицы.

        3. public void remove(String storageUnit, String item) удаляет данный элемент из данной единицы
           хранения. Удаляет только один элемент - если есть несколько элементов с одинаковым именем,
           остальные остаются. Если после удаления блок хранения окажется пустым, метод также удаляет блок.
        4. public ArrayList<String> storageUnits() возвращает имена единиц хранения в виде списка.
           Перечисляются только единицы, содержащие предметы.
 */
public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.storage.putIfAbsent(unit, new ArrayList<>());
        this.storage.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return this.storage.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item) {
        this.storage.get(storageUnit).remove(item);
        if (this.storage.get(storageUnit).isEmpty()) {
            this.storage.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> storageUnits = new ArrayList<>();
        for (String key : storage.keySet()) {
            if (this.storage.get(key).size() != 0) {
                storageUnits.add(key);
            }
        }
        return storageUnits;
    }
}
