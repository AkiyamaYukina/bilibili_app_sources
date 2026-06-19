package com.bilibili.ship.theseus.ogv.heavyviewdelay;

import com.bilibili.ship.theseus.united.page.tab.TheseusTabPagerService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/heavyviewdelay/b.class */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata({"com.bilibili.ship.theseus.united.page.tab.RawTabPagerServiceViews"})
public final class b implements Factory<Flow<TheseusTabPagerService.c>> {
    public static Flow<TheseusTabPagerService.c> a(Flow<TheseusTabPagerService.c> flow, a aVar) {
        return (Flow) Preconditions.checkNotNullFromProvides(FlowKt.transformLatest(flow, new OgvHeavyViewsDelayedModule$provideTabPagerServiceViews$1(aVar.f92197c, null)));
    }
}
