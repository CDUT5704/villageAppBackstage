package com.wuxingcunappbackstage.wuxingcunappbackstage.scenicarea.comment;

public class StarsAndComment {
    private int stars;
    private int comment;

    public StarsAndComment() {
        stars = 0;
        comment = 0;
    }

    public StarsAndComment(int stars, int comment) {
        this.stars = stars;
        this.comment = comment;
    }

    public int getComment() {
        return comment;
    }

    public void setComment(int comment) {
        this.comment = comment;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public int getStars() {
        return stars;
    }
}
