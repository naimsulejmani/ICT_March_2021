package oop.ict.kosovo.growth.ushtrimi7_loggingexceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestBufferReaderAutoCloseable {
    public static void main(String[] args) {
        // = null;
        try (BufferedReader in = new BufferedReader(new FileReader("txt.txt"))) {
            String text = in.readLine();
            System.out.println(text);
            return;
        } catch (FileNotFoundException ex) {
            System.out.println("Fajlli nuk gjindet!!!");
            return;
        } catch (IOException ex) {
            System.out.println("Error reading file!!!");
            return;
        } catch (Exception ex) {
            Throwable[] gabimet = ex.getSuppressed();
            for (Throwable th : gabimet) {
                System.out.println(th.getMessage());
            }
        }
    }
}
