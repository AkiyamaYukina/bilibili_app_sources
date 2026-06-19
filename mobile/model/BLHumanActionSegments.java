package com.bilibili.mobile.model;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mobile/model/BLHumanActionSegments.class */
public class BLHumanActionSegments {
    private BLSegment depth;
    private int faceOcclusionCount;
    private BLSegment[] faceOcclusions;
    private BLSegment hair;
    private int headCount;
    private BLSegment[] heads;
    private BLSegment image;
    private int mouthParseCount;
    private BLSegment[] mouthParses;
    private BLSegment multiSegment;
    private BLSegment skin;
    private BLSegment sky;
    private int trouserLegCount;
    private BLSegment[] trouserLegSegment;

    public BLSegment getDepth() {
        return this.depth;
    }

    public int getFaceOcclusionCount() {
        return this.faceOcclusionCount;
    }

    public BLSegment[] getFaceOcclusions() {
        return this.faceOcclusions;
    }

    public BLSegment getFigureSegment() {
        return this.image;
    }

    public BLSegment getHair() {
        return this.hair;
    }

    public int getHeadCount() {
        return this.headCount;
    }

    public BLSegment[] getHeads() {
        return this.heads;
    }

    public BLSegment getImage() {
        return this.image;
    }

    public int getMouthParseCount() {
        return this.mouthParseCount;
    }

    public BLSegment[] getMouthParses() {
        return this.mouthParses;
    }

    public BLSegment getMultiSegment() {
        return this.multiSegment;
    }

    public BLSegment getSkin() {
        return this.skin;
    }

    public BLSegment getSky() {
        return this.sky;
    }

    public int getTrouserLegCount() {
        return this.trouserLegCount;
    }

    public BLSegment[] getTrouserLegSegment() {
        return this.trouserLegSegment;
    }

    public void setFigureSegment(BLSegment bLSegment) {
        this.image = bLSegment;
    }

    public void setHair(BLSegment bLSegment) {
        this.hair = bLSegment;
    }
}
