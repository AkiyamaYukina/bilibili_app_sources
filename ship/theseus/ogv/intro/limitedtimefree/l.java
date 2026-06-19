package com.bilibili.ship.theseus.ogv.intro.limitedtimefree;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import javax.inject.Inject;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/limitedtimefree/l.class */
@StabilityInferred(parameters = 0)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f93259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PageReportService f93260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.ogv.activity.c f93261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f93262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Context f93263e;

    @Inject
    public l(@NotNull CoroutineScope coroutineScope, @NotNull PageReportService pageReportService, @NotNull com.bilibili.ship.theseus.ogv.activity.c cVar, @NotNull IntroContentSizeRepository introContentSizeRepository, @NotNull Context context) {
        this.f93259a = coroutineScope;
        this.f93260b = pageReportService;
        this.f93261c = cVar;
        this.f93262d = introContentSizeRepository;
        this.f93263e = context;
    }
}
