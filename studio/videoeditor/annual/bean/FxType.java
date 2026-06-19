package com.bilibili.studio.videoeditor.annual.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/annual/bean/FxType.class */
@Keep
public enum FxType {
    VIDEO(0),
    IMAGE(1),
    CAPTION(2),
    VIDEO_FX(3);

    public int type;

    FxType(int i7) {
        this.type = i7;
    }

    public static boolean isMedia(int i7) {
        return VIDEO.getValue() == i7 || IMAGE.getValue() == i7;
    }

    public int getValue() {
        return this.type;
    }

    public FxType valueOf(int i7) {
        if (i7 < 0 || i7 >= values().length) {
            throw new IndexOutOfBoundsException("Invalid type");
        }
        return values()[i7];
    }
}
