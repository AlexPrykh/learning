package exercise2.santasWorkshop;

import java.util.ArrayList;

/*
    Создайте Package класс, в который можно добавлять подарки и который отслеживает
    общий вес подарков в упаковке. Класс должен содержать:

    Конструктор без параметров
    Метод public void addGift(Gift gift), который добавляет подарок, переданный в
    качестве параметра, к пакету. Метод не возвращает значения.
    Метод public int totalWeight(), возвращающий общий вес подарков посылки.
    Рекомендуется хранить предметы в ArrayList объекте.
 */
public class Package {
    private ArrayList<Gift> gifts;

    public Package() {
        this.gifts = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        this.gifts.add(gift);
    }

    public int totalWeight() {
        if (gifts.isEmpty()) {
            return -1;
        }
        int totalWeight = 0;
        for (Gift gift : gifts) {
            totalWeight += gift.getWeight();
        }
        return totalWeight;
    }
}
