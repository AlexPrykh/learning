package mooc_JavaProgramming_I.exercise2;

import java.util.ArrayList;
import java.util.Collections;

/*
        Ресторан изысканной кухни Unicafe в кампусе Кумпула Хельсинкского университета
        нуждается в новом меню. Шеф-повар знает, как программировать, и ему нужна
        компьютерная система для управления меню. В этом задании мы реализуем сердце
        системы - класс Menu.

        Объект меню имеет ArrayList в качестве переменной экземпляра для хранения названий
        блюд в меню. В меню должны быть предусмотрены следующие методы:

        public void addMeal(String meal)добавляет блюдо в меню. Если блюдо уже есть в списке,
        его не следует добавлять снова.
        public void printMeals() печатает блюда.
        public void clearMenu() очищает меню.

        Part 1: Добавление еды
        Реализуйте public void addMeal(String meal) метод, добавляющий новое блюдо в meals список.
        Если блюдо, которое вы хотите добавить, уже есть в списке, не добавляйте его снова.
        Метод списка contains удобен для проверки наличия в нем элементов.

        Part 2: Печать блюд
        Реализуйте public void printMeals() метод, который печатает блюда.

        Part 3: Очистка списка продуктов питания
        Реализуйте public void clearMenu() метод, очищающий меню. У ArrayList класса есть метод,
        который здесь может пригодиться.
 */
public class Menu {
    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal) {
        if (!this.meals.contains(meal)) {
            this.meals.add(meal);
        }
    }

    public void printMeals() {
        for (String meal : this.meals) {
            System.out.println(meal);
        }
    }

    public void clearMenu() {
        this.meals.removeAll(Collections.unmodifiableList(this.meals));
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.addMeal("Tofu ratatouille");
        menu.addMeal("Chilli Coconut Chicken");
        menu.addMeal("Chilli Coconut Chicken");
        menu.addMeal("Meatballs with mustard sauce");

        menu.printMeals();
        menu.clearMenu();

        System.out.println();
        menu.addMeal("Tomato and mozzarella salad");
        menu.printMeals();
    }
}
