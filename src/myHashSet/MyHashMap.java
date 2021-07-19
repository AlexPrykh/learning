package myHashSet;

import java.util.Objects;

public class MyHashMap {
    private Entry[] table;
    private int capacity = 16;
    private double loadFactor = 0.75;
    private int size;

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
        this.table = new Entry[capacity];
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int getSize() {
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
        if (this.shouldResize()) {
            this.resize();
        }

        if (addEntry(new Entry(key, value), this.table)) {
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

    private boolean shouldResize() {
        return this.size > Math.ceil((double) this.capacity * this.loadFactor);
    }

    private void resize() {
        this.capacity = this.size * 2;

        Entry[] newEntries = new Entry[this.capacity];
        for (Entry entry : table) {
            if (entry != null) {
                this.setEntry(entry, newEntries);
            }
        }
        this.table = newEntries;
    }

    private void setEntry(Entry entry, Entry[] newEntries) {
        Entry nextEntry = entry.next;
        entry.next = null;

        this.addEntry(entry, newEntries);

        if (nextEntry != null) {
            this.setEntry(nextEntry, newEntries);
        }
    }

    private boolean addEntry(Entry entry, Entry[] newEntries) {
        int index = indexOf(entry.key);
        Entry existingEntry = newEntries[index];

        if (existingEntry == null) {
            newEntries[index] = entry;
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

        for (int i = 0; i < capacity; i++) {
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

        for (int i = 0; i < capacity; i++) {
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
        return Math.abs(key.hashCode()) % capacity;
    }

    private Entry getMatchingEntry(Object key) {
        Entry existingEntry = this.table[indexOf(key)];

        while (existingEntry != null && !matches(key, existingEntry.key)) {
            existingEntry = existingEntry.next;
        }

        return existingEntry;
    }

    private int indexOf(Object object) {
        return object == null ? 0 : hash(object) & (this.capacity - 1);
    }

    private boolean matches(Object o1, Object o2) {
        return Objects.equals(o1, o2);
        //return (o1 == null && o2 == null) ||
        //        (o1 != null && o2 != null && o1.equals(o2));
    }
}
