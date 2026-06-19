package com.bilibili.ship.theseus.cheese.biz.modules;

import com.bapis.bilibili.app.viewunite.pugvanymodel.PostPurchaseInfo;
import com.bapis.bilibili.app.viewunite.pugvanymodel.ViewPugvAny;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import eu0.C7003v;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/S.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata
public final class S implements Factory<C7003v> {
    public static C7003v a(@Nullable ViewPugvAny viewPugvAny) {
        PostPurchaseInfo postPurchaseInfo;
        return (C7003v) Preconditions.checkNotNullFromProvides((viewPugvAny == null || (postPurchaseInfo = viewPugvAny.getPostPurchaseInfo()) == null) ? new C7003v("", 0L) : new C7003v(postPurchaseInfo.getPopUpPic(), postPurchaseInfo.getPopUpInterval()));
    }
}
