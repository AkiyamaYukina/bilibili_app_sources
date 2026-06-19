package com.bilibili.tgwt.service;

import Kj0.b;
import android.content.Context;
import com.bilibili.bangumi.logic.page.detail.service.refactor.NewSeasonService;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/p.class */
@ScopeMetadata("com.bilibili.bangumi.player.commonplayer.utils.di.BangumiScope")
@DaggerGenerated
@QualifierMetadata
public final class p implements Factory<ChatVoiceRtcService> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yW0.b f111993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yW0.b f111994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yW0.c f111995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yW0.c f111996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Kl.b f111997e;

    public p(yW0.b bVar, yW0.b bVar2, yW0.c cVar, yW0.c cVar2, Kl.b bVar3) {
        this.f111993a = bVar;
        this.f111994b = bVar2;
        this.f111995c = cVar;
        this.f111996d = cVar2;
        this.f111997e = bVar3;
    }

    public final Object get() {
        NewSeasonService newSeasonService = (NewSeasonService) this.f111993a.get();
        ChatRoomManagerService chatRoomManagerService = (ChatRoomManagerService) this.f111994b.get();
        Context context = (Context) this.f111995c.a;
        CoroutineScope coroutineScope = (CoroutineScope) this.f111996d.a;
        b.a.f12954a.get();
        return new ChatVoiceRtcService(newSeasonService, chatRoomManagerService, context, coroutineScope, (Kl.a) this.f111997e.get());
    }
}
