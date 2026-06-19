package com.bilibili.studio.kaleidoscope.sdk;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/VideoFrameInfo.class */
public interface VideoFrameInfo {
    public static final int VIDEO_FRAME_PIXEL_FROMAT_GRAY8 = 5;
    public static final int VIDEO_FRAME_PIXEL_FROMAT_JPG_DATA = 3;
    public static final int VIDEO_FRAME_PIXEL_FROMAT_NV12 = 4;
    public static final int VIDEO_FRAME_PIXEL_FROMAT_NV21 = 0;
    public static final int VIDEO_FRAME_PIXEL_FROMAT_RGBA = 2;
    public static final int VIDEO_FRAME_PIXEL_FROMAT_YUV420 = 1;

    int getDisplayRotation();

    int getFrameHeight();

    long getFrameTimestamp();

    int getFrameWidth();

    int getPixelFormat();

    Object getVideoFrameInfo();

    void setDisplayRotation(int i7);

    void setFrameHeight(int i7);

    void setFrameTimestamp(long j7);

    void setFrameWidth(int i7);

    void setVideoFrameInfo(Object obj);
}
