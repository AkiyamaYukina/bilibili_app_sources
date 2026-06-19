package com.bilibili.ship.theseus.united.page.restrictionlayer;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/J.class */
public final class J implements N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G f102565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0<Unit> f102566b;

    public J(G g7, Function0<Unit> function0) {
        this.f102565a = g7;
        this.f102566b = function0;
    }

    @Override // com.bilibili.ship.theseus.united.page.restrictionlayer.N
    public final void onBackClick() {
        this.f102565a.h.c(true);
    }

    @Override // com.bilibili.ship.theseus.united.page.restrictionlayer.N
    public final void onCloseClick() {
        this.f102566b.invoke();
    }
}
