package com.bilibili.tgwt.player.processor;

import androidx.lifecycle.Lifecycle;
import com.bilibili.bangumi.logic.page.detail.service.BangumiPlayerContainerService;
import com.bilibili.bangumi.logic.page.detail.service.ScreenStateService;
import com.bilibili.tgwt.service.ChatService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/processor/l.class */
@ScopeMetadata("com.bilibili.bangumi.player.commonplayer.utils.di.BangumiScope")
@DaggerGenerated
@QualifierMetadata
public final class l implements Factory<k> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yW0.a f111668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yW0.b f111669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yW0.b f111670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yW0.c f111671d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.bilibili.tgwt.player.widget.g f111672e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final yW0.b f111673f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final yW0.c f111674g;

    public l(yW0.a aVar, yW0.b bVar, yW0.b bVar2, yW0.c cVar, com.bilibili.tgwt.player.widget.g gVar, yW0.b bVar3, yW0.c cVar2) {
        this.f111668a = aVar;
        this.f111669b = bVar;
        this.f111670c = bVar2;
        this.f111671d = cVar;
        this.f111672e = gVar;
        this.f111673f = bVar3;
        this.f111674g = cVar2;
    }

    public final Object get() {
        return new k((ChatService) this.f111668a.get(), (ScreenStateService) this.f111669b.get(), (BangumiPlayerContainerService) this.f111670c.get(), (Lifecycle) this.f111671d.a, this.f111672e, (com.bilibili.tgwt.player.h) this.f111673f.get(), (CoroutineScope) this.f111674g.a);
    }
}
