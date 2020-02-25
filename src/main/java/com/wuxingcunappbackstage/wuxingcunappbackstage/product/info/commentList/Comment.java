package com.wuxingcunappbackstage.wuxingcunappbackstage.product.info.commentList;

import com.wuxingcunappbackstage.wuxingcunappbackstage.product.info.type.BuyType;

import java.util.Date;

public class Comment {
    private String name; //用户名称
    private Date date; //购买时间
    private String content; //评价内容
    private BuyType buyType; //购买类型
    private int eavaluate; //评价等级

    public Comment() {
        name = "张迎喜";
        date = new Date();
        content = "内容";
        buyType = new BuyType();
        buyType.setSize("32");
        eavaluate = 5;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBuyType(BuyType buyType) {
        this.buyType = buyType;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setEavaluate(int eavaluate) {
        this.eavaluate = eavaluate;
    }

    public BuyType getBuyType() {
        return buyType;
    }

    public Date getDate() {
        return date;
    }

    public int getEavaluate() {
        return eavaluate;
    }

    public String getContent() {
        return content;
    }

}
