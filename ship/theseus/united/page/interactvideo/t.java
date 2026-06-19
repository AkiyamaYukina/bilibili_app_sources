package com.bilibili.ship.theseus.united.page.interactvideo;

import tv.danmaku.biliplayerv2.service.Video;
import tv.danmaku.biliplayerv2.widget.toast.PlayerToast;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/interactvideo/t.class */
public final class t implements PlayerToast.MessageClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Video.b f100006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TheseusInteractVideoService f100007b;

    public t(Video.b bVar, TheseusInteractVideoService theseusInteractVideoService) {
        this.f100006a = bVar;
        this.f100007b = theseusInteractVideoService;
    }

    public final void onActionWithCollapse(int i7, boolean z6) {
        Video.b bVar = this.f100006a;
        this.f100007b.j(new com.bilibili.app.gemini.ugc.feature.interactivevideo.j(bVar.b, bVar.c, "", 0L, 1, 0, 0), null, true);
    }

    public final void onDismiss() {
    }
}
