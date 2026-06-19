package com.bilibili.ship.theseus.ogv;

import com.bilibili.ship.theseus.ogv.ep.ContinuingType;
import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.bili.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/r.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata
public final class r implements Factory<s> {
    public static s a(final a.m0 m0Var) {
        return (s) Preconditions.checkNotNullFromProvides(new s(m0Var) { // from class: com.bilibili.ship.theseus.ogv.q

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final a.m0 f94383a;

            {
                this.f94383a = m0Var;
            }

            @Override // com.bilibili.ship.theseus.ogv.s
            public final C6152d a(CoroutineScope coroutineScope, com.bilibili.ship.theseus.united.di.o oVar, OgvEpisode ogvEpisode, ContinuingType continuingType, com.bilibili.ship.theseus.keel.player.j jVar) {
                a.m0 m0Var2 = this.f94383a;
                Preconditions.checkNotNull(coroutineScope);
                Preconditions.checkNotNull(oVar);
                Preconditions.checkNotNull(ogvEpisode);
                Preconditions.checkNotNull(continuingType);
                Preconditions.checkNotNull(jVar);
                a.n0 n0Var = new a.n0(m0Var2.a, m0Var2.b, m0Var2.c, coroutineScope, oVar, ogvEpisode, jVar);
                C6152d c6152d = (C6152d) n0Var.X.get();
                return c6152d;
            }
        });
    }
}
