package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PairTest {

    @Test
    public void testKeyValuePair() {
        Pair<String, Integer> pair = new Pair<>("Mike", 23);
        assertEquals("Mike", pair.getKey());
        assertEquals(23, pair.getValue());
    }

    @Test
    public void testSetKey() {
        Pair<String, Integer> pair = new Pair<>("Subject", 10);
        pair.setKey("Names");
        assertEquals("Names", pair.getKey());
    }

    @Test
    public void testSetValue() {
        Pair<String, String> pair = new Pair<>("Jack", "Jill");
        pair.setValue("Joey");
        assertEquals("Joey", pair.getValue());
    }

    @Test
    public void testNullKeyAndValue() {
        Pair<String, String> pair = new Pair<>(null, null);
        assertNull(pair.getKey());
        assertNull(pair.getValue());
    }

    @Test
    public void testDifferentTypes() {
        Pair<Integer, Boolean> pair = new Pair<>(23, true);
        assertEquals(23, pair.getKey());
        assertTrue(pair.getValue());
    }
}