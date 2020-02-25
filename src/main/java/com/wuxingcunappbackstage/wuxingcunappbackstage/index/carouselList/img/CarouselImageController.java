package com.wuxingcunappbackstage.wuxingcunappbackstage.index.carouselList.img;
import com.wuxingcunappbackstage.wuxingcunappbackstage.tools.ImageStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;
import java.io.IOException;

@RestController
public class CarouselImageController {
    private String imgSrc;
    @Autowired
    private ImageStream imageStream;
    @RequestMapping(value = "/index/carouselList/img", produces = MediaType.IMAGE_JPEG_VALUE, method = RequestMethod.GET)
    public byte[] getImage(@RequestParam String img) throws IOException {
        imgSrc = "src/main/resources/" + img + ".jpg";
        imageStream.setSrc(imgSrc);
        return imageStream.getBytes();
    }
}
