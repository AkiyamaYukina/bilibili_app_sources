package com.bilibili.ship.theseus.united.di;

import android.app.Application;
import com.bilibili.lib.accounts.BiliAccounts;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/di/q.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.PageScope")
@DaggerGenerated
@QualifierMetadata
public final class q implements Factory<BiliAccounts> {
    public static BiliAccounts a(Application application) {
        return (BiliAccounts) Preconditions.checkNotNullFromProvides(BiliAccounts.get(application));
    }
}
