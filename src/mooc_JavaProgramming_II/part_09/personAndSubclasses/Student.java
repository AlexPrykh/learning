package mooc_JavaProgramming_II.part_09.personAndSubclasses;

/*
        Part 2: Student
        Создайте класс Student, который наследует этот класс Person.

        На момент создания у студента 0 зачетных единиц. Каждый раз, когда студент учится,
        количество зачетных единиц увеличивается. Класс должен действовать следующим образом:

        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);
        System.out.println("Study credits " + ollie.credits());
        ollie.study();
        System.out.println("Study credits "+ ollie.credits());

        Part 3: Student's toString
        В предыдущей задаче Student наследует метод toString от класса Person. Однако вы также
        можете перезаписать унаследованный метод, заменив его собственной версией. Напишите версию
        метода toString специально для этого класса Student.
 */
public class Student extends Person {
    private int study;

    public Student(String name, String placeOfResidence) {
        super(name, placeOfResidence);
    }

    public void study() {
        this.study++;
    }

    public int credits() {
        return this.study;
    }

    @Override
    public String toString() {
        return super.toString() + "\n Study credits " + this.study;
    }
}
