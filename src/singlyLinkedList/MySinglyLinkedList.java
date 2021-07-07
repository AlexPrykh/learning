package singlyLinkedList;

import java.util.Iterator;

public class MySinglyLinkedList {
    public static void main(String[] args) {
        SingleLinkList<Contact> contactList = new SingleLinkList<>();
        contactList.addToEnd(new Contact(123, "Vasily Grigorievich Badov", "+120785436754"));
        contactList.addToEnd(new Contact(132, "Roman Viktorovich Kakashko", "+120506785321"));
        contactList.addToEnd(new Contact(134, "Andrey Alekseevich Piskurko", "+120719818756"));
        contactList.addToEnd(new Contact(135, "Vitaliy Gashishovich Pukan", "+120978011100"));
        contactList.addToEnd(new Contact(137, "Rita Vasilievna Jopko", "+12076553329"));

        for (Contact contact : contactList) {
            System.out.println(contact);
        }

        System.out.println("========================================================================");

        contactList.reverse();
        for (Contact contact : contactList) {
            System.out.println(contact);
        }
    }

    static class Contact {
        private int id;
        private String name;
        private String phone;

        public Contact(int id, String name, String phone) {
            this.id = id;
            this.name = name;
            this.phone = phone;
        }

        @Override
        public String toString() {
            return "Contact{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", phone='" + phone + '\'' +
                    '}';
        }
    }

    public static class SingleLinkList<T> implements Iterable<T> {
        ListItem<T> head;
        ListItem<T> tail;

        @Override
        public Iterator<T> iterator() {
            return new Iterator<T>() {
                ListItem<T> current = head;

                @Override
                public boolean hasNext() {
                    return current != null;
                }

                @Override
                public T next() {
                    T data = current.data;
                    current = current.next;
                    return data;
                }
            };
        }

        private static class ListItem<T> {
            T data;
            ListItem<T> next;
        }

        public boolean isEmpty() {
            return head == null;
        }

        public void addToEnd(T item) {
            ListItem<T> newItem = new ListItem<>();
            newItem.data = item;
            if (isEmpty()) {
                head = newItem;
                tail = newItem;
            } else {
                tail.next = newItem;
                tail = newItem;
            }
        }

        public void reverse() {
            if (!isEmpty() && head.next != null) {
                tail = head;
                ListItem<T> current = head.next;
                head.next = null;

                while (current != null) {
                    ListItem<T> next = current.next;
                    current.next = head;
                    head = current;
                    current = next;
                }
            }
        }
    }
}
