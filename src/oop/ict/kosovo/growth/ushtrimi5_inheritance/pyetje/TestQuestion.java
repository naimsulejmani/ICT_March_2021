package oop.ict.kosovo.growth.ushtrimi5_inheritance.pyetje;

public class TestQuestion {
    public static void main(String[] args) {
        Question besnikQuestion = new Question(1, "Pse duhet te behet overriding metoda toString()?");

        System.out.println(besnikQuestion.getQuestion());
        System.out.println(besnikQuestion);
        System.out.println(max(20,30));
        System.out.println(max("Abdurraman","Valtrinit"));

        double x  = Math.max(100,2l);
    }

    public static void main() {

    }

    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static String max(String x, String y) {
        return x.compareTo(y) > 0 ? x : y;
    }


}
