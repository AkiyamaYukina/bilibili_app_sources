package com.bilibili.ship.theseus.united.page.intro.module.kingposition;

import com.bilibili.playerbizcommon.IVideoLikeRouteService;
import com.bilibili.ship.theseus.united.page.intro.module.kingposition.B;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/F.class */
public final class F implements IVideoLikeRouteService.ActionLikeNologinCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final B.a f100220a;

    public F(B.a aVar) {
        this.f100220a = aVar;
    }

    @Override // com.bilibili.playerbizcommon.IVideoLikeRouteService.ActionLikeNologinCallback
    public final boolean isCancel() {
        return this.f100220a.f100206a.isCancel();
    }

    @Override // com.bilibili.playerbizcommon.IVideoLikeRouteService.ActionLikeNologinCallback
    public final void onRequestFailed(Throwable th) {
        this.f100220a.a(th);
    }

    @Override // com.bilibili.playerbizcommon.IVideoLikeRouteService.ActionLikeNologinCallback
    public final void onRequestSuccess(String str, int i7, String str2) {
        IVideoLikeRouteService.ActionLikeNologinCallback.onRequestSuccess$default(this.f100220a.f100206a, str, i7, null, 4, null);
    }

    @Override // com.bilibili.playerbizcommon.IVideoLikeRouteService.ActionLikeNologinCallback
    public final void onResponseIllegal() {
        this.f100220a.f100206a.onResponseIllegal();
    }
}
