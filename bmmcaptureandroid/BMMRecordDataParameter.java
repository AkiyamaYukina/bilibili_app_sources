package com.bilibili.bmmcaptureandroid;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/bmmcaptureandroid/BMMRecordDataParameter.class */
public class BMMRecordDataParameter {
    private byte[] aacData;
    private int audioFormat;
    private int channels;
    private int fps;
    private byte[] h264Data;
    private int height;
    private boolean isKeyFrame;
    private boolean isSpsPps;
    private long pts;
    private int sampleRate;
    private int width;

    public byte[] getAacData() {
        return this.aacData;
    }

    public int getAudioFormat() {
        return this.audioFormat;
    }

    public int getChannels() {
        return this.channels;
    }

    public int getFps() {
        return this.fps;
    }

    public byte[] getH264Data() {
        return this.h264Data;
    }

    public int getHeight() {
        return this.height;
    }

    public long getPts() {
        return this.pts;
    }

    public int getSampleRate() {
        return this.sampleRate;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isKeyFrame() {
        return this.isKeyFrame;
    }

    public boolean isSpsPps() {
        return this.isSpsPps;
    }

    public void setAudioParameter(byte[] bArr, int i7, int i8, int i9, long j7) {
        this.aacData = new byte[bArr.length];
        this.aacData = (byte[]) bArr.clone();
        this.audioFormat = i7;
        this.sampleRate = i8;
        this.channels = i9;
        this.pts = j7;
    }

    public void setVideoParameter(byte[] bArr, int i7, int i8, int i9, boolean z6, boolean z7, long j7) {
        this.h264Data = new byte[bArr.length];
        this.h264Data = (byte[]) bArr.clone();
        this.width = i7;
        this.height = i8;
        this.isKeyFrame = z6;
        this.isSpsPps = z7;
        this.pts = j7;
        this.fps = i9;
    }
}
