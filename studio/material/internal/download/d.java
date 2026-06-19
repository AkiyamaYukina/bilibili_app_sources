package com.bilibili.studio.material.internal.download;

import com.bilibili.base.BiliContext;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/internal/download/d.class */
public final class d implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f108552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f108553b;

    public d(f fVar, String str) {
        this.f108552a = fVar;
        this.f108553b = str;
    }

    public final Object invoke(Object obj) {
        ((c) this.f108552a.f108557a.getValue()).b(BiliContext.application(), this.f108553b);
        return Unit.INSTANCE;
    }
}
