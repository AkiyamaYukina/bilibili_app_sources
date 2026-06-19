package com.bilibili.montage.avinfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/avinfo/MontageVideoResolution.class */
public class MontageVideoResolution {
    public static final int VIDEO_RESOLUTION_BIT_DEPTH_16_BIT_FLOAT = 1;
    public static final int VIDEO_RESOLUTION_BIT_DEPTH_8_BIT = 0;
    public static final int VIDEO_RESOLUTION_BIT_DEPTH_AUTO = 2;
    public int bitDepth;
    public int imageHeight;
    public MontageRational imagePAR;
    public int imageWidth;

    public MontageVideoResolution() {
        this.imageWidth = 720;
        this.imageHeight = 1280;
        this.imagePAR = new MontageRational(1, 1);
        this.bitDepth = 8;
    }

    public MontageVideoResolution(int i7, int i8) {
        this.imageWidth = 720;
        this.imageHeight = 1280;
        this.imagePAR = new MontageRational(1, 1);
        this.bitDepth = 8;
        this.imageWidth = i7;
        this.imageHeight = i8;
    }
}
