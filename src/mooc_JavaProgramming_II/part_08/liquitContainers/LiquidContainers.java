package mooc_JavaProgramming_II.part_08.liquitContainers;

import java.util.Scanner;

/*
        Создадим интерактивную программу для управления двумя емкостями с жидкостью. Контейнеры
        называются «первый» и «второй». Каждый из них может вместить 100 литров жидкости за раз.

        Программа предлагает функции добавления, перемещения и удаления жидкости. Использование
        команды «добавить» добавит жидкость в первый контейнер, «переместить» переместит жидкость
        из первого контейнера во второй контейнер, а «удалить» удалит жидкость из второго контейнера.

        Команды должны быть определены следующим образом:

        1. add amount  добавляет количество жидкости, указанное параметром, в первую емкость. Введенная
           сумма должна быть указана как целое число. Контейнер не может вместить больше ста литров,
           и все, что добавлено, пойдет напрасно.
        2. move amount перемещает количество жидкости, указанное параметром, из первого контейнера во
           второй контейнер. Данная сумма должна быть указана в виде целого числа. Если программе
           предлагается переместить больше жидкости, чем в настоящее время вмещает первая емкость,
           переместите всю оставшуюся жидкость. Второй контейнер не может вместить более ста литров
           жидкости и все, что попадает в него, пойдет зря.
        3. remove amount удаляет количество жидкости, указанное параметром, из второй емкости.
           Если программа требует удалить больше жидкости, чем в настоящее время вмещает контейнер,
           удалите всю оставшуюся жидкость.

    После каждой команды программа будет печатать содержимое обоих контейнеров. Вам не обязательно
    принимать во внимание отрицательные значения.

    Все функции должны быть добавлены к методу main в классе LiquidContainers.

        Part 1: Adding
        Реализуйте функцию добавления жидкости в первую емкость.

        Part 2: Moving
        Реализуйте функцию перемещения жидкости из первого контейнера во второй.

        Part 3: Removing
        Реализовать функционал по удалению жидкости из второй емкости.
 */
public class LiquidContainers {
    public static void main(String[] args) {
        int firstVolume = 0;
        int secondVolume = 0;
        int maxVolume = 100;

        System.out.println("First: " + firstVolume + "/" + maxVolume);
        System.out.println("Second: " + secondVolume + "/" + maxVolume);
        System.out.println();
        System.out.println("Command: "
                + "\nadd - adds liquid to the first flask"
                + "\nmove - moves liquid to the second flask"
                + "\nremove - removes liquid from the second flask"
                + "\nquit - exit the program");
        System.out.println();
        System.out.println("Please, enter  a command:");

        while (true) {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            if ("quit".equals(input)) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.parseInt(parts[1]);

            if ("add".equals(command) && amount >= 0) {
                if (firstVolume <= maxVolume) {
                    firstVolume += amount;
                    if (firstVolume > maxVolume) {
                        firstVolume = maxVolume;
                    }
                    System.out.println("First: " + firstVolume + "/" + maxVolume);
                    System.out.println("Second: " + secondVolume + "/" + maxVolume);
                }
            } else if ("move".equals(command) && amount >= 0) {
                if ((firstVolume - amount) >= 0) {
                    secondVolume += amount;
                    firstVolume -= amount;
                    if (secondVolume >= maxVolume) {
                        secondVolume = maxVolume;
                    }
                    System.out.println("First: " + firstVolume + "/" + maxVolume);
                    System.out.println("Second: " + secondVolume + "/" + maxVolume);
                } else if ((firstVolume - amount) < 0) {
                    secondVolume += firstVolume;
                    firstVolume = 0;
                    if (secondVolume >= maxVolume) {
                        secondVolume = maxVolume;
                    }
                    System.out.println("First: " + firstVolume + "/" + maxVolume);
                    System.out.println("Second: " + secondVolume + "/" + maxVolume);
                }
            } else if ("remove".equals(command) && amount >= 0) {
                if ((secondVolume - amount) >= 0) {
                    secondVolume -= amount;
                } else if ((secondVolume - amount) < 0) {
                    secondVolume = 0;
                }
                System.out.println("First: " + firstVolume + "/" + maxVolume);
                System.out.println("Second: " + secondVolume + "/" + maxVolume);
            }
        }
        System.out.println("First: " + firstVolume + "/" + maxVolume);
        System.out.println("Second: " + secondVolume + "/" + maxVolume);
    }
}
