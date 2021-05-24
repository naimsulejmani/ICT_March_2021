package labs.ict.kosovo.growth.model;

import labs.ict.kosovo.growth.exceptions.ExpiredDateException;
import labs.ict.kosovo.growth.exceptions.IllegalNegativeProductPriceException;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Product {
    private int id;
    private String name;
    private String description;
    private BigDecimal price; //priceNegativeExcption
    private LocalDate bestBefore; //afati i skadences
    private Rating rating;
    private List<Review> reviews;
    //Liste me rating
    //private ArrayList<Rating> ratings

    //konstruktor me te cilet mund te krijojme produkt


    Product(int id, String name, String description, BigDecimal price, LocalDate bestBefore, Rating rating) {
        this.id = id;
        this.name = name;
        this.description = description;
        setPrice(price);
        setBestBefore(bestBefore);
        //this.price = price;
        //this.bestBefore = bestBefore;
        this.rating = rating;
        this.reviews = new ArrayList<>();
    }

    Product(int id, String name, BigDecimal price) {
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
            price = BigDecimal.ZERO;
            //System.out.println("Nuk lejohet c");
            //throw new IllegalNegativeProductPriceException("Cmimi negative nuk lejohet!", price.doubleValue());
        }
        this.price = price;
    }

    public LocalDate getBestBefore() {
        return bestBefore;
    }

    public void setBestBefore(LocalDate bestBefore) {
        if (bestBefore.isBefore(LocalDate.now())) {
            // throw new ExpiredDateException("Ka skadu afati per kete produkt!");
            //System.out.println("i paska kalu afati ketij produkti");
            //exception throw new KaSkaduAfatiException();
            //return;//
            System.out.println("Jeni duke shtuar Produkt me afat te skaduar!!!");
        }
        this.bestBefore = bestBefore;
    }

    public Rating getRating() {

        OptionalDouble avg = reviews.stream().mapToInt(r -> r.getRating().ordinal()).average();
        //reviews.stream().filter(r -> r.getRating() != Rating.NOT_RATED).mapToInt(r -> r.getRating().ordinal()).sum()/review.length
        if (avg.isPresent())
            return Rating.values()[(int) Math.ceil(avg.getAsDouble())];
        else return Rating.NOT_RATED;
        //return rating;
    }

//    public void setRating(Rating rating) {
//        this.rating = rating;
//    }

    @Override
    public String toString() {
        return String.format("Produkti: %d - %s %nCmimi: %.2f%nBest before: %s%nDescription: %s%nOverall rating: %s",
                id, name, price, bestBefore, description, rating
        );
    }

    public BigDecimal getDiscount() {
        return BigDecimal.ZERO;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
}
