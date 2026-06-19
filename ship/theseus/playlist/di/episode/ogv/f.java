package com.bilibili.ship.theseus.playlist.di.episode.ogv;

import com.bilibili.ship.theseus.keel.player.j;
import com.bilibili.ship.theseus.ogv.C6152d;
import com.bilibili.ship.theseus.ogv.ep.ContinuingType;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import com.bilibili.ship.theseus.ogv.s;
import com.bilibili.ship.theseus.united.di.o;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.bili.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/episode/ogv/f.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata
public final class f implements Factory<s> {
    public static s a(final a.L0 l02) {
        return (s) Preconditions.checkNotNullFromProvides(new s(l02) { // from class: com.bilibili.ship.theseus.playlist.di.episode.ogv.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final a.L0 f95541a;

            {
                this.f95541a = l02;
            }

            @Override // com.bilibili.ship.theseus.ogv.s
            public final C6152d a(CoroutineScope coroutineScope, o oVar, OgvEpisode ogvEpisode, ContinuingType continuingType, j jVar) {
                ContinuingType continuingType2 = ContinuingType.NotContinuing;
                a.L0 l03 = this.f95541a;
                Preconditions.checkNotNull(coroutineScope);
                Preconditions.checkNotNull(oVar);
                Preconditions.checkNotNull(ogvEpisode);
                Preconditions.checkNotNull(continuingType2);
                Preconditions.checkNotNull(jVar);
                return ((d) new a.M0(l03.a, l03.b, l03.c, l03.d, coroutineScope, oVar, ogvEpisode, jVar).b0.get()).f95540a;
            }
        });
    }
}
