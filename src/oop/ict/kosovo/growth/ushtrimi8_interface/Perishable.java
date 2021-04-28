package oop.ict.kosovo.growth.ushtrimi8_interface;

import java.time.Period;

public interface Perishable {
    //constante
    public static final Period MAX_PERIOD = Period.ofDays(5);
    //Period MAX_PERIOD = Period.ofDays(5);

    //metodat abstrakte
    void perish();

    boolean isPerished();

    //metoda default
    public default boolean verifyPeriod(Period p) {
        return comparePeriod(p) < 0;
    }

    //metoda private
    private int comparePeriod(Period p) {
        return p.getDays() - MAX_PERIOD.getDays();
    }

    //metoda statike
    public static int getMaxPeriodDays() {
        return MAX_PERIOD.getDays();
    }
}
