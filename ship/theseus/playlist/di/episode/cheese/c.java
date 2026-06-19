package com.bilibili.ship.theseus.playlist.di.episode.cheese;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import eu0.C6985d;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.bili.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/episode/cheese/c.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata
public final class c implements Factory<com.bilibili.ship.theseus.cheese.di.d> {
    public static com.bilibili.ship.theseus.cheese.di.d a(final a.z0 z0Var) {
        return (com.bilibili.ship.theseus.cheese.di.d) Preconditions.checkNotNullFromProvides(new com.bilibili.ship.theseus.cheese.di.d(z0Var) { // from class: com.bilibili.ship.theseus.playlist.di.episode.cheese.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final a.z0 f95525a;

            {
                this.f95525a = z0Var;
            }

            @Override // com.bilibili.ship.theseus.cheese.di.d
            public final void a(CoroutineScope coroutineScope, C6985d c6985d) {
                a.z0 z0Var2 = this.f95525a;
                Preconditions.checkNotNull(coroutineScope);
                Preconditions.checkNotNull(c6985d);
            }
        });
    }
}
