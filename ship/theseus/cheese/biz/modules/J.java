package com.bilibili.ship.theseus.cheese.biz.modules;

import com.bapis.bilibili.app.viewunite.pugvanymodel.SeasonCoupon;
import com.bapis.bilibili.app.viewunite.pugvanymodel.ViewPugvAny;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import eu0.C6988g;
import eu0.C7007z;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/J.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata
public final class J implements Factory<C7007z> {
    public static C7007z a(@Nullable ViewPugvAny viewPugvAny) {
        SeasonCoupon seasonCoupon;
        return (C7007z) Preconditions.checkNotNullFromProvides((viewPugvAny == null || (seasonCoupon = viewPugvAny.getSeasonCoupon()) == null) ? C6988g.a() : new C7007z(seasonCoupon.getToken(), seasonCoupon.getTitle(), seasonCoupon.getStartTime(), seasonCoupon.getExpireTime(), seasonCoupon.getAmount(), seasonCoupon.getShowAmount(), seasonCoupon.getStatusValue(), seasonCoupon.getCouponTypeValue(), seasonCoupon.getShortTitle(), seasonCoupon.getExpireMinute(), seasonCoupon.getUseScope(), seasonCoupon.getDiscountAmount(), seasonCoupon.getReceiveExpireTime(), seasonCoupon.getUseExpireTime(), seasonCoupon.getSceneMark(), seasonCoupon.getSceneBackgroundImg(), seasonCoupon.getSceneBenefitImg(), seasonCoupon.getSceneCountdown(), seasonCoupon.getIsFrequenter()));
    }
}
