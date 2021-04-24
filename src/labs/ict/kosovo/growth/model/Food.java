package labs.ict.kosovo.growth.model;

import labs.ict.kosovo.growth.exceptions.ExpiredDateException;
import labs.ict.kosovo.growth.exceptions.IllegalNegativeProductPriceException;

import java.math.BigDecimal;
import java.time.LocalDate;

public final class Food extends Product {
    public Food(int id, String name, String description, BigDecimal price, LocalDate bestBefore, Rating rating)
            throws IllegalNegativeProductPriceException, ExpiredDateException {
        super(id, name, description, price, bestBefore, rating);
    }

    public Food(int id, String name, BigDecimal price)
            throws IllegalNegativeProductPriceException, ExpiredDateException {
        super(id, name, price);
    }

    @Override
    public BigDecimal getDiscount() {
        return getBestBefore().isEqual(LocalDate.now()) ? getPrice() : BigDecimal.ZERO;
    }


}
