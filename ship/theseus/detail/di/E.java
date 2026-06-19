package com.bilibili.ship.theseus.detail.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import mv0.C8043a;
import mv0.C8044b;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/di/E.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.PageScope")
@DaggerGenerated
@QualifierMetadata
public final class E implements Factory<C8043a.C1329a> {
    public static C8043a.C1329a a(x xVar) {
        return (C8043a.C1329a) Preconditions.checkNotNullFromProvides(new C8043a.C1329a(new C8044b(xVar.f91044g, 0, "united.player-video-detail.0.0", xVar.h, xVar.f91046j, xVar.f91045i, xVar.f91050n)));
    }
}
