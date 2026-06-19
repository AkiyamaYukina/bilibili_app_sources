package com.bilibili.tgwt.player.processor;

import Kj0.b;
import com.bilibili.bangumi.ui.page.detail.playerV2.screenstate.BangumiScreenStatePlayerHelper;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import com.bilibili.tgwt.service.ChatService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.biliplayerv2.service.IControlContainerService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/processor/c.class */
@ScopeMetadata("com.bilibili.bangumi.player.commonplayer.utils.di.BangumiScope")
@DaggerGenerated
@QualifierMetadata
public final class c implements Factory<TogetherWatchChatImageProcessor> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yW0.b f111633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yW0.a f111634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yW0.c f111635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.bilibili.tgwt.player.c f111636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yW0.b f111637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.bilibili.tgwt.player.e f111638f;

    public c(yW0.b bVar, yW0.a aVar, yW0.c cVar, com.bilibili.tgwt.player.c cVar2, yW0.b bVar2, com.bilibili.tgwt.player.e eVar) {
        this.f111633a = bVar;
        this.f111634b = aVar;
        this.f111635c = cVar;
        this.f111636d = cVar2;
        this.f111637e = bVar2;
        this.f111638f = eVar;
    }

    public final Object get() {
        return new TogetherWatchChatImageProcessor((ChatRoomManagerService) this.f111633a.get(), (ChatService) this.f111634b.get(), (CoroutineScope) this.f111635c.a, (com.bilibili.tgwt.player.b) this.f111636d.get(), (BangumiScreenStatePlayerHelper) this.f111637e.get(), (IControlContainerService) this.f111638f.get(), (BiliAccounts) b.a.f12954a.get());
    }
}
