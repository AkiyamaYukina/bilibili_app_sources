package com.bilibili.ship.theseus.united.di;

import androidx.lifecycle.LifecycleOwnerKt;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.di.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/di/g.class */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"com.bilibili.ship.theseus.united.di.PageCoroutineScope"})
public final class C6273g implements Factory<CoroutineScope> {
    public static CoroutineScope a(C6267a c6267a) {
        return (CoroutineScope) Preconditions.checkNotNullFromProvides(LifecycleOwnerKt.getLifecycleScope(c6267a.f98773a));
    }
}
