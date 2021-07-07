package doublyLinkedList;

public class Program {
    public static void main(String[] args) {
        List list = new List();
        System.out.println("Add numbers to the beginning of the list:");
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.print();
        System.out.println("Add one more number to the end of the list:");
        list.addLast(6);
        list.print();
        System.out.println("Add the number by index, at position 1:");
        list.addByIndex(7, 1);
        list.print();
        System.out.println();

        System.out.println("Removing the first number in the list:");
        list.removeFirst();
        list.print();
        System.out.println("Removing the last number in the list:");
        list.removeLast();
        list.print();
        System.out.println();

        System.out.println("Remove the number by key:");
        list.removeAt(2);
        list.print();
    }
}
