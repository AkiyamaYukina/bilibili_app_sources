package com.bilibili.tgwt.player.processor;

import com.bilibili.bangumi.logic.page.detail.service.BangumiPlayerContainerService;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import com.bilibili.tgwt.service.ChatService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/processor/g.class */
@ScopeMetadata("com.bilibili.bangumi.player.commonplayer.utils.di.BangumiScope")
@DaggerGenerated
@QualifierMetadata
public final class g implements Factory<f> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yW0.b f111651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yW0.a f111652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yW0.b f111653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yW0.c f111654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.bilibili.tgwt.player.widget.i f111655e;

    public g(yW0.b bVar, yW0.a aVar, yW0.b bVar2, yW0.c cVar, com.bilibili.tgwt.player.widget.i iVar) {
        this.f111651a = bVar;
        this.f111652b = aVar;
        this.f111653c = bVar2;
        this.f111654d = cVar;
        this.f111655e = iVar;
    }

    public final Object get() {
        return new f((BangumiPlayerContainerService) this.f111651a.get(), (ChatService) this.f111652b.get(), (ChatRoomManagerService) this.f111653c.get(), (CoroutineScope) this.f111654d.a, this.f111655e);
    }
}
