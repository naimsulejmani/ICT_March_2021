package oop.ict.kosovo.growth.ushtrimi5_inheritance.finals;

public final class NewPerson extends Person {
    private String surname;

    public NewPerson(long PERSONAL_NO, String name, String surname) {
        super(PERSONAL_NO, name);
        this.surname = surname;
    }

    public final String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

//    @Override
//    public long getPERSONAL_NO() {
//        return super.getPERSONAL_NO() + 10;
//    }
}
