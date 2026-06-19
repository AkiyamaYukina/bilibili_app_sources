package com.bilibili.ship.theseus.united.di;

import com.bapis.bilibili.app.viewunite.v1.ViewReply;
import com.bilibili.ship.theseus.united.page.danmaku.DanmakuInputMode;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/di/j.class */
public final /* synthetic */ class j implements com.bilibili.ship.theseus.united.page.danmaku.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewReply f98774a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.bilibili.ship.theseus.united.page.danmaku.n] */
    @Override // com.bilibili.ship.theseus.united.page.danmaku.r
    public final com.bilibili.ship.theseus.united.page.danmaku.n a(DanmakuInputMode danmakuInputMode) {
        ViewReply viewReply = this.f98774a;
        return viewReply.getViewBase().hasActivityResource() ? new k(viewReply.getViewBase().getActivityResource()) : new Object();
    }
}
