package oop.ict.kosovo.growth.ushtrimi14_io;

import java.io.Console;

public class UsingConsonle {
    public static void main(String[] args) {
        Console console = System.console();
        if(console==null) {
            System.out.println("Console is not supported");
        }
    }
}
