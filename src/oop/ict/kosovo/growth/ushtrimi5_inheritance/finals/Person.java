package oop.ict.kosovo.growth.ushtrimi5_inheritance.finals;

public class Person {
    private static final long MAX_PERSON_NO;
    //BLANK VARIABLE OR FINAL UNINITIALIZED VARIABLE
    private final long PERSONAL_NO;
    private String name;

    static {
        MAX_PERSON_NO = 1000;
    }

    public Person(final long PERSONAL_NO, final String name) {
        //PERSONAL_NO = PERSONAL_NO / 2;
        this.PERSONAL_NO = PERSONAL_NO;
        this.name = name;
    }

    public final long getPERSONAL_NO() {
        return PERSONAL_NO;
    }

    public final String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
