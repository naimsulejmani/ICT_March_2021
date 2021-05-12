package project.ict.kosovo.growth;

import project.ict.kosovo.growth.model.Invoice;
import project.ict.kosovo.growth.model.InvoiceDetail;

import java.time.LocalDate;
import java.time.LocalDateTime;

//aplikacion i shitjes ->
//faturen, artikujt, consumatorin, detajet e aritikullit e keshtu me rralle
//NORTHWIND
public class Main {
    public static void main(String[] args) {
        Invoice invoice1 = new Invoice(1,1, LocalDate.now(),
                LocalDate.now().plusMonths(2),"kujdes se ka produkte te ndjeshme",
                "naimsulejmani", LocalDateTime.now());

        InvoiceDetail d1 = new InvoiceDetail(1,1,1,10,3,0.30,"naimsuljemani",LocalDateTime.now());
        InvoiceDetail d2 = new InvoiceDetail(2,2,1,20,2.50,0.05,"naimsuljemani",LocalDateTime.now());
        InvoiceDetail d3 = new InvoiceDetail(3,10,1,200,0.50,0.02,"naimsuljemani",LocalDateTime.now());

        //realisht ky get eshte dasht me na kthy nje clone te saj
        invoice1.getDetails().add(d1);
        invoice1.getDetails().add(d2);
        invoice1.getDetails().add(d3);


        System.out.println(invoice1);





    }
}
