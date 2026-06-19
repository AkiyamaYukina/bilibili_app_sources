package com.bilibili.ship.theseus.cheese.biz.intro.zone;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import au0.C4911a;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.ship.theseus.cheese.biz.intro.zone.a;
import com.bilibili.ship.theseus.cheese.biz.intro.zone.b;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/zone/CheeseZoneService.class */
@StabilityInferred(parameters = 0)
public final class CheeseZoneService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f90294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C4911a f90295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f90296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PageReportService f90297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f90298e;

    @Inject
    public CheeseZoneService(@NotNull Context context, @NotNull C4911a c4911a, @NotNull IntroContentSizeRepository introContentSizeRepository, @NotNull PageReportService pageReportService) {
        this.f90294a = context;
        this.f90295b = c4911a;
        this.f90296c = introContentSizeRepository;
        this.f90297d = pageReportService;
    }

    @NotNull
    public final RunningUIComponent a(@NotNull c cVar) {
        a aVar = new a(new a.b(cVar, this.f90296c.f100021b));
        return new RunningUIComponent(aVar, 0, new CheeseZoneService$createMulZoneComponent$1(aVar, this, null), 2);
    }

    @NotNull
    public final RunningUIComponent b(@NotNull c cVar) {
        b bVar = new b(new b.C0650b(cVar, this.f90296c.f100021b));
        return new RunningUIComponent(bVar, 0, new CheeseZoneService$createSingleZoneComponent$1(bVar, this, null), 2);
    }

    public final void c(int i7, boolean z6) {
        if (this.f90298e) {
            return;
        }
        PageReportService pageReportService = this.f90297d;
        if (z6) {
            PageReportService.i(pageReportService, "pugv.detail.partition.0.show", null, 6);
            PageReportService.i(pageReportService, "pugv.detail.kaoyan-entrance.0.show", null, 6);
        } else {
            PageReportService.i(pageReportService, i7 == 1 ? "pugv.detail.partition.0.show" : "pugv.detail.kaoyan-entrance.0.show", null, 6);
        }
        this.f90298e = true;
    }
}
