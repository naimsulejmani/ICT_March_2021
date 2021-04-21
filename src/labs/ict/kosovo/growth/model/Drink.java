package labs.ict.kosovo.growth.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;

public final class Drink extends Product {
    public Drink(int id, String name, String description, BigDecimal price, LocalDate bestBefore, Rating rating) {
        super(id, name, description, price, bestBefore, rating);
    }

    public Drink(int id, String name, BigDecimal price) {
        super(id, name, price);
    }

    //happy hour
    @Override
    public BigDecimal getDiscount() {
        LocalTime now = LocalTime.now();

        return
                now.isAfter(LocalTime.of(21, 15)) &&
                        now.isBefore(LocalTime.of(22, 00)) ?
                            getPrice().divide(BigDecimal.valueOf(2)) : BigDecimal.ZERO;

    }
}
