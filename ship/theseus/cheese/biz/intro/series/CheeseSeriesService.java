package com.bilibili.ship.theseus.cheese.biz.intro.series;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.ship.theseus.cheese.biz.intro.series.a;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.HashSet;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/series/CheeseSeriesService.class */
@StabilityInferred(parameters = 0)
public final class CheeseSeriesService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PageReportService f90081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final c f90082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f90083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final HashSet<Long> f90084d = new HashSet<>();

    @Inject
    public CheeseSeriesService(@NotNull PageReportService pageReportService, @NotNull c cVar, @NotNull IntroContentSizeRepository introContentSizeRepository) {
        this.f90081a = pageReportService;
        this.f90082b = cVar;
        this.f90083c = introContentSizeRepository;
    }

    @NotNull
    public final RunningUIComponent a(@NotNull d dVar) {
        a aVar = new a(new a.d(dVar, this.f90083c.f100021b));
        return new RunningUIComponent(aVar, 0, new CheeseSeriesService$createSeriesComponent$1(aVar, dVar, this, null), 2);
    }
}
