package mooc_JavaProgramming_II.part_08.sameDate;

/*
        Шаблон упражнения содержит класс SimpleDate, который определяет объект даты на основе
        заданного дня, месяца и года. В этом упражнении вы расширите класс SimpleDate с помощью
        метода equals, который может определить, совпадают ли даты в точности.

        Создайте метод public boolean equals(Object object) для SimpleDate класса, который возвращает
        истину, если дата объекта, переданного методу в качестве параметра, совпадает с датой объекта,
        используемого для вызова метода.
 */
public class SimpleDate {
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(SimpleDate other) {
        if (this.year < other.year) {
            return true;
        }
        if (this.year == other.year
                && this.month == other.month
                && this.day < other.day) {
            return true;
        }
        return false;
    }

    public int differenceInYears(SimpleDate other) {
        if (earlier(other)) {
            return other.differenceInYears(this);
        }

        int yearRemoved = 0;

        if (this.month < other.month) {
            yearRemoved = 1;
        } else if (this.month == other.month && this.day < other.day) {
            yearRemoved = 1;
        }

        return this.year - other.year - yearRemoved;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof SimpleDate)) {
            return false;
        }

        SimpleDate compareDate = (SimpleDate) object;

        if (this.day == compareDate.day
                && this.month == compareDate.month
                && this.year == compareDate.year) {
            return true;
        }
        return false;
    }
}
