package project.ict.kosovo.growth.model.enums;

public enum Category {
    PIJE_TE_GAZUARA(1,"Pije te gazyara"),
    PIJE_TE_PAGAZUARA(2,"Pije te pagazuara"),
    EMBELSIRA(3,"Embelsira te ndryshme!!!"),
    SANITARI(4, "Produkte sanitarike!"),
    PAISJE_TEKNOLOGJIKE(5,"Paisje teknologjike"),
    PEME(6,"Peme"),
    PERIME(7,"Perime"),
    USHQIMORE_TE_NDRYSHME(8,"Ushqimore te ndryshme");

    private int id;
    private String name;

    private Category(int id, String name) {
        this.id=id;
        this.name=name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
