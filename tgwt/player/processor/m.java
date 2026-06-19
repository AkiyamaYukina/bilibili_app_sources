package com.bilibili.tgwt.player.processor;

import Kj0.b;
import android.content.Context;
import com.bilibili.bangumi.logic.page.detail.service.BangumiPlayerContainerService;
import com.bilibili.bangumi.logic.page.detail.service.ScreenStateService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.NewSeasonService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.PlayLimitedLayerService;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import com.bilibili.tgwt.service.ChatService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/processor/m.class */
@ScopeMetadata("com.bilibili.bangumi.player.commonplayer.utils.di.BangumiScope")
@DaggerGenerated
@QualifierMetadata
public final class m implements Factory<TogetherWatchEndPageProcessor> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yW0.c f111675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yW0.b f111676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yW0.b f111677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yW0.a f111678d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yW0.b f111679e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final yW0.b f111680f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final yW0.b f111681g;
    public final yW0.c h;

    public m(yW0.c cVar, yW0.b bVar, yW0.b bVar2, yW0.a aVar, yW0.b bVar3, yW0.b bVar4, yW0.b bVar5, yW0.c cVar2) {
        this.f111675a = cVar;
        this.f111676b = bVar;
        this.f111677c = bVar2;
        this.f111678d = aVar;
        this.f111679e = bVar3;
        this.f111680f = bVar4;
        this.f111681g = bVar5;
        this.h = cVar2;
    }

    public final Object get() {
        return new TogetherWatchEndPageProcessor((Context) this.f111675a.a, (ChatRoomManagerService) this.f111676b.get(), (NewSeasonService) this.f111677c.get(), (ChatService) this.f111678d.get(), (ScreenStateService) this.f111679e.get(), (BangumiPlayerContainerService) this.f111680f.get(), (PlayLimitedLayerService) this.f111681g.get(), (CoroutineScope) this.h.a, (BiliAccounts) b.a.f12954a.get());
    }
}
