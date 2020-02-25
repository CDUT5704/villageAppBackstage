package com.wuxingcunappbackstage.wuxingcunappbackstage.index.carouselList;

import com.wuxingcunappbackstage.wuxingcunappbackstage.index.carouselList.backgroundcolor.BackgroundColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

public class CarouselList {
    Carousel[] carousels;

    public void setCarousels(Carousel[] carousels) {
        this.carousels = carousels;
    }

    public Carousel[] getCarousels() {
        return carousels;
    }

    public CarouselList(Carousel[] carousels) {
        this.carousels = carousels;
    }

    public void setImages(String[] images) {
        for(String str : images) {
            int i = 0;
            carousels[i].setImage(str);
            i++;
        }
        carousels[0].setImage(images[0]);
        carousels[1].setImage(images[1]);
        carousels[2].setImage(images[2]);
    }

    public void setBackgroundColors(BackgroundColor[] backgroundColors) {
        carousels[0].setBackgroundColor(backgroundColors[0]);
        carousels[1].setBackgroundColor(backgroundColors[1]);
        carousels[2].setBackgroundColor(backgroundColors[2]);
    }

}
