package oop.ict.kosovo.growth.ushtrimi10_nestedclass.localInnerClass;

public class Outer {
    public void metodaX() {
       final String methodName = "Naim";
        class InnerClass {
            private int id;
            private String name;

            public InnerClass(int id) {
                this.id = id;
                this.name = methodName;
            }
        }

        InnerClass innerClass = new InnerClass(1);
        System.out.println(innerClass.id);
        System.out.println(innerClass.name);
    }
}
