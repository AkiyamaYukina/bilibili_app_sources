package com.bilibili.ship.theseus.united.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/di/H.class */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"com.bilibili.ship.theseus.united.di.ViewSessionId"})
public final class H implements Factory<String> {
    public static String a(E e7) {
        return (String) Preconditions.checkNotNullFromProvides(e7.f98767c);
    }
}
