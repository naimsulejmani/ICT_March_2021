package oop.ict.kosovo.growth.ushtrimi4_associations;


//lidhjen asociations ndermjet Person dhe Brain
// nje objekt personi ka ne vete nje objekt te trurit


//Composition -> kerkon qe variabla brain te inicializohet ne momentin qe krijojme Person
//Aggregation -> lejohet me qene variabla brain edhe null


public class Person {
    private Brain brain;
    private String fullName;
    private Date birthdate;

//    public Person() {
//        //default -> refrecen na e inicializon null
//        brain = new Brain();
//    }

    public Person(String fullName, Date birthdate, Brain brain) {
        this.brain = brain;
        this.fullName = fullName;
        this.birthdate = birthdate;
    }

    //mbishkrimi i metodes toString

    @Override
    public String toString() {
        return String.format("%s i lindur me %d.%d.%d ka IQ-ne: %d",
                fullName, birthdate.getDay(), birthdate.getMonth(),
                birthdate.getYear(), brain.getIq());
    }
}
