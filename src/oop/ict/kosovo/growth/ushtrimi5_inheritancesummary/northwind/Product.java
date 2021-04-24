package oop.ict.kosovo.growth.ushtrimi5_inheritancesummary.northwind;

public class Product {
    private int productId;
    private String productName;
    private int supplierId;
    private int categoryId;
    private String quantityPerUnit;//24 pjese per pako
    private double unitPrice;
    private double unitsInStock;
    private double unitsInOrder;
    private double reorderLevel;
    private boolean discontinued;

    //composition nje produkt i takon 1..1 kategorise
    private Category category;

    public Product() {
        //default
    }

    public Product(int productId, String productName, int supplierId, int categoryId, String quantityPerUnit, double unitPrice, double unitsInStock, double unitsInOrder, double reorderLevel, boolean discontinued, Category category) {
        this.productId = productId;
        this.productName = productName;
        this.supplierId = supplierId;
        this.categoryId = categoryId;
        this.quantityPerUnit = quantityPerUnit;
        this.unitPrice = unitPrice;
        this.unitsInStock = unitsInStock;
        this.unitsInOrder = unitsInOrder;
        this.reorderLevel = reorderLevel;
        this.discontinued = discontinued;
        this.category = category;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(int supplierId) {
        this.supplierId = supplierId;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getQuantityPerUnit() {
        return quantityPerUnit;
    }

    public void setQuantityPerUnit(String quantityPerUnit) {
        this.quantityPerUnit = quantityPerUnit;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(double unitsInStock) {
        this.unitsInStock = unitsInStock;
    }

    public double getUnitsInOrder() {
        return unitsInOrder;
    }

    public void setUnitsInOrder(double unitsInOrder) {
        this.unitsInOrder = unitsInOrder;
    }

    public double getReorderLevel() {
        return reorderLevel;
    }

    public void setReorderLevel(double reorderLevel) {
        this.reorderLevel = reorderLevel;
    }

    public boolean isDiscontinued() {
        return discontinued;
    }

    public void setDiscontinued(boolean discontinued) {
        this.discontinued = discontinued;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
