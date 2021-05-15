package labs.ict.kosovo.growth.model;

import java.math.BigDecimal;
import java.text.MessageFormat;
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
    private ResourceFormatter formatter;


    String language = "en-US";

    public ProductManager(String language) {
        this.language = language;
        String[] arr = language.split("-");
        formatter = new ResourceFormatter(new Locale(arr[0], arr[1]));
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
        System.out.printf("%s: %d%n",formatter.getText("totalProductsLabel"), products.size());
        System.out.println("------------------------------------");
        for (Product p : products) {
            System.out.println(formatter.formatProduct(p));
        }
    }

    //detyra e saj eshte
    // me lidhe localizimin (gjuhen) me njonen prej resource
    //me lexu resource edhe me tentu me i fromatizu te dhanat tonat
    private static class ResourceFormatter {
        private Locale locale;
        private ResourceBundle resources;
        private DateTimeFormatter dateFormatter;
        private NumberFormat moneyFormat;

        private ResourceFormatter(Locale locale) {
            this.locale = locale;
            resources = ResourceBundle.getBundle("labs.ict.kosovo.growth.model.Resources", locale);
            dateFormatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).localizedBy(locale);
            moneyFormat = NumberFormat.getCurrencyInstance(locale);
        }

        private String formatProduct(Product product) {
            return MessageFormat.format(resources.getString("product"),
                    product.getId(),
                    product.getName(),
                    moneyFormat.format(product.getPrice()),
                    dateFormatter.format(product.getBestBefore()),
                    product.getRating().getStars()
            );
        }

        private String getText(String key) {
            return resources.getString(key);
        }
    }
}
