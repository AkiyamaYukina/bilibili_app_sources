package com.bilibili.studio.videoeditor.util;

import androidx.annotation.Keep;
import androidx.window.core.layout.WindowSizeClass;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/videoeditor/util/ResolutionType.class */
@Keep
public enum ResolutionType {
    RES_480("480P", WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND),
    RES_720("720P", 720),
    RES_1080("1080P", 1080),
    RES_2160("2160P", 2160),
    RES_360("360P", 360);

    final String desc;
    final int size;

    ResolutionType(String str, int i7) {
        this.desc = str;
        this.size = i7;
    }

    public static ResolutionType match(int i7) {
        for (ResolutionType resolutionType : values()) {
            if (i7 == resolutionType.size) {
                return resolutionType;
            }
        }
        return RES_1080;
    }

    public static ResolutionType valueOf(int i7) {
        if (i7 < 0 || i7 >= values().length) {
            throw new IndexOutOfBoundsException("Invalid ordinal");
        }
        return values()[i7];
    }

    public String getDesc() {
        return this.desc;
    }

    public int getSize() {
        return this.size;
    }
}
