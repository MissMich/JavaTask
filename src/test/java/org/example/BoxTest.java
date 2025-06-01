package org.example;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
public class BoxTest {
    @Test
    public void testGetterAndSetter() {
        String item = "Hello Java";
        Box<String> stringBox = new Box<>();
        stringBox.setItem(item);
        assertEquals(item, stringBox.getItem());

        int intItem = 23;
        Box<Integer> intBox = new Box<>();
        intBox.setItem(intItem);
        assertEquals(intItem, intBox.getItem());
    }
  
}