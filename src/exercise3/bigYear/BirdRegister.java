package exercise3.bigYear;

import java.util.ArrayList;
import java.util.Scanner;

public class BirdRegister {
    private ArrayList<Bird> register;

    public BirdRegister() {
        this.register = new ArrayList<>();
    }

    public void add(String name, String latinName) {
        register.add(new Bird(name, latinName));
    }

    public ArrayList<Bird> getRegister() {
        return register;
    }
}
