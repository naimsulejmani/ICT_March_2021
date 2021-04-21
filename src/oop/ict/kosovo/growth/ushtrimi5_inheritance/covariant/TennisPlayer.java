package oop.ict.kosovo.growth.ushtrimi5_inheritance.covariant;

public class TennisPlayer extends Player {
    public String surname;

    //java ka me kriju kete konstruktore
    public TennisPlayer() {
        this("Naim");
        surname = "test";
        super.name="FILAN";
        //super.toString();
    }

    public TennisPlayer(String surname) {
        super();
        this.surname = surname;
    }

    @Override
    public TennisPlayer getPlayer() {
        return this;
    }
}
