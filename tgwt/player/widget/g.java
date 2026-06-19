package com.bilibili.tgwt.player.widget;

import android.content.Context;
import com.bilibili.bangumi.logic.page.detail.service.BangumiPlayerContainerService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.NewShareService;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import com.bilibili.tgwt.service.ChatService;
import com.bilibili.tgwt.service.ChatVoiceRtcService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/g.class */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
public final class g implements Factory<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yW0.c f111817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yW0.b f111818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yW0.b f111819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yW0.a f111820d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yW0.b f111821e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final yW0.b f111822f;

    public g(yW0.a aVar, yW0.b bVar, yW0.b bVar2, yW0.b bVar3, yW0.b bVar4, yW0.c cVar) {
        this.f111817a = cVar;
        this.f111818b = bVar;
        this.f111819c = bVar2;
        this.f111820d = aVar;
        this.f111821e = bVar3;
        this.f111822f = bVar4;
    }

    public final Object get() {
        return new f((Context) this.f111817a.a, (ChatRoomManagerService) this.f111818b.get(), (ChatVoiceRtcService) this.f111819c.get(), (ChatService) this.f111820d.get(), (NewShareService) this.f111821e.get(), (BangumiPlayerContainerService) this.f111822f.get());
    }
}
