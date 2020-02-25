package com.wuxingcunappbackstage.wuxingcunappbackstage.index.carouselList;

import com.wuxingcunappbackstage.wuxingcunappbackstage.index.carouselList.backgroundcolor.BackgroundColor;
import org.springframework.stereotype.Component;

public class Carousel {
    private String image;
    private BackgroundColor backgroundColor;

    public BackgroundColor getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(BackgroundColor backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Carousel() {
        image = new String(); //这里使用强耦合
        backgroundColor = new BackgroundColor();
    }
}
