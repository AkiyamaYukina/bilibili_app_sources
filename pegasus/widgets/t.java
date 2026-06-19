package com.bilibili.pegasus.widgets;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/widgets/t.class */
public final class t implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f7) {
        float f8;
        double d7 = f7;
        if (0.0d <= d7 && d7 <= 0.1d) {
            f8 = f7 * 10;
        } else if (0.1d <= d7 && d7 <= 0.5d) {
            f8 = 1.0f;
        } else if (0.5d > d7 || d7 > 0.6d) {
            if (0.6d <= d7) {
            }
            f8 = 0.0f;
        } else {
            f8 = (float) ((0.6d - d7) * ((double) 10));
        }
        return f8;
    }
}
