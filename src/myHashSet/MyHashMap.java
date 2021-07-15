package myHashSet;

public class MyHashMap {
    private Entry[] table;
    private int capacity = 16;

    private static class Entry {
        Object key;
        Object value;
        Entry next;

        public Entry(Object key, Object value, Entry next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    public MyHashMap() {
        this.table = new Entry[capacity];
    }

    public void put(Object newKey, Object data) {
        if (newKey == null)
            return;

        int hash = hash(newKey);
        Entry newEntry = new Entry(newKey, data, null);

        if (table[hash] == null) {
            table[hash] = newEntry;
        } else {
            Entry previous = null;
            Entry current = table[hash];

            while (current != null) {
                if (current.key.equals(newKey)) {
                    if (previous == null) {
                        newEntry.next = current.next;
                        table[hash] = newEntry;
                        return;
                    } else {
                        newEntry.next = current.next;
                        previous.next = newEntry;
                        return;
                    }
                }
                previous = current;
                current = current.next;
            }
            previous.next = newEntry;
        }
    }

    public Object get(Object key) {
        int hash = hash(key);
        if (table[hash] == null) {
            return null;
        } else {
            Entry temp = table[hash];
            while (temp != null) {
                if (temp.key.equals(key))
                    return temp.value;
                temp = temp.next;
            }
            return null;
        }
    }

    public boolean remove(Object deleteKey) {

        int hash = hash(deleteKey);

        if (table[hash] == null) {
            return false;
        } else {
            Entry previous = null;
            Entry current = table[hash];

            while (current != null) {
                if (current.key.equals(deleteKey)) {
                    if (previous == null) {
                        table[hash] = table[hash].next;
                        return true;
                    } else {
                        previous.next = current.next;
                        return true;
                    }
                }
                previous = current;
                current = current.next;
            }
            return false;
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
}
