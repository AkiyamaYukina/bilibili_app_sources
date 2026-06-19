package com.bilibili.playerbizcommonv2.widget.base;

import dagger.internal.DaggerGenerated;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.IActivityStateService;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/base/c.class */
@DaggerGenerated
@QualifierMetadata
public final class c implements rW0.b<PlayerLockWidget> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<AbsFunctionWidgetService> f82387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<IControlContainerService> f82388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider<IReporterService> f82389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Provider<IPlayerSettingService> f82390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Provider<IActivityStateService> f82391e;

    public c(Provider<AbsFunctionWidgetService> provider, Provider<IControlContainerService> provider2, Provider<IReporterService> provider3, Provider<IPlayerSettingService> provider4, Provider<IActivityStateService> provider5) {
        this.f82387a = provider;
        this.f82388b = provider2;
        this.f82389c = provider3;
        this.f82390d = provider4;
        this.f82391e = provider5;
    }

    public final void injectMembers(Object obj) {
        PlayerLockWidget playerLockWidget = (PlayerLockWidget) obj;
        playerLockWidget.f82352e = (AbsFunctionWidgetService) this.f82387a.get();
        playerLockWidget.f82353f = (IControlContainerService) this.f82388b.get();
        playerLockWidget.f82354g = (IReporterService) this.f82389c.get();
        playerLockWidget.h = (IPlayerSettingService) this.f82390d.get();
        playerLockWidget.f82355i = (IActivityStateService) this.f82391e.get();
    }
}
