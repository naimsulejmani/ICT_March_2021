package oop.ict.kosovo.growth.ushtrimi4_associations.game;

import oop.ict.kosovo.growth.ushtrimi3.Point;

/*

1 bombardues vs 1 mbrojte anti bombardues
 */
public class Bomber {
    private AntiAircraftGun target;
    private Point pointLocation;
    private int damage = 0;
    private final int MAX_DAMAGE = 100;

    public Bomber(double positionX, double positionY, int damage) {
        pointLocation = new Point(positionX, positionY);
        this.damage = damage;
    }

    public void setTarget(AntiAircraftGun target) {
        this.target = target;
    }

    public void attack() {
        if (target != null) {
            double dmg = Math.random() * 100;// 0..99
            dmg += target.getDamage();
            target.setDamage((int) dmg);
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
