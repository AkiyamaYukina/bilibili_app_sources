package com.bilibili.pegasus.holders;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearSmoothScroller;
import kotlin.jvm.functions.Function5;

/* JADX INFO: renamed from: com.bilibili.pegasus.holders.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/d0.class */
public final class C5653d0 extends LinearSmoothScroller {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f77853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function5<Integer, Integer, Integer, Integer, Integer, Integer> f77854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f77855c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5653d0(Context context, boolean z6, Function5<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Integer> function5, float f7) {
        super(context);
        this.f77853a = z6;
        this.f77854b = function5;
        this.f77855c = f7;
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public final int calculateDtToFit(int i7, int i8, int i9, int i10, int i11) {
        return ((Number) this.f77854b.invoke(Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11))).intValue();
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
        return this.f77855c / displayMetrics.densityDpi;
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public final int getVerticalSnapPreference() {
        return this.f77853a ? -1 : 1;
    }
}
