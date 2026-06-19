package com.bilibili.ship.theseus.united.di;

import androidx.fragment.app.FragmentActivity;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.di.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/di/e.class */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
public final class C6271e implements Factory<FragmentActivity> {
    public static FragmentActivity a(C6267a c6267a) {
        return (FragmentActivity) Preconditions.checkNotNullFromProvides(c6267a.f98773a);
    }
}
