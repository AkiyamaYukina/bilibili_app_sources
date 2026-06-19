package com.bilibili.ship.theseus.united.di;

import com.bapis.bilibili.app.viewunite.v1.ViewReply;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/di/I.class */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
public final class I implements Factory<ViewReply> {
    public static ViewReply a(E e7) {
        return (ViewReply) Preconditions.checkNotNullFromProvides(e7.f98766b);
    }
}
