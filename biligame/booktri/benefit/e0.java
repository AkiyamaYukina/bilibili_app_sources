package com.bilibili.biligame.booktri.benefit;

import androidx.compose.foundation.pager.PageSize;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/biligame/booktri/benefit/e0.class */
public final class e0 implements PageSize {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Density f62387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f62388b;

    public e0(Density density, float f7) {
        this.f62387a = density;
        this.f62388b = f7;
    }

    @Override // androidx.compose.foundation.pager.PageSize
    public final int calculateMainAxisPageSize(Density density, int i7, int i8) {
        return this.f62387a.mo1265roundToPx0680j_4(Dp.m3880constructorimpl(this.f62388b - Dp.m3880constructorimpl(66)));
    }
}
