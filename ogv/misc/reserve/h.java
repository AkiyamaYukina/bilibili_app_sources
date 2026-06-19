package com.bilibili.ogv.misc.reserve;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/misc/reserve/h.class */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReserveListActivity f69191a;

    public h(ReserveListActivity reserveListActivity) {
        this.f69191a = reserveListActivity;
    }

    public final void a(int i7, boolean z6) {
        c cVar;
        ReserveListActivity reserveListActivity = this.f69191a;
        if (!reserveListActivity.f69176N || (cVar = reserveListActivity.f69171I) == null || cVar == null) {
            return;
        }
        cVar.c(i7, z6);
    }
}
