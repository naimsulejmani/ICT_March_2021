package project.ict.kosovo.growth.model.enums;

public enum Unit {
    KG(1,"Kilogram"),
    LITER(2,"Liter"),
    COPE(3,"Copë"),
    PAKO(4,"Paketë"),
    M2(5,"Meter ne katrore");

    private int id;
    private String name;

    private Unit(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
