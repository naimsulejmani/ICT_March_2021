package oop.ict.kosovo.growth.ushtrimi2;

public class Dog {
    //instance variable (kjo eshte ajo per te cilen rezervohet memoria)
    private String name;
    private float weight;
    private String favouriteToy;

    public Dog(String name, float weight, String favouriteToy) {
        this.name = name;
        this.weight = weight;
        this.favouriteToy = favouriteToy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getFavouriteToy() {
        return favouriteToy;
    }

    public void setFavouriteToy(String favouriteToy) {
        this.favouriteToy = favouriteToy;
    }

    public void fetch(String toy) {
        System.out.println("vrapo vrapo vrapo e kapa lodren: " + toy);
    }

    public int compare(Dog anotherDog) {
        return 0;
    }
}
