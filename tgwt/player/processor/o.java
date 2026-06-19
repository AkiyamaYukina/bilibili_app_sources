package com.bilibili.tgwt.player.processor;

import Kj0.b;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.bilibili.bangumi.logic.page.detail.service.BangumiPlayerContainerService;
import com.bilibili.bangumi.logic.page.detail.service.BangumiPreloadPlayHandlerService;
import com.bilibili.bangumi.logic.page.detail.service.PlayControlService;
import com.bilibili.bangumi.logic.page.detail.service.PlayHistoryService;
import com.bilibili.bangumi.logic.page.detail.service.SeekBizService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.NewSeasonService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.NewSectionService;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import com.bilibili.tgwt.service.ChatService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/processor/o.class */
@ScopeMetadata("com.bilibili.bangumi.player.commonplayer.utils.di.BangumiScope")
@DaggerGenerated
@QualifierMetadata
public final class o implements Factory<TogetherWatchPlayProcessor> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yW0.c f111683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yW0.b f111684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yW0.b f111685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yW0.b f111686d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yW0.a f111687e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final yW0.a f111688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final yW0.b f111689g;
    public final yW0.b h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final yW0.b f111690i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final yW0.b f111691j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final yW0.b f111692k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final yW0.c f111693l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final yW0.c f111694m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Kl.b f111695n;

    public o(yW0.c cVar, yW0.b bVar, yW0.b bVar2, yW0.b bVar3, yW0.a aVar, yW0.a aVar2, yW0.b bVar4, yW0.b bVar5, yW0.b bVar6, yW0.b bVar7, yW0.b bVar8, yW0.c cVar2, yW0.c cVar3, Kl.b bVar9) {
        this.f111683a = cVar;
        this.f111684b = bVar;
        this.f111685c = bVar2;
        this.f111686d = bVar3;
        this.f111687e = aVar;
        this.f111688f = aVar2;
        this.f111689g = bVar4;
        this.h = bVar5;
        this.f111690i = bVar6;
        this.f111691j = bVar7;
        this.f111692k = bVar8;
        this.f111693l = cVar2;
        this.f111694m = cVar3;
        this.f111695n = bVar9;
    }

    public final Object get() {
        return new TogetherWatchPlayProcessor((Context) this.f111683a.a, (BangumiPlayerContainerService) this.f111684b.get(), (ChatRoomManagerService) this.f111685c.get(), (NewSeasonService) this.f111686d.get(), (PlayControlService) this.f111687e.get(), (ChatService) this.f111688f.get(), (PlayHistoryService) this.f111689g.get(), (NewSectionService) this.h.get(), (SeekBizService) this.f111690i.get(), (com.bilibili.tgwt.watermark.b) this.f111691j.get(), (BangumiPreloadPlayHandlerService) this.f111692k.get(), (Lifecycle) this.f111693l.a, (CoroutineScope) this.f111694m.a, (BiliAccounts) b.a.f12954a.get(), (Kl.a) this.f111695n.get());
    }
}
