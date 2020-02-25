package com.wuxingcunappbackstage.wuxingcunappbackstage.index.carouselList.backgroundcolor;

import org.springframework.stereotype.Component;

public class BackgroundColor {
    private int red;
    private int green;
    private int blue;


    public int getBlue() {
        return blue;
    }

    public int getGreen() {
        return green;
    }

    public int getRed() {
        return red;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public void setRed(int red) {
        this.red = red;
    }

    @Override
    public String toString() {
        return "BackgroundColor{" +
                "red=" + red +
                ", green=" + green +
                ", blue=" + blue +
                '}';
    }
}
