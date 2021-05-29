package oop.ict.kosovo.growth.ushtrimi14_io;

import java.io.*;
import java.nio.charset.Charset;

public class ConnectingStreams {
    public static void main(String[] args) {
        Charset utf8 = Charset.forName("UTF-8");
        try (
                BufferedReader in = new BufferedReader(new InputStreamReader(
                        new FileInputStream("src/oop/ict/kosovo/growth/ushtrimi14_io/files/input.txt")));
                PrintWriter out = new PrintWriter(new OutputStreamWriter(
                        new FileOutputStream("src/oop/ict/kosovo/growth/ushtrimi14_io/files/output_2.txt")))
        ) {
            String line = null;
            while ((line = in.readLine()) != null) {
                out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
