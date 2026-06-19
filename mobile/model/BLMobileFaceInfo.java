package com.bilibili.mobile.model;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mobile/model/BLMobileFaceInfo.class */
public class BLMobileFaceInfo {
    public BLMobile106 face106;
    public BLPoint[] extraFacePoints = null;
    public int extraFacePointsCount = 0;
    public BLPoint[] tonguePoints = null;
    public float[] tonguePointsScore = null;
    public int tonguePointsCount = 0;
    public BLPoint[] eyeballCenter = null;
    public int eyeballCenterPointsCount = 0;
    public BLPoint[] eyeballContour = null;
    public int eyeballContourPointsCount = 0;
    public float leftEyeballScore = 0.0f;
    public float rightEyeballScore = 0.0f;
    public long faceAction = 0;
    public float[] faceActionScore = null;
    public int faceActionScoreCount = 0;
    public byte[] avatarHelpInfo = null;
    public int avatarHelpInfoLength = 0;
    public float[] avatars = null;
    public float age = 0.0f;
    public float[] genderScore = null;
    public int genderScoreCount = 0;

    public float getAge() {
        return this.age;
    }

    public BLPoint[] getExtraFacePoints() {
        return this.extraFacePoints;
    }

    public int getExtraFacePointsCount() {
        return this.extraFacePointsCount;
    }

    public BLPoint[] getEyeballCenter() {
        return this.eyeballCenter;
    }

    public int getEyeballCenterPointsCount() {
        return this.eyeballCenterPointsCount;
    }

    public BLPoint[] getEyeballContour() {
        return this.eyeballContour;
    }

    public int getEyeballContourPointsCount() {
        return this.eyeballContourPointsCount;
    }

    public BLMobile106 getFace() {
        return this.face106;
    }

    public long getFaceAction() {
        return this.faceAction;
    }

    public float[] getGenderScore() {
        return this.genderScore;
    }

    public int getGenderScoreCount() {
        return this.genderScoreCount;
    }

    public void setFace(BLMobile106 bLMobile106) {
        this.face106 = bLMobile106;
    }

    public void setFaceAction(long j7) {
        this.faceAction = j7;
    }
}
