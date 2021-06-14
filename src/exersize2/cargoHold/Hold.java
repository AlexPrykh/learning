package exersize2.cargoHold;

import java.util.ArrayList;

/*
        Part 6: Hold-класс
        Создайте Hold класс с помощью следующих методов:

    конструктор, которому дается максимальный вес
    метод, public void addSuitcase(Suitcase suitcase) который добавляет указанный багаж
    в багажное отделение
    метод, public String toString() который возвращает строку «x чемоданов (y кг)»
    Храните чемоданы в подходящей ArrayList конструкции.

    Класс Hold должен гарантировать, что общий вес содержащихся в нем чемоданов не
    превышает максимального веса. Если максимальный вес будет превышен из-за добавления
    нового багажа, addSuitcase метод не должен добавлять новый чемодан.

        Part 7: Содержание Hold
        Добавьте к Hold классу public void printItems()  метод, который печатает все предметы,
        содержащиеся в чемоданах трюма.
 */
public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<Suitcase>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (this.totalWeight() + suitcase.totalWeight() <= maxWeight) {
            this.suitcases.add(suitcase);
        }
    }

    public int totalWeight() {
        int sumOfWeights = 0;
        for (Suitcase suitcase : suitcases) {
            sumOfWeights += suitcase.totalWeight();
        }
        return sumOfWeights;
    }

    public void printItems() {
        for (Suitcase suitcase : suitcases) {
            System.out.println(suitcase.items);
        }
    }

    @Override
    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.totalWeight() + " kg)";
    }
}
