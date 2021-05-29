package oop.ict.kosovo.growth.ushtrimi14_io;

import java.io.*;
import java.nio.charset.Charset;

public class BasicCharacterRW {
    public static void main(String[] args) {
        Charset utf8 = Charset.forName("UTF-8");
        try (
                Reader in = new FileReader(
                        "src/oop/ict/kosovo/growth/ushtrimi14_io/files/input.txt", utf8);
                Writer out = new FileWriter(
                        "src/oop/ict/kosovo/growth/ushtrimi14_io/files/output_1.txt",utf8)
        ) {
            char[] buffer = new char[1024];
            int length = 0;
            while ((length = in.read(buffer)) != -1) {
                out.write(buffer, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
