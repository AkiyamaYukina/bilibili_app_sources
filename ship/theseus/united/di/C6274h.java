package com.bilibili.ship.theseus.united.di;

import androidx.fragment.app.FragmentManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.di.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/di/h.class */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
public final class C6274h implements Factory<FragmentManager> {
    public static FragmentManager a(C6267a c6267a) {
        return (FragmentManager) Preconditions.checkNotNullFromProvides(c6267a.f98773a.getSupportFragmentManager());
    }
}
