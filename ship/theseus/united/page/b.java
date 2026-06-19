package com.bilibili.ship.theseus.united.page;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/b.class */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AutoPlayService f98989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f98990b;

    public /* synthetic */ b(AutoPlayService autoPlayService, a aVar) {
        this.f98989a = autoPlayService;
        this.f98990b = aVar;
    }

    public final Object invoke() {
        return AutoPlayService$showCover$1.invokeSuspend$lambda$1$0$0(this.f98989a, this.f98990b);
    }
}
