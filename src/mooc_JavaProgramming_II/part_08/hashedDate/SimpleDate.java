package mooc_JavaProgramming_II.part_08.hashedDate;
/*
        Давайте расширим SimpleDate класс из предыдущего упражнения, чтобы он также имел собственный
        hashCode метод.

        Создайте метод public int hashCode() для SimpleDate класса, который вычисляет хэш для объекта
        SimpleDate. Реализуйте вычисление хеша таким образом, чтобы между 1900 и 2100 годами было как
        можно меньше похожих хешей.
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
                && this.month < other.month) {
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

        SimpleDate comparedDate = (SimpleDate) object;

        if (this.day == comparedDate.day
                && this.month == comparedDate.month
                && this.year == comparedDate.year) {
            return true;
        }

        return false;
    }

    public int hashCode() {
        return (this.year * 385) + (this.month * 32) + this.day;
    }
}
