package com.bilibili.ship.theseus.united.di;

import android.content.res.Configuration;
import com.bilibili.ogv.infra.android.app.ActivitiesKt;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: renamed from: com.bilibili.ship.theseus.united.di.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/di/i.class */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
public final class C6275i implements Factory<Flow<Configuration>> {
    public static Flow<Configuration> a(C6267a c6267a) {
        return (Flow) Preconditions.checkNotNullFromProvides(ActivitiesKt.b(c6267a.f98773a));
    }
}
