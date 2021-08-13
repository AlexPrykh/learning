package myLinkedListUsingGenerics;

import java.util.Collection;
import java.util.NoSuchElementException;

public class MyLinkedListUsingGenerics<E> {
    transient int size = 0;
    transient Node<E> first;
    transient Node<E> last;

    public MyLinkedListUsingGenerics() {
    }

    private class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    private void checkIndexExist(int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Element can't be found! "
                    + "Number of elements in array = " + size);
        }
    }

    public E get(int index) {
        checkIndexExist(index);
        return node(index).item;
    }

    public E set(int index, E element) {
        checkIndexExist(index);
        Node<E> x = node(index);
        E oldVal = x.item;
        x.item = element;
        return oldVal;
    }

    private void linkFirst(E e) {
        final Node<E> f = first;
        final Node<E> newNode = new Node<>(null, e, f);
        first = newNode;
        if (f == null) {
            last = newNode;
        } else {
            f.prev = newNode;
        }
        size++;
    }

    void linkLast(E e) {
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(l, e, null);
        last = newNode;
        if (l == null) {
            first = newNode;
        } else {
            l.next = newNode;
        }
        size++;
    }

    void linkBefore(E e, Node<E> succ) {
        final Node<E> pred = succ.prev;
        final Node<E> newNode = new Node<>(pred, e, succ);
        succ.prev = newNode;
        if (pred == null) {
            first = newNode;
        } else {
            pred.next = newNode;
        }
        size++;
    }

    private E unlinkFirst(Node<E> first) {
        final E element = first.item;
        final Node<E> next = first.next;
        first.item = null;
        first.next = null;
        this.first = next;
        if (next == null) {
            last = null;
        } else {
            next.prev = null;
        }
        size--;
        return element;
    }

    private E unlinkLast(Node<E> last) {
        final E element = last.item;
        final Node<E> prev = last.prev;
        last.item = null;
        last.prev = null;
        this.last = prev;
        if (prev == null) {
            first = null;
        } else {
            prev.next = null;
        }
        size--;
        return element;
    }

    E unlink(Node<E> x) {
        final E element = x.item;
        final Node<E> next = x.next;
        final Node<E> prev = x.prev;

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

    public E getFirst() {
        final Node<E> first = this.first;
        if (first == null) {
            throw new NoSuchElementException();
        }
        return first.item;
    }

    public E getLast() {
        final Node<E> last = this.last;
        if (last == null) {
            throw new NoSuchElementException();
        }
        return last.item;
    }

    public E removeFirst() {
        final Node<E> first = this.first;
        if (first == null) {
            throw new NoSuchElementException();
        }
        return unlinkFirst(first);
    }

    public E removeLast() {
        final Node<E> last = this.last;
        if (last == null) {
            throw new NoSuchElementException();
        }
        return unlinkLast(last);
    }

    public void addFirst(E e) {
        linkFirst(e);
    }

    public void addLast(E e) {
        linkLast(e);
    }

    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    public int size() {
        return size;
    }

    public boolean add(E e) {
        linkLast(e);
        return true;
    }

    public void add(int index, E element) {
        checkIndexExist(index);
        if (index == size) {
            linkLast(element);
        } else {
            linkBefore(element, node(index));
        }
    }

    public boolean addAll(Collection<? extends E> collection) {
        for (E element : collection) {
            add(element);
        }
        return true;
    }


    public E element() {
        return getFirst();
    }

    private int indexOf(Object o) {
        int index = 0;
        if (o == null) {
            for (Node<E> x = first; x != null; x = x.next) {
                if (x.item == null) {
                    return index;
                }
                index++;
            }
        } else {
            for (Node<E> x = first; x != null; x = x.next) {
                if (o.equals(x.item)) {
                    return index;
                }
                index++;
            }
        }
        return -1;
    }

    public boolean remove(Object object) {
        if (object == null) {
            for (Node<E> x = first; x != null; x = x.next) {
                if (x.item == null) {
                    unlink(x);
                    return true;
                }
            }
        } else {
            for (Node<E> x = first; x != null; x = x.next) {
                if (object.equals(x.item)) {
                    unlink(x);
                    return true;
                }
            }
        }
        return false;
    }

    public E remove() {
        return removeFirst();
    }

    public Object remove(int index) {
        checkIndexExist(index);
        Node<E> nodeToUnlink = node(index);
        return unlink(nodeToUnlink);
    }

    private Node<E> node(int index) {
        if (index > size / 2) {
            Node<E> current = this.last;
            for (int i = size; i > index; i--) {
                current = current.prev;
            }
            return current;
        } else {
            Node<E> current = this.first;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (Node<E> x = first; x != null; x = x.next) {
            E item = x.item;
            sb.append(item);
            if (x.next != null) {
                sb.append(", ");
            }
        }

        sb.append("]");
        return sb.toString();
    }
}
