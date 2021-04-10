package oop.ict.kosovo.growth.ushtrimi1;

public class BankTest {
    public static void main(String[] args) {

        BankCardAccount hulajAccount = new BankCardAccount(1234123412341234l,
                444411112222333l, "Sabrije", "Hulaj", 12, 2023, 123,
                "Debit", "ICT BANK");

        System.out.println(hulajAccount.getPin());

    }
}
