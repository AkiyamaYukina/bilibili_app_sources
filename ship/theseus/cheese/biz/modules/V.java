package com.bilibili.ship.theseus.cheese.biz.modules;

import com.bapis.bilibili.app.viewunite.pugvanymodel.SeasonAIInfo;
import com.bapis.bilibili.app.viewunite.pugvanymodel.ViewPugvAny;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import eu0.C7005x;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/modules/V.class */
@ScopeMetadata("com.bilibili.ship.theseus.united.di.DetailBizScope")
@DaggerGenerated
@QualifierMetadata
public final class V implements Factory<C7005x> {
    public static C7005x a(@Nullable ViewPugvAny viewPugvAny) {
        SeasonAIInfo aiInfo;
        return (C7005x) Preconditions.checkNotNullFromProvides((viewPugvAny == null || (aiInfo = viewPugvAny.getAiInfo()) == null) ? new C7005x(0) : new C7005x(aiInfo.getGuideTitle(), aiInfo.getGuideContent(), aiInfo.getDiagram(), aiInfo.getIsAi()));
    }
}
