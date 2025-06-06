package org.example;

//1. Create a generic class Box<T> with methods to set and get the item.
public class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

//Box<String> stringBox = new Box<>();
//        stringBox.setItem("My name is Michelle");
//        System.out.println(stringBox.getItem());
//
//Box<Integer> intBox = new Box<>();
//        intBox.setItem(29);
//        System.out.println("I'm " + intBox.getItem());
