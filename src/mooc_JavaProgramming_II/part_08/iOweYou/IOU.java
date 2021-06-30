package mooc_JavaProgramming_II.part_08.iOweYou;

import java.util.HashMap;

/*
        Создайте класс с именем, IOU который имеет следующие методы:

    1. конструктор public IOU()создает новую долговую расписку
    2. public void setSum(String toWhom, double amount) сохраняет причитающуюся сумму и лицо,
       имеющее задолженность перед долговым обязательством.
    3. public double howMuchDoIOweTo(String toWhom) возвращает сумму, причитающуюся лицу,
       имя которого указано в качестве параметра. Если человека не удается найти, возвращается 0.
 */
public class IOU {
    private HashMap<String, Double> debtRegister;

    public IOU() {
        this.debtRegister = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        this.debtRegister.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return this.debtRegister.getOrDefault(toWhom, 0.00);
    }
}
