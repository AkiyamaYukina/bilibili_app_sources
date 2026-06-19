package com.bilibili.tgwt.chatroom;

import Kj0.b;
import com.bilibili.bangumi.logic.page.detail.service.PlayControlService;
import com.bilibili.bangumi.logic.page.detail.service.ScreenStateService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.ActivityContextParamsService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.NewSeasonService;
import com.bilibili.lib.accounts.BiliAccounts;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/chatroom/b.class */
@ScopeMetadata("com.bilibili.bangumi.player.commonplayer.utils.di.BangumiScope")
@DaggerGenerated
@QualifierMetadata
public final class b implements Factory<ChatRoomManagerService> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yW0.b f110965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yW0.b f110966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yW0.a f110967c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yW0.b f110968d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yW0.b f110969e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final yW0.c f110970f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Kl.b f110971g;

    public b(yW0.b bVar, yW0.b bVar2, yW0.a aVar, yW0.b bVar3, yW0.b bVar4, yW0.c cVar, Kl.b bVar5) {
        this.f110965a = bVar;
        this.f110966b = bVar2;
        this.f110967c = aVar;
        this.f110968d = bVar3;
        this.f110969e = bVar4;
        this.f110970f = cVar;
        this.f110971g = bVar5;
    }

    public final Object get() {
        return new ChatRoomManagerService((ActivityContextParamsService) this.f110965a.get(), (ScreenStateService) this.f110966b.get(), (PlayControlService) this.f110967c.get(), (NewSeasonService) this.f110968d.get(), (Hl.a) this.f110969e.get(), (CoroutineScope) this.f110970f.a, (BiliAccounts) b.a.f12954a.get(), (Kl.a) this.f110971g.get());
    }
}
