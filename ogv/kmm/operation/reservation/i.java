package com.bilibili.ogv.kmm.operation.reservation;

import androidx.compose.runtime.MutableState;
import kntr.base.router.Router;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import mk0.C8008d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/kmm/operation/reservation/i.class */
public final class i implements Function0<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f68671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Router f68672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.bilibili.ogv.kmm.operation.vippreview.a f68673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MutableState<Boolean> f68674d;

    public i(e eVar, Router router, com.bilibili.ogv.kmm.operation.vippreview.a aVar, MutableState<Boolean> mutableState) {
        this.f68671a = eVar;
        this.f68672b = router;
        this.f68673c = aVar;
        this.f68674d = mutableState;
    }

    public final Object invoke() {
        e eVar = this.f68671a;
        l lVar = eVar.f68665c;
        lVar.f68688a.a(eVar.f68666d, 2, eVar.f68663a);
        lVar.f68689b.a("pgc.cinema-tab.film-activity.notice.click", eVar.f68663a);
        C8008d.a(this.f68673c.f68915e, this.f68672b);
        this.f68674d.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }
}
