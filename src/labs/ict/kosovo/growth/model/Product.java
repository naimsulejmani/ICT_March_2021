package labs.ict.kosovo.growth.model;

import labs.ict.kosovo.growth.exceptions.ExpiredDateException;
import labs.ict.kosovo.growth.exceptions.IllegalNegativeProductPriceException;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Product {
    private int id;
    private String name;
    private String description;
    private BigDecimal price; //priceNegativeExcption
    private LocalDate bestBefore; //afati i skadences
    private Rating rating;

    //konstruktor me te cilet mund te krijojme produkt


    public Product(int id, String name, String description, BigDecimal price, LocalDate bestBefore, Rating rating)
            throws IllegalNegativeProductPriceException, ExpiredDateException {
        this.id = id;
        this.name = name;
        this.description = description;
        setPrice(price);
        setBestBefore(bestBefore);
        //this.price = price;
        //this.bestBefore = bestBefore;
        this.rating = rating;
    }

    public Product(int id, String name, BigDecimal price) throws IllegalNegativeProductPriceException, ExpiredDateException {
        this(id, name, null, price, LocalDate.now().plusMonths(1), Rating.NOT_RATED);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //rregullen se qysh duhet me definu validimin
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) throws IllegalNegativeProductPriceException {
        if (price.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalNegativeProductPriceException("Cmimi negative nuk lejohet!", price.doubleValue());
        }
        this.price = price;
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }

    public void setBestBefore(LocalDate bestBefore) throws ExpiredDateException {
        if (bestBefore.isBefore(LocalDate.now())) {
            throw new ExpiredDateException("Ka skadu afati per kete produkt!");
            //System.out.println("i paska kalu afati ketij produkti");
            //exception throw new KaSkaduAfatiException();
            //return;//
        }
        this.bestBefore = bestBefore;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return String.format("Produkti: %d - %s %nCmimi: %.2f%nBest before: %s%nDescription: %s%nOverall rating: %s",
                id, name, price, bestBefore, description, rating
        );
    }

    public BigDecimal getDiscount() {
        return BigDecimal.ZERO;
    }
}
