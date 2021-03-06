package oop.ict.kosovo.growth.ushtrimi4_associations.game;

import oop.ict.kosovo.growth.ushtrimi3.Point;

public class AntiAircraftGun {
    private Bomber target;
    private Point pointLocation;
    private int damage;
    private final int MAX_DAMAGE = 200;

    public AntiAircraftGun(double positionX, double positionY, int damage) {
        this.pointLocation = new Point(positionX, positionY);
        this.damage = damage;
    }

    public void setTarget(Bomber target) {
        this.target = target;
    }

    public void attack() {
        if (target != null) {
            double dmg = Math.random()*100;// 0..99
            dmg += target.getDamage();
            target.setDamage((int)dmg);
        }
    }


    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        if (damage > MAX_DAMAGE) {
            damage = MAX_DAMAGE;
            //kur ti mesojm gabimet eshte dasht me gjujt naj gbaim naj excception
        } else
            this.damage = damage;
    }
}
