package com.bilibili.mobile.model;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mobile/model/BLMobileBodyInfo.class */
public class BLMobileBodyInfo {
    public BLRect bodyRect;
    public BLPoint[] contourPoints;
    public int contourPointsCount;
    public float[] contourPointsScore;
    public int id;
    public BLPoint[] keyPoints;
    public int keyPointsCount;
    public float[] keyPointsScore;

    public BLPoint[] getContourPoints() {
        return this.contourPoints;
    }

    public float[] getContourPointsScore() {
        return this.contourPointsScore;
    }

    public BLPoint[] getKeyPoints() {
        return this.keyPoints;
    }

    public float[] getKeyPointsScore() {
        return this.keyPointsScore;
    }
}
