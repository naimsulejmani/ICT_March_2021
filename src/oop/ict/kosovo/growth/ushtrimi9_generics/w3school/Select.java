package oop.ict.kosovo.growth.ushtrimi9_generics.w3school;

import java.util.ArrayList;
import java.util.Iterator;

public class Select {
    private String id;
    private String name;
    private ArrayList<Option<String, String>> options = new ArrayList<>();

    public Select(String id, String name, ArrayList<Option<String, String>> options) {
        this.id = id;
        this.name = name;
        this.options = options;
    }

    public Select() {
    }

    public Select(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Option<String, String>> getOptions() {
        return options;
    }

    public void addOption(String value, String text) {
        if (this.options == null) this.options = new ArrayList<>();
        Option<String, String> newOption = new Option<>(value, text);
        this.options.add(newOption);
    }

    public void setOptions(ArrayList<Option<String, String>> options) {
        this.options = options;
    }

    @Override
    public String toString() {
        String selectString = String.format("<select id='%s' name='%s'>%n", id, name);
        Iterator<Option<String, String>> iterator = options.iterator();
        while (iterator.hasNext()) {
            selectString += String.format("%s %n", iterator.next().toString());
        }
        selectString += "</select>";
        return selectString;
    }
}
