package labs.ict.kosovo.growth.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public final class Food extends Product {
    public Food(int id, String name, String description, BigDecimal price, LocalDate bestBefore, Rating rating) {
        super(id, name, description, price, bestBefore, rating);
    }

    public Food(int id, String name, BigDecimal price) {
        super(id, name, price);
    }

    @Override
    public BigDecimal getDiscount() {
        return getBestBefore().isEqual(LocalDate.now()) ? getPrice() : BigDecimal.ZERO;
    }



}
