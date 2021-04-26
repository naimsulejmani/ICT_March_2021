package oop.ict.kosovo.growth.ushtrimi7_loggingexceptions.logging;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Log {
    public Logger logger; //blank constant
    FileHandler fileHandler;

    public Log(String fileName) throws IOException {
        File file = new File(fileName);
        if (!file.exists()) {
            file.createNewFile();
        }
        fileHandler = new FileHandler(fileName, true);
        logger = Logger.getLogger(Log.class.getName());
        logger.addHandler(fileHandler);

        SimpleFormatter formatter = new SimpleFormatter();
        fileHandler.setFormatter(formatter);
    }

    public Log(String fileName, String loggerName) throws IOException {
        File file = new File(fileName);
        if (!file.exists()) {
            file.createNewFile();
        }
        fileHandler = new FileHandler(fileName, true);
        logger = Logger.getLogger(loggerName);
        logger.addHandler(fileHandler);

        SimpleFormatter formatter = new SimpleFormatter();
        fileHandler.setFormatter(formatter);
    }

    public Log(String fileName, String loggerName, Level minimumLevel) throws IOException {
        File file = new File(fileName);
        if (!file.exists()) {
            file.createNewFile();
        }
        fileHandler = new FileHandler(fileName, true);
        logger = Logger.getLogger(loggerName);
        logger.addHandler(fileHandler);
        logger.setLevel(minimumLevel);//caktimi i nivelit
        //se cfare lloji eshte minimum per me u ruajt ne log

        SimpleFormatter formatter = new SimpleFormatter();
        fileHandler.setFormatter(formatter);
    }





}
