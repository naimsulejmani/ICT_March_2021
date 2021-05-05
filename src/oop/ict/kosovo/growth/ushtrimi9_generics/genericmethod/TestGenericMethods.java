package oop.ict.kosovo.growth.ushtrimi9_generics.genericmethod;

public class TestGenericMethods {
    public static void main(String[] args) {
        int numriMesit = getMiddle(20, 30, 10, 50, 60);
        String emriMesit = getMiddle("Naim", "Messi", "Fistek");
        double middle = getMiddle(2.2, 3.3, 4d, 1d, 2d, 3d, 4d, 5d, 6.0);
        System.out.println(numriMesit);
        System.out.println(emriMesit);
        System.out.println(middle);

        int minimum = min(10, 6, 100, -5, 200, 30, 0, -4, 9);
        double minDouble = min(30d, 20d, 205d, 0.5d);
        System.out.println("Minimum: " + minimum);
        System.out.println("minDouble: " + minDouble);

        Katrori k1 = new Katrori(10);
        Katrori k2 = new Katrori(20);

        System.out.println(k1.compareTo(k2));
        System.out.println(k2.compareTo(k1));
        System.out.println(k1.compareTo(new Katrori(10)));


        Katrori katroriMeSyprineMinimale = min(
                new Katrori(10), new Katrori(20), new Katrori(4)
        );
        System.out.println(katroriMeSyprineMinimale.getA());
    }

    //varargs -> ku mundemi me definu nje numer te pacakatuar te parametrave si arguemnt
    public static <T> T getMiddle(T... args) {
        //varargs -> prapavije ketu funksionon si array
        return args[args.length / 2];
    }

    public static <T extends Comparable> T min(T... args) {
        if (args == null || args.length == 0) return null;
        T smallest = args[0];
        for (int i = 1; i < args.length; i++) {
            if (smallest.compareTo(args[i]) > 0)
                smallest = args[i];
        }
        return smallest;
    }
}
