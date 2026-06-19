package com.bilibili.ship.theseus.detail.di;

import com.bilibili.ship.theseus.united.page.color.ActivityColorRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/di/C.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.PageScope")
@DaggerGenerated
@QualifierMetadata
public final class C implements Factory<ActivityColorRepository.c> {
    public static ActivityColorRepository.c a(x xVar) {
        return (ActivityColorRepository.c) Preconditions.checkNotNullFromProvides(new ActivityColorRepository.c(xVar.f91010B));
    }
}
