package oop.ict.kosovo.growth.ushtrimi13_collections;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class U7 {
    public static void main(String[] args) {
        LinkedHashSet<String> list = new LinkedHashSet<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        //duplicate will be ignored
        list.add("A");


        System.out.println(list.size());

        List<String> stringList = new LinkedList<>(list);
        stringList.add("A");
        stringList.add("A");
        List<String> subList = stringList.subList(0,2);
        int lastIndex = stringList.lastIndexOf("A");
    }
}
