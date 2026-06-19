package com.bilibili.tgwt.player.processor;

import android.content.Context;
import com.bilibili.bangumi.logic.page.detail.service.ScreenStateService;
import com.bilibili.bangumi.logic.page.detail.service.refactor.ActivityContextParamsService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import kntr.base.android.legacy.context.ContextUtilKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/processor/b.class */
@ScopeMetadata("com.bilibili.bangumi.player.commonplayer.utils.di.BangumiScope")
@DaggerGenerated
@QualifierMetadata
public final class b implements Factory<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yW0.b f111630a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yW0.b f111631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yW0.c f111632c;

    public b(yW0.b bVar, yW0.b bVar2, yW0.c cVar) {
        this.f111630a = bVar;
        this.f111631b = bVar2;
        this.f111632c = cVar;
    }

    public final Object get() {
        ScreenStateService screenStateService = (ScreenStateService) this.f111630a.get();
        ActivityContextParamsService activityContextParamsService = (ActivityContextParamsService) this.f111631b.get();
        Context context = (Context) this.f111632c.a;
        Object obj = new Object();
        if (activityContextParamsService.getImmutable().getAutoIsFullScreen() && activityContextParamsService.isChatRoom() && !ContextUtilKt.requireActivity(context).isInMultiWindowMode()) {
            screenStateService.getScreenStateHelper().g();
        }
        return obj;
    }
}
