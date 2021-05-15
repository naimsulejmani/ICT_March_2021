package oop.ict.kosovo.growth.ushtrimi10_nestedclass.anonymousinnerclass;

import java.math.BigDecimal;

public class OnlineOrder extends Order {
    //me shtu features apo me i mbishkru sjelljet e Order


    @Override
    public BigDecimal getDiscount() {
        return BigDecimal.valueOf(Math.random() * 20).divide(BigDecimal.valueOf(10));
    }
}
