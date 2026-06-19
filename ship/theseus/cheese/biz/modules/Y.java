package com.bilibili.ship.theseus.cheese.biz.modules;

import com.bapis.bilibili.app.viewunite.pugvanymodel.SeasonStat;
import com.bapis.bilibili.app.viewunite.pugvanymodel.ViewPugvAny;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import eu0.C6980C;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/Y.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata
public final class Y implements Factory<C6980C> {
    public static C6980C a(@Nullable ViewPugvAny viewPugvAny) {
        SeasonStat seasonStat;
        return (C6980C) Preconditions.checkNotNullFromProvides((viewPugvAny == null || (seasonStat = viewPugvAny.getSeasonStat()) == null) ? new C6980C(0) : new C6980C(seasonStat.getFav(), seasonStat.getShare()));
    }
}
