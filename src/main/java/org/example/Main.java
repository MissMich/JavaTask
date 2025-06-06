package org.example;

import java.io.File;
import java.net.URL;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Example example = new Example();

        // Get the resource file
        ClassLoader classLoader = Main.class.getClassLoader();
        URL resourceUrl = classLoader.getResource("example.txt");

        if (resourceUrl == null) {
            System.out.println("File not found in resources!");
            return;
        }

        File inputFile = new File(resourceUrl.getFile());
        String outputPath = "output.txt";

        example.reader(inputFile.getAbsolutePath(), outputPath);
    }

//    public static void gradeRange() {
//        Scanner scanner = new Scanner(System.in);
//        String input;
//
//        System.out.println("Enter Score");
//
//        while (true) {
//            System.out.println("Enter score: ");
//            input = scanner.nextLine();
//
//            if (input.equals("/q")) {
//                System.out.println("Closing program");
//                scanner.close();
//                return;
//            }
//
//            try {
//                int score = Integer.parseInt(input);
//                if (score > 100) {
//                    System.out.println("Score must be less than or equal to 100");
//                } else if (score >= 80) {
//                    System.out.println("Grade: A");
//                } else if (score >= 70) {
//                    System.out.println("Grade: B");
//                } else if (score >= 60) {
//                    System.out.println("Grade: C");
//                } else if (score >= 50) {
//                    System.out.println("Grade: D");
//                } else if (score >= 40) {
//                    System.out.println("Grade: E");
//                } else if (score >= 0) {
//                    System.out.println("Grade: F");
//                }
//            } catch (NumberFormatException e) {
//                System.out.println("Invalid input, enter a number");
//            }
//
//        }
//    }

//2. Write a generic method contains(T[] array, T item) to check if the array contains a given item.
    public static <T> boolean contains(T[] array, T item) {
        for(T element: array) {
            if (element.equals(item)) {
                return true;
            }
        }
        return false;
    }


//    5. Write a method that swaps two elements in a generic array.
    public static <T> void swap(T[] array, int i, int j) {
        if (array == null || i < 0 || j < 0 || i >= array.length || j >= array.length) {
            throw new IllegalArgumentException("Invalid index or null array");
        }

        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }


//    7. Implement a method copyList(List<? super T> dest, List<? extends T> src) to copy elements generically.
    public static <T> void copyList(List<? super T> dest, List<? extends T> src) {
        for (T item: src) {
            dest.add(item);
        }
    }


//    8. Write a generic method to find the maximum element in an array using Comparable<T>.
    public static <T extends Comparable<T>> T findMaximum(T[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException();
        }
        T max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }
}
