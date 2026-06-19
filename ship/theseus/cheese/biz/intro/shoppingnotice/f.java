package com.bilibili.ship.theseus.cheese.biz.intro.shoppingnotice;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/shoppingnotice/f.class */
@StabilityInferred(parameters = 0)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final PageReportService f90127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f90128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f90129c;

    @Inject
    public f(@NotNull PageReportService pageReportService, @NotNull IntroContentSizeRepository introContentSizeRepository) {
        this.f90127a = pageReportService;
        this.f90128b = introContentSizeRepository;
    }
}
