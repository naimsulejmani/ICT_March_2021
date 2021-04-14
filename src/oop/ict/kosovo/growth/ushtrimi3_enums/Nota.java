package oop.ict.kosovo.growth.ushtrimi3_enums;

//1,2,3,4,5
public enum Nota {
    DOBET(1), MJAFTUESHEM(2), MIRE(3), SHUME_MIRE(4), SHKELQYESHEM(5);

    private int value;

    public int getValue() {
        return value;
    }

    private Nota(int nota) {
        this.value = nota;
    }


}
