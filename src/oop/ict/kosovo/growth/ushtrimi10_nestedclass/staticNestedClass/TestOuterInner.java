package oop.ict.kosovo.growth.ushtrimi10_nestedclass.staticNestedClass;

import oop.ict.kosovo.growth.ushtrimi10_nestedclass.staticNestedClass.Outer;

public class TestOuterInner {
    public static void main(String[] args) {
        Outer outer = new Outer();
        //outer.InnerClass

        Outer.InnerClass innerClass = new Outer.InnerClass();
    }
}
