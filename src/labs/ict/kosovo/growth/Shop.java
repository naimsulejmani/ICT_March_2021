package labs.ict.kosovo.growth;

import labs.ict.kosovo.growth.exceptions.ExpiredDateException;
import labs.ict.kosovo.growth.exceptions.IllegalNegativeProductPriceException;
import labs.ict.kosovo.growth.model.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Locale;

public class Shop {
    public static void main(String[] args) {

        ProductManager manager = new ProductManager("sq-AL");

        Product p1 = manager.createDrink(1, "Coca Cola 2l", "Mos e pini vet!",
                BigDecimal.valueOf(1.50d), LocalDate.of(2021, 12, 31), Rating.FOUR_STAR);

        Product p2 = manager.createFood(2, "Monte Choko", "Per femij dhe te rritur!",
                BigDecimal.valueOf(0.45d), LocalDate.now().plusDays(30), Rating.FIVE_STAR);
        Product p3 = manager.createProduct(ProductType.DRINK, 3, "Makiato e shkurter!!!",
                "2/5", BigDecimal.valueOf(0.70d), LocalDate.now(), Rating.NOT_RATED);


        manager.printAllProducts();

//        ProductManager.ResourceFormatter formatter = new ProductManager.ResourceFormatter(
//                new Locale("en","US")
//        );
//
//        System.out.println(formatter.getText("product"));



//       try{
//           Product p1 = new Product(1, "Monte Coko", "Shume e shijshme",
//                   BigDecimal.valueOf(0.45d), LocalDate.of(2022, 5, 1), Rating.FOUR_STAR);
//
//           Food f = new Food(2, "Buke furre", "",
//                   BigDecimal.valueOf(-0.4), LocalDate.now(), Rating.THREE_STAR);
//
//           Product d = new Drink(3, "Espresso", "", BigDecimal.valueOf(0.7), LocalDate.now(),
//                   Rating.FOUR_STAR);
//       }catch (IllegalNegativeProductPriceException e) {
//           System.out.println(e.getPrice());
//           System.out.println(e.getMessage());
//       }
//       catch (ExpiredDateException e) {
//           System.out.println(e.getMessage());
//       }

//        System.out.println(p1);
//        System.out.println("Zbritja per food: "+f.getDiscount());
//        System.out.println("Zbritja per drink(happy hour 50%): "+d.getDiscount());
    }
}
