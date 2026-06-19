package com.bilibili.ship.theseus.united.player.mediaplay;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/player/mediaplay/e.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata
public final class e implements Factory<Flow<l>> {
    public static Flow<l> a(n nVar) {
        return (Flow) Preconditions.checkNotNullFromProvides(nVar.f104532b);
    }
}
