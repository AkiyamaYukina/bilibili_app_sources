package com.bilibili.ship.theseus.cheese.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import eu0.C6985d;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.bili.a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/di/f.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata
public final class f implements Factory<d> {
    public static d a(final a.w wVar) {
        return (d) Preconditions.checkNotNullFromProvides(new d(wVar) { // from class: com.bilibili.ship.theseus.cheese.di.e

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final a.w f90465a;

            {
                this.f90465a = wVar;
            }

            @Override // com.bilibili.ship.theseus.cheese.di.d
            public final void a(CoroutineScope coroutineScope, C6985d c6985d) {
                a.w wVar2 = this.f90465a;
                Preconditions.checkNotNull(coroutineScope);
                Preconditions.checkNotNull(c6985d);
            }
        });
    }
}
