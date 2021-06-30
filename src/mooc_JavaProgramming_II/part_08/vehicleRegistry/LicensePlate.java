package mooc_JavaProgramming_II.part_08.vehicleRegistry;

import java.util.List;

/*
        Part 1: Equals and hashCode for the LicensePlate class
        Европейские номерные знаки состоят из двух частей: двухбуквенного кода страны и
        уникального национального номера лицензии. Номер лицензии состоит из цифр и символов.

        Мы хотим иметь возможность сохранять номерные знаки в ArrayLists и использовать их в
        качестве ключей в HashMap. Это, как было указано выше, означает , что equals и hashcode методы
        должны быть перезаписаны, или они не будут работать должным образом . Реализуйте методы equals
        и hashCode для класса LicensePlate.

        Когда они будут реализованы правильно, пример вывода программы напечатает:

        Пример вывода
    Финский: [FI ABC-123, FI UXE-465] владелец: Арто Юрген
 */
public class LicensePlate {
    // these instance variables have been defined as final, meaning
    // that once set, their value can't be changed
    private final String country;
    private final String liNumber;

    public LicensePlate(String country, String liNumber) {
        this.country = country;
        this.liNumber = liNumber;
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof LicensePlate)) {
            return false;
        }

        LicensePlate compared = (LicensePlate) object;

        if (this.liNumber.equals(compared.liNumber)
                && this.country.equals(compared.country)) {
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.country.hashCode() + this.liNumber.hashCode();
    }
}
