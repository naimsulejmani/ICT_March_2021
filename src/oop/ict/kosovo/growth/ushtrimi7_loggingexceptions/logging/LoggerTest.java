package oop.ict.kosovo.growth.ushtrimi7_loggingexceptions.logging;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerTest {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(LoggerTest.class.getName());
        String fileName = "C:\\Users\\keds13136\\IdeaProjects\\ICT_March_2021\\src\\oop\\ict\\kosovo\\growth\\ushtrimi7_loggingexceptions\\logging\\log.txt";
        try {
            FileHandler fileHandler = new FileHandler(fileName,true);
            logger.addHandler(fileHandler);
            logger.log(Level.WARNING,"Po ju paralajmeroj ne kete gabim");
            logger.severe("Ktu ska paralajmerim!!!!");

        } catch (IOException e) {
            System.out.println("File nuk ekziston!!");
        }
    }
}
