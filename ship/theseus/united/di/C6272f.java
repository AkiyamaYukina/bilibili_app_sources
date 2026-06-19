package com.bilibili.ship.theseus.united.di;

import androidx.lifecycle.Lifecycle;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.di.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/di/f.class */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
public final class C6272f implements Factory<Lifecycle> {
    public static Lifecycle a(C6267a c6267a) {
        return (Lifecycle) Preconditions.checkNotNullFromProvides(c6267a.f98773a.getLifecycle());
    }
}
