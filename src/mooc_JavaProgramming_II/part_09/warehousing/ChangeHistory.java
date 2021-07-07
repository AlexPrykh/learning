package mooc_JavaProgramming_II.part_09.warehousing;

import java.util.ArrayList;

/*
        Part 3: Change History, step 1
        Иногда может быть полезно узнать, как запасы продукта меняются с течением времени: часто ли
        запасы низкие? Обычно мы на пределе? Изменения в инвентаре большие или маленькие? И т.д.
        Таким образом, мы должны дать классу ProductWarehouse возможность запоминать изменения
        количества продукта.

        Начнем с создания инструмента, который помогает реализовать желаемую функциональность.

        Сохранение истории изменений, конечно, могло быть выполнено с помощью ArrayList<Double> объекта
        в классе ProductWarehouse, однако нам нужен наш собственный специализированный инструмент для
        этой цели. Инструмент должен быть реализован путем инкапсуляции ArrayList<Double> объекта.

        Публичные конструкторы и методы ChangeHistory класса:

        public ChangeHistory() - создает пустой ChangeHistory объект.
        public void add(double status) - добавляет предоставленный статус в качестве последней суммы,
        которую нужно запомнить в истории изменений.
        public void clear() - очищает историю.
        public String toString() - возвращает строковое представление истории изменений. Строковое
        представление, предоставляемое классом ArrayList, является достаточным.

        Part 4: Change History, step 2
        Развивайте ChangeHistory класс, добавляя методы анализа:

        public double maxValue() возвращает наибольшее значение в истории изменений. Если история пуста,
        метод должен вернуть ноль.
        public double minValue() возвращает наименьшее значение в истории изменений. Если история пуста,
        метод должен вернуть ноль.
        public double average() возвращает среднее значение в истории изменений. Если история пуста,
        метод должен вернуть ноль.
        Методы не должны изменять порядок инкапсулированного списка.
 */
public class ChangeHistory {
    private ArrayList<Double> list;

    public ChangeHistory() {
        this.list = new ArrayList<>();
    }

    public void add(double status) {
        this.list.add(status);
    }

    public void clear() {
        this.list.clear();
    }

    public double maxValue() {
        checkList();
        double maxvalue = Integer.MIN_VALUE;
        for (Double line : list) {
            if (line > maxvalue) {
                maxvalue = line;
            }
        }
        return maxvalue;
    }

    public double minValue() {
        checkList();
        double minValue = Integer.MAX_VALUE;
        for (Double line : list) {
            if (line < minValue) {
                minValue = line;
            }
        }
        return minValue;
    }

    public double average() {
        checkList();
        double sum = 0.0;
        int count = 0;
        for (Double number : list) {
            sum += number;
            count++;
        }
        return (sum / count);
    }

    private void checkList() {
        if (this.list.isEmpty()) {
            System.out.println("List is empty!");
        }
    }

    @Override
    public String toString() {
        return this.list.toString();
    }
}
