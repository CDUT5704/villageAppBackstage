package com.wuxingcunappbackstage.wuxingcunappbackstage.index;

import com.alibaba.fastjson.JSON;
import com.wuxingcunappbackstage.wuxingcunappbackstage.Test;
import com.wuxingcunappbackstage.wuxingcunappbackstage.index.carouselList.CarouselList;
import com.wuxingcunappbackstage.wuxingcunappbackstage.index.carouselList.backgroundcolor.BackgroundColor;
import com.wuxingcunappbackstage.wuxingcunappbackstage.tools.BeanConfig;
import com.wuxingcunappbackstage.wuxingcunappbackstage.tools.ImageStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private ImageStream imageStream;

    @Autowired
    private CarouselList carouselList;
    /*static byte[] image2Bytes(String imgSrc) throws IOException { //手动用流传输 可以用其他代替
            FileInputStream fin  = new FileInputStream(new File(imgSrc));
            byte[] bytes = new byte[fin.available()];
            fin.read(bytes);
            fin.close();
            bytes = Base64.getEncoder().encode(bytes);
            return bytes;
    }*/
    @PostMapping("/carouselList")
    public String carouselList() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
        carouselList = (CarouselList)context.getBean("getCarouselList");
        String[] strings = new String[3]; //测试数据 随便写的几个
        for(int i = 0; i < 3; ++i) {
            strings[i] = Test.getIp() + "/index/carouselList/img?img=banner" + String.valueOf(i + 2);
        }
        BackgroundColor[] backgroundColors = new BackgroundColor[3]; //这里随便指定了一些数据
        backgroundColors[0] = new BackgroundColor();
        backgroundColors[1] = new BackgroundColor();
        backgroundColors[2] = new BackgroundColor();
        backgroundColors[0].setRed(203);
        backgroundColors[0].setGreen(87);
        backgroundColors[0].setBlue(60);
        backgroundColors[1].setRed(205);
        backgroundColors[1].setGreen(215);
        backgroundColors[1].setBlue(218);
        backgroundColors[2].setRed(183);
        backgroundColors[2].setGreen(73);
        backgroundColors[2].setBlue(69);
        carouselList.setImages(strings);
        carouselList.setBackgroundColors(backgroundColors);
        String jsonUsers = JSON.toJSONString(carouselList); //阿里的fastjson工具，能将类转化为json字符串格式


        return jsonUsers;
    }
    @GetMapping(value = "/ad", produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] advertisement() throws IOException {
        imageStream.setSrc("src/main/resources/ad.jpg");
        return imageStream.getBytes();
    }
}
