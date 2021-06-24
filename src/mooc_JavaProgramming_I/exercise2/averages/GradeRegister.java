package mooc_JavaProgramming_I.exercise2.averages;

import java.util.ArrayList;

/*
        База упражнений включает ранее построенную программу для хранения оценок.
        В этом упражнении вы доработаете класс, GradeRegister чтобы он мог вычислять
        средние оценки и результаты экзаменов.

        Part 1: Средняя оценка
        Создайте метод public double averageOfGrades() для класса GradeRegister.
        Он должен вернуть среднее значение оценок. Если в регистре нет оценок, метод
        должен вернуть -1. Используйте grades список, чтобы вычислить среднее значение.

        Part 2; Среднее количество балов
        Дайте классу GradeRegister новую объектную переменную: типа List, в котором вы будете
        сохранять экзаменационные баллы при каждом addGradeBasedOnPoints вызове метода.
        После этого добавления создайте метод, public double averageOfPoints() который
        вычисляет и возвращает среднее значение экзаменационных баллов. Если в регистр
        не добавлены баллы, метод должен вернуть число -1.
 */
public class GradeRegister {
    private ArrayList<Integer> grades;
    private ArrayList<Integer> points;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrades(points));
        this.points.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }
        return count;
    }

    public static int pointsToGrades(int points) {
        int grade;

        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }
        return grade;
    }

    public double averageOfGrades() {
        double sum = 0;

        if (grades.isEmpty()) {
            return -1;
        } else {
            for (Integer grade : this.grades) {
                sum += grade;
            }
        }
        return sum / grades.size();
    }

    public double averageOfPoints() {
        double sum = 0;

        if (points.isEmpty()) {
            return -1;
        } else {
            for (Integer point : this.points) {
                sum += point;
            }
        }
        return sum / points.size();
    }
}
