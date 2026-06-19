package com.bilibili.pegasus.holders.oversea;

import android.graphics.Rect;
import kotlin.jvm.functions.Function5;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/oversea/z.class */
public final /* synthetic */ class z implements Function5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f78070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f78071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f78072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f78073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f78074e;

    public /* synthetic */ z(boolean z6, int i7, Rect rect, int i8, int i9) {
        this.f78070a = z6;
        this.f78071b = i7;
        this.f78072c = rect;
        this.f78073d = i8;
        this.f78074e = i9;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Rect rect = this.f78072c;
        int iIntValue = ((Integer) obj).intValue();
        ((Integer) obj2).intValue();
        int iIntValue2 = ((Integer) obj3).intValue();
        ((Integer) obj4).intValue();
        ((Integer) obj5).intValue();
        return Integer.valueOf(this.f78070a ? (iIntValue2 - iIntValue) + this.f78071b : (rect.height() - this.f78073d) - this.f78074e);
    }
}
