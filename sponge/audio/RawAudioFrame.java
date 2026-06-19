package com.bilibili.sponge.audio;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/sponge/audio/RawAudioFrame.class */
public class RawAudioFrame {
    public static final int SOURCE_TYPE_FILE = 1;
    public static final int SOURCE_TYPE_MIC = 0;
    private int freq;
    private int mAudioFormat;
    private ByteBuffer mBBData;
    private int mChannel;
    private byte[] mRawData;
    private int mSampleRate;
    private int mSourceType;
    private int offset;
    private int size;

    public int getFreq() {
        return this.freq;
    }

    public int getOffset() {
        return this.offset;
    }

    public int getSize() {
        return this.size;
    }

    public int getmAudioFormat() {
        return this.mAudioFormat;
    }

    public ByteBuffer getmBBData() {
        return this.mBBData;
    }

    public int getmChannel() {
        return this.mChannel;
    }

    public byte[] getmRawData() {
        return this.mRawData;
    }

    public int getmSampleRate() {
        return this.mSampleRate;
    }

    public int getmSourceType() {
        return this.mSourceType;
    }

    public void setFreq(int i7) {
        this.freq = i7;
    }

    public void setOffset(int i7) {
        this.offset = i7;
    }

    public void setSize(int i7) {
        this.size = i7;
    }

    public void setmAudioFormat(int i7) {
        this.mAudioFormat = i7;
    }

    public void setmBBData(ByteBuffer byteBuffer) {
        this.mBBData = byteBuffer;
    }

    public void setmChannel(int i7) {
        this.mChannel = i7;
    }

    public void setmRawData(byte[] bArr) {
        this.mRawData = bArr;
    }

    public void setmSampleRate(int i7) {
        this.mSampleRate = i7;
    }

    public void setmSourceType(int i7) {
        this.mSourceType = i7;
    }
}
