package oop.ict.kosovo.growth.ushtrimi5_inheritance;

public class B extends A {
    private String name;

    public B(int id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name + id;
    }

    public void setName(String name) {
        this.name = name;
    }


}
