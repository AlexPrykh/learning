package myHashSet;

import java.util.HashMap;

public class MyHashSet {
    private final MyHashMap map;
    private static final Object PRESENT = new Object();

    public MyHashSet() {
        this.map = new MyHashMap();
    }

    public void add(Object object) {
        map.put(object, PRESENT);
    }

    public boolean contains(Object object) {
        return map.contains(object);
    }

    public boolean remove(Object object) {
        return map.remove(object);
    }

    public boolean isEmpty() {
        return map.isEmpty();
    }

    public int size() {
        return map.size();
    }

    public void display() {
        map.displaySet();
    }
}
