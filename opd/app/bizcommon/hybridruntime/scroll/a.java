package com.bilibili.opd.app.bizcommon.hybridruntime.scroll;

import android.view.animation.Interpolator;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/hybridruntime/scroll/a.class */
public final /* synthetic */ class a implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f7) {
        a aVar = ConsecutiveScrollerLayout.f73592B;
        float f8 = f7 - 1.0f;
        return androidx.customview.widget.b.a(f8, f8, f8, f8, f8, 1.0f);
    }
}
