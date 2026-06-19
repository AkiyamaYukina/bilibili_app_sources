package com.bilibili.ship.theseus.united.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/di/t.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.PageScope")
@DaggerGenerated
@QualifierMetadata
public final class t implements Factory<com.bilibili.ship.theseus.keel.player.h> {
    public static com.bilibili.ship.theseus.keel.player.h a() {
        return (com.bilibili.ship.theseus.keel.player.h) Preconditions.checkNotNullFromProvides(new com.bilibili.ship.theseus.keel.player.h(true));
    }
}
