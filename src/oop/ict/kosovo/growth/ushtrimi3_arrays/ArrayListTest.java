package oop.ict.kosovo.growth.ushtrimi3_arrays;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList lista = new ArrayList();
        lista.add("Enis Bajrami");
        lista.add("Ibadete Gashi");
        lista.add(10);
        lista.add(false);
        lista.add(100l);
        lista.add(200f);

        System.out.println(lista.get(0));
        System.out.println(lista.get(3));
        System.out.println(lista.get(5));

        int vlera2 = (int) lista.get(2);

        System.out.println("Madhesia e listes: " + lista.size());


        ArrayList<String> names = new ArrayList<>();
        names.add("Naim Sulejmani");
        names.add("Sabrije Hulaj");
        names.add(0, "Besnik Mazreku");

        for (String name : names) {
            System.out.println(name);
        }

        ArrayList<Double> pagat = new ArrayList<>();
        pagat.add(300.50d);
        pagat.add(200d);

        ArrayList<Integer> numrat = new ArrayList<>();
        numrat.add(100);
        numrat.clear();

        //numrat.contains(100);
        //numrat.remove
    }
}
