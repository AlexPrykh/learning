package exercise;

import java.util.ArrayList;
import java.util.Scanner;

/*
    В шаблоне упражнения есть готовый класс TelevisionProgram, представляющий телепрограмму.
    У класса есть имя и продолжительность объектных переменных, конструктор и несколько методов.

    Реализуйте программу, которая начинается с чтения телепрограмм от пользователя.
    Когда пользователь вводит пустую строку в качестве имени программы, программа
    перестает читать программы.

    После этого пользователя запрашивают максимальную продолжительность программы.
    Как только максимальное значение задано, программа переходит к списку всех программ,
    продолжительность которых меньше или равна указанной максимальной продолжительности.

    Пример вивода:

    Имя: Рик и Морти
    Продолжительность: 25
    Имя: Два с половиной человека
    Продолжительность: 30
    Имя: Любите или перечислите
    Продолжительность: 60
    Имя: Дом
    Продолжительность: 60

    Максимальная продолжительность программы? 30
    Рик и Морти, 25 минут Два с половиной человека, 30 минут
 */
public class TelevisionProgram {
    private String nameProgram;
    private int durationProgram;


    public TelevisionProgram(String nameProgram, int durationProgram) {
        this.nameProgram = nameProgram;
        this.durationProgram = durationProgram;
    }

    @Override
    public String toString() {
        return nameProgram + " (" + durationProgram + ")";
    }

    public String getNameProgram() {
        return nameProgram;
    }

    public int getDurationProgram() {
        return durationProgram;
    }

    public static void main(String[] args) {
        ArrayList<TelevisionProgram> televisionPrograms = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Please, enter a name program:");
            String nameProgram = sc.nextLine();

            if (nameProgram.isEmpty()) {
                break;
            }

            System.out.println("Please, enter a duration program:");
            int durationProgram = sc.nextInt();

            sc.nextLine();

            televisionPrograms.add(new TelevisionProgram(nameProgram, durationProgram));
        }

        System.out.println("Program's maximum duration?");
        int maxDuration = Integer.parseInt(sc.nextLine());

        for (TelevisionProgram nameAndDuration : televisionPrograms) {
            if (nameAndDuration.getDurationProgram() <= maxDuration) {
                System.out.println(nameAndDuration);
            }
        }
    }
}
