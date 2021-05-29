package oop.ict.kosovo.growth.ushtrimi14_io;

import java.io.*;

public class BasicBinaryDataRW {
    public static void main(String[] args) {
        try (
                InputStream in = new FileInputStream("src/oop/ict/kosovo/growth/ushtrimi14_io/files/input.pdf");
                OutputStream out = new FileOutputStream("src/oop/ict/kosovo/growth/ushtrimi14_io/files/output.pdf")
        ) {
            byte[] buffer = new byte[1024];
            int length = 0;

            while ((length = in.read(buffer)) != -1) {
                out.write(buffer, 0, length);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
