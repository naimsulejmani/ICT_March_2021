package oop.ict.kosovo.growth.ushtrimi10_nestedclass.staticNestedClass;

public class Outer {

    private int id = 1;
    private static int outerId = 10;

    public static class InnerClass {
        private int id = 2;
        private static int innerId = 20;

        public int getOuterId() {
//            Outer outer = new Outer();
//            return outer.id;
            return outerId;
        }
    }


}
