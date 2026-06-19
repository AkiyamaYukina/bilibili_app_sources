package com.bilibili.mobile.model;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mobile/model/BLSegment.class */
public class BLSegment {
    private byte[] extraInfoBuffer;
    private int extraInfoLength;
    private int faceId;
    public BLImage image;
    public float maxThreshold;
    public float minThreshold;
    public BLPoint offset;
    private int rotateType;
    public BLPoint scale;
    public float score;

    public byte[] getExtraInfoBuffer() {
        return this.extraInfoBuffer;
    }

    public int getExtraInfoLength() {
        return this.extraInfoLength;
    }

    public int getFaceId() {
        return this.faceId;
    }

    public BLImage getImage() {
        return this.image;
    }

    public float getMaxThreshold() {
        return this.maxThreshold;
    }

    public float getMinThreshold() {
        return this.minThreshold;
    }

    public BLPoint getOffset() {
        return this.offset;
    }

    public int getRotateType() {
        return this.rotateType;
    }

    public BLPoint getScale() {
        return this.scale;
    }

    public float getScore() {
        return this.score;
    }
}
