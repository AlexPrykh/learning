package myTreeMap;

import java.util.Comparator;
import java.util.TreeMap;

public class MyTreeMap {
    private final Comparator comparator;
    private MyTreeMap.Entry root;
    private int size = 0;
    private int modCount = 0;

    public MyTreeMap() {
        comparator = null;
    }

    public void clear() {
        this.modCount++;
        this.size = 0;
        this.root = null;
    }

    public int size() {
        return size;
    }

    public boolean containsKey(Object key) {
        return this.getEntry(key) != null;
    }

    public Object get(Object key) {
        Entry p = this.getEntry(key);
        return p == null ? null : p.value;
    }

    final Entry getEntry(Object key) {
        if (this.comparator != null) {
            return this.getEntryUsingComparator(key);
        } else if (key == null) {
            throw new NullPointerException();
        } else {
            Comparable k = (Comparable) key;

            Entry p = this.root;

            while (p != null) {
                int cpm = k.compareTo(p.key);
                if (cpm < 0) {
                    p = p.left;
                } else {
                    if (cpm <= 0) {
                        return p;
                    }
                    p = p.right;
                }
            }
            return null;
        }
    }

    final Entry getEntryUsingComparator(Object key) {
        Comparator cpr = this.comparator;
        if (cpr != null) {
            Entry p = this.root;

            while (p != null) {
                int cmp = cpr.compare(key, p.key);
                if (cmp < 0) {
                    p = p.left;
                } else {
                    if (cmp <= 0) {
                        return p;
                    }
                    p = p.right;
                }
            }
        }
        return null;
    }


     class Entry implements Comparable<Entry> {
        Object key;
        Object value;
        MyTreeMap.Entry left = null;
        MyTreeMap.Entry right = null;
        MyTreeMap.Entry parent;

        public Entry(Object key, Object value, Entry parent) {
            this.key = key;
            this.value = value;
            this.parent = parent;
        }

        public Object getKey() {
            return key;
        }

        public Object getValue() {
            return value;
        }

        public Object setValue(Object value) {
            Object oldValue = this.value;
            this.value = value;
            return oldValue;
        }

        public Object put(Object key, Object value) {
            Entry t = root; // Корневой узел красно-черного дерева
            if (t == null) {// Пусто ли красно-черное дерево
                compare(key, key); // type (and possibly null) check
                // Создаем корневой узел, поскольку у корневого узла нет родительского узла, передаем нулевое значение.
                root = new Entry(key, value, null);
                size = 1; // значение размера плюс 1
                modCount++; // Изменить количество модификаций
                return null; // вернуть ноль
            }
            int cmp;
            Entry parent; // Определить узел
            // split comparator and comparable paths
            Comparator comparator = MyTreeMap.this.comparator; // Получить компаратор
            if (comparator != null) {// Если определен компаратор, используйте для сравнения пользовательский компаратор
                do {
                    parent = t; // Присвоить корневой узел красно-черного дерева родителю
                    cmp = comparator.compare(key, t.key); // Сравнить ключ с размером корневого узла
                    if (cmp < 0) { // если key < t.key, указать на левое поддерево
                        t = t.left; // t = t.left, t == его дочерний узел
                    } else if (cmp > 0) {
                        t = t.right; // если ключ> t.key, указать на его правый дочерний узел
                    } else {
                        return t.setValue(value); // Если они равны, заменить значение ключа
                    }
                } while (t != null); // перебрать
            } else {
                // Естественный метод сортировки, компаратор не указан
                if (key == null) {
                    throw new NullPointerException(); // бросить исключение
                }
                Comparable k = (Comparable) key; // Преобразование типов
                do {
                    parent = t;
                    cmp = k.compareTo(t.key);
                    if (cmp < 0) { // key < t.key
                        t = t.left; // левый ребенок
                    } else if (cmp > 0) { // key > t.key
                        t = t.right; // правый ребенок
                    } else {
                        return t.setValue(value); // t == t.key, заменить значение
                    }
                } while (t != null);
            }
            Entry e = new Entry(key, value, parent); // Создать новый узел и указать родительский узел
            // Определяем, является ли новый узел левым или правым дочерним узлом родительского узла на основе результата сравнения
            if (cmp < 0) {
                parent.left = e;
            } else {
                parent.right = e;
                size++;
                modCount++;
            }
            return null;
        }

        public Object remove(Object key) {
            Entry p = this.getEntry(key);
            if (p == null) {
                return null;
            } else {
                Object oldValue = p.value;
                this.deleteEntry(p);
                return oldValue;
            }
        }

        // Метод сравнения, если для сравнения == null, используйте сопоставимый.compartTo для сравнения, в противном случае для сравнения размера используйте указанный компаратор
        public Object compare(Object k1, Object k2) {
            return comparator == null ? ((Comparable) k1).compareTo(k2)
                    : comparator.compare(k1, (k2));
        }


        @Override
        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) object;
            return valEquals(key, entry.getKey()) && valEquals(value, entry.getValue());
        }

        @Override
        public int hashCode() {
            int keyHash = this.key == null ? 0 : this.key.hashCode();
            int valueHash = this.value == null ? 0 : this.value.hashCode();
            return keyHash ^ valueHash;
        }

        @Override
        public String toString() {
            return key + " = " + value;
        }

        @Override
        public int compareTo(Entry entry) {
            if (this.key.hashCode() == entry.getKey().hashCode()) {
                return 0;
            } else if (this.key.hashCode() < entry.getKey().hashCode()) {
                return -1;
            } else {
                return 1;
            }
        }

        public boolean valEquals(Object o1, Object o2) {
            return o1 == null ? o2 == null : o1.equals(o2);
        }
    }
}
