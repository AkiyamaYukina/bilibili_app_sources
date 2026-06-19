package com.bilibili.ship.theseus.playlist.di.page;

import androidx.fragment.app.FragmentManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.playlist.di.page.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/playlist/di/page/h.class */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
public final class C6225h implements Factory<FragmentManager> {
    public static FragmentManager a(C6218a c6218a) {
        return (FragmentManager) Preconditions.checkNotNullFromProvides(c6218a.f95703a.getSupportFragmentManager());
    }
}
