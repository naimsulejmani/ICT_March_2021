package oop.ict.kosovo.growth.ushtrimi16_annotations;

@ClassPreamble(author = "", date = "", reviewers = {})
public class Puntori extends Object{
    private String name;

    @Deprecated
    public void test() {
        System.out.println("This method is deprecated!");
    }

    @Override
    public String toString() {
        return "test";
    }


    public void test( int[] array) {

    }

    public static void main(String[] args) {
        Puntori puntori = new Puntori();
        puntori.test();

    }
}
