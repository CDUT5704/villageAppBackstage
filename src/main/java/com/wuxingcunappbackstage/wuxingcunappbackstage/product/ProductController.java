package com.wuxingcunappbackstage.wuxingcunappbackstage.product;

import com.alibaba.fastjson.JSON;
import com.wuxingcunappbackstage.wuxingcunappbackstage.product.info.ProductInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/product")
@RestController
public class ProductController {
    private ProductInfo productInfo;

    @RequestMapping(method = RequestMethod.POST)
    public String getProductInfo(@RequestParam int id) {
        productInfo = new ProductInfo();
        //中间填充从数据库里获得商品信息到productinfo中.
        return JSON.toJSONString(productInfo);
    }
}
