package oop.ict.kosovo.growth.ushtrimi5_inheritance.upcasting;

public class FutballPlayer extends Player{
    @Override
    public void play() {
        System.out.println("I play football!");
    }

    public void defend() {
        System.out.println("I can play as defende too!");
    }
}
