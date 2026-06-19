package com.bilibili.playerbizcommonv2.widget.subtitle;

import dagger.internal.DaggerGenerated;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import tv.danmaku.biliplayerv2.service.AbsFunctionWidgetService;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.IPlayDirector;
import tv.danmaku.biliplayerv2.service.IToastService;
import tv.danmaku.biliplayerv2.service.interact.biz.IInteractLayerService;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playerbizcommonv2/widget/subtitle/J0.class */
@DaggerGenerated
@QualifierMetadata
public final class J0 implements rW0.b<SubtitleAndAiWidget> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<IControlContainerService> f83521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<IInteractLayerService> f83522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider<IReporterService> f83523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Provider<AbsFunctionWidgetService> f83524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Provider<IPlayerSettingService> f83525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Provider<IToastService> f83526f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final yW0.b f83527g;
    public final Provider<IPlayDirector> h;

    public J0(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, yW0.b bVar) {
        this.f83521a = provider;
        this.f83522b = provider2;
        this.f83523c = provider3;
        this.f83524d = provider4;
        this.f83525e = provider5;
        this.f83526f = provider6;
        this.f83527g = bVar;
        this.h = provider7;
    }

    public final void injectMembers(Object obj) {
        SubtitleAndAiWidget subtitleAndAiWidget = (SubtitleAndAiWidget) obj;
        subtitleAndAiWidget.f83587k = (IControlContainerService) this.f83521a.get();
        subtitleAndAiWidget.f83588l = (IInteractLayerService) this.f83522b.get();
        subtitleAndAiWidget.f83589m = (IReporterService) this.f83523c.get();
        subtitleAndAiWidget.f83590n = (AbsFunctionWidgetService) this.f83524d.get();
        subtitleAndAiWidget.f83591o = (IPlayerSettingService) this.f83525e.get();
        subtitleAndAiWidget.f83592p = (IToastService) this.f83526f.get();
        subtitleAndAiWidget.f83593q = (com.bilibili.playerbizcommonv2.service.ai.a) this.f83527g.get();
        subtitleAndAiWidget.f83594r = (IPlayDirector) this.h.get();
    }
}
