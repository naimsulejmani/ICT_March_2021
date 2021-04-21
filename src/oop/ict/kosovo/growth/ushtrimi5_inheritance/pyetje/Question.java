package oop.ict.kosovo.growth.ushtrimi5_inheritance.pyetje;

public class Question extends Object {
    private int id;
    private String question;

    public Question(int id, String question) {
        this.id = id;
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String toString(int a) {
        return Integer.toString(a);
    }

    @Override
    public String toString() {
        return id + ". " + question;
    }
}
