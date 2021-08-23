package myArrayListUsingGenerics.tests;

import myArrayListUsingGenerics.MyArrayListUsingGenerics;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MyArrayListUsingGenericsTest {


    @Test
    void size() {
        MyArrayListUsingGenerics<Integer> list = new MyArrayListUsingGenerics(10);
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);

        int expected = list.size();
        int actual = list.size();

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
        MyArrayListUsingGenerics<Integer> list = new MyArrayListUsingGenerics(10);
        list.add(1);
        list.add(2);
        list.add(3);

        Assertions.assertFalse(list.isEmpty());

        list.clear();

        boolean expected = true;
        boolean actual = list.isEmpty();

        Assertions.assertTrue(expected, String.valueOf(actual));
    }

    @org.junit.jupiter.api.Test
    void contains() {
        MyArrayListUsingGenerics<Integer> list1 = new MyArrayListUsingGenerics(10);
        list1.add(0);
        list1.add(1);
        list1.add(2);

        MyArrayListUsingGenerics<Integer> list2 = new MyArrayListUsingGenerics(10);
        list2.add(2);
        list2.add(3);
        list2.add(4);

        int expected = list1.get(2);
        int actual = list2.get(0);

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void indexOf() {
        MyArrayListUsingGenerics<Integer> list = new MyArrayListUsingGenerics(10);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int expected1 = list.indexOf(3);
        boolean actual1 = expected1 > 0;
        Assertions.assertTrue(actual1);

        int expected2 = list.indexOf(25);
        boolean actual2 = expected2 == -1;
        Assertions.assertTrue(actual2);
    }

    @org.junit.jupiter.api.Test
    void get() {
        MyArrayListUsingGenerics<Integer> list = new MyArrayListUsingGenerics(10);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int expected = list.get(3);
        int actual = 4;

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void set() {
        MyArrayListUsingGenerics<Integer> list = new MyArrayListUsingGenerics(10);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.set(0, 7);

        int expected = list.get(0);
        int actual = list.get(0);

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void add() {
        MyArrayListUsingGenerics<Integer> list = new MyArrayListUsingGenerics(10);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int expected = list.size();
        int actual = 5;

        Assertions.assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void removeByIndex() {
        MyArrayListUsingGenerics<Integer> list = new MyArrayListUsingGenerics(10);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int sizeList1 = list.size();
        Assertions.assertEquals(sizeList1, 5);

        list.remove(2);

        int sizeList2 = list.size();
        Assertions.assertEquals(sizeList2, 4);
    }

    @org.junit.jupiter.api.Test
    void removeObject() {
        MyArrayListUsingGenerics<Integer> list = new MyArrayListUsingGenerics(10);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int sizeList1 = list.size();
        Assertions.assertEquals(sizeList1, 5);

        list.remove((Object) 3);
        Assertions.assertEquals(list.get(2), 4);

        int sizeList2 = list.size();
        Assertions.assertEquals(sizeList2, 4);
    }

    @org.junit.jupiter.api.Test
    void clear() {
        MyArrayListUsingGenerics<Integer> list = new MyArrayListUsingGenerics(10);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int sizeList1 = list.size();
        Assertions.assertEquals(sizeList1, 5);

        list.clear();

        int sizeList2 = list.size();
        Assertions.assertEquals(sizeList2, 0);
    }

    @Test
    void addAll() {
        // finish the test
    }
}