package com.bilibili.ship.theseus.ogv.intro.download.ui;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/download/ui/F.class */
public final class F implements Function0<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f92466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f92467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f92468c;

    public F(n0 n0Var, d0 d0Var, int i7) {
        this.f92466a = n0Var;
        this.f92467b = d0Var;
        this.f92468c = i7;
    }

    public final Object invoke() {
        n0 n0Var = this.f92466a;
        n0Var.f92609d.invoke(this.f92467b.f92545c);
        n0Var.f92610e.setIntValue(this.f92468c);
        return Unit.INSTANCE;
    }
}
