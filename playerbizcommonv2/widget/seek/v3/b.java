package com.bilibili.playerbizcommonv2.widget.seek.v3;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/seek/v3/b.class */
public final /* synthetic */ class b implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f7) {
        b bVar = HeatPeakView.h;
        double dSqrt = Math.sqrt(203.5d);
        double dSqrt2 = 24.0d / (Math.sqrt(203.5d) * 2.0d);
        double dSqrt3 = Math.sqrt(1.0d - (dSqrt2 * dSqrt2)) * dSqrt;
        double d7 = ((double) f7) * 0.5d;
        double dExp = Math.exp((-dSqrt2) * dSqrt * d7);
        double d8 = d7 * dSqrt3;
        return (float) (1.0d - (((Math.sin(d8) * ((dSqrt2 * dSqrt) / dSqrt3)) + Math.cos(d8)) * dExp));
    }
}
