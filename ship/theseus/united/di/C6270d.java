package com.bilibili.ship.theseus.united.di;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.di.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/di/d.class */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
public final class C6270d implements Factory<Context> {
    public static Context a(C6267a c6267a) {
        return (Context) Preconditions.checkNotNullFromProvides(c6267a.f98773a);
    }
}
