package com.wuxingcunappbackstage.wuxingcunappbackstage.scenicarea.ScenicAreaInfo;

public class SwiperList {
    private int id; //图片id
    private String type = "image"; //类型，直接默认image
    private String url;

    public void setId(int id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
