package com.wuxingcunappbackstage.wuxingcunappbackstage.scenicarea.comment;


public class CommentList {
    private Comment[] comments;

    public CommentList() {
        comments = new Comment[10];
        for(int i =  0; i < 10; ++i) {
            comments[i] = new Comment();
            comments[i].setImgSrc("https://ossweb-img.qq.com/images/lol/web201310/skin/big10006.jpg");
            comments[i].setCommentTime(124124);
            comments[i].setIconSrc("https://ossweb-img.qq.com/images/lol/web201310/skin/big10006.jpg");
            comments[i].setStarsAndComment(new StarsAndComment(1000, 3245));
            comments[i].setText("今天天气不错");
            comments[i].setName("安其拉");
        }
    }

    public CommentList(Comment[] comments) {
        this.comments = comments;
    }

    public Comment[] getComments() {
        return comments;
    }

    public void setComments(Comment[] comments) {
        this.comments = comments;
    }
}
