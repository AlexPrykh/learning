package mooc_JavaProgramming_I.exercise3.gradeStatistics;

import java.util.ArrayList;

/*
        Part 1: Point averages
        Напишите программу, которая считывает целые числа, представляющие общее количество баллов,
        полученных от пользователя. Допустимы числа между [0-100], а число -1 завершает чтение ввода.
        Остальные числа - ошибочный ввод, который следует игнорировать. Когда пользователь
        вводит число -1, программа должна распечатать среднее значение введенных баллов.

        Part 2: Point average for points giving a passing grade
        Расширьте программу таким образом, чтобы она, помимо среднего балла всех итогов,
        также давала средний балл для баллов, дающих проходной балл.

        Проходной балл можно получить, набрав минимум 50 баллов за курс.
        Вы можете предположить, что пользователь всегда предоставляет по крайней мере
        одно целое число от [0-100]. Если нет чисел, дающих проходной балл, программа
        должна вывести строку «-», где будет среднее значение.

        Part 3: Pass percentage
        Расширьте программу из предыдущей части так, чтобы она также печатала процент
        пройденных испытаний. Процент успешных прохождений рассчитывается по формуле:
        100 * пройденных / участников.

        Part 4: Grade distribution
        Расширьте программу так, чтобы она также распечатывала распределение оценок.
        Если сумма очков не находится в пределах [0–100], его следует игнорировать.

        Распределение оценок отображается в виде звездочек. Например, если есть одна общая
        сумма баллов, дающая оценку 5, тогда она должна вывести строку 5: * . Если нет итоговых
        баллов, дающих определенную оценку, то для нее не следует печатать звездочки.
 */
public class GradeRegister {
    private ArrayList<Integer> points;
    private ArrayList<Integer> passingPoints;
    private ArrayList<Integer> grades;

    public GradeRegister() {
        this.points = new ArrayList<>();
        this.passingPoints = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    // Add grades to points ArrayList
    public void addPoints(int points) {
        this.points.add(points);
        if (points >= 50) {
            this.passingPoints.add(points);
        }
        this.grades.add(pointsToGrade(points));
    }

    // Method to return the average of all points
    public double averageOfPointsAll() {
        double total = 0;

        if (this.points.isEmpty()) {
            return -1;
        } else {
            for (Integer point : this.points) {
                total += point;
            }
        }
        return total / points.size();
    }

    // Method to return the average of only passing grades
    public double averageOfPassingPoints() {
        double total = 0;

        if (passingPoints.isEmpty()) {
            return 0.00;
        } else {
            for (Integer passingPoint : passingPoints) {
                total += passingPoint;
            }
        }

        return total / passingPoints.size();
    }

    // Method to calculate pass percentage for all course participants
    public double passPercentage() {
        int participants = points.size();
        int passing = passingPoints.size();
        double passingRatio;

        if (participants == 0) {
            return -1;
        } else {
            passingRatio = (double) (100 * passing) / participants;
            return passingRatio;
        }
    }

    // Method to convert points received into a grade
    public static int pointsToGrade(int points) {
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

    // Method to return the total of a given grade for the whole class
    public int totalGradesFromPoints(int grade) {
        int total = 0;

        for (int received : this.grades) {
            if (received == grade) {
                total++;
            }
        }
        return total;
    }
}
