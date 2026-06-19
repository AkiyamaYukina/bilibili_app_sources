package com.bilibili.playerbizcommonv2.widget.base;

import dagger.internal.DaggerGenerated;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.IToastService;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.z;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/base/h.class */
@DaggerGenerated
@QualifierMetadata
public final class h implements rW0.b<PlayerProgressTextWidget> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<IPlayerCoreService> f82400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<IControlContainerService> f82401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yW0.b f82402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Provider<IToastService> f82403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Provider<IReporterService> f82404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final yW0.b f82405f;

    public h(Provider provider, Provider provider2, Provider provider3, Provider provider4, yW0.b bVar, yW0.b bVar2) {
        this.f82400a = provider;
        this.f82401b = provider2;
        this.f82402c = bVar;
        this.f82403d = provider3;
        this.f82404e = provider4;
        this.f82405f = bVar2;
    }

    public final void injectMembers(Object obj) {
        PlayerProgressTextWidget playerProgressTextWidget = (PlayerProgressTextWidget) obj;
        playerProgressTextWidget.f82371c = (IPlayerCoreService) this.f82400a.get();
        playerProgressTextWidget.f82372d = (IControlContainerService) this.f82401b.get();
        playerProgressTextWidget.f82373e = (z) this.f82402c.get();
        playerProgressTextWidget.f82374f = (IToastService) this.f82403d.get();
        playerProgressTextWidget.f82375g = (IReporterService) this.f82404e.get();
        playerProgressTextWidget.h = (Er0.a) this.f82405f.get();
    }
}
