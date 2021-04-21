package oop.ict.kosovo.growth.ushtrimi5_inheritance.rocks;

public class TestRock {
    public static void main(String[] args) {
        Rock rock = new Rock("nocolor", 100.0);
        IgneousRock ir = new IgneousRock("orange", 200.50);
        Basalt b = new Basalt("black",1000);
    }
}
