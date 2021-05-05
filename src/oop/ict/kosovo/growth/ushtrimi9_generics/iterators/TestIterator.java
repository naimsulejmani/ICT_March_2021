package oop.ict.kosovo.growth.ushtrimi9_generics.iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Anita Hajdari");
        names.add("Besnik Mazreku");
        names.add("Detjon Qoqaj");
        names.add("Elfete Totaj");

        System.out.println("Iterator-i me WHILE");
        Iterator<String> nameIterator = names.iterator();
        while (nameIterator.hasNext()) {
            System.out.println(nameIterator.next());
        }
        System.out.println("Iteratori me FOR");
        for (Iterator<String> iter = names.iterator(); iter.hasNext(); ) {
            System.out.println(iter.next());
        }
    }
}
