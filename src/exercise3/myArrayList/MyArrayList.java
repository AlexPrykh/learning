package exercise3.myArrayList;

import java.util.Arrays;
import java.util.Collection;

public class MyArrayList {
    private Object[] elements; //массив для хранения объектов
    private int size; //поле-счетчик, которое указывает на количество елементов в массиве
    private static final int DEFAULT_CAPACITY = 16; //размер массива по умолчанию
    private static final Object[] EMPTY_ELEMENT_DATA = new Object[0]; //массив, в котором нет объуктов (пустой)

    //конструктор без параметров, который создает массив на 16 элементов,
    //если размер не был указан
    public MyArrayList() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    //конструктор с папаметром, который создает массив по указанному размеру
    public MyArrayList(int initialCapacity) {
        if (initialCapacity >= 0) {
            this.elements = new Object[initialCapacity];
        } else {
            throw new IllegalStateException("Capacity can't be less than 0.");
        }
        this.elements = EMPTY_ELEMENT_DATA;
    }

    //получает элемент по указанному индексу
    public Object get(int index) {
        isIndexExist(index);
        return elements[index];
    }

    //устанавливаем элемент на указанную позицию
    public Object set(int index, Object object) {
        isIndexExist(index);
        Object temp = elements[index];
        elements[index] = object;
        return temp;
    }

    //возвращает количество элементов в списке
    public int size() {
        return size;
    }

    //дополнительный закрытый метод для увеличения ёмкости массива
    private Object[] increaseCapacity() {
        int[] temp = new int[(int) (elements.length * 1.5 + 1)]; //создаем массив большего размера
        System.arraycopy(elements, 0, temp, 0, elements.length);
        return new int[][]{temp};
    }

    //проверяем индексы, не выходят ли они за границы массива
    private int isIndexExist(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Element can't be found! "
                    + "Number of elements in array = " + size
                    + ". Total size of array = " + elements.length);
        }
        return index;
    }

    //добавляем элемент в конец списка
    public boolean add(Object value) {
        if (size == elements.length) {  //если в массиве нет места
            elements = increaseCapacity(); //вызываем метод, который отвечает за увеличение массива
        }
        elements[size] = value; //записываем в конец списка новое значение
        size++; //увеличиваем значение переменной размера списка
        return true;
    }

    //добавляем элемент в список по индексу
    public void add(int index, Object object) {
        if (index > size || index < 0) { //если вышли за пределы массива
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + size);
        }
        System.arraycopy(elements, index, elements, index + 1, size - index);
        if (isIndexExist(index) <= size) { //проверяем индуксы
            increaseCapacity(); // увеличиваем массив
        }
        elements[index] = object;
        size++;
    }

    //метод, который добавляет все элементы в список за раз
    public boolean addAll(Collection collection) {
        for (Object object : collection) {
            add(object);
        }
        return true;
    }

    //метод, который удаляет указанный объект
    public boolean remove(Object object) {
        Object[] temp = this.elements;
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

    // метод, который удаляет элемент по индексу
    public Object remove(int index) {
        isIndexExist(index); // проверям индекс
        Object[] temp = elements; //во временный массыв заносим ссылку на текущий массив
        elements = new Object[temp.length - 1]; //полю elements присваиваем ссылку на новый массив размером на 1 меньше
        Object value = temp[index]; //сохраняем в доп. переменную значение удаляемого елемента
        System.arraycopy(temp, 0, elements, 0, index); //копируем левую часть массива до указанного индекса
        System.arraycopy(temp, index + 1, elements, index, temp.length - index - 1); //копируем правую часть массива после указанного индекса
        size--; //уменьшаем значение переменной
        return value;
    }

    //метод, который проверяет есть ли элементы в списке
    public boolean isEmpty() {
        return size == 0;
    }

    //метод, который проверяет элементы на равность
    public boolean contains(Object object) {
        Object[] temp = this.elements;
        if (object != null) {
            for (int i = 0; i < size; i++) {
                if (object.equals(temp[i])) {
                    return true;
                }
            }
        } else {
            //сравнивает элементы с ==
            for (int i = 0; i < size; i++) {
                if (object == temp[i]) {
                    return true;
                }
            }
        }
        return false;
    }

    //метод, который возвращает индекс первого вхождения указанного элемента в этот список или -1,
    //если этот список не содержит элемента
    public int indexOf(Object o) {
        Object[] temp = this.elements;
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (temp[i] == null) {
                    return i;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(temp[i])) {
                    return i;
                }
            }
        }
        return -1;
    }

    //переопределенный метод для красивого вывода списка на екран
    //иначе будут выводится значения незаполненных ячеек [1, 10] вместо [1, 10, 0, 0...]
    @Override
    public String toString() {
        int[] temp = new int[size];
        System.arraycopy(elements, 0, temp, 0, size);
        return Arrays.toString(temp);
    }
}
