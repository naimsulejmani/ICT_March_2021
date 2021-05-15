package oop.ict.kosovo.growth.ushtrimi10_nestedclass.memberInnerClass;

import java.util.List;

public class TestMemberInnerClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.addInners(1,"Naim");
        outer.addInners(2,"Nisa");

        var list = outer.inners;

       // Outer.Inner in = new outer.Inner(1,20);
        //Outer.Inner inner = new Outer().Inner()
        for(Outer.Inner inner: list) {
            System.out.printf("%d - %s%n",inner.getId(),inner.getName());
        }
    }
}
