package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ExampleTest {

    @TempDir
    Path tempDir;

    @Test
    public void testReaderAndWriter() throws IOException {
        // Setup input file with content
        Path inputFile = tempDir.resolve("input.txt");
        Files.write(inputFile, List.of("Line 1", "Line 2", "Line 3"));

        // Output file path
        Path outputFile = tempDir.resolve("output.txt");

        // Execute reader and writer
        Example example = new Example();
        example.reader(inputFile.toString(), outputFile.toString());

        // Verify output file content
        List<String> outputLines = Files.readAllLines(outputFile);
        assertEquals(2, outputLines.size());
        assertEquals("Hello Emmanuel", outputLines.get(0));
        assertEquals("Welcome to Java I/O", outputLines.get(1));
    }
}
