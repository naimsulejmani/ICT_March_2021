package labs.ict.kosovo.growth.model;

public class Review {
    private String comment;
    private Rating rating;

    public Review(String comment, Rating rating) {
        this.comment = comment;
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }
}
