package com.wuxingcunappbackstage.wuxingcunappbackstage.scenicarea.ScenicAreaInfo;

public class ScenicAreaInfo {
    private SwiperList[] swiperList; //景点图片资源列表
    private String introduction;  //景点介绍

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public void setSwiperList(SwiperList[] swiperList) {
        this.swiperList = swiperList;
    }

    public SwiperList[] getSwiperList() {
        return swiperList;
    }
}
