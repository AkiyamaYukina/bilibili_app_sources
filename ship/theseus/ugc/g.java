package com.bilibili.ship.theseus.ugc;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.bili.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/g.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata
public final class g implements Factory<e> {
    public static e a(final a.A1 a12) {
        return (e) Preconditions.checkNotNullFromProvides(new e(a12) { // from class: com.bilibili.ship.theseus.ugc.f

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final a.A1 f96909a;

            {
                this.f96909a = a12;
            }

            @Override // com.bilibili.ship.theseus.ugc.e
            public final void a(CoroutineScope coroutineScope, Av0.a aVar) {
                a.A1 a13 = this.f96909a;
                Preconditions.checkNotNull(coroutineScope);
                Preconditions.checkNotNull(aVar);
            }
        });
    }
}
