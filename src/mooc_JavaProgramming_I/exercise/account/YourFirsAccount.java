package mooc_JavaProgramming_I.exercise.account;

/*
    В шаблоне упражнения есть готовый класс с именем Account.
    Account-объект представляет банковский счет, на котором есть баланс
    (т.е. Тот, на котором есть некоторая сумма денег).
 */
public class YourFirsAccount {
    public static void main(String[] args) {
        Account artosAccount = new Account("Arto's account", 100.00);

        System.out.println("Initial state:");
        System.out.println(artosAccount);
        System.out.println();

        System.out.println("Top ups the account by 20:");
        artosAccount.deposit(20);
        System.out.println("The balance of Arto's account is now: " + artosAccount.balance);
        System.out.println();

        System.out.println("End state");
        System.out.println(artosAccount);
    }
}
