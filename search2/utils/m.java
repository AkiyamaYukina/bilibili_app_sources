package com.bilibili.search2.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.graphics.ColorUtils;
import kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/utils/m.class */
@StabilityInferred(parameters = 1)
public final class m {
    @JvmStatic
    public static final int a(float f7, int i7) {
        float f8;
        float f9;
        if (f7 > 0.0f) {
            f8 = f7;
            if (f7 >= 1.0f) {
                f9 = 1.0f;
            }
            return ColorUtils.setAlphaComponent(i7, (int) (f8 * 255));
        }
        f9 = 0.0f;
        f8 = f9;
        return ColorUtils.setAlphaComponent(i7, (int) (f8 * 255));
    }
}
