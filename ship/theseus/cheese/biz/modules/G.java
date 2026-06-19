package com.bilibili.ship.theseus.cheese.biz.modules;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/G.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata
public final class G implements Factory<com.bilibili.ship.theseus.united.bean.b> {
    public static com.bilibili.ship.theseus.united.bean.b a(F f7) {
        com.bilibili.ship.theseus.united.bean.b bVar = f7.f90393a;
        com.bilibili.ship.theseus.united.bean.b bVar2 = bVar;
        if (bVar == null) {
            bVar2 = new com.bilibili.ship.theseus.united.bean.b((Long) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 4095);
        }
        return (com.bilibili.ship.theseus.united.bean.b) Preconditions.checkNotNullFromProvides(bVar2);
    }
}
