package myHashSet.testMyHashMap;

import myHashSet.MyHashMap;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyHashMapTest {

    @Test
    void isEmpty() {
        MyHashMap map = new MyHashMap();
        Assertions.assertTrue(map.isEmpty());
    }

    @Test
    void size() {
        MyHashMap map = new MyHashMap();
        map.put(1, "1");
        map.put(2, "2");
        map.put(3, "3");

        int expected = 3;
        int actual = map.size();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void containsKey() {
        MyHashMap map = new MyHashMap();
        map.put(1, "1");
        Assertions.assertTrue(map.containsKey(1) && map.get(1) != null);
    }

    @Test
    void containsValue() {
        MyHashMap map = new MyHashMap();
        map.put(1, "1");
        Assertions.assertTrue(map.containsValue("1"));
    }

    @Test
    void get() {
        MyHashMap map = new MyHashMap();
        map.put(1, "1");
        map.put(2, "2");
        map.put(3, "3");

        Object expected = map.get(2);
        Object actual = "2";
        Assertions.assertSame(expected, actual);

    }

    @Test
    void put() {
        MyHashMap map = new MyHashMap();
        map.put(1, "1");
        map.put(2, "2");
        map.put(3, "3");
        map.put(4, "4");

        int expected = 4;
        int actual = map.size();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void remove() {
        MyHashMap map = new MyHashMap();
        map.put(1, "1");
        map.put(2, "2");
        map.put(3, "3");
        map.put(4, "4");

        int expected1 = 4;
        int actual1 = map.size();
        Assertions.assertEquals(expected1, actual1);

        Assertions.assertTrue(map.remove(3));

        int expected2 = 3;
        int actual2 = map.size();
        Assertions.assertEquals(expected2, actual2);
    }

    @Test
    void contains() {
        MyHashMap map = new MyHashMap();
        map.put(1, "1");
        map.put(2, "2");
        map.put(3, "3");
        map.put(4, "4");

        boolean expected = true;
        boolean actual = map.contains(2);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void clear() {
        MyHashMap map = new MyHashMap();
        map.put(1, "1");
        map.put(2, "2");
        map.put(3, "3");
        map.put(4, "4");

        map.clear();

        boolean expected = true;
        boolean actual = map.isEmpty();
        Assertions.assertTrue(expected, String.valueOf(actual));
    }
}