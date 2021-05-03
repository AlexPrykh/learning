import java.util.Arrays;
/*
    Написати метод для генерації колоди з 52 гральних карт, наприклад:
    {“4 of spades”, “4 of clubs”, “king of hearts”, …}
    Хардкодити не можна.
    Створити метод для перетасування карт - приймає масив з картами,
    повертає той же масив (не новий), але з перетасованими картами.

    Підказка: для генерації потрібно створити 2 масиви, і на їх основі генерувати колоду:
    1. З усіма можливими картами: {“2”, “3”, “4”, …і до туза}
    2. З усіма мастями: {“diamonds”, “hearts”, “clubs”, “spades”}
 */
public class DeckOfCards {
    public static void main(String[] args) {
        String[] card = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suit = {"diamonds", "hearts", "clubs", "spades"};

        int n = suit.length * card.length;

        String[] deck = new String[n];
        for (int i = 0; i < card.length; i++) {
            for (int j = 0; j < suit.length; j++) {
                deck[suit.length * i + j] = card[i] + " " + suit[j];
            }
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            int random = i + (int) (Math.random() * (n - i));
            String temp = deck[random];
            deck[random] = deck[i];
            deck[i] = temp;
        }
        System.out.println(Arrays.toString(deck));
    }
}
