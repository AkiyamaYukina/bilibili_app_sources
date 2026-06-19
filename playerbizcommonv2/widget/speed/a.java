package com.bilibili.playerbizcommonv2.widget.speed;

import dagger.internal.DaggerGenerated;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/speed/a.class */
@DaggerGenerated
@QualifierMetadata
public final class a implements rW0.b<PlayerSpeedWidget> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<IControlContainerService> f83411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<IPlayerCoreService> f83412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider<IReporterService> f83413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Provider<AbsFunctionWidgetService> f83414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Provider<IPlayerSettingService> f83415e;

    public a(Provider<IControlContainerService> provider, Provider<IPlayerCoreService> provider2, Provider<IReporterService> provider3, Provider<AbsFunctionWidgetService> provider4, Provider<IPlayerSettingService> provider5) {
        this.f83411a = provider;
        this.f83412b = provider2;
        this.f83413c = provider3;
        this.f83414d = provider4;
        this.f83415e = provider5;
    }

    public final void injectMembers(Object obj) {
        PlayerSpeedWidget playerSpeedWidget = (PlayerSpeedWidget) obj;
        playerSpeedWidget.f83400b = (IControlContainerService) this.f83411a.get();
        playerSpeedWidget.f83401c = (IPlayerCoreService) this.f83412b.get();
        playerSpeedWidget.f83402d = (IReporterService) this.f83413c.get();
        playerSpeedWidget.f83403e = (AbsFunctionWidgetService) this.f83414d.get();
        playerSpeedWidget.f83404f = (IPlayerSettingService) this.f83415e.get();
    }
}
