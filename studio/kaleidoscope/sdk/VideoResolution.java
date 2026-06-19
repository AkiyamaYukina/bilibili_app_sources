package com.bilibili.studio.kaleidoscope.sdk;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/VideoResolution.class */
public interface VideoResolution {
    public static final int VIDEO_RESOLUTION_BIT_DEPTH_16_BIT_FLOAT = 1;
    public static final int VIDEO_RESOLUTION_BIT_DEPTH_8_BIT = 0;
    public static final int VIDEO_RESOLUTION_BIT_DEPTH_AUTO = 2;

    int getBitDepth();

    int getImageHeight();

    Rational getImagePAR();

    int getImageWidth();

    Object getVideoResolution();

    void setBitDepth(int i7);

    void setImageHeight(int i7);

    void setImagePAR(Rational rational);

    void setImageWidth(int i7);

    void setVideoResolution(Object obj);
}
