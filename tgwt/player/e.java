package com.bilibili.tgwt.player;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import tv.danmaku.biliplayerv2.PlayerContainer;
import tv.danmaku.biliplayerv2.service.IControlContainerService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/e.class */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
public final class e implements Factory<IControlContainerService> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yW0.b f111545a;

    public e(yW0.b bVar) {
        this.f111545a = bVar;
    }

    public final Object get() {
        return (IControlContainerService) Preconditions.checkNotNullFromProvides(((PlayerContainer) this.f111545a.get()).getControlContainerService());
    }
}
