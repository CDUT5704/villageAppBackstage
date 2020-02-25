package com.wuxingcunappbackstage.wuxingcunappbackstage.product.productimg;

import com.wuxingcunappbackstage.wuxingcunappbackstage.tools.ImageStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/product/image")
public class ProductImageController {
    @Autowired
    private ImageStream imageStream;
    @RequestMapping(produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] images() throws IOException {
        imageStream.setSrc("");
        return imageStream.getBytes();
    }
}
