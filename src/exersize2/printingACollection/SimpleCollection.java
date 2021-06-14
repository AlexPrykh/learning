package exersize2.printingACollection;

import java.util.ArrayList;

public class SimpleCollection {
    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return elements;
    }

    //упражнение Longest in collection
    //Шаблон упражнения поставляется с классом SimpleCollection,
    //знакомым по предыдущим упражнениям. Реализуйте метод public String longest()
    //для класса, который возвращает самую длинную строку в коллекции.
    //Если коллекция пуста, метод должен вернуть ссылку null.
    public String longest() {
        if (this.elements.isEmpty()) {
            return null;
        }
        String returnElements = this.elements.get(0);

        for (String element : elements) {
            if (returnElements.length() < element.length()) {
                returnElements = element;
            }
        }
        return returnElements;
    }

    @Override
    public String toString() {
        String printString = "The collection " + this.name;
        if (this.elements.isEmpty()) {
            return printString + " is empty.";
        }
        String printValues = "";
        for (String element : elements) {
            if (elements.size() <= 1) {
                printValues = element;
            } else {
                printValues = printValues + element + "\n";
            }
        }
        String elementString = "";
        if (elements.size() > 1) {
            elementString = "elements:\n";
        } else {
            elementString = "element:\n";
        }
        return printString + " has " + elements.size() + " " + elementString + printValues;
    }
}
