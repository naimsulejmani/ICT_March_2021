package project.ict.kosovo.growth.model;

import project.ict.kosovo.growth.model.enums.Category;
import project.ict.kosovo.growth.model.enums.Unit;

import java.time.LocalDateTime;

//Object
public class Product extends BaseAudit<String> {
    private final int id;//blank konstante
    private String name;
    private String description;
    private Unit unit; //kete kem me dizajnu enum pastaj
    private Category category;//kete kem me dizajnu enum pastaj
    private String supplier;
    private double unitInStock;//
    private double unitSellPrice;
    private double unitPurchasePrice;//

    //construrt


    public Product(int id, String name, String description,
                   Unit unit, Category category, String supplier,
                   double unitInStock, double unitSellPrice,
                   double unitPurchasePrice, LocalDateTime insertDate, String insertBy) {
        super(insertBy,insertDate);
        this.id = id;
        this.name = name;
        this.description = description;
        this.unit = unit;
        this.category = category;
        this.supplier = supplier;
        this.unitInStock = unitInStock;
        this.unitSellPrice = unitSellPrice;
        this.unitPurchasePrice = unitPurchasePrice;
    }

    public Product(int id, String name, Unit unit, Category category,
                   double unitInStock, double unitSellPrice, LocalDateTime insertDate, String insertBy) {
        this(id, name, null, unit, category, null, unitInStock, unitSellPrice, 0,
                insertDate,insertBy);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public double getUnitInStock() {
        return unitInStock;
    }

    public void setUnitInStock(double unitInStock) {
        this.unitInStock = unitInStock;
    }

    public double getUnitSellPrice() {
        return unitSellPrice;
    }

    public void setUnitSellPrice(double unitSellPrice) {
        this.unitSellPrice = unitSellPrice;
    }

    public double getUnitPurchasePrice() {
        return unitPurchasePrice;
    }

    public void setUnitPurchasePrice(double unitPurchasePrice) {
        this.unitPurchasePrice = unitPurchasePrice;
    }

    //varargs... (Object...)
    @Override
    public void printAudit() {
        System.out.printf("Produkti %d - %s eshte regjistruar me daten '%s' nga shfrytezuesi: %s %n",
                id, name, insertDate, insertBy);
    }
}
