package com.wuxingcunappbackstage.wuxingcunappbackstage.product.info.sales;

public class SalesInfo {
    private int Sales;  //销量
    private int stock;  //库存
    private int views; //浏览量

    public void setSales(int sales) {
        Sales = sales;
    }

    public int getSales() {
        return Sales;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getStock() {
        return stock;
    }

    public int getViews() {
        return views;
    }
}
