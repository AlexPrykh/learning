package myArrayListUsingGenerics;

import java.util.Arrays;
import java.util.Collection;

public class MyArrayListUsingGenerics<E> {
    transient Object[] elementData;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;
    private static final Object[] EMPTY_ELEMENT_DATA = new Object[0];

    public MyArrayListUsingGenerics(Object[] elementData) {
        this.elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayListUsingGenerics(int initialCapacity) {
        if (initialCapacity >= 0) {
            this.elementData = new Object[initialCapacity];
        } else {
            throw new IllegalStateException("Capacity can't be less than 0.");
        }
        this.elementData = EMPTY_ELEMENT_DATA;
    }

    public void trimToSize() {
        if (size < elementData.length) {
            elementData = (size == 0)
                    ? EMPTY_ELEMENT_DATA
                    : Arrays.copyOf(elementData, size);
        }
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public boolean contains(Object object) {
        return indexOf(object) >= 0;
    }

    public int indexOf(Object o) {
        return indexOfRange(o, 0, size);
    }

    int indexOfRange(Object o, int start, int end) {
        Object[] es = elementData;
        if (o == null) {
            for (int i = start; i < end; i++) {
                if (es[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = start; i < end; i++) {
                if (o.equals(es[i])) {
                    return i;
                }
            }
        }
        return -1;
    }


    public E get(int index) {
        isIndexExist(index);
        return elementData(index);
    }

    private int isIndexExist(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Element can't be found! "
                    + "Number of elements in array = " + size
                    + ". Total size of array = " + elementData.length);
        }
        return index;
    }

    public E set(int index, E element) {
        isIndexExist(index);
        E oldValue = elementData(index);
        elementData[index] = element;
        return oldValue;
    }

    E elementData(int index) {
        return (E) elementData[index];
    }

    private Object[] increaseCapacity() {
        Object[] temp = new Object[(int) (elementData.length * 1.5 + 1)];
        System.arraycopy(elementData, 0, temp, 0, elementData.length);
        return temp;
    }

    public boolean add(E element) {
        if (size == elementData.length) {
            elementData = increaseCapacity();
        }
        elementData[size] = element;
        size++;
        return true;
    }

    public void add(int index, E element) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + size);
        }
        System.arraycopy(elementData, index, elementData, index + 1, size - index);
        if (isIndexExist(index) <= size) {
            elementData = increaseCapacity();
        }
        elementData[index] = element;
        size++;
    }

    public boolean remove(Object object) {
        Object[] temp = this.elementData;
        if (object == null) {
            for (int i = 0; i < size; i++) {
                if (temp[i] == null) {
                    remove(i);
                    return true;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (object.equals(temp[i])) {
                    remove(i);
                    return true;
                }
            }
        }
        return false;
    }

    public E remove(int index) {
        isIndexExist(index);
        Object[] temp = elementData;
        elementData = new Object[temp.length - 1];
        E oldValue = (E) temp[index];
        System.arraycopy(temp, 0, elementData, 0, index);
        System.arraycopy(temp, index + 1, elementData, index, temp.length - index - 1);
        size--;
        return oldValue;
    }

    public void clear() {
        final Object[] temp = elementData;
        for (int to = size, i = size = 0; i < to; i++)
            temp[i] = null;
    }

    public boolean addAll(Collection<? extends E> collection) {
        for (E object : collection) {
            add(object);
        }
        return true;
    }

    @Override
    public String toString() {
        Object[] temp = new Object[size];
        System.arraycopy(elementData, 0, temp, 0, size);
        return Arrays.toString(temp);
    }
}
