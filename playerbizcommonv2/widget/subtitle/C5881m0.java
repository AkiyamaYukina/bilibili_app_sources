package com.bilibili.playerbizcommonv2.widget.subtitle;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.subtitle.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/m0.class */
public final class C5881m0 implements Function0<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f83737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function2<String, Boolean, Unit> f83738b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5887t f83739c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f83740d;

    /* JADX WARN: Multi-variable type inference failed */
    public C5881m0(boolean z6, Function2<? super String, ? super Boolean, Unit> function2, C5887t c5887t, String str) {
        this.f83737a = z6;
        this.f83738b = function2;
        this.f83739c = c5887t;
        this.f83740d = str;
    }

    public final Object invoke() {
        if (!this.f83737a) {
            String str = this.f83739c.f83777a;
            this.f83738b.invoke(str, Boolean.valueOf(Intrinsics.areEqual(str, this.f83740d)));
        }
        return Unit.INSTANCE;
    }
}
