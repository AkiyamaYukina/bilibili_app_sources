package com.bilibili.ogv.operation2;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/i.class */
public final class i implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f70839a;

    public i(d dVar) {
        this.f70839a = dVar;
    }

    public final Object invoke(Object obj) {
        this.f70839a.dismiss();
        return Unit.INSTANCE;
    }
}
