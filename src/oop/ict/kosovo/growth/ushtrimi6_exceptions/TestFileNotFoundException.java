package oop.ict.kosovo.growth.ushtrimi6_exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestFileNotFoundException {
    public static void main(String[] args) {
        //Scanner reader = new Scanner(System.in);
        int totalLines = countLines("C:\\Users\\keds13136\\IdeaProjects\\ICT_March_2021\\src\\oop\\ict\\kosovo\\growth\\ushtrimi6_exceptions\\Studentet.txt");
        System.out.println("Total lines: " + totalLines);
    }

    public static int countLines(String filename) {
        int counter = 0;

        Scanner reader = null;
        try {
            reader = new Scanner(new File(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line = "";
        while (reader.hasNextLine()) {
            line += reader.nextLine() + "\n";
            counter++;
        }
        System.out.println(line);
        return counter;
    }
}
