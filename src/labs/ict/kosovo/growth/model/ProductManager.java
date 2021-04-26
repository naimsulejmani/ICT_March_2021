package labs.ict.kosovo.growth.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class ProductManager {
    //Listen e produkteve qe kemi me ruajt
    //formatizimin e te dhenave
    // resources -> per me perdore shumegjuhesine ne lidhje me produktin
    //kemi me perdore me kriju produkt
    //kemi me perdore per me gjeneru raporte te ndryshme
    private ArrayList<Product> products = new ArrayList<>();
    String language = "en-US";

    public ProductManager(String language) {
        this.language = language;
    }

    public Product createFood(int id, String name, String description, BigDecimal price,
                              LocalDate bestBefore, Rating rating) {
        Product product = new Food(id, name, description, price, bestBefore, rating);
        products.add(product);
        return product;
    }

    public Product createDrink(int id, String name, String description, BigDecimal price,
                               LocalDate bestBefore, Rating rating) {
        Product product = new Drink(id, name, description, price, bestBefore, rating);
        products.add(product);
        return product;
    }

    public Product createProduct(ProductType type, int id, String name, String description, BigDecimal price,
                                 LocalDate bestBefore, Rating rating) {

        return type == ProductType.FOOD ?
                createFood(id, name, description, price, bestBefore, rating) :
                createDrink(id, name, description, price, bestBefore, rating);
    }

    public void printAllProducts() {
        System.out.printf("Total products: %d%n",products.size());
        System.out.println("------------------------------------");
        for(Product p: products) {
            System.out.println(p);
        }
    }

    //duhet me be nje metode qe  e gjen produktin ne baze te id-se
    //duhet te behet nje metode e cila mundeson vendosjen ne nje Review -> dhe ajo review e ka nje koment
    //dhe ka nje rating te caktum







}
