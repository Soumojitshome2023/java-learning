// File: L02_FileHandlingAppendReadLine.java
// This program demonstrates:
// 1. Appending data to a file
// 2. Reading data line by line from a file

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class L02_FileHandlingAppendReadLine {

    public static void main(String[] args) {

        // ===================== Appending to a File =====================
        try {
            // true = append mode (old data will NOT be deleted)
            FileWriter writer = new FileWriter("example.txt", true);

            writer.write("\nThis line is appended to the file.");
            writer.write("\nLearning Java File Handling.");

            writer.close();

            System.out.println("Data appended successfully.");
        } catch (IOException e) {
            System.out.println("Error while appending data.");
        }

        // ===================== Reading File Line by Line =====================
        try {
            FileReader reader = new FileReader("example.txt");
            BufferedReader br = new BufferedReader(reader);

            String line;
            System.out.println("\nReading file line by line:");

            // readLine() reads one full line at a time
            // returns null when end of file is reached
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            reader.close();
        } catch (IOException e) {
            System.out.println("Error while reading file.");
        }
    }
}
