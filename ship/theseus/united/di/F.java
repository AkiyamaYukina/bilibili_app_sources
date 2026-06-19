package com.bilibili.ship.theseus.united.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/di/F.class */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
public final class F implements Factory<BusinessType> {
    public static BusinessType a(E e7) {
        return (BusinessType) Preconditions.checkNotNullFromProvides(e7.f98765a);
    }
}
