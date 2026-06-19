package com.bilibili.ship.theseus.ugc;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.bili.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/o.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata
public final class o implements Factory<m> {
    public static m a(final a.C1 c12) {
        return (m) Preconditions.checkNotNullFromProvides(new m(c12) { // from class: com.bilibili.ship.theseus.ugc.n

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final a.C1 f97985a;

            {
                this.f97985a = c12;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [com.bilibili.ship.theseus.ugc.r, java.lang.Object] */
            /* JADX WARN: Type inference failed for: r0v11, types: [com.bilibili.ship.theseus.ugc.h, java.lang.Object] */
            @Override // com.bilibili.ship.theseus.ugc.m
            public final void a(CoroutineScope coroutineScope, com.bilibili.ship.theseus.united.di.o oVar, Av0.a aVar, com.bilibili.ship.theseus.keel.player.j jVar) {
                a.C1 c13 = this.f97985a;
                Preconditions.checkNotNull(coroutineScope);
                Preconditions.checkNotNull(oVar);
                Preconditions.checkNotNull(aVar);
                Preconditions.checkNotNull(jVar);
                ?? obj = new Object();
                ?? obj2 = new Object();
            }
        });
    }
}
