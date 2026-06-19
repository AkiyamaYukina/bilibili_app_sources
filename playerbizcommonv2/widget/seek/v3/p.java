package com.bilibili.playerbizcommonv2.widget.seek.v3;

import com.bilibili.playerbizcommon.gesture.IGestureService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IPlayerCoreService;
import tv.danmaku.biliplayerv2.service.SeekService;
import tv.danmaku.biliplayerv2.service.report.IReporterService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/seek/v3/p.class */
@DaggerGenerated
@QualifierMetadata
public final class p implements rW0.b<PlayerSeekWidget3> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<IPlayerCoreService> f83059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<IControlContainerService> f83060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yW0.b f83061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yW0.b f83062d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Provider<AbsFunctionWidgetService> f83063e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Provider<IReporterService> f83064f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final yW0.b f83065g;

    public p(Provider provider, Provider provider2, yW0.b bVar, yW0.b bVar2, Provider provider3, Provider provider4, yW0.b bVar3) {
        this.f83059a = provider;
        this.f83060b = provider2;
        this.f83061c = bVar;
        this.f83062d = bVar2;
        this.f83063e = provider3;
        this.f83064f = provider4;
        this.f83065g = bVar3;
    }

    public final void injectMembers(Object obj) {
        PlayerSeekWidget3 playerSeekWidget3 = (PlayerSeekWidget3) obj;
        playerSeekWidget3.f82915D = (IPlayerCoreService) this.f83059a.get();
        playerSeekWidget3.f82916E = (IControlContainerService) this.f83060b.get();
        playerSeekWidget3.f82917F = (SeekService) this.f83061c.get();
        playerSeekWidget3.f82918G = (IGestureService) this.f83062d.get();
        playerSeekWidget3.f82919H = (AbsFunctionWidgetService) this.f83063e.get();
        playerSeekWidget3.f82920I = (IReporterService) this.f83064f.get();
        playerSeekWidget3.f82921J = (Er0.a) this.f83065g.get();
    }
}
