package oop.ict.kosovo.growth.ushtrimi7_loggingexceptions.logging;

import java.io.IOException;
import java.util.logging.Level;

public class TestLog {
    public static void main(String[] args) {
        try {
            Log log = new Log("general.log");
            log.logger.warning("Hello World!");
            log.logger.fine("Test");
            severeLog();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void severeLog() {
        try {
            Log log = new Log("severe.log", "severe", Level.SEVERE);
            log.logger.severe("Gabim trashanik!!!");
            log.logger.info("TEST");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
