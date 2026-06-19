package com.bilibili.tgwt.service;

import tv.danmaku.biliplayerv2.service.K;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/l.class */
public final class l implements K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChatService f111973a;

    public l(ChatService chatService) {
        this.f111973a = chatService;
    }

    public final void o(float f7) {
        this.f111973a.f111852A.setValue(Float.valueOf(f7));
    }
}
