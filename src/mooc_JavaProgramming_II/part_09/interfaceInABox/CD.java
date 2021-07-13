package mooc_JavaProgramming_II.part_09.interfaceInABox;

public class CD implements Packable {
    private String executor;
    private String name;
    private int yearOfPublication;

    public CD(String executor, String name, int yearOfPublication) {
        this.executor = executor;
        this.name = name;
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public double weight() {
        return 0.1;
    }

    @Override
    public String toString() {
        return executor + ": " + name + " (" + yearOfPublication + ")";
    }
}
