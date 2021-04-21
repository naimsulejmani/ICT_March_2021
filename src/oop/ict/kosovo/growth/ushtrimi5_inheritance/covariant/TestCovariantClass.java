package oop.ict.kosovo.growth.ushtrimi5_inheritance.covariant;

public class TestCovariantClass {
    public static void main(String[] args) {
        Player p1 = new Player();
        p1.name = "Eorde";

        TennisPlayer p2 = new TennisPlayer();
        p2.name = "anita";

        System.out.println(p1.getPlayer().name);

        System.out.println(p2.getPlayer().name + " " + p2.getPlayer().surname);

    }
}
