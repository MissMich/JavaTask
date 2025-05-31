package org.example;

import java.io.*;


public class Example {
    public void reader() {
//        try {
//            FileReader read = new FileReader("example.txt");
//            BufferedReader br = new BufferedReader(read);
//
//            String line;
//            while ((line = br.readLine()) != null) {
//                System.out.println(line);
//            }
//            br.close();
//        } catch (IOException e) {
//            System.out.println("Error reading file" + e.getMessage());
//        }
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Hello Emmanuel");
            writer.newLine();
            writer.write("Welcome to jave I/O");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error writing file" + e.getMessage());
        }
    }

}

