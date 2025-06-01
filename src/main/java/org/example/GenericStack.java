package org.example;

import java.util.ArrayList;
import java.util.EmptyStackException;

//6. Create a generic stack class GenericStack<T> with push, pop, and peek methods.
public class GenericStack<T> {
    private ArrayList<T> stack;

    public GenericStack() {
        stack = new ArrayList<>();
    }

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeLast();
    }

    public T peek() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.getLast();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }
}

//GenericStack<String> stackList = new GenericStack<>();
//        stackList.push("Books");
//        stackList.push("pencils");
//        stackList.push("Eraser");
//        System.out.println(stackList.peek());
//        System.out.println(stackList.pop());
//        System.out.println(stackList.peek());
