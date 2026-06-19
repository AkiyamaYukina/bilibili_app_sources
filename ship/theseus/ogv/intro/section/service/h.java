package com.bilibili.ship.theseus.ogv.intro.section.service;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.ogv.intro.section.floatlayer.OgvSectionFloatLayerService;
import com.bilibili.ship.theseus.ogv.season.OgvSeason;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/section/service/h.class */
@StabilityInferred(parameters = 0)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final OgvSectionFloatLayerService f93795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Gu0.a f93796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final OgvSeason f93797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PageReportService f93798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f93799e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Context f93800f;

    @Inject
    public h(@NotNull OgvSectionFloatLayerService ogvSectionFloatLayerService, @NotNull Gu0.a aVar, @NotNull OgvSeason ogvSeason, @NotNull PageReportService pageReportService, @NotNull IntroContentSizeRepository introContentSizeRepository, @NotNull Context context) {
        this.f93795a = ogvSectionFloatLayerService;
        this.f93796b = aVar;
        this.f93797c = ogvSeason;
        this.f93798d = pageReportService;
        this.f93799e = introContentSizeRepository;
        this.f93800f = context;
    }
}
