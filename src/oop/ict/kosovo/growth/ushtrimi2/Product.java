package oop.ict.kosovo.growth.ushtrimi2;
//opsionale mundet me pas edhe import nga librarit apo package tjere

import java.math.BigDecimal;
import java.time.LocalDate;

public class Product {
    //variablat instance
    private int id; //=0
    private String name; //=null
    private BigDecimal price; //=null
    private LocalDate bestBesfore = LocalDate.now().plusDays(3);
// =null -> 15.04.2021 (reference ne momorie)

    //getter
    public BigDecimal getPrice() {
        return price;
    }

    //setter
    public void setPrice(double price) {
        this.price = BigDecimal.valueOf(price);
    }


}
