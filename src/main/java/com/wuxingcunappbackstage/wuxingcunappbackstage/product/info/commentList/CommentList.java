package com.wuxingcunappbackstage.wuxingcunappbackstage.product.info.commentList;


public class CommentList {
    Comment[] comments;

    public CommentList() {
        comments = new Comment[3];
        for(int i = 0; i < 3; ++i) {
            comments[i] = new Comment();
        }
    }

    public CommentList(Comment[] comments) {
        this.comments = comments;
    }

    public void setComments(Comment[] comments) {
        this.comments = comments;
    }

    public Comment[] getComments() {
        return comments;
    }
}
