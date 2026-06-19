package com.bilibili.ship.theseus.playlist.di.episode.ugc;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.bili.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/episode/ugc/c.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata
public final class c implements Factory<com.bilibili.ship.theseus.ugc.e> {
    public static com.bilibili.ship.theseus.ugc.e a(final a.T0 t02) {
        return (com.bilibili.ship.theseus.ugc.e) Preconditions.checkNotNullFromProvides(new com.bilibili.ship.theseus.ugc.e(t02) { // from class: com.bilibili.ship.theseus.playlist.di.episode.ugc.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final a.T0 f95552a;

            {
                this.f95552a = t02;
            }

            @Override // com.bilibili.ship.theseus.ugc.e
            public final void a(CoroutineScope coroutineScope, Av0.a aVar) {
                a.T0 t03 = this.f95552a;
                Preconditions.checkNotNull(coroutineScope);
                Preconditions.checkNotNull(aVar);
            }
        });
    }
}
