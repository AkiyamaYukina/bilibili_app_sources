package com.bilibili.ship.theseus.detail.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/di/G.class */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"com.bilibili.ship.theseus.united.page.report.PvEventId"})
public final class G implements Factory<String> {
    public static String a() {
        return (String) Preconditions.checkNotNullFromProvides("united.player-video-detail.0.0.pv");
    }
}
