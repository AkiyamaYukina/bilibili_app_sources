package com.bilibili.ship.theseus.cheese.di;

import com.bilibili.ship.theseus.united.di.o;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import eu0.C6985d;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.bili.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/di/j.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata
public final class j implements Factory<h> {
    public static h a(final a.y yVar) {
        return (h) Preconditions.checkNotNullFromProvides(new h(yVar) { // from class: com.bilibili.ship.theseus.cheese.di.i

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final a.y f90466a;

            {
                this.f90466a = yVar;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [com.bilibili.ship.theseus.cheese.player.module.h, java.lang.Object] */
            @Override // com.bilibili.ship.theseus.cheese.di.h
            public final void a(CoroutineScope coroutineScope, o oVar, C6985d c6985d, com.bilibili.ship.theseus.keel.player.j jVar) {
                a.y yVar2 = this.f90466a;
                Preconditions.checkNotNull(coroutineScope);
                Preconditions.checkNotNull(oVar);
                Preconditions.checkNotNull(c6985d);
                Preconditions.checkNotNull(jVar);
                ?? obj = new Object();
            }
        });
    }
}
