package com.bilibili.tgwt.watermark;

import Kj0.b;
import androidx.lifecycle.Lifecycle;
import com.bilibili.bangumi.logic.page.detail.service.BangumiPlayerContainerService;
import com.bilibili.bangumi.logic.page.detail.service.PlayControlService;
import com.bilibili.lib.accounts.BiliAccounts;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/watermark/c.class */
@ScopeMetadata("com.bilibili.bangumi.player.commonplayer.utils.di.BangumiScope")
@DaggerGenerated
@QualifierMetadata
public final class c implements Factory<b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yW0.b f112315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yW0.a f112316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yW0.c f112317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f112318d;

    public c(yW0.b bVar, yW0.a aVar, yW0.c cVar, a aVar2) {
        this.f112315a = bVar;
        this.f112316b = aVar;
        this.f112317c = cVar;
        this.f112318d = aVar2;
    }

    public final Object get() {
        return new b((BangumiPlayerContainerService) this.f112315a.get(), (PlayControlService) this.f112316b.get(), (Lifecycle) this.f112317c.a, this.f112318d, (BiliAccounts) b.a.f12954a.get());
    }
}
