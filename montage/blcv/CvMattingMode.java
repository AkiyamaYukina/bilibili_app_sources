package com.bilibili.montage.blcv;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/blcv/CvMattingMode.class */
public enum CvMattingMode {
    CV_MATTING_HEAD(0),
    CV_MATTING_HUMAN(1);

    private final int value;

    CvMattingMode(int i7) {
        this.value = i7;
    }

    public static CvMattingMode valueOf(int i7) {
        for (CvMattingMode cvMattingMode : values()) {
            if (cvMattingMode.getValue() == i7) {
                return cvMattingMode;
            }
        }
        return CV_MATTING_HEAD;
    }

    public int getValue() {
        return this.value;
    }
}
