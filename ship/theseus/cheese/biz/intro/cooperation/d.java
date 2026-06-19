package com.bilibili.ship.theseus.cheese.biz.intro.cooperation;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/cooperation/d.class */
@StabilityInferred(parameters = 0)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f89369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PageReportService f89370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f89371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f89372d;

    @Inject
    public d(@NotNull Context context, @NotNull PageReportService pageReportService, @NotNull IntroContentSizeRepository introContentSizeRepository) {
        this.f89369a = context;
        this.f89370b = pageReportService;
        this.f89371c = introContentSizeRepository;
    }
}
