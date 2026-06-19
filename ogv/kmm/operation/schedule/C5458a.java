package com.bilibili.ogv.kmm.operation.schedule;

import androidx.compose.runtime.MutableIntState;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: com.bilibili.ogv.kmm.operation.schedule.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/schedule/a.class */
public final class C5458a implements Function0<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f68775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutableIntState f68776b;

    public C5458a(MutableIntState mutableIntState, int i7) {
        this.f68775a = i7;
        this.f68776b = mutableIntState;
    }

    public final Object invoke() {
        this.f68776b.setIntValue(this.f68775a);
        return Unit.INSTANCE;
    }
}
