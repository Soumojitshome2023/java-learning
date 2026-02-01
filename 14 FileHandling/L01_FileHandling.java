// File: L01_FileHandling.java
// This program demonstrates basic file handling in Java
// It shows how to WRITE data into a file and READ data from a file

// Import classes required for file handling
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class L01_FileHandling {

    public static void main(String[] args) {

        // ===================== Writing to a File =====================
        // FileWriter is used to write text data into a file

        try {
            // Creates a file named "example.txt"
            // If file does not exist, it will be created
            // If file exists, old data will be overwritten
            FileWriter writer = new FileWriter("example.txt");

            // Writing text into the file
            writer.write("Hello Java File Handling");
            writer.write("\nThis is a simple file example.");

            // Closing the file is VERY important
            // It saves the data properly and releases resources
            writer.close();

            System.out.println("Data written to file successfully.");
        }
        catch (IOException e) {
            // Handles any input/output error
            System.out.println("Error while writing to file.");
        }

        // ===================== Reading from a File =====================
        // FileReader is used to read text data from a file

        try {
            // Opens the file "example.txt" for reading
            FileReader reader = new FileReader("example.txt");

            int ch; // stores character ASCII value
            System.out.println("\nReading data from file:");

            // read() reads one character at a time
            // It returns -1 when end of file is reached
            while ((ch = reader.read()) != -1) {
                // Type casting int to char to display character
                System.out.print((char) ch);
            }

            // Closing the file after reading
            reader.close();
        }
        catch (IOException e) {
            // Handles error if file is not found or cannot be read
            System.out.println("Error while reading file.");
        }
    }
}
