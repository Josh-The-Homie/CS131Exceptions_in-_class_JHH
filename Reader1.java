import java.io.*;
import java.util.Scanner;

public class Reader1 {
    public static void main(String[] args) throws java.io.FileNotFoundException {
        String filename = "test.dat";
        File file = new File(filename);
		Scanner inputFile = new Scanner(file);
		while (inputFile.hasNext()) {
		    System.out.println(inputFile.nextLine());
		}
		inputFile.close();
    }
}