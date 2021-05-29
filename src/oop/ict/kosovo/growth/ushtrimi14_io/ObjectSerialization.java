package oop.ict.kosovo.growth.ushtrimi14_io;

import oop.ict.kosovo.growth.ushtrimi13_collections.Product;

import java.io.*;

public class ObjectSerialization {
    public static void main(String[] args) {
        Product p1 = new Product("Monte Choko");
        try (
                ObjectOutputStream out = new ObjectOutputStream(
                        new FileOutputStream("src/oop/ict/kosovo/growth/ushtrimi14_io/files/output_3.bin")
                )
        ) {
            out.writeObject(p1);
            p1 = null;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("src/oop/ict/kosovo/growth/ushtrimi14_io/files/output_3.bin")
        )) {
            p1 = (Product)in.readObject();
            System.out.println(p1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
