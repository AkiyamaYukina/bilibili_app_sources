package com.bilibili.ship.theseus.detail.di;

import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.foundation.FoundationAlias;
import com.bilibili.moduleservice.main.MainCommonService;
import com.bilibili.ship.theseus.united.page.AutoPlayService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/detail/di/B.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.PageScope")
@DaggerGenerated
@QualifierMetadata
public final class B implements Factory<AutoPlayService.a> {
    public static AutoPlayService.a a() {
        MainCommonService mainCommonService = (MainCommonService) BLRouter.INSTANCE.get(MainCommonService.class, "default");
        return (AutoPlayService.a) Preconditions.checkNotNullFromProvides(mainCommonService == null ? new AutoPlayService.a(true) : new AutoPlayService.a(mainCommonService.isBangumiAutoPlay(FoundationAlias.getFapp())));
    }
}
