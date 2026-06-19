package com.bilibili.ship.theseus.playlist.di.episode.ugc;

import com.bilibili.ship.theseus.keel.player.j;
import com.bilibili.ship.theseus.ugc.m;
import com.bilibili.ship.theseus.united.di.o;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.bili.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/episode/ugc/f.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata
public final class f implements Factory<m> {
    public static m a(final a.V0 v02) {
        return (m) Preconditions.checkNotNullFromProvides(new m(v02) { // from class: com.bilibili.ship.theseus.playlist.di.episode.ugc.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final a.V0 f95553a;

            {
                this.f95553a = v02;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [com.bilibili.ship.theseus.ugc.r, java.lang.Object] */
            @Override // com.bilibili.ship.theseus.ugc.m
            public final void a(CoroutineScope coroutineScope, o oVar, Av0.a aVar, j jVar) {
                a.V0 v03 = this.f95553a;
                Preconditions.checkNotNull(coroutineScope);
                Preconditions.checkNotNull(oVar);
                Preconditions.checkNotNull(aVar);
                Preconditions.checkNotNull(jVar);
            }
        });
    }
}
