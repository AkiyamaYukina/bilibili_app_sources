package com.bilibili.playerbizcommonv2.widget.subtitle;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.bilibili.playerbizcommonv2.widget.subtitle.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/i.class */
public final class C5872i implements Function0<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function2<String, Boolean, Unit> f83720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final M0 f83721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f83722c;

    /* JADX WARN: Multi-variable type inference failed */
    public C5872i(Function2<? super String, ? super Boolean, Unit> function2, M0 m02, String str) {
        this.f83720a = function2;
        this.f83721b = m02;
        this.f83722c = str;
    }

    public final Object invoke() {
        String str = this.f83721b.f83545a;
        this.f83720a.invoke(str, Boolean.valueOf(Intrinsics.areEqual(str, this.f83722c)));
        return Unit.INSTANCE;
    }
}
