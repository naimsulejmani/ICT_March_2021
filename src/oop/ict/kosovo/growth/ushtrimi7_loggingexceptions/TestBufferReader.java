package oop.ict.kosovo.growth.ushtrimi7_loggingexceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestBufferReader {
    public static void main(String[] args) {
        BufferedReader in = null;
        try {
            in = new BufferedReader(
                new FileReader("C:\\Users\\keds13136\\IdeaProjects\\ICT_March_2021\\src\\oop\\ict\\kosovo\\growth\\ushtrimi7_loggingexceptions\\test.txt"));
            String text = in.readLine();
            System.out.println(text);
            return;
        } catch (FileNotFoundException ex) {
            System.out.println("Fajlli nuk gjindet!!!");
            return;
        } catch (IOException ex) {
            System.out.println("Error reading file!!!");
            return;
        } finally {
            System.out.println("Kjo do te thirret gjithqysh edhe pse kane return try dhe catch!!!");
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    System.out.println("Nuk po mundem me mbylle fajllin!!!");
                }
            }
        }
    }
}
