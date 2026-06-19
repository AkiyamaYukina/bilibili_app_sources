package com.bilibili.ship.theseus.playlist.di.page;

import androidx.lifecycle.Lifecycle;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.page.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/page/f.class */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
public final class C6223f implements Factory<Lifecycle> {
    public static Lifecycle a(C6218a c6218a) {
        return (Lifecycle) Preconditions.checkNotNullFromProvides(c6218a.f95703a.getLifecycle());
    }
}
