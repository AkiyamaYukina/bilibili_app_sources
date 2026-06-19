package com.bilibili.mobile.model;

import com.bilibili.mobile.BLHumanActionParamsType;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mobile/model/BLMobile106.class */
public class BLMobile106 {
    int ID;
    float eye_dist;
    float pitch;
    BLPoint[] points_array;
    BLRect rect;
    float roll;
    float score;
    float[] visibility_array = new float[BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_HAND_DET_SCORE_THRESHOLD];
    float yaw;

    public BLMobile106(BLRect bLRect, float f7, BLPoint[] bLPointArr, float f8, float f9, float f10, float f11, int i7) {
        this.rect = bLRect;
        this.score = f7;
        this.points_array = bLPointArr;
        this.yaw = f8;
        this.pitch = f9;
        this.roll = f10;
        this.eye_dist = f11;
        this.ID = i7;
    }

    public float getEyeDist() {
        return this.eye_dist;
    }

    public int getID() {
        return this.ID;
    }

    public float getPitch() {
        return this.pitch;
    }

    public BLPoint[] getPointsArray() {
        return this.points_array;
    }

    public BLRect getRect() {
        return this.rect;
    }

    public float getRoll() {
        return this.roll;
    }

    public float getScore() {
        return this.score;
    }

    public float[] getVisibilityArray() {
        return this.visibility_array;
    }

    public float getYaw() {
        return this.yaw;
    }

    public void setEye_dist(float f7) {
        this.eye_dist = f7;
    }

    public void setID(int i7) {
        this.ID = i7;
    }

    public void setPitch(float f7) {
        this.pitch = f7;
    }

    public void setPoints_array(BLPoint[] bLPointArr) {
        this.points_array = bLPointArr;
    }

    public void setRect(BLRect bLRect) {
        this.rect = bLRect;
    }

    public void setRoll(float f7) {
        this.roll = f7;
    }

    public void setScore(float f7) {
        this.score = f7;
    }

    public void setYaw(float f7) {
        this.yaw = f7;
    }
}
