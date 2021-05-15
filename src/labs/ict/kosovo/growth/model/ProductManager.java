package labs.ict.kosovo.growth.model;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.Locale;
import java.util.ResourceBundle;

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
        System.out.printf("Total products: %d%n", products.size());
        System.out.println("------------------------------------");
        for (Product p : products) {
            System.out.println(p);
        }
    }

    //detyra e saj eshte
    // me lidhe localizimin (gjuhen) me njonen prej resource
    //me lexu resource edhe me tentu me i fromatizu te dhanat tonat
    public static class ResourceFormatter {
        private Locale locale;
        private ResourceBundle resources;
        private DateTimeFormatter dateFormatter;
        private NumberFormat moneyFormat;

        public ResourceFormatter(Locale locale) {
            this.locale = locale;
            System.out.println(this.locale);
            resources = ResourceBundle.getBundle("labs.ict.kosovo.growth.model.Resources");
            dateFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).localizedBy(locale);
            moneyFormat = NumberFormat.getCurrencyInstance(locale);
        }

        public String getText(String key) {
            return resources.getString(key);
        }
    }
}
