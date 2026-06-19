package com.bilibili.ship.theseus.cheese.biz.modules;

import com.bapis.bilibili.app.viewunite.pugvanymodel.SeasonPayment;
import com.bapis.bilibili.app.viewunite.pugvanymodel.ViewPugvAny;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import eu0.C6978A;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/Q.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata
public final class Q implements Factory<C6978A> {
    public static C6978A a(@Nullable ViewPugvAny viewPugvAny) {
        SeasonPayment seasonPayment;
        return (C6978A) Preconditions.checkNotNullFromProvides((viewPugvAny == null || (seasonPayment = viewPugvAny.getSeasonPayment()) == null) ? new C6978A("", "", "", "", "") : new C6978A(seasonPayment.getPriceUnit(), seasonPayment.getDiscountPrice(), seasonPayment.getDiscountPriceDesc(), seasonPayment.getOriginalPrice(), seasonPayment.getOriginalPriceDesc()));
    }
}
