package com.bilibili.playerbizcommon.input.panels;

import qq0.InterfaceC8478b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommon/input/panels/l.class */
public final class l implements qq0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f80213a;

    public l(i iVar) {
        this.f80213a = iVar;
    }

    @Override // qq0.d
    public final void a(InterfaceC8478b interfaceC8478b) {
        m mVar = this.f80213a.f80201n;
        if (mVar != null) {
            mVar.f(interfaceC8478b);
        }
    }

    @Override // qq0.d
    public final void b(InterfaceC8478b interfaceC8478b) {
        m mVar = this.f80213a.f80201n;
        if (mVar != null) {
            mVar.c();
        }
    }
}
