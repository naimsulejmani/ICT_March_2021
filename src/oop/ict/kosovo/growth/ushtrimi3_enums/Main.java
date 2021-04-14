package oop.ict.kosovo.growth.ushtrimi3_enums;

public class Main {
    public static void main(String[] args) {
        String name = "Sabrije";
        String surname = "Hulaj";
        Double borxhi = 1000.50;
        System.out.printf("I/E nderuar %s %s ju keni dhe %.2f EUR borxh te papaguar %n"
                , name, surname, borxhi);

        Rating gentritQorri = Rating.NO_STAR;
        Rating sabrijeHulaj = Rating.FIVE_STAR;
        Rating endritHoti = Rating.THREE_STAR;

        gentritQorri.print();
        sabrijeHulaj.print();
        endritHoti.print();

        System.out.println(endritHoti.getStars());

    }
}
