package com.bilibili.ship.theseus.united.page.danmaku;

import tv.danmaku.biliplayerv2.service.interact.biz.chronos.chronosrpc.remote.IRemoteHandler;
import tv.danmaku.biliplayerv2.widget.function.danmaku.filter.UserKeywordItem;
import tv.danmaku.biliplayerv2.widget.function.danmaku.filter.l;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/danmaku/o.class */
public final class o implements l.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DanmakuKeywordsService f99537a;

    public o(DanmakuKeywordsService danmakuKeywordsService) {
        this.f99537a = danmakuKeywordsService;
    }

    public final void a(boolean z6, tv.danmaku.biliplayerv2.widget.function.danmaku.filter.f<UserKeywordItem> fVar) {
    }

    public final void b() {
        IRemoteHandler remoteHandler = this.f99537a.f99413c.getRemoteHandler();
        if (remoteHandler != null) {
            remoteHandler.filtersChanged();
        }
    }
}
