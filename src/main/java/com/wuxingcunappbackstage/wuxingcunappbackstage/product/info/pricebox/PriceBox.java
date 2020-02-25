package com.wuxingcunappbackstage.wuxingcunappbackstage.product.info.pricebox;

public class PriceBox {
    private double price;
    private double m_price;
    private double coupon;

    public void setCoupon(double coupon) {
        this.coupon = coupon;
    }

    public double getCoupon() {
        return coupon;
    }

    public void setM_price(double m_price) {
        this.m_price = m_price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getM_price() {
        return m_price;
    }

    public double getPrice() {
        return price;
    }
}
