package com.bilibili.ship.theseus.ogv;

import com.bilibili.ship.theseus.ogv.intro.section.bean.OgvEpisode;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.bili.a;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/i.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata
public final class C6157i implements Factory<InterfaceC6206j> {
    public static InterfaceC6206j a(final a.k0 k0Var) {
        return (InterfaceC6206j) Preconditions.checkNotNullFromProvides(new InterfaceC6206j(k0Var) { // from class: com.bilibili.ship.theseus.ogv.h

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final a.k0 f92194a;

            {
                this.f92194a = k0Var;
            }

            @Override // com.bilibili.ship.theseus.ogv.InterfaceC6206j
            public final void a(CoroutineScope coroutineScope, OgvEpisode ogvEpisode) {
                a.k0 k0Var2 = this.f92194a;
                Preconditions.checkNotNull(coroutineScope);
                Preconditions.checkNotNull(ogvEpisode);
            }
        });
    }
}
