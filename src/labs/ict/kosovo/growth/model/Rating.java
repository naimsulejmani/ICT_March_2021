package labs.ict.kosovo.growth.model;

public enum Rating {
    // me  fillojne characters unicode ->
    NOT_RATED("\u2606\u2606\u2606\u2606\u2606"),
    ONE_STAR("\u2605\u2606\u2606\u2606\u2606"),
    TWO_STAR("\u2605\u2605\u2606\u2606\u2606"),
    THREE_STAR("\u2605\u2605\u2605\u2606\u2606"),
    FOUR_STAR("\u2605\u2605\u2605\u2605\u2606"),
    FIVE_STAR("\u2605\u2605\u2605\u2605\u2605");

    private String stars;

    public String getStars() {
        return stars;
    }

    private Rating(String stars) {
        this.stars = stars;
    }

    //this -> e ka kuptimin e instances se objektit
    public void print() {
        //tek formatizimi
        // NO_STAR, ******
        System.out.printf("%s - %s %n", this.toString(), getStars());
    }

    @Override
    public String toString() {
        return getStars();
    }
}
