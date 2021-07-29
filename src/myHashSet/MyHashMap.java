package myHashSet;

import java.util.Objects;

public class MyHashMap {
    private Entry[] table;
    static final int DEFAULT_INITIAL_CAPACITY = 16;
    private double loadFactor = 0.75;
    private int size;
    private int MAX_ENTRY_SIZE = 5;

    private static class Entry {
        Object key;
        Object value;
        Entry next;

        public Entry(Object key, Object value) {
            this.key = key;
            this.value = value;
        }
    }

    public MyHashMap() {
        this.table = new Entry[DEFAULT_INITIAL_CAPACITY];
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int size() {
        return size;
    }

    public boolean containsKey(Object key) {
        return getMatchingEntry(key) != null;
        //Entry matchingEntry = getMatchingEntry(key);
        //return matchingEntry != null && matchingEntry.key == key;
    }

    public boolean containsValue(Object value) {
        for (Entry entry : table) {
            while (entry != null && !matches(value, entry.value)) {
                entry = entry.next;
            }
            if (entry != null) {
                return true;
            }
        }
        return false;
    }

    public Object get(Object key) {
        Entry matchingEntry = getMatchingEntry(key);
        return matchingEntry == null ? null : matchingEntry.value;
    }

    public void put(Object key, Object value) {
        if (this.shouldResize(table[(int) value])) {
            this.resize();
        }

        if (addEntry(new Entry(key, value))) {
            this.size++;
        }
    }

    public boolean remove(Object deleteKey) {
        int index = indexOf(deleteKey);
        Entry currentEntry = this.table[index];

        while (currentEntry != null && currentEntry.next != null
                && !matches(deleteKey, currentEntry.next.key)) {

            currentEntry = currentEntry.next;
        }
        if (currentEntry != null) {
            if (matches(deleteKey, currentEntry.key)) {
                this.table[index] = null;
            } else if (currentEntry.next != null) {
                currentEntry.next = currentEntry.next.next;
            }
            this.size--;
            return true;
        }
        return false;
    }

    private boolean shouldResize(Entry entry) {
        if (entry == null) {
            return false;
        }

        int countValues = 1;
        while (entry.next != null) {
            countValues++;
            entry = entry.next;
        }
        if (countValues >= MAX_ENTRY_SIZE) {
            return true;
        }
        return false;
    }

    private void resize() {
        int newCopacity = (int) (this.size * 2.5);

        Entry[] oldEntries = this.table;
        Entry[] newEnries = new Entry[newCopacity];
        this.table = newEnries;
        this.size = 0;

        for (Entry oldEntry : oldEntries) {
            while (oldEntry != null) {
                Object key = oldEntry.key;
                Object value = oldEntry.value;
                put(key, value);
                oldEntry = oldEntry.next;
            }
        }
    }


    private boolean addEntry(Entry entry) {
        int index = indexOf(entry.key);
        Entry existingEntry = this.table[index];

        boolean shouldResize = this.shouldResize(existingEntry);

        if (shouldResize) {
            this.resize();
            index = indexOf(entry.key);
            existingEntry = this.table[index];
        }

        if (existingEntry == null) {
            this.table[index] = entry;
            return true;
        } else {
            while (!this.matches(entry.key, existingEntry.key)
                    && existingEntry.next != null) {
                existingEntry = existingEntry.next;
            }
            if (this.matches(entry.key, existingEntry.key)) {
                existingEntry.value = entry.value;
                return false;
            }
            existingEntry.next = entry;
            return true;
        }
    }

    public void display() {

        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {
                Entry entry = table[i];
                while (entry != null) {
                    System.out.print("{" + entry.key + " = " + entry.value + "}" + " ");
                    entry = entry.next;
                }
            }
        }
    }

    public Object contains(Object key) {
        int hash = hash(key);
        if (table[hash] == null) {
            return null;
        } else {
            Entry temp = table[hash];
            while (temp != null) {
                if (temp.key.equals(key))
                    return key;
                temp = temp.next;
            }
            return null;
        }
    }

    public void displaySet() {

        for (int i = 0; i < table.length; i++) {
            if (table[i] != null) {
                Entry entry = table[i];
                while (entry != null) {
                    System.out.print(entry.key + " ");
                    entry = entry.next;
                }
            }
        }
    }

    private int hash(Object key) {
        return Math.abs(key.hashCode()) % table.length;
    }

    public void clear() {
        Entry[] tab;
        if ((tab = this.table) != null && this.size > 0) {
            this.size = 0;

            for (int i = 0; i < tab.length; i++) {
                tab[i] = null;
            }
        }
    }

    private Entry getMatchingEntry(Object key) {
        Entry existingEntry = this.table[indexOf(key)];

        while (existingEntry != null && !matches(key, existingEntry.key)) {
            existingEntry = existingEntry.next;
        }

        return existingEntry;
    }

    private int indexOf(Object object) {
        return object == null ? 0 : hash(object) & (this.table.length - 1);
    }

    private boolean matches(Object o1, Object o2) {
        return Objects.equals(o1, o2);
        // return (o1 == null && o2 == null) ||
        //        (o1 != null && o2 != null && o1.equals(o2));
    }
}
