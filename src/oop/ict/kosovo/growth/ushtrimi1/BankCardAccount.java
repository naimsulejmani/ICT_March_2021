package oop.ict.kosovo.growth.ushtrimi1;

public class BankCardAccount {
    //shume ka rendesi definimi i datatype
    private long accountNumber;
    private long cardNumber;
    private String holderName;
    private String holderSurname;
    private int month; //-128 ... +127
    private int year; //-35K ... +35K
    private int pin;
    private int securityCode; //3
    private String cardType;
    private String bankName;
    private double balance;

    //menyra se si duhet me u ndertu objekti
    public BankCardAccount(long accountNumber, long cardNumber, String holderName,
                           String holderSurname, int month, int year, int securityCode,
                           String cardType, String bankName) {
        this.accountNumber = accountNumber;
        this.cardNumber = cardNumber;
        this.holderName = holderName;
        this.holderSurname = holderSurname;
        this.month = month;
        this.year = year;
        this.securityCode = securityCode;
        this.cardType = cardType;
        this.bankName = bankName;
        this.balance = 0.0;
        this.pin = (short) (Math.random() * 10_000);//gjenero ne menyre randome nje numer prej 0_9999
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public String getHolderSurname() {
        return holderSurname;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getPin() {
        return pin;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public String getCardType() {
        return cardType;
    }

    public String getBankName() {
        return bankName;
    }

    public double getBalance() {
        return balance;
    }

    public void changePin(short oldPin, short newPin, short confirmNewPin) {
        if (pin != oldPin) {
            System.out.println("Pini vjeter gabim!");
            return;
        }
        if (newPin != confirmNewPin) {
            System.out.println("Pini i ri nuk eshte konfirmuar sakte!!!");
            return;
        }
        this.pin = newPin;

    }

}
