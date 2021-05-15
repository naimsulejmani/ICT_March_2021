package oop.ict.kosovo.growth.ushtrimi10_nestedclass.referencemethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestReferenceMethodWithLambda {
    public static void main(String[] args) {
        TextFilter textFilter = new TextFilter();
        List<String> names = new ArrayList<>();
        names.add("Abdurrahman");
        names.add("Besnik");
        names.add("Elfete");
        names.add("RAhmell");

        //names.removeIf((s) -> TextFilter.containsA(s)); // lambda expression duke perdore nje metode statike
        names.removeIf(TextFilter::containsA);//referencim static


        Collections.sort(names, (s1, s2) -> s1.compareToIgnoreCase(s2));
        Collections.sort(names, String::compareToIgnoreCase);//Class:InstanceMethod referencing

        names.forEach(textFilter::print); //referencimin sipas metodes se objektit
    }
}
