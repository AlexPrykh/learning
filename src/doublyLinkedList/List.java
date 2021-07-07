package doublyLinkedList;

public class List {
    private Node head;
    private Node tail;

    public List() {
        this.head = null;
        this.tail = null;
    }

    private boolean isEmpry() {
        return head == null;
    }

    public void addFirst(int data) {
        Node temp = new Node(data);

        if (isEmpry()) {
            tail = temp;
        } else {
            head.previous = temp;
        }
        temp.next = head;
        head = temp;
    }

    public void addLast(int data) {
        Node temp = new Node(data);

        if (isEmpry()) {
            head = temp;
        } else {
            tail.next = temp;
        }
        temp.previous = tail;
        tail = temp;
    }

    public void addByIndex(int data, int index) {
        Node current = head;
        int c = 0;

        while (current != null && c != index) {
            current = current.next;
            c++;
        }
        Node temp = new Node(data);
        current.previous.next = temp;
        temp.previous = current.previous;
        current.previous = temp;
        temp.next = current;
    }

    public void removeFirst() {
        if (head.next == null) {
            tail = null;
        } else {
            head.next.previous = null;
        }
        head = head.next;
    }

    public void removeLast() {
        if (head.next == null) {
            head = null;
        } else {
            tail.previous.next = null;
        }
        tail = tail.previous;
    }

    // проверить метод
    public void removeAt(int key) {
        Node current = head;
        while (current.data != key) {
            current = current.next;

            if (current == null) {
                return;
            }
        }

        if (current == head) {
            removeFirst();
        } else {
            current.previous.next = current.next;
        }

        if (current == tail) {
            removeLast();
        } else {
            current.next.previous = current.previous;
        }
    }

    public void print() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
