package com.bilibili.montage.blcv;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/blcv/CvDetectMode.class */
public enum CvDetectMode {
    CV_DETECT_MODE_VIDEO(0),
    CV_DETECT_MODE_IMAGE(1);

    private final int value;

    CvDetectMode(int i7) {
        this.value = i7;
    }

    public int getValue() {
        return this.value;
    }
}
