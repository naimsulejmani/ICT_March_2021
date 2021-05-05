package oop.ict.kosovo.growth.ushtrimi9_generics.w3school;

public class Option<T, U> {
    private T value;
    private U text;

    public Option() {
    }

    public Option(T value, U text) {
        this.value = value;
        this.text = text;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public U getText() {
        return text;
    }

    public void setText(U text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return String.format("%4s<option value='%s'>%s</option>"," ", this.value, this.text);
    }
}
