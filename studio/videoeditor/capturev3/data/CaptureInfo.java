package com.bilibili.studio.videoeditor.capturev3.data;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/capturev3/data/CaptureInfo.class */
@Keep
public class CaptureInfo {
    private int nowZoomValue;
    private float nowSpeed = 1.0f;
    private int nowDeviceIndex = 1;
    private int frontCameraIndex = 0;
    private int backCameraIndex = 0;

    public int getBackCameraIndex() {
        return this.backCameraIndex;
    }

    public int getFrontCameraIndex() {
        return this.frontCameraIndex;
    }

    public int getNowDeviceIndex() {
        return this.nowDeviceIndex;
    }

    public float getNowSpeed() {
        return this.nowSpeed;
    }

    public int getNowZoomValue() {
        return this.nowZoomValue;
    }

    public void setBackCameraIndex(int i7) {
        this.backCameraIndex = i7;
    }

    public void setFrontCameraIndex(int i7) {
        this.frontCameraIndex = i7;
    }

    public void setNowDeviceIndex(int i7) {
        this.nowDeviceIndex = i7;
    }

    public void setNowSpeed(float f7) {
        this.nowSpeed = f7;
    }

    public void setNowZoomValue(int i7) {
        this.nowZoomValue = i7;
    }
}
