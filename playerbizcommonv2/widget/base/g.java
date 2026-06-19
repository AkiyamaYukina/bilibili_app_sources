package com.bilibili.playerbizcommonv2.widget.base;

import dagger.internal.DaggerGenerated;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.report.IReporterService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/base/g.class */
@DaggerGenerated
@QualifierMetadata
public final class g implements rW0.b<PlayerPlayPauseWidget> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yW0.b f82395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<IReporterService> f82396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider<IControlContainerService> f82397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yW0.b f82398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yW0.b f82399e;

    public g(yW0.b bVar, Provider provider, Provider provider2, yW0.b bVar2, yW0.b bVar3) {
        this.f82395a = bVar;
        this.f82396b = provider;
        this.f82397c = provider2;
        this.f82398d = bVar2;
        this.f82399e = bVar3;
    }

    public final void injectMembers(Object obj) {
        PlayerPlayPauseWidget playerPlayPauseWidget = (PlayerPlayPauseWidget) obj;
        playerPlayPauseWidget.f82361e = (ei1.d) this.f82395a.get();
        playerPlayPauseWidget.f82362f = (IReporterService) this.f82396b.get();
        playerPlayPauseWidget.f82363g = (IControlContainerService) this.f82397c.get();
        playerPlayPauseWidget.h = (tv.danmaku.biliplayerv2.service.report.statistics.a) this.f82398d.get();
        playerPlayPauseWidget.f82364i = (Er0.a) this.f82399e.get();
    }
}
