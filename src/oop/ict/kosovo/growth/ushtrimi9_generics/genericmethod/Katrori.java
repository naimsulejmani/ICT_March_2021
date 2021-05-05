package oop.ict.kosovo.growth.ushtrimi9_generics.genericmethod;

public class Katrori implements Comparable<Katrori> {
    private double a;

    public Katrori(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double syprina() {
        return a * a;
    }

    @Override
    public int compareTo(Katrori otherKatror) {
        double diff = this.getA()-otherKatror.getA();
        if (diff < 0) return -1;
        else if (diff > 0) return 1;
        return 0;
    }
}
