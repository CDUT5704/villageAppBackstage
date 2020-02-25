package com.wuxingcunappbackstage.wuxingcunappbackstage.scenicarea.comment;


public class Comment {
    private String name; //用户名
    private String iconSrc; //用户图标地址
    private long commentTime; //评论的时间，从1900年1月1号0时0分0秒计算
    private String text; //用户的评论内容
    private String ImgSrc; //用户评论图片的资源地址(也可不用做这个功能)
    private StarsAndComment starsAndComment; //用户的点赞数和子评论数

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(long commentTime) {
        this.commentTime = commentTime;
    }

    public StarsAndComment getStarsAndComment() {
        return starsAndComment;
    }

    public String getIconSrc() {
        return iconSrc;
    }

    public String getImgSrc() {
        return ImgSrc;
    }

    public String getText() {
        return text;
    }

    public void setIconSrc(String iconSrc) {
        this.iconSrc = iconSrc;
    }

    public void setImgSrc(String imgSrc) {
        ImgSrc = imgSrc;
    }

    public void setStarsAndComment(StarsAndComment starsAndComment) {
        this.starsAndComment = starsAndComment;
    }

    public void setText(String text) {
        this.text = text;
    }
}
