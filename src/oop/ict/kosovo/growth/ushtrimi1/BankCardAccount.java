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


    //kur shtojme para ne ATM Machine
    public double deposit(double deposit) {
        //nuk ka kontrolle nese ben deposit negative
        System.out.println("Balanci eshte " + this.balance);
        this.balance = this.balance + deposit;
        System.out.println("Balanci pas deponimit eshte " + this.balance);
        return this.balance;
    }

    public double withdraw (double withdraw) {
        if (withdraw < 0.0) {
            System.out.println("Shuma e terheqjes duhet te jete me e madhe se 0.0!");
        }
        if (this.balance < 0.0) {
            System.out.println("Fonde te pamjaftueshme!");
        } else
            System.out.println("Shuma e terhequr eshte " + withdraw);
        //if(balanace-withdraw<0)

        double currentBalance = this.balance - withdraw;
        System.out.println("Balanci i mbetur eshte " + currentBalance);
        this.balance = currentBalance;
        return currentBalance;
    }



    public double checkBalance() {
        System.out.println("Balanci eshte " + this.balance);
        return this.balance;
    }

    public String printBankCardAccount(BankCardAccount bankCardAccount) {
        String print = bankCardAccount.accountNumber + " " +
                bankCardAccount.cardNumber + " " +
                bankCardAccount.holderName + " " +
                bankCardAccount.holderSurname + " " +
                bankCardAccount.month + " " +
                bankCardAccount.year + " " +
                bankCardAccount.securityCode + " " +
                bankCardAccount.cardType + " " +
                bankCardAccount.bankName;
        System.out.println(print);
        return print;
    }

}
