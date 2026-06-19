package com.bilibili.ship.theseus.playlist.di.episode.cheese;

import com.bilibili.ship.theseus.cheese.di.h;
import com.bilibili.ship.theseus.keel.player.j;
import com.bilibili.ship.theseus.united.di.o;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import eu0.C6985d;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.bili.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/episode/cheese/f.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata
public final class f implements Factory<h> {
    public static h a(final a.B0 b02) {
        return (h) Preconditions.checkNotNullFromProvides(new h(b02) { // from class: com.bilibili.ship.theseus.playlist.di.episode.cheese.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final a.B0 f95526a;

            {
                this.f95526a = b02;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [com.bilibili.ship.theseus.cheese.player.module.h, java.lang.Object] */
            @Override // com.bilibili.ship.theseus.cheese.di.h
            public final void a(CoroutineScope coroutineScope, o oVar, C6985d c6985d, j jVar) {
                a.B0 b03 = this.f95526a;
                Preconditions.checkNotNull(coroutineScope);
                Preconditions.checkNotNull(oVar);
                Preconditions.checkNotNull(c6985d);
                Preconditions.checkNotNull(jVar);
            }
        });
    }
}
