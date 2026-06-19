package com.bilibili.ship.theseus.ogv.intro.download.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/W.class */
public final class W implements Function0<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f92515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0<Unit> f92516b;

    public W(a0 a0Var, Function0<Unit> function0) {
        this.f92515a = a0Var;
        this.f92516b = function0;
    }

    public final Object invoke() {
        this.f92515a.f92522b.invoke();
        this.f92516b.invoke();
        return Unit.INSTANCE;
    }
}
