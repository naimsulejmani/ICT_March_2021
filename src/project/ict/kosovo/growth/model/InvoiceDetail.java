package project.ict.kosovo.growth.model;

import project.ict.kosovo.growth.model.interfaces.TotalCalculateable;

import java.time.LocalDateTime;

public class InvoiceDetail extends BaseAudit<String> implements TotalCalculateable {
    private int id;
    private int productId;
    private int invoiceId;
    private double quantity;
    private double price;
    private double discount;

    public InvoiceDetail(int id, int productId, int invoiceId, double quantity, double price, double discount,
                         String insertBy, LocalDateTime insertDate) {
        super(insertBy, insertDate);
        this.id = id;
        this.productId = productId;
        this.invoiceId = invoiceId;
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public void printAudit() {
        System.out.println("Logu per detalin e fatures");
    }

    @Override
    public double getTotal() {
        return quantity * (1 - discount) * price;
    }

    @Override
    public String toString() {
        return String.format("#%d - Produkti me nr. %d %10.2f %10.2f  %10.2f %15.2f",
                id, productId, quantity, price, discount, getTotal());
    }
}
