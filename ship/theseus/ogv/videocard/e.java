package com.bilibili.ship.theseus.ogv.videocard;

import tv.danmaku.biliplayerv2.service.FunctionWidgetToken;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videocard/e.class */
public final class e implements FunctionWidgetToken.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OgvVideoCardService f94715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.bilibili.ship.theseus.ogv.bugle.a f94716b;

    public e(OgvVideoCardService ogvVideoCardService, com.bilibili.ship.theseus.ogv.bugle.a aVar) {
        this.f94715a = ogvVideoCardService;
        this.f94716b = aVar;
    }

    public final void onDismiss() {
        OgvVideoCardService ogvVideoCardService = this.f94715a;
        if (((com.bilibili.ship.theseus.ogv.bugle.a) ogvVideoCardService.f94653x.getValue()) == this.f94716b) {
            ogvVideoCardService.f94653x.setValue((Object) null);
        }
    }
}
