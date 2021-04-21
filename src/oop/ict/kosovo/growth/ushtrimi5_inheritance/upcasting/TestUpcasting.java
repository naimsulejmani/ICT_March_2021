package oop.ict.kosovo.growth.ushtrimi5_inheritance.upcasting;

public class TestUpcasting {
    public static void main(String[] args) {
        Object henry = new FutballPlayer();
        Object zidan = new Player();
        Player messi = new FutballPlayer();
        Player ronaldo = new Player();
        FutballPlayer besnikHasi = new FutballPlayer();
        besnikHasi.play();
        besnikHasi.defend();
        ronaldo.play();
        messi.play();//i thojne polimorfizem

        //nuk vlene downcasting
        //FutballPlayer player = new Player();
    }
}
