package org.example;

//4. Implement a generic class Pair<K, V> to represent a key-value pair.
public class Pair<K,V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

//        Pair<String, Integer> newPair = new Pair<>("Mike" , 34);
//        System.out.println("key: " + newPair.getKey());
//        System.out.println("Value: " + newPair.getValue());
//
//        newPair.setValue(45);
//        newPair.setKey("Joe");
//
//        System.out.println("key: " + newPair.getKey());
//        System.out.println("Value: " + newPair.getValue());
