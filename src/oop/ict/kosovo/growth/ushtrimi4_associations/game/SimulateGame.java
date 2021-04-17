package oop.ict.kosovo.growth.ushtrimi4_associations.game;

public class SimulateGame {
    public static void main(String[] args) {
        Bomber b52 = new Bomber(3, 4, 0);
        Bomber b51 = new Bomber(7, 6, 10);

        AntiAircraftGun s400 = new AntiAircraftGun(2, 2, 0);

        //distanca eshte e afert ma  vogel <2.5

        s400.setTarget(b52);

        b52.setTarget(s400);
        b51.setTarget(s400);

        s400.attack();
        b52.attack();

        System.out.println("S400 damage = "+s400.getDamage());
        System.out.println("B52 damage = "+b52.getDamage());
        System.out.println("B51 damage = "+b51.getDamage());

        b51.attack();

        System.out.println("S400 damage = "+s400.getDamage());
        System.out.println("B52 damage = "+b52.getDamage());
        System.out.println("B51 damage = "+b51.getDamage());

    }
}
