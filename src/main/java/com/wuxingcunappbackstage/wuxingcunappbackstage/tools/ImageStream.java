package com.wuxingcunappbackstage.wuxingcunappbackstage.tools;

import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@Service //声明其为Spring的一个服务组件类，就不用再配置bean了 具体百度
public class ImageStream {
    private String src;
    private byte[] bytes;

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public byte[] getBytes() throws IOException {
        FileInputStream inputStream = new FileInputStream(new File(src));
        bytes = new byte[inputStream.available()];
        inputStream.read(bytes, 0, inputStream.available());
        return bytes;
    }

}
