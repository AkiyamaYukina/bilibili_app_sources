package com.bilibili.ship.theseus.cheese.biz.modules;

import com.bapis.bilibili.app.viewunite.pugvanymodel.SeasonOverview;
import com.bapis.bilibili.app.viewunite.pugvanymodel.ViewPugvAny;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import eu0.C6987f;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/X.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata
public final class X implements Factory<C6987f> {
    public static C6987f a(@Nullable ViewPugvAny viewPugvAny) {
        C6987f c6987f;
        SeasonOverview seasonOverview;
        if (viewPugvAny == null || (seasonOverview = viewPugvAny.getSeasonOverview()) == null) {
            c6987f = new C6987f("", 0L, 0, false, 0);
        } else {
            c6987f = new C6987f(seasonOverview.getCover(), seasonOverview.getSeasonId(), seasonOverview.getStatusValue(), seasonOverview.getSupportCash(), seasonOverview.getTypeValue());
        }
        return (C6987f) Preconditions.checkNotNullFromProvides(c6987f);
    }
}
