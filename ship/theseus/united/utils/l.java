package com.bilibili.ship.theseus.united.utils;

import androidx.lifecycle.Lifecycle;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/utils/l.class */
public final class l implements Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lifecycle f104864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f104865b;

    public l(Lifecycle lifecycle, m mVar) {
        this.f104864a = lifecycle;
        this.f104865b = mVar;
    }

    public final Object invoke(Object obj) {
        this.f104864a.removeObserver(this.f104865b);
        return Unit.INSTANCE;
    }
}
