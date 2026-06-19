package com.bilibili.ship.theseus.united.page.videoquality;

import com.bilibili.ship.theseus.united.page.videoquality.TheseusPlayerQualitySwitchWidget;
import com.google.common.base.Optional;
import dagger.internal.DaggerGenerated;
import dagger.internal.Provider;
import dagger.internal.QualifierMetadata;
import tv.danmaku.biliplayerv2.service.IControlContainerService;
import tv.danmaku.biliplayerv2.service.report.IReporterService;
import tv.danmaku.biliplayerv2.service.setting.IPlayerSettingService;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/videoquality/l0.class */
@DaggerGenerated
@QualifierMetadata
public final class l0 implements rW0.b<TheseusPlayerQualitySwitchWidget> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider<com.bilibili.ship.theseus.keel.player.h> f103901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider<com.bilibili.ship.theseus.united.page.screenstate.c> f103902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Provider<IControlContainerService> f103903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Provider<IReporterService> f103904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Provider<IPlayerSettingService> f103905e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Provider<O> f103906f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Provider<Optional<TheseusPlayerQualitySwitchWidget.a>> f103907g;

    public l0(Provider<com.bilibili.ship.theseus.keel.player.h> provider, Provider<com.bilibili.ship.theseus.united.page.screenstate.c> provider2, Provider<IControlContainerService> provider3, Provider<IReporterService> provider4, Provider<IPlayerSettingService> provider5, Provider<O> provider6, Provider<Optional<TheseusPlayerQualitySwitchWidget.a>> provider7) {
        this.f103901a = provider;
        this.f103902b = provider2;
        this.f103903c = provider3;
        this.f103904d = provider4;
        this.f103905e = provider5;
        this.f103906f = provider6;
        this.f103907g = provider7;
    }

    public final void injectMembers(Object obj) {
        TheseusPlayerQualitySwitchWidget theseusPlayerQualitySwitchWidget = (TheseusPlayerQualitySwitchWidget) obj;
        theseusPlayerQualitySwitchWidget.f103803f = (com.bilibili.ship.theseus.keel.player.h) this.f103901a.get();
        theseusPlayerQualitySwitchWidget.f103804g = (com.bilibili.ship.theseus.united.page.screenstate.c) this.f103902b.get();
        theseusPlayerQualitySwitchWidget.h = (IControlContainerService) this.f103903c.get();
        theseusPlayerQualitySwitchWidget.f103805i = (IReporterService) this.f103904d.get();
        theseusPlayerQualitySwitchWidget.f103806j = (IPlayerSettingService) this.f103905e.get();
        theseusPlayerQualitySwitchWidget.f103807k = (O) this.f103906f.get();
        theseusPlayerQualitySwitchWidget.f103808l = (Optional) this.f103907g.get();
    }
}
