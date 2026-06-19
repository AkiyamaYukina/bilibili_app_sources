package com.bilibili.tgwt.service;

import Kj0.b;
import android.content.Context;
import androidx.activity.OnBackPressedDispatcher;
import androidx.lifecycle.Lifecycle;
import com.bilibili.bangumi.logic.page.detail.service.BangumiPlayerContainerService;
import com.bilibili.bangumi.logic.page.detail.service.PlayControlService;
import com.bilibili.bangumi.logic.page.detail.service.PlayHistoryService;
import com.bilibili.bangumi.logic.page.detail.service.ScreenStateService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.ActivityContextParamsService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.BangumiDanmakuService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.BangumiPopFragmentService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.LegacyPagePopService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.NewSeasonService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.NewSectionService;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.tgwt.chatroom.ChatRoomManagerService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/n.class */
@ScopeMetadata("com.bilibili.bangumi.player.commonplayer.utils.di.BangumiScope")
@DaggerGenerated
@QualifierMetadata
public final class n implements Factory<ChatService> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yW0.c f111974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yW0.b f111975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yW0.b f111976c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yW0.b f111977d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yW0.b f111978e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final yW0.a f111979f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final yW0.b f111980g;
    public final yW0.b h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final yW0.b f111981i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final yW0.b f111982j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final yW0.b f111983k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final yW0.b f111984l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final yW0.b f111985m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final yW0.c f111986n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final yW0.b f111987o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final yW0.c f111988p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.bilibili.tgwt.im.ui.i f111989q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Kl.b f111990r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final yW0.c f111991s;

    public n(yW0.c cVar, yW0.b bVar, yW0.b bVar2, yW0.b bVar3, yW0.b bVar4, yW0.a aVar, yW0.b bVar5, yW0.b bVar6, yW0.b bVar7, yW0.b bVar8, yW0.b bVar9, yW0.b bVar10, yW0.b bVar11, yW0.c cVar2, yW0.b bVar12, yW0.c cVar3, com.bilibili.tgwt.im.ui.i iVar, Kl.b bVar13, yW0.c cVar4) {
        this.f111974a = cVar;
        this.f111975b = bVar;
        this.f111976c = bVar2;
        this.f111977d = bVar3;
        this.f111978e = bVar4;
        this.f111979f = aVar;
        this.f111980g = bVar5;
        this.h = bVar6;
        this.f111981i = bVar7;
        this.f111982j = bVar8;
        this.f111983k = bVar9;
        this.f111984l = bVar10;
        this.f111985m = bVar11;
        this.f111986n = cVar2;
        this.f111987o = bVar12;
        this.f111988p = cVar3;
        this.f111989q = iVar;
        this.f111990r = bVar13;
        this.f111991s = cVar4;
    }

    public final Object get() {
        return new ChatService((Context) this.f111974a.a, (LegacyPagePopService) this.f111975b.get(), (NewSeasonService) this.f111976c.get(), (BangumiPopFragmentService) this.f111977d.get(), (ActivityContextParamsService) this.f111978e.get(), (PlayControlService) this.f111979f.get(), (ChatVoiceRtcService) this.f111980g.get(), (ChatRoomManagerService) this.h.get(), (Hl.a) this.f111981i.get(), (ScreenStateService) this.f111982j.get(), (NewSectionService) this.f111983k.get(), (PlayHistoryService) this.f111984l.get(), (BangumiDanmakuService) this.f111985m.get(), (Lifecycle) this.f111986n.a, (BangumiPlayerContainerService) this.f111987o.get(), (CoroutineScope) this.f111988p.a, this.f111989q, (BiliAccounts) b.a.f12954a.get(), (Kl.a) this.f111990r.get(), (OnBackPressedDispatcher) this.f111991s.a);
    }
}
