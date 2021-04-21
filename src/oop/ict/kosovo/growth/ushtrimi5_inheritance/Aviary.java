package oop.ict.kosovo.growth.ushtrimi5_inheritance;

//kafaz / kopshtin e zogjeve
public class Aviary {
    private Bird[] birds;

    public Aviary() {
        birds = new Bird[4];
        birds[0] = new Parrot();
        birds[1] = new Goose();
        birds[2] = new WalkingBird();
        birds[3] = new Bird();

        System.out.println(birds[0].toString());
        System.out.println(birds[1].toString());
        System.out.println(birds[2].toString());
        System.out.println(birds[3].toString());
    }
}
