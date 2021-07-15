package myHashSet;

import java.util.HashMap;

public class MyHashSet {
    private final MyHashMap map;

    public MyHashSet() {
        this.map = new MyHashMap();
    }

    public void add(Object object) {
        map.put(object, null);
    }

    public boolean contains(Object object) {
        return map.contains(object) != null;
    }

    public void display() {
        map.displaySet();
    }

    public boolean remove(Object object) {
        return map.remove(object);
    }
}
