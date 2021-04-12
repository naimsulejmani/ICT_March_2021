package oop.ict.kosovo.growth.ushtrimi2;

public class NumriDecimal {
    private double numri;

    public NumriDecimal() {

    }

    private NumriDecimal(double nr) {
        this.numri = nr;
    }

    public static NumriDecimal valueOf(double numri) {
        NumriDecimal nr = new NumriDecimal(numri);
        return nr;
    }

}
