package com.bilibili.playerbizcommon.input.panels;

import qq0.InterfaceC8478b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/input/panels/j.class */
public final class j implements qq0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f80211a;

    public j(i iVar) {
        this.f80211a = iVar;
    }

    @Override // qq0.d
    public final void a(InterfaceC8478b interfaceC8478b) {
        m mVar = this.f80211a.f80201n;
        if (mVar != null) {
            mVar.g(interfaceC8478b);
        }
    }

    @Override // qq0.d
    public final void b(InterfaceC8478b interfaceC8478b) {
        m mVar = this.f80211a.f80201n;
        if (mVar != null) {
            mVar.e(interfaceC8478b);
        }
    }
}
