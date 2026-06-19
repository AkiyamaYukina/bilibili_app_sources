package com.bilibili.mobile.model;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mobile/model/BLImage.class */
public class BLImage {
    public int height;
    public byte[] imageData;
    public int pixelFormat;
    public int stride;
    public double timeStamp;
    public int width;

    public int getHeight() {
        return this.height;
    }

    public byte[] getImageData() {
        return this.imageData;
    }

    public int getPixelFormat() {
        return this.pixelFormat;
    }

    public int getStride() {
        return this.stride;
    }

    public double getTimeStamp() {
        return this.timeStamp;
    }

    public int getWidth() {
        return this.width;
    }
}
