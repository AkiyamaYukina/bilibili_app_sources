package com.bilibili.montage.avinfo;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/avinfo/MontageVideoFrameInfo.class */
public class MontageVideoFrameInfo {
    public static final int VIDEO_FRAME_PIXEL_FROMAT_GRAY8 = 5;
    public static final int VIDEO_FRAME_PIXEL_FROMAT_JPG_DATA = 3;
    public static final int VIDEO_FRAME_PIXEL_FROMAT_NV12 = 4;
    public static final int VIDEO_FRAME_PIXEL_FROMAT_NV21 = 0;
    public static final int VIDEO_FRAME_PIXEL_FROMAT_RGBA = 2;
    public static final int VIDEO_FRAME_PIXEL_FROMAT_YUV420 = 1;
    public int displayRotation;
    public boolean flipHorizontally;
    public int frameHeight;
    public long frameTimestamp;
    public int frameWidth;
    public boolean isFullRangeYuv;
    public boolean isRec601;
    public int pixelFormat;
    public int rowPitchUV;
    public int rowPitchY;
}
