package oop.ict.kosovo.growth.ushtrimi10_nestedclass.referencemethod;

public class TextFilter {
    public static boolean containsA(String s) {
        return s.contains("A");
    }

    public int sortText(String s1, String s2) {
        return s1.compareTo(s2);
    }

    public void print(String s) {
        System.out.println(s);
    }
}
