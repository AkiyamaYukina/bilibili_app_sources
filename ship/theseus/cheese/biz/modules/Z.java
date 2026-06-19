package com.bilibili.ship.theseus.cheese.biz.modules;

import com.bapis.bilibili.app.viewunite.pugvanymodel.SeasonCustom;
import com.bapis.bilibili.app.viewunite.pugvanymodel.ViewPugvAny;
import com.bapis.bilibili.app.viewunite.pugvanymodel.WaterMark;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import eu0.C6981D;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/Z.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata
public final class Z implements Factory<C6981D> {
    public static C6981D a(@Nullable ViewPugvAny viewPugvAny) {
        SeasonCustom seasonCustom;
        WaterMark waterMark;
        return (C6981D) Preconditions.checkNotNullFromProvides((viewPugvAny == null || (seasonCustom = viewPugvAny.getSeasonCustom()) == null || (waterMark = seasonCustom.getWaterMark()) == null) ? new C6981D(false, 0L) : new C6981D(waterMark.getShowWatermark(), waterMark.getWatermarkInterval()));
    }
}
