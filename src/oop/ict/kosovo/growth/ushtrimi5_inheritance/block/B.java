package oop.ict.kosovo.growth.ushtrimi5_inheritance.block;

public class B {

    public B() {
        System.out.println("CONSTRUCTOR");
    }

    {
        System.out.println("INSTANCE INITIALIZER BLOCK");
    }
    {
        System.out.println("TEST");
    }


    public static void main(String[] args) {
        B b = new B();
    }
}
