package labs.ict.kosovo.growth.exceptions;

import labs.ict.kosovo.growth.model.Product;

public class IllegalNegativeProductPriceException extends Exception {
    //private Product product;
    private double price;

    public IllegalNegativeProductPriceException(String message, double price) {
        super(message);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
