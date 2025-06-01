package org.example;

import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

public class GenericStackTest {

    @Test
    public void testPushAndPeek() {
        GenericStack<String> stack = new GenericStack<>();
        stack.push("Java");
        assertEquals("Java", stack.peek());
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testPushAndPop() {
        GenericStack<Integer> stack = new GenericStack<>();
        stack.push(10);
        stack.push(20);
        assertEquals(20, stack.pop());
        assertEquals(10, stack.pop());
    }

    @Test
    public void PeekWithoutPop() {
        GenericStack<String> stack = new GenericStack<>();
        stack.push("Hello");
        stack.push("World");
        assertEquals("World", stack.peek());
        assertEquals(2, stack.size());
    }

    @Test
    public void testEmptyStackPeekThrows() {
        GenericStack<Double> stack = new GenericStack<>();
        assertThrows(EmptyStackException.class, stack::peek);
    }

    @Test
    public void testEmptyStackPopThrows() {
        GenericStack<Double> stack = new GenericStack<>();
        assertThrows(EmptyStackException.class, stack::pop);
    }

    @Test
    public void testStackSize() {
        GenericStack<Character> stack = new GenericStack<>();
        assertEquals(0, stack.size());
        stack.push('A');
        stack.push('B');
        assertEquals(2, stack.size());
        stack.pop();
        assertEquals(1, stack.size());
    }

}