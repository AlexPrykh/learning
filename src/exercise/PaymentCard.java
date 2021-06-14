package exercise;

/*
        Part 1: Шаблон класса
    Сначала создайте PaymentCard конструктор объекта, которому передается
    начальный баланс карты и который затем сохраняет этот баланс во внутренней
    переменной объекта. Затем напишите toString метод, который вернет баланс карты
    в виде «На карте есть баланс X евро».

        Part 2: Совершение транзакций
    Дополните PaymentCard класс следующими методами:

        public void eatAffordably() {
        // write code here
        }

        public void eatHeartily() {
        // write code here
        }
    Этот метод eatAffordably должен уменьшить баланс карты на 2,60 евро,
    а метод eatHeartily должен уменьшить баланс карты на 4,60 евро.

        Part 3; Неотрицательный баланс
    Что произойдет, если на карте закончатся деньги? В этом случае не имеет смысла балансу
    становиться отрицательным. Изменените методы eatAffordably и eatHeartily
    таким образом , чтобы они не уменьшали баланс , если он станет отрицательним.

        Part 4:  Пополнение карты
    Добавьте в PaymentCardкласс следующий метод :

        public void addMoney(double amount) {
        // write code here
        }
    Цель метода - увеличить баланс карты на сумму денег, указанную в качестве параметра.
    Однако баланс карты не может превышать 150 евро. Таким образом, если сумма,
    подлежащая пополнению, превышает этот лимит, баланс в любом случае должен стать ровно 150 евро.

        Part 5: Пополнения карты отрицательным значением
    Измените addMoney способ дальше, чтобы при попытке пополнения на отрицательную сумму
    значение на карте не изменилось.

        Part 6: Несколько карт
    Напишите код в main методе MainProgram класса, который содержит следующую последовательность событий:

    1. Создайте карточку Пола. Начальный баланс карты 20 евро.
    2. Создайте карточку Мэтта. Начальный баланс карты 30 евро.
    3. Пол ест от души
    4. Мэтт ест по доступным ценам
    5. Значения карт печатаются (каждая в отдельной строке, с именем владельца карты в начале).
    6. Пол добавляет 20 евро
    7. Мэтт ест от души
    8. Значения карт печатаются (каждая в отдельной строке, с именем владельца карты в начале).
    9. Пол ест по доступным ценам
    10. Пол ест по доступным ценам
    11. Мэтт добавляет 50 евро
    12. Значения карт печатаются (каждая в отдельной строке, с именем владельца карты в начале).
 */
public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    public String toString() {
        return "The card has a balance of: " + this.balance + " euros.";
    }

    public void eatAffordably() {
        if (this.balance >= 2.60) {
            this.balance -= 2.60;
        }
    }

    public void eatHeartily() {
        if (this.balance >= 4.60) {
            this.balance -= 4.60;

        }
    }

    public void addMoney(double amount) {
        if (amount < 0) {
            return;
        }
        this.balance += amount;

        if (this.balance > 150) {
            this.balance = 150.00;
        }
    }


    public static void main(String[] args) {
        System.out.println("Part 1:");
        PaymentCard card = new PaymentCard(50);
        System.out.println(card);
        System.out.println();

        System.out.println("Part 2:");

        card.eatAffordably();
        System.out.println(card);

        card.eatHeartily();
        card.eatAffordably();
        System.out.println(card);
        System.out.println();

        System.out.println("Part 3:");

        PaymentCard card2 = new PaymentCard(5);
        System.out.println(card2);

        card2.eatHeartily();
        System.out.println(card2);

        card2.eatHeartily();
        System.out.println(card2);
        System.out.println();

        System.out.println("Part 4:");

        PaymentCard card3 = new PaymentCard(10);
        System.out.println(card3);

        card3.addMoney(15);
        System.out.println(card3);

        card3.addMoney(10);
        System.out.println(card3);

        card3.addMoney(200);
        System.out.println(card3);
        System.out.println();

        System.out.println("Part 5:");

        PaymentCard card4 = new PaymentCard(10);
        System.out.println("Paul: " + card4);
        card4.addMoney(-15);
        System.out.println("Paul: " + card4);
        System.out.println();

        System.out.println("Part 6:");

        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);

        paulsCard.eatHeartily();
        mattsCard.eatAffordably();

        System.out.println("Paul Map:\n" + paulsCard);
        System.out.println("Matt's Map:\n" + mattsCard);

        paulsCard.addMoney(20);
        mattsCard.eatHeartily();

        System.out.println("Paul Map:\n" + paulsCard);
        System.out.println("Matt's Map:\n" + mattsCard);

        paulsCard.eatAffordably();
        paulsCard.eatAffordably();

        mattsCard.addMoney(50);

        System.out.println("Paul Map:\n" + paulsCard);
        System.out.println("Matt's Map:\n" + mattsCard);
    }
}
