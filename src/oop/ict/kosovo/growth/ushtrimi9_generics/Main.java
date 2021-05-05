package oop.ict.kosovo.growth.ushtrimi9_generics;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();//Object[] elements = new Object[10]
        list.add(10); //0
        list.add("test");//1
        list.add(false);//2
        list.add(LocalDate.of(2021,5,5));//3

//
//        int i = (int)list.get(1);
//        System.out.println(i);

        ArrayList<String> emrat = new ArrayList<>();
        emrat.add("Detjon");
        emrat.add("Donarta");
     //   emrat.add(10); //error
        String emri1 = emrat.get(1);
        System.out.println(emri1);


        ArrayList<Integer> numrat = new ArrayList<>();
        ArrayList<Double> numratDouble = new ArrayList<>();
        numrat.add(20);
        numratDouble.add(20.6);
    }
}
