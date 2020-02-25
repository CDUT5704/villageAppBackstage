package com.wuxingcunappbackstage.wuxingcunappbackstage.product.info;

import com.wuxingcunappbackstage.wuxingcunappbackstage.product.info.commentList.CommentList;
import com.wuxingcunappbackstage.wuxingcunappbackstage.product.info.pricebox.PriceBox;
import com.wuxingcunappbackstage.wuxingcunappbackstage.product.info.sales.SalesInfo;
import com.wuxingcunappbackstage.wuxingcunappbackstage.product.info.type.BuyType;

public class ProductInfo {
    private String[] imgSrc; //图片路径
    private String title; //商品名称
    private CommentList commentList; //评论列表
    private PriceBox priceBox; //价格信息
    private SalesInfo salesInfo; //销售，库存，浏览量信息
    private BuyType buyType; //购买类型

    public ProductInfo() {
        imgSrc = new String[3];
        imgSrc[0] = "sada";
        imgSrc[1] = "asdasdsj";
        title = "biaoti";
        commentList = new CommentList();
        priceBox = new PriceBox();
        salesInfo = new SalesInfo();
        buyType = new BuyType();
    }

    public void setImgSrc(String[] imgSrc) {
        this.imgSrc = imgSrc;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getImgSrc() {
        return imgSrc;
    }

    public void setBuyType(BuyType buyType) {
        this.buyType = buyType;
    }

    public BuyType getBuyType() {
        return buyType;
    }

    public void setCommentList(CommentList commentList) {
        this.commentList = commentList;
    }

    public void setPriceBox(PriceBox priceBox) {
        this.priceBox = priceBox;
    }

    public void setSalesInfo(SalesInfo salesInfo) {
        this.salesInfo = salesInfo;
    }

    public CommentList getCommentList() {
        return commentList;
    }

    public PriceBox getPriceBox() {
        return priceBox;
    }

    public SalesInfo getSalesInfo() {
        return salesInfo;
    }
}
