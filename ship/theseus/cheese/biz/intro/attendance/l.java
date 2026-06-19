package com.bilibili.ship.theseus.cheese.biz.intro.attendance;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import au0.C4911a;
import com.bilibili.lib.accounts.BiliAccounts;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import com.bilibili.ship.theseus.united.page.weblayer.WebFloatLayerService;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/attendance/l.class */
@StabilityInferred(parameters = 0)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f89322a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f89323b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final i f89324c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final PageReportService f89325d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final C4911a f89326e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final WebFloatLayerService f89327f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.g f89328g;

    @NotNull
    public final BiliAccounts h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f89329i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f89330j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f89331k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final Lazy f89332l = LazyKt.lazy((Function0) new Object());

    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
    @Inject
    public l(@NotNull FragmentActivity fragmentActivity, @NotNull CoroutineScope coroutineScope, @NotNull i iVar, @NotNull PageReportService pageReportService, @NotNull C4911a c4911a, @NotNull WebFloatLayerService webFloatLayerService, @NotNull com.bilibili.ship.theseus.united.page.playingarea.g gVar, @NotNull BiliAccounts biliAccounts, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar, @NotNull IntroContentSizeRepository introContentSizeRepository) {
        this.f89322a = fragmentActivity;
        this.f89323b = coroutineScope;
        this.f89324c = iVar;
        this.f89325d = pageReportService;
        this.f89326e = c4911a;
        this.f89327f = webFloatLayerService;
        this.f89328g = gVar;
        this.h = biliAccounts;
        this.f89329i = cVar;
        this.f89330j = aVar;
        this.f89331k = introContentSizeRepository;
    }
}
