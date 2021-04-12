package oop.ict.kosovo.growth.ushtrimi2;

public class CounterTest {
    public static void main(String[] args) {
        Counter x = new Counter();
        Counter y = new Counter();
        x.increment(); //1
        y=x; //1
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
