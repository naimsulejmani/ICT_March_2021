package oop.ict.kosovo.growth.ushtrimi10_nestedclass.anonymousinnerclass;

import java.math.BigDecimal;

public class TestAnonymousOrder {
    public static void main(String[] args) {
        OnlineOrder onlineOrder= new OnlineOrder();
        System.out.println(onlineOrder.getDiscount());


        Order anonymousClass = new Order() {
            @Override
            public BigDecimal getDiscount() {
                return BigDecimal.TEN;
            }
        };

        System.out.println(anonymousClass.getDiscount());





    }
}
