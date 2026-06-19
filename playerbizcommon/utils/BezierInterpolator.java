package com.bilibili.playerbizcommon.utils;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/utils/BezierInterpolator.class */
public class BezierInterpolator implements Interpolator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f80261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f80262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f80263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f80264d;

    public BezierInterpolator(float f7, float f8, float f9, float f10) {
        this.f80261a = f7;
        this.f80262b = f8;
        this.f80263c = f9;
        this.f80264d = f10;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f7) {
        if (this.f80261a == this.f80262b && this.f80263c == this.f80264d) {
            return f7;
        }
        float f8 = f7;
        for (int i7 = 0; i7 < 4; i7++) {
            float f9 = this.f80261a;
            float f10 = this.f80263c;
            double d7 = ((double) f10) * 3.0d;
            double d8 = f9 * 3.0d;
            double d9 = (float) ((1.0d - d7) + d8);
            double d10 = f8;
            float fA = (float) (androidx.compose.ui.graphics.vector.f.a((float) (d7 - (r0 * 6.0d)), 2.0d, d10, d9 * 3.0d * d10 * d10) + ((double) ((float) d8)));
            if (fA == 0.0d) {
                break;
            }
            double d11 = ((double) f10) * 3.0d;
            double d12 = f9;
            double d13 = 3.0d * d12;
            f8 -= (((((float) d13) + ((((float) (d11 - (d12 * 6.0d))) + (((float) ((1.0d - d11) + d13)) * f8)) * f8)) * f8) - f7) / fA;
        }
        float f11 = this.f80262b;
        double d14 = ((double) this.f80264d) * 3.0d;
        double d15 = f11;
        double d16 = 3.0d * d15;
        return (((float) d16) + ((((float) (d14 - (d15 * 6.0d))) + (((float) ((1.0d - d14) + d16)) * f8)) * f8)) * f8;
    }
}
