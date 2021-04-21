package oop.ict.kosovo.growth.ushtrimi5_inheritance.upcasting;

import oop.ict.kosovo.growth.ushtrimi5_inheritance.BesnikClass;

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
        messi.play();//i thojne polimorfizem // dynamic binding
        Object t = new Thread();


//        Player p = new Player();
//        if(p instanceof  String) {
//
//        }


        //BesnikClass bc = (BesnikClass)henry;

        if(henry instanceof FutballPlayer) {
            FutballPlayer fp = (FutballPlayer)henry;
            fp.defend();
            fp.play();
            System.out.println("Eshte Football Player");
        }
//
//        if(messi instanceof Player) {
//            System.out.println("Eshte instance e player");
//        }

        if(messi instanceof Object) {
            System.out.println("OBject");
        }
        else
        if(messi instanceof  Player) {
            System.out.println("Player");
        }
        else if(messi instanceof  FutballPlayer) {
            System.out.println("Futball player");
        }




        //nuk vlene downcasting
        //FutballPlayer player = new Player();
    }
}
