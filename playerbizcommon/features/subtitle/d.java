package com.bilibili.playerbizcommon.features.subtitle;

import androidx.annotation.ColorInt;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/features/subtitle/d.class */
public final class d {
    @ColorInt
    public static final int a(@ColorInt int i7) {
        return (Math.min(255, Math.max(0, (int) (0.3f * ((i7 >> 24) & 255)))) << 24) + (i7 & ViewCompat.MEASURED_SIZE_MASK);
    }
}
