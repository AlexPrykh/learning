package myLinkedList;

import java.util.Collection;

public class MyLinkedList {
    private int size = 0;
    private Node first;
    private Node last;

    private static class Node {
        Object item;
        Node next;
        Node prev;

        Node(Node prev, Object element, Node next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    //вспомагательный метод, который проверяет индексы
    private void checkIndexExist(int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Element can't be found! "
                    + "Number of elements in array = " + size);
        }
    }

    //получает элемент по указанному индексу
    public Object get(int index) {
        checkIndexExist(index);
        return node(index).item;
    }


    private Node node(int index) {
        if (index > size / 2) {
            // right part of the list - start from 'last'
            Node current = this.last;
            for (int i = size; i > index; i--) {
                current = current.prev;
            }
            return current;
        } else {
            Node current = this.first;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current;
        }
    }

    //устанавливаем элемент на указанную позицию
    public Object set(int index, Object object) {
        checkIndexExist(index);
        Node node = node(index);
        Object previousItem = node.item;
        node.item = object;

        return previousItem;
    }

    //возвращает количество элементов в списке
    public int size() {
        return size;
    }

    //добавляем элемент в конец списка
    public boolean add(Object value) {
        linkLast(value);
        return true;
    }

    //добавляем элемент в список по индексу
    public void add(int index, Object object) {
        checkIndexExist(index);
        if (index == size) {
            linkLast(object);
        } else {
            linkBefore(object, node(index));
        }
    }

    void linkBefore(Object e, Node node) {
        final Node previousNode = node.prev;
        final Node newNode = new Node(previousNode, e, node);
        node.prev = newNode;
        if (previousNode == null) {
            first = newNode;
        } else {
            previousNode.next = newNode;
            size++;
        }
    }

    private void linkLast(Object e) {
        final Node previousLastNode = last;
        final Node newNode = new Node(previousLastNode, e, null);
        last = newNode;
        if (previousLastNode == null) {
            first = newNode;
        } else {
            previousLastNode.next = newNode;
            size++;
        }
    }

    //метод, который добавляет все элементы в список за раз
    public boolean addAll(Collection collection) {
        for (Object e : collection) {
            add(e);
        }
        return true;
    }

    //метод, который удаляет указанный объект
    public boolean remove(Object o) {
        if (o == null) {
            for (Node x = first; x != null; x = x.next) {
                if (x.item == null) {
                    unlink(x);
                    return true;
                }
            }
        } else {
            for (Node x = first; x != null; x = x.next) {
                if (o.equals(x.item)) {
                    unlink(x);
                    return true;
                }
            }
        }
        return false;
    }

    private Object unlink(Node x) {
        final Object element = x.item;

        final Node next = x.next;
        final Node prev = x.prev;

        if (prev == null) {
            first = next;
        } else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null) {
            last = prev;
        } else {
            next.prev = prev;
            x.next = null;
        }

        x.item = null;
        size--;

        return element;
    }

    // метод, который удаляет элемент по индексу
    public Object remove(int index) {
        checkIndexExist(index);
        Node nodeToUnlink = node(index);
        return unlink(nodeToUnlink);
    }

    //метод, который проверяет есть ли элементы в списке
    public boolean isEmpty() {
        return size == 0;
    }

    //метод, который проверяет элементы на равность
    public boolean contains(Object object) {
        return indexOf(object) != -1;
    }

    //метод, который возвращает индекс первого вхождения указанного элемента в этот список или -1,
    //если этот список не содержит элемента
    public int indexOf(Object o) {
        int index = 0;
        if (o == null) {
            for (Node x = first; x != null; x = x.next) {
                if (x.item == null)
                    return index;
                index++;
            }
        } else {
            for (Node x = first; x != null; x = x.next) {
                if (o.equals(x.item))
                    return index;
                index++;
            }
        }
        return -1;
    }

    //переопределенный метод toString() для красивого вывода списка на екран
    @Override
    public String toString() {
        // [1, 2, 3]
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (Node x = first; x != null; x = x.next) {
            Object item = x.item;
            sb.append(item);
            if (x.next != null) {
                sb.append(", ");
            }
        }

        sb.append("]");
        return sb.toString();
    }
}
