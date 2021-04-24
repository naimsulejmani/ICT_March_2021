package labs.ict.kosovo.growth;

import labs.ict.kosovo.growth.exceptions.ExpiredDateException;
import labs.ict.kosovo.growth.exceptions.IllegalNegativeProductPriceException;
import labs.ict.kosovo.growth.model.Drink;
import labs.ict.kosovo.growth.model.Food;
import labs.ict.kosovo.growth.model.Product;
import labs.ict.kosovo.growth.model.Rating;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Shop {
    public static void main(String[] args) {
       try{
           Product p1 = new Product(1, "Monte Coko", "Shume e shijshme",
                   BigDecimal.valueOf(0.45d), LocalDate.of(2022, 5, 1), Rating.FOUR_STAR);

           Food f = new Food(2, "Buke furre", "",
                   BigDecimal.valueOf(-0.4), LocalDate.now(), Rating.THREE_STAR);

           Product d = new Drink(3, "Espresso", "", BigDecimal.valueOf(0.7), LocalDate.now(),
                   Rating.FOUR_STAR);
       }catch (IllegalNegativeProductPriceException e) {
           System.out.println(e.getPrice());
           System.out.println(e.getMessage());
       }
       catch (ExpiredDateException e) {
           System.out.println(e.getMessage());
       }

//        System.out.println(p1);
//        System.out.println("Zbritja per food: "+f.getDiscount());
//        System.out.println("Zbritja per drink(happy hour 50%): "+d.getDiscount());
    }
}
