package mooc_JavaProgramming_I.exercise;

/*
    Создайте класс, Debt который имеет переменные экземпляра типа
    double balance и interestRate. Баланс и процентная ставка передаются
    конструктору в качестве параметров
    public Debt(double initialBalance, double initialInterestRate).

    Кроме того, создайте методы
    public void printBalance() и public void waitOneYear() для класса.
    Метод printBalance печатает текущий баланс, а метод waitOneYear увеличивает сумму долга.

    Задолженность увеличивается путем умножения остатка на процентную ставку.
 */
public class Debt {
    double balance;
    double interestRate;

    public Debt(double initialBalance, double initialInterestRate) {
        this.balance = initialBalance;
        this.interestRate = initialInterestRate;
    }

    public static void main(String[] args) {
        Debt mortgage = new Debt(120000.0, 1.01);
        mortgage.printBalance();

        mortgage.waitOneYear();
        mortgage.printBalance();

        for (int i = 0; i < 20; i++) {
            mortgage.waitOneYear();
        }
        mortgage.printBalance();
    }

    private void waitOneYear() {
        balance *= interestRate;
    }

    private void printBalance() {
        System.out.println("Balance: " + balance);
    }
}
