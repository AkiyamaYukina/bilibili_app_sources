package com.bilibili.ship.theseus.cheese.biz.intro.selection;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.ship.theseus.cheese.biz.catalog.CheeseCatalogRepository;
import com.bilibili.ship.theseus.cheese.player.play.CheesePlayRepository;
import com.bilibili.ship.theseus.keel.player.h;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.tab.u;
import eu0.C6985d;
import java.util.HashSet;
import java.util.List;
import javax.inject.Inject;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/selection/e.class */
@StabilityInferred(parameters = 0)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f90071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final u f90072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final CheesePlayRepository f90073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PageReportService f90074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Context f90075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final h f90076f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final CheeseCatalogRepository f90077g;

    @NotNull
    public final com.bilibili.ship.theseus.cheese.biz.intro.series.c h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f90078i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final List<C6985d> f90079j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final HashSet<Integer> f90080k = new HashSet<>();

    @Inject
    public e(@NotNull CoroutineScope coroutineScope, @NotNull u uVar, @NotNull CheesePlayRepository cheesePlayRepository, @NotNull PageReportService pageReportService, @NotNull Context context, @NotNull h hVar, @NotNull CheeseCatalogRepository cheeseCatalogRepository, @NotNull com.bilibili.ship.theseus.cheese.biz.intro.series.c cVar, @NotNull IntroContentSizeRepository introContentSizeRepository, @NotNull List<C6985d> list) {
        this.f90071a = coroutineScope;
        this.f90072b = uVar;
        this.f90073c = cheesePlayRepository;
        this.f90074d = pageReportService;
        this.f90075e = context;
        this.f90076f = hVar;
        this.f90077g = cheeseCatalogRepository;
        this.h = cVar;
        this.f90078i = introContentSizeRepository;
        this.f90079j = list;
    }
}
