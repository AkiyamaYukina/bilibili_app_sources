package com.bilibili.playerbizcommonv2.danmaku.widget;

import dagger.internal.DaggerGenerated;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/danmaku/widget/t.class */
@DaggerGenerated
@QualifierMetadata
public final class t implements rW0.b<PlayerDanmakuToggleWidget> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<IControlContainerService> f81696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<IInteractLayerService> f81697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider<IReporterService> f81698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Provider<IPlayerSettingService> f81699d;

    public t(Provider<IControlContainerService> provider, Provider<IInteractLayerService> provider2, Provider<IReporterService> provider3, Provider<IPlayerSettingService> provider4) {
        this.f81696a = provider;
        this.f81697b = provider2;
        this.f81698c = provider3;
        this.f81699d = provider4;
    }

    public final void injectMembers(Object obj) {
        PlayerDanmakuToggleWidget playerDanmakuToggleWidget = (PlayerDanmakuToggleWidget) obj;
        playerDanmakuToggleWidget.f81619f = (IControlContainerService) this.f81696a.get();
        playerDanmakuToggleWidget.f81620g = (IInteractLayerService) this.f81697b.get();
        playerDanmakuToggleWidget.h = (IReporterService) this.f81698c.get();
        playerDanmakuToggleWidget.f81621i = (IPlayerSettingService) this.f81699d.get();
    }
}
