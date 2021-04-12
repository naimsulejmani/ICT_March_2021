package oop.ict.kosovo.growth.ushtrimi2;

public class CounterTest {
    public static void main(String[] args) {
        Counter x = new Counter();
        Counter y = new Counter();
        System.out.println(x == y); // kur i krahasojme objetet rregull eshte me perdore metoden equals
        //compareTo

//        String a ="Naim";
//        String b = "Filan";
//        a.equals(b);
        x.increment(); //1
        y = x; //1
//adresen e njejte ne memorie, i kan vlerat e njejta, edhe implementimi i equal eshte injejte
        System.out.println(x == y);
        System.out.println(x.equals(y));
        //kur kemi assignment operator tek tipet refercen
        //i bjen qe kemi marr adresen (kopju adresen memorike)


        y.increment(); //1+1
        System.out.println(x.getValue()); //cka shtypet ketu


        System.out.println("FUND");


        Counter numroStudentet = new Counter(); //value=0
        numroStudentet.increment();
        numroStudentet.increment();
        numroStudentet.increment();
        numroStudentet.increment();

        Counter ditaRamazanit = new Counter();
        ditaRamazanit.increment(); //

        Counter golaReal = new Counter();
        Counter golaBarceloan = new Counter();


        golaReal.increment();
        golaReal.increment();
        golaBarceloan.increment();
        golaBarceloan.decrement();

        System.out.printf("Real %d : Barcelona %d %n", golaReal.getValue(), golaBarceloan.getValue());

        System.out.println("Total studente: " + numroStudentet.getValue());
    }
}
