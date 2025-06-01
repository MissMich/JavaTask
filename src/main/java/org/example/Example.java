package org.example;

import java.io.*;


public class Example {
    public void reader(String inputFile, String outputFile ) {
        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line); // Optional for test; could be removed
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            writer.write("Hello Emmanuel");
            writer.newLine();
            writer.write("Welcome to Java I/O");
        } catch (IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }

}

