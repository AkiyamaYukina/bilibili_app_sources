package com.bilibili.studio.kaleidoscope.sdk;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/kaleidoscope/sdk/AudioSampleBuffers.class */
public interface AudioSampleBuffers {
    public static final int AUDIO_SAMPLE_FROMAT_DOUBLE = 5;
    public static final int AUDIO_SAMPLE_FROMAT_DOUBLE_PLANAR = 10;
    public static final int AUDIO_SAMPLE_FROMAT_SIGNED_16 = 2;
    public static final int AUDIO_SAMPLE_FROMAT_SIGNED_16_PLANAR = 7;
    public static final int AUDIO_SAMPLE_FROMAT_SIGNED_32 = 3;
    public static final int AUDIO_SAMPLE_FROMAT_SIGNED_32_PLANAR = 8;
    public static final int AUDIO_SAMPLE_FROMAT_SINGLE_FLOAT = 4;
    public static final int AUDIO_SAMPLE_FROMAT_SINGLE_FLOAT_PLANAR = 9;
    public static final int AUDIO_SAMPLE_FROMAT_UNSIGNED_8 = 1;
    public static final int AUDIO_SAMPLE_FROMAT_UNSIGNED_8_PLANAR = 6;

    int getActualSampleCount();

    ByteBuffer getAudioBuffer();

    Object getAudioSampleBuffers();

    int getChannelCount();

    int getSampleRate();

    int getSampleformat();

    long getTimeStamp();

    void setActualSampleCount(int i7);

    void setAudioBuffer(ByteBuffer byteBuffer);

    void setAudioSampleBuffers(Object obj);

    void setChannelCount(int i7);

    void setSampleRate(int i7);

    void setSampleformat(int i7);

    void setTimeStamp(long j7);
}
