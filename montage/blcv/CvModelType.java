package com.bilibili.montage.blcv;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/montage/blcv/CvModelType.class */
public enum CvModelType {
    BL_MOD_FACE_VIDEO(0),
    BL_MOD_IRIS(1),
    BL_MOD_HAND(2),
    BL_MOD_SEGMENT(3),
    BL_MOD_AVATAR(4),
    BL_MOD_CAT_FACE(5),
    BL_MOD_HEAD_SEG(6),
    BL_MOD_SEGMENT_VIDEO(7),
    BL_MOD_LIP_SEG(8),
    BL_MOD_BODY(9);

    private final int mValue;

    CvModelType(int i7) {
        this.mValue = i7;
    }

    public static CvModelType valueOf(int i7) {
        for (CvModelType cvModelType : values()) {
            if (cvModelType.getValue() == i7) {
                return cvModelType;
            }
        }
        return BL_MOD_FACE_VIDEO;
    }

    public int getValue() {
        return this.mValue;
    }
}
