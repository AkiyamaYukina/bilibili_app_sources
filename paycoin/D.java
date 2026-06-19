package com.bilibili.paycoin;

import dq0.d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/paycoin/D.class */
public final class D implements d.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.bilibili.playerbizcommonv2.widget.coin.c f74711a;

    public D(com.bilibili.playerbizcommonv2.widget.coin.c cVar) {
        this.f74711a = cVar;
    }

    @Override // dq0.d.a
    public final void a(String str, String str2, String str3, boolean z6, boolean z7) {
        this.f74711a.a(str, str2, null, z6, z7);
    }

    @Override // dq0.d.a
    public final boolean isCancel() {
        return this.f74711a.isCancel();
    }

    @Override // dq0.d.a
    public final void onRequestFailed(Throwable th) {
        this.f74711a.onRequestFailed(th);
    }

    @Override // dq0.d.a
    public final void onResponseIllegal() {
    }
}
