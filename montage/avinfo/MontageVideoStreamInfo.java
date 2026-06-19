package com.bilibili.montage.avinfo;

import androidx.collection.C3269h;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/avinfo/MontageVideoStreamInfo.class */
public class MontageVideoStreamInfo {
    public static final int COLOR_TRANSFER_HLG = 2;
    public static final int COLOR_TRANSFER_SDR_VIDEO = 0;
    public static final int COLOR_TRANSFER_ST2084 = 1;
    public static final int VIDEO_CODEC_TYPE_H264 = 1;
    public static final int VIDEO_CODEC_TYPE_H265 = 2;
    public static final int VIDEO_CODEC_TYPE_MJPEG = 9;
    public static final int VIDEO_CODEC_TYPE_MPEG1 = 7;
    public static final int VIDEO_CODEC_TYPE_MPEG2 = 8;
    public static final int VIDEO_CODEC_TYPE_MPEG4 = 3;
    public static final int VIDEO_CODEC_TYPE_UNKNOWN = 0;
    public static final int VIDEO_CODEC_TYPE_VP8 = 4;
    public static final int VIDEO_CODEC_TYPE_VP9 = 5;
    public static final int VIDEO_CODEC_TYPE_WMV = 6;
    public static final int VIDEO_ROTATION_0 = 0;
    public static final int VIDEO_ROTATION_180 = 2;
    public static final int VIDEO_ROTATION_270 = 3;
    public static final int VIDEO_ROTATION_90 = 1;
    public int codecLevel;
    public int codecProfile;
    public int colorTranfer;
    public int componentBitCount;
    public int displayRotation;
    public long duration;
    public MontageRational frameRate;
    public int imageHeight;
    public int imageWidth;
    public MontageRational pixelAspectRatio;
    public int videoCodecType;

    public String toString() {
        StringBuilder sb = new StringBuilder("MontageVideoStreamInfo{duration=");
        sb.append(this.duration);
        sb.append(", imageWidth=");
        sb.append(this.imageWidth);
        sb.append(", imageHeight=");
        sb.append(this.imageHeight);
        sb.append(", pixelAspectRatio=");
        sb.append(this.pixelAspectRatio);
        sb.append(", frameRate=");
        sb.append(this.frameRate);
        sb.append(", displayRotation=");
        sb.append(this.displayRotation);
        sb.append(", videoCodecType=");
        sb.append(this.videoCodecType);
        sb.append(", componentBitCount=");
        sb.append(this.componentBitCount);
        sb.append(", colorTranfer=");
        sb.append(this.colorTranfer);
        sb.append(", codecProfile=");
        sb.append(this.codecProfile);
        sb.append(", codecLevel=");
        return C3269h.a(sb, this.codecLevel, '}');
    }
}
