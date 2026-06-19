package com.bilibili.studio.kaleidoscope.sdk;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/AVFileInfo.class */
public interface AVFileInfo {
    public static final int AV_FILE_TYPE_AUDIO = 1;
    public static final int AV_FILE_TYPE_AUDIOVIDEO = 0;
    public static final int AV_FILE_TYPE_IMAGE = 2;
    public static final int AV_FILE_TYPE_UNKNOWN = -1;

    Object getAVFileInfo();

    int getAVFileType();

    boolean getAudioStreamCodecSupport(int i7);

    int getAudioStreamCount();

    long getAudioStreamDuration(int i7);

    int getAudioStreamSampleRate(int i7);

    long getDataRate();

    long getDuration();

    int getVideoStreamCodecType(int i7);

    int getVideoStreamColorTranfer(int i7);

    int getVideoStreamComponentBitCount(int i7);

    int getVideoStreamCount();

    @NonNull
    Size getVideoStreamDimension(int i7);

    long getVideoStreamDuration(int i7);

    @NonNull
    Rational getVideoStreamFrameRate(int i7);

    int getVideoStreamRotation(int i7);

    void setAVFileInfo(Object obj);
}
