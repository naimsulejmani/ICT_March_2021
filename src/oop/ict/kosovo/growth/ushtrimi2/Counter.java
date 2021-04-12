package oop.ict.kosovo.growth.ushtrimi2;

//Numrator
public class Counter {
    public static final int MAX = 100;
    private int value = 0;

    //shkruane metoden decrement - zbret vleren per njo
    public void decrement() {
        if (value > 0)
            --value;
    }

    public void increment() {
        if (value < MAX)
            ++value; //pre-increment ose kem mujt me postincrement
    }

    public int getValue() {
        return value;
    }
}
