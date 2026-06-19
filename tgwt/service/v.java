package com.bilibili.tgwt.service;

import Kj0.b;
import com.bilibili.bangumi.logic.page.detail.service.BangumiPlayerContainerService;
import com.bilibili.bangumi.logic.page.detail.service.ScreenStateService;
import com.bilibili.bangumi.logic.page.detail.service.ToolbarService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.ActivityContextParamsService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.NewSeasonService;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/v.class */
@ScopeMetadata("com.bilibili.bangumi.player.commonplayer.utils.di.BangumiScope")
@DaggerGenerated
@QualifierMetadata
public final class v implements Factory<TogetherWatchToolbarService> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yW0.b f112012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yW0.b f112013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yW0.b f112014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yW0.b f112015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yW0.b f112016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final yW0.b f112017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final yW0.c f112018g;
    public final Kl.b h;

    public v(yW0.b bVar, yW0.b bVar2, yW0.b bVar3, yW0.b bVar4, yW0.b bVar5, yW0.b bVar6, yW0.c cVar, Kl.b bVar7) {
        this.f112012a = bVar;
        this.f112013b = bVar2;
        this.f112014c = bVar3;
        this.f112015d = bVar4;
        this.f112016e = bVar5;
        this.f112017f = bVar6;
        this.f112018g = cVar;
        this.h = bVar7;
    }

    public final Object get() {
        return new TogetherWatchToolbarService((ToolbarService) this.f112012a.get(), (NewSeasonService) this.f112013b.get(), (ScreenStateService) this.f112014c.get(), (ChatRoomManagerService) this.f112015d.get(), (ActivityContextParamsService) this.f112016e.get(), (BangumiPlayerContainerService) this.f112017f.get(), (CoroutineScope) this.f112018g.a, (BiliAccounts) b.a.f12954a.get(), (Kl.a) this.h.get());
    }
}
