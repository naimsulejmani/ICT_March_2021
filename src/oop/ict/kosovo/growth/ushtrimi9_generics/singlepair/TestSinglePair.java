package oop.ict.kosovo.growth.ushtrimi9_generics.singlepair;

public class TestSinglePair {
    public static void main(String[] args) {
        PairInt pairInt = new PairInt(10, 20);
        PairDouble pairDouble = new PairDouble(20.5, 30.5);
        // generalizimin PairObject -> private Object first; private Obejct second;

        Pair<Integer> ints = new Pair<>(20, 203);
        System.out.println(ints.getFirst());
        Pair<Double> doubles = new Pair<>(20.5, 30.5);
        double d1 = doubles.getSecond();
        System.out.println(d1);
        Pair<String> names = new Pair<>("Anita", "Ardin");
        String name = names.getFirst();
        System.out.println(name);


    }
}
