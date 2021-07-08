package myLinkedList;

public class Main {
    // let's test our LinkedList here
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println(linkedList);

        linkedList.set(0, 25);

        System.out.println(linkedList);

        linkedList.remove((Object) 4);

        System.out.println(linkedList);

        linkedList.remove(0);

        System.out.println(linkedList);
    }
}
