package com.bilibili.ship.theseus.united.page.intro.module.kingposition;

import com.bilibili.playerbizcommon.IVideoLikeRouteService;
import com.bilibili.ship.theseus.united.page.intro.module.kingposition.A;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/D.class */
public final class D implements IVideoLikeRouteService.ActionLikeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A.a f100215a;

    public D(A.a aVar) {
        this.f100215a = aVar;
    }

    @Override // com.bilibili.playerbizcommon.IVideoLikeRouteService.ActionLikeCallback
    public final boolean isCancel() {
        return this.f100215a.f100196a.isCancel();
    }

    @Override // com.bilibili.playerbizcommon.IVideoLikeRouteService.ActionLikeCallback
    public final void onRequestFailed(Throwable th) {
        this.f100215a.a(th);
    }

    @Override // com.bilibili.playerbizcommon.IVideoLikeRouteService.ActionLikeCallback
    public final void onRequestSuccess(String str, String str2) {
        IVideoLikeRouteService.ActionLikeCallback.onRequestSuccess$default(this.f100215a.f100196a, str, null, 2, null);
    }

    @Override // com.bilibili.playerbizcommon.IVideoLikeRouteService.ActionLikeCallback
    public final void onResponseIllegal() {
        this.f100215a.f100196a.onResponseIllegal();
    }
}
