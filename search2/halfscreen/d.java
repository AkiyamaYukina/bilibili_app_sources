package com.bilibili.search2.halfscreen;

import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/halfscreen/d.class */
public final /* synthetic */ class d implements Ns0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SearchCoreHostFragment f86563a;

    @Override // Ns0.a
    public final void a(Ns0.b bVar) {
        if (this.f86563a.f86550j.tryEmit(bVar)) {
            return;
        }
        BLog.w("SearchCoreHostFrag", "CommandSink buffer full, command dropped: " + bVar);
    }
}
