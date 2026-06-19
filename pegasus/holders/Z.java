package com.bilibili.pegasus.holders;

import android.graphics.Rect;
import kotlin.jvm.functions.Function5;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/Z.class */
public final /* synthetic */ class Z implements Function5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f77652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f77653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f77654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f77655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f77656e;

    public /* synthetic */ Z(boolean z6, int i7, Rect rect, int i8, int i9) {
        this.f77652a = z6;
        this.f77653b = i7;
        this.f77654c = rect;
        this.f77655d = i8;
        this.f77656e = i9;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Rect rect = this.f77654c;
        int iIntValue = ((Integer) obj).intValue();
        ((Integer) obj2).intValue();
        int iIntValue2 = ((Integer) obj3).intValue();
        ((Integer) obj4).intValue();
        ((Integer) obj5).intValue();
        return Integer.valueOf(this.f77652a ? (iIntValue2 - iIntValue) + this.f77653b : (rect.height() - this.f77655d) - this.f77656e);
    }
}
