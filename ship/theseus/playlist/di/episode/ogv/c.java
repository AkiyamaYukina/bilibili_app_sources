package com.bilibili.ship.theseus.playlist.di.episode.ogv;

import com.bilibili.ship.theseus.ogv.InterfaceC6206j;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.bili.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/episode/ogv/c.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata
public final class c implements Factory<InterfaceC6206j> {
    public static InterfaceC6206j a(final a.J0 j02) {
        return (InterfaceC6206j) Preconditions.checkNotNullFromProvides(new InterfaceC6206j(j02) { // from class: com.bilibili.ship.theseus.playlist.di.episode.ogv.b

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final a.J0 f95539a;

            {
                this.f95539a = j02;
            }

            @Override // com.bilibili.ship.theseus.ogv.InterfaceC6206j
            public final void a(CoroutineScope coroutineScope, OgvEpisode ogvEpisode) {
                a.J0 j03 = this.f95539a;
                Preconditions.checkNotNull(coroutineScope);
                Preconditions.checkNotNull(ogvEpisode);
            }
        });
    }
}
