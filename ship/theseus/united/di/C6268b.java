package com.bilibili.ship.theseus.united.di;

import android.app.Activity;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.di.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/di/b.class */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
public final class C6268b implements Factory<Activity> {
    public static Activity a(C6267a c6267a) {
        return (Activity) Preconditions.checkNotNullFromProvides(c6267a.f98773a);
    }
}
