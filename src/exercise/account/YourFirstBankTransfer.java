package exercise.account;

/*
    В этом Account-упражнении также доступен класс из предыдущего упражнения.

    Напишите программу, которая:

    1. Создает учетную запись "Matthews account"с балансом 1000
    2. Создает учетную запись "My account"с балансом 0
    3. Снимает 100.0 со счета Мэтью
    4. Переводит 100.0 на «мой счет»
    5. Печатает обе учетные записи

 */
public class YourFirstBankTransfer {
    public static void main(String[] args) {
        Account matthewsAccount = new Account("Matthews account", 1000.00);
        Account myAccount = new Account("My account", 0.00);

        System.out.println("Initial state:");
        System.out.println(matthewsAccount);
        System.out.println();
        System.out.println(myAccount);
        System.out.println();

        System.out.println("Matthew return the hundred!");

        matthewsAccount.transferToAccount(myAccount, 100.00);

        System.out.println("End state:");
        System.out.println();
        System.out.println(matthewsAccount);
        System.out.println();
        System.out.println(myAccount);
    }
}
