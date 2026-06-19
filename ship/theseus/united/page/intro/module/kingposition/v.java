package com.bilibili.ship.theseus.united.page.intro.module.kingposition;

import com.bilibili.playerbizcommon.IVideoLikeRouteService;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/intro/module/kingposition/v.class */
public final class v implements IVideoLikeRouteService.ActionLikeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KingPositionService f100483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f100484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f100485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.bilibili.app.comm.opus.lightpublish.page.comment.j f100486d;

    public v(KingPositionService kingPositionService, r rVar, boolean z6, com.bilibili.app.comm.opus.lightpublish.page.comment.j jVar) {
        this.f100483a = kingPositionService;
        this.f100484b = rVar;
        this.f100485c = z6;
        this.f100486d = jVar;
    }

    @Override // com.bilibili.playerbizcommon.IVideoLikeRouteService.ActionLikeCallback
    public final boolean isCancel() {
        return !CoroutineScopeKt.isActive(this.f100483a.f100371a);
    }

    @Override // com.bilibili.playerbizcommon.IVideoLikeRouteService.ActionLikeCallback
    public final void onRequestFailed(Throwable th) {
        this.f100486d.invoke(th != null ? th.getMessage() : null);
    }

    @Override // com.bilibili.playerbizcommon.IVideoLikeRouteService.ActionLikeCallback
    public final void onRequestSuccess(String str, String str2) {
        boolean z6 = this.f100485c;
        this.f100484b.invoke(Boolean.valueOf(z6), str);
        this.f100483a.f100379j.f100346x.tryEmit(Boolean.valueOf(!z6));
    }
}
