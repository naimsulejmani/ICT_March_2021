package labs.ict.kosovo.growth.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Product {
    private int id;
    private String name;
    private String description;
    private BigDecimal price;
    private LocalDate bestBefore; //afati i skadences
    private Rating rating;

    //konstruktor me te cilet mund te krijojme produkt


    public Product(int id, String name, String description, BigDecimal price, LocalDate bestBefore, Rating rating) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.bestBefore = bestBefore;
        this.rating = rating;
    }

    public Product(int id, String name, BigDecimal price) {
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

    public void setPrice(BigDecimal price) {
        if (price.compareTo(BigDecimal.ZERO) < 0) {
            System.out.println("Nuk lejohet cmimi me i vogel se zero");
            return;
        }
        this.price = price;
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }

    public void setBestBefore(LocalDate bestBefore) {
        if (bestBefore.isBefore(LocalDate.now())) {
            System.out.println("i paska kalu afati ketij produkti");
            //exception throw new KaSkaduAfatiException();
            return;//
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
