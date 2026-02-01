// File: L03_FileHandlingMoreExamples.java
// This program demonstrates advanced beginner-level file handling in Java

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class L03_FileHandlingMoreExamples {

    public static void main(String[] args) {

        File file = new File("sample.txt");

        // ===================== Check File Exists =====================
        if (file.exists()) {
            System.out.println("File already exists.");
        } else {
            System.out.println("File does not exist. Creating file...");
        }

        // ===================== Create & Append Data =====================
        try {
            // true = append mode
            FileWriter writer = new FileWriter(file, true);

            writer.write("Java File Handling Learning\n");
            writer.write("This is a new line added.\n");

            writer.close();
            System.out.println("Data written successfully.");
        }
        catch (IOException e) {
            System.out.println("Error while writing file.");
        }

        // ===================== Read Line by Line =====================
        int lineCount = 0;

        try {
            FileReader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader);

            String line;
            System.out.println("\nReading file content:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
                lineCount++; // counting lines
            }

            br.close();
            reader.close();
        }
        catch (IOException e) {
            System.out.println("Error while reading file.");
        }

        // ===================== Line Count =====================
        System.out.println("\nTotal number of lines: " + lineCount);
    }
}
