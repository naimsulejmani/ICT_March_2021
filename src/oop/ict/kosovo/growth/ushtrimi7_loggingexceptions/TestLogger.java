package oop.ict.kosovo.growth.ushtrimi7_loggingexceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

public class TestLogger {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(TestLogger.class.getName());
        logger.setLevel(Level.WARNING);

        logger.log(Level.INFO,"INFO nuk shtypet!");
        logger.log(Level.WARNING,"Warning shtypet!");
        logger.log(Level.SEVERE,"WOW MERR MASA!!!!");

        logger.info("Info nuk shtypet");
        logger.warning("warning shtypet");
        logger.severe("ska problem me te madh se ky");
    }
}
