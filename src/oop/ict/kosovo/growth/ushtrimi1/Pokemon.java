package oop.ict.kosovo.growth.ushtrimi1;

public class Pokemon {
    //attribute - fields - te dhenat qe e pershkruajne llojin e klases (e pershkruaj objektin)
    String name;
    String type;
    int health;


    //metoda - operation - action - veprmiet apo sjllejet me te cilat objekti mundet te sillet
    //metoda dogdge e ka per manovrim per me pa se a mundet me i largu sulmit te kundershtarit
    // edhe kjo eshte me rastesi
    boolean dodge() {
        //random eshte nje metode statike e klases Math e cila
        //gjeneron nje numer double prej 0.0 deri me te vogel 1
        return Math.random() > 0.5;
    }

    //temen
    void attack(Pokemon enemy) {
        if (!enemy.dodge()) {
            enemy.health--;
        }
    }
}
