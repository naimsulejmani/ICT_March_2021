package basic.ict.kosovo.growth;

public class MethodsExample {
    public static void main(String[] args) {
        pershendetje("Besnik");
        pershendetje("Anita");
        MethodsExample.pershendetje("Taulant");
        MethodsExample me = new MethodsExample();
        //me.pershendetje("TEST");
        System.out.println(max(100, 200));

        pershendetje("Donarta","Kokollari");
    }

    static void pershendetje(String emri) //ketu vednsoen execption
    {
        System.out.printf("Pershendetje %s%n", emri);
    }

    static void pershendetje(String emri, String mbiemri) {
        System.out.printf("Pershendetje %s %s%n", emri, mbiemri);

        //System.out.println("Pershendetje " + emri + " " + mbiemri);
    }


    //metode e cila pranon dy parametra x dhe y te tipit int
    // dhe si rezultat duhet me na kthy nje numer te plote
    static int max(int x, int y) {
        if (x > y) return x;
        else
            return y;
    }


}
