package com.bilibili.mobile.model;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mobile/model/BLAnimalFace.class */
public class BLAnimalFace {
    int id;
    int key_points_count;
    BLPoint[] p_key_points;
    float pitch;
    BLRect rect;
    float roll;
    float score;
    float yaw;

    public int getId() {
        return this.id;
    }

    public int getKey_points_count() {
        return this.key_points_count;
    }

    public BLPoint[] getP_key_points() {
        return this.p_key_points;
    }

    public float getPitch() {
        return this.pitch;
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

    public float getYaw() {
        return this.yaw;
    }

    public void setId(int i7) {
        this.id = i7;
    }

    public void setKey_points_count(int i7) {
        this.key_points_count = i7;
    }

    public void setP_key_points(BLPoint[] bLPointArr) {
        this.p_key_points = bLPointArr;
    }

    public void setPitch(float f7) {
        this.pitch = f7;
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
