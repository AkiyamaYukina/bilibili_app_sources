package com.bilibili.playerbizcommonv2.widget.setting;

import dagger.internal.DaggerGenerated;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.report.IReporterService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/setting/O.class */
@DaggerGenerated
@QualifierMetadata
public final class O implements rW0.b<PlayerSettingWidget> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<IControlContainerService> f83109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<IReporterService> f83110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider<AbsFunctionWidgetService> f83111c;

    public O(Provider<IControlContainerService> provider, Provider<IReporterService> provider2, Provider<AbsFunctionWidgetService> provider3) {
        this.f83109a = provider;
        this.f83110b = provider2;
        this.f83111c = provider3;
    }

    public final void injectMembers(Object obj) {
        PlayerSettingWidget playerSettingWidget = (PlayerSettingWidget) obj;
        playerSettingWidget.f83144e = (IControlContainerService) this.f83109a.get();
        playerSettingWidget.f83145f = (IReporterService) this.f83110b.get();
        playerSettingWidget.f83146g = (AbsFunctionWidgetService) this.f83111c.get();
    }
}
