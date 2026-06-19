package com.bilibili.ship.theseus.playlist.di.page;

import androidx.lifecycle.LifecycleOwnerKt;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.page.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/page/g.class */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"com.bilibili.ship.theseus.united.di.PageCoroutineScope"})
public final class C6224g implements Factory<CoroutineScope> {
    public static CoroutineScope a(C6218a c6218a) {
        return (CoroutineScope) Preconditions.checkNotNullFromProvides(LifecycleOwnerKt.getLifecycleScope(c6218a.f95703a));
    }
}
