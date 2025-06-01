package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    @Test
    public void testContainsWithString() {
        String[] fruits = {"Apple", "Banana", "Mango"};
        assertTrue(Main.contains(fruits, "Apple"));
        assertFalse(Main.contains(fruits, "Carrot"));
    }

    @Test
    public void testContainsWithIntegers() {
        Integer[] numbers = {1,3,4,6,9};
        assertTrue(Main.contains(numbers, 3));
        assertFalse(Main.contains(numbers, 5));
    }

    @Test
    public void testSwapValidIndices() {
        String[] names = {"Jane", "Sandra", "Sam"};
        Main.swap(names, 0,2);
        assertArrayEquals(new String[]{"Sam", "Sandra", "Jane"}, names);
    }

    @Test
    void testSwapThrowsOnInvalidIndex() {
        String[] names = {"Joe", "Jane", "Sam"};
        assertThrows(IllegalArgumentException.class, () -> Main.swap(names, 0, 5));
    }

    @Test
    public void testCopyListGeneric() {
        List<Integer> source = List.of(1, 2,3);
        List<Number> dest = new ArrayList<>();
        Main.copyList(dest, source);
        assertEquals(List.of(1,2,3), dest);
    }

    @Test
    public void testFindMaximumWithIntegers() {
        Integer[] nums = {2,5,7,12};
        assertEquals(12, Main.findMaximum(nums));
    }

    @Test
    public void testFindMaxWithStings() {
        String[] strings = {"Ball", "Zoo", "Elephant", "Wall"};
        assertEquals("Zoo", Main.findMaximum(strings));
    }

    @Test
    public void testFindMaxThrowException() {
        Integer[] empty= {};
        assertThrows(IllegalArgumentException.class, () -> Main.findMaximum(empty));
    }
}