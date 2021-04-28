package oop.ict.kosovo.growth.ushtrimi8_abstract;

public class TestAbstract {
    public static void main(String[] args) {
        //AbstractU1 u1 = new AbstractU1();

        Base b = new Derived();
        Derived d = new Derived();
        b.fun();
        d.fun();
    }
}
