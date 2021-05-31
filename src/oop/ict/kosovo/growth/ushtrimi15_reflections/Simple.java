package oop.ict.kosovo.growth.ushtrimi15_reflections;

public class Simple {
    private String text;

    public Simple(String text) {
        this.text = text;
    }

    void message() {
        System.out.println("Text = " + text);
    }

    void message(String message) {
        System.out.println(text + " -> " + message);
    }
}
