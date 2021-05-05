package oop.ict.kosovo.growth.ushtrimi9_generics.doublepair;

public class TestPair {
    public static void main(String[] args) {
        Pair<Integer, String> person = new Pair<>(1, "Naim");
        Pair<String, Double> personSalary = new Pair<>("Naim", 100.50);
        Pair<Integer, Integer> pairOfInts = new Pair<>(10, 20);

        System.out.println(person.getFirst());
        System.out.println(person.getSecond());
    }
}
