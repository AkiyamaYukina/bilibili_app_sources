package com.bilibili.ship.theseus.cheese.biz.modules;

import com.bapis.bilibili.app.viewunite.pugvanymodel.DanmakuControl;
import com.bapis.bilibili.app.viewunite.pugvanymodel.SeasonCustom;
import com.bapis.bilibili.app.viewunite.pugvanymodel.ViewPugvAny;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import eu0.C6994m;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/N.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata
public final class N implements Factory<C6994m> {
    public static C6994m a(@Nullable ViewPugvAny viewPugvAny) {
        SeasonCustom seasonCustom;
        DanmakuControl danmakuControl;
        return (C6994m) Preconditions.checkNotNullFromProvides((viewPugvAny == null || (seasonCustom = viewPugvAny.getSeasonCustom()) == null || (danmakuControl = seasonCustom.getDanmakuControl()) == null) ? new C6994m(false, "") : new C6994m(danmakuControl.getDisabled(), danmakuControl.getExtraContent().getDisabledReason()));
    }
}
