package project.ict.kosovo.growth.model;

import project.ict.kosovo.growth.model.interfaces.TotalCalculateable;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Invoice extends BaseAudit<String> implements TotalCalculateable {
    private int id;
    private int customerId;
    private LocalDate invoiceDate;
    private LocalDate dueDate;
    private String comment;
    //liste me artikuj
    private List<InvoiceDetail> details;

    public Invoice(int id, int customerId, LocalDate invoiceDate, LocalDate dueDate,
                   String comment, String insertBy, LocalDateTime insertDate) {
        super(insertBy, insertDate);
        this.id = id;
        this.customerId = customerId;
        this.invoiceDate = invoiceDate;
        this.dueDate = dueDate;
        this.comment = comment;
        this.details=new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public LocalDate getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(LocalDate invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public List<InvoiceDetail> getDetails() {
        return details;
    }

    public void setDetails(List<InvoiceDetail> details) {
        this.details = details;
    }

    @Override
    public void printAudit() {
        System.out.println("Auditi per fature");
    }

    @Override
    public double getTotal() {
        double total = 0.0d;
        for (InvoiceDetail id : details) {
            total += id.getTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        String result = String.format("Invoice ID: %d%n", id);
        result += String.format("Invoice Date: %s%n", invoiceDate);
        result += String.format("Paguani deri me: %s%n", dueDate);
        result += String.format("Konsumatori me numer %d%n", customerId);
        result += "------------------------------------------------------\n";
        for (InvoiceDetail detail : details) {
            result += detail.toString()+"\n";
        }
        result += "------------------------------------------------------\n";
        result += String.format("Total Invoice: %.2f%n", getTotal());
        return result;
    }
}
