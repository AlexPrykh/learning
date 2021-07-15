package myHashSet;

public class Main {
    public static void main(String[] args) {
        MyHashSet myHashSet = new MyHashSet();
        myHashSet.add(21);
        myHashSet.add(25);
        myHashSet.add(30);
        myHashSet.add(33);
        myHashSet.add(35);

        System.out.println("MyHashSet contains 21 = " + myHashSet.contains(21));
        System.out.println("MyHashSet contains 51 = " + myHashSet.contains(51));

        System.out.print("Displaying MyHashSet: ");
        myHashSet.display();

        System.out.println("\n\n21 removed: " + myHashSet.remove(21));
        System.out.println("22 removed: " + myHashSet.remove(22));

        System.out.print("Displaying MyHashSet: ");
        myHashSet.display();

    }
}
