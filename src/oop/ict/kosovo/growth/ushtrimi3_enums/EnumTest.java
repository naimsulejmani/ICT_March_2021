package oop.ict.kosovo.growth.ushtrimi3_enums;

import java.util.EnumSet;
import java.util.Scanner;

public class EnumTest {
    public static void main(String[] args) {
        Season season = Season.SPRING;
        Season otherSeason = Season.WINTER;

        System.out.println(season);
        System.out.println(otherSeason);

        System.out.println(season.equals(otherSeason));

        System.out.println(season.compareTo(otherSeason));

        DayOfWeek dita1 = DayOfWeek.FRIDAY;
        DayOfWeek dita2 = DayOfWeek.MONDAY;
        System.out.println(dita1.compareTo(dita2));

        System.out.println(dita1.compareTo(DayOfWeek.valueOf("FRIDAY")));

        DayOfWeek[] ditetEJaves = DayOfWeek.values();

        for (DayOfWeek dite : ditetEJaves) {
            System.out.println(dite);
        }
        System.out.println("Perzgjedhja me indeks");
        DayOfWeek ditaEDyte = DayOfWeek.values()[1];
        System.out.println(ditaEDyte);

        explainDayOfWeekFeelings(ditaEDyte);

        drawSuitOnCard(0);
        drawSuitOnCard(1);
        drawSuitOnCard(2);
        drawSuitOnCard(3);
        drawSuitOnCard(Suit.HEARTS);
        drawSuitOnCard(Suit.DIAMONDS);
        //drawSuitOnCard(Suit.ZEMER);
        drawSuitOnCard(SuitOld.HEARTS);

//        Scanner reader = new Scanner(System.in);
//        System.out.println("Write a season name with capital letters: ");
//        String seasonName = reader.nextLine();
//        Season selectedSeason = Season.valueOf(seasonName.toUpperCase());
//        System.out.println(selectedSeason);

        Nota notaEnisit = Nota.SHUME_MIRE;
        System.out.println(notaEnisit);
        System.out.println(notaEnisit.getValue());


        for (Nota note : EnumSet.range(Nota.MJAFTUESHEM, Nota.SHUME_MIRE)) {
            System.out.println("          "+note+" -                     "+note.getValue());
        }


    }

    public static void explainDayOfWeekFeelings(DayOfWeek dita) {
        switch (dita) {
            case MONDAY:
                System.out.println("Mondays aer boring!!!");
                break;
            case TUESDAY:
                System.out.println("Boring++");
                break;
            case WEDNESDAY:
                System.out.println("CKA ME THAN");
                break;
            case THURSDAY:
                System.out.println("START FEELING BETTER");
                break;
            case FRIDAY:
                System.out.println("Fridays are better");
                break;
//            case SATURDAY:
//            case SUNDAY:
            case SATURDAY, SUNDAY:
                System.out.println("WEEKENDS ARE THE BEST!!!!");
                break;
            default:
                System.out.println("NUK JANE TE IMPLEMENTUARA PER TJERA DITE QE NUK JANE PARAPARE");
                break;
        }
    }

    public static void drawSuitOnCard(SuitOld suit) {
        if (suit == SuitOld.HEARTS) {
            //printo zemer
        }
    }

    public static void drawSuitOnCard(int suit) {
        if (suit == 0) {
            //printo nje zemer
        }
    }

    public static void drawSuitOnCard(Suit suit) {
        if (suit == Suit.HEARTS) {
            //printo nje numer me zemer
        } else if (suit.equals(Suit.SPADES)) {

        }
    }
}
