package com.bilibili.ship.theseus.cheese.biz.intro.publisher;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import au0.C4911a;
import com.bilibili.ship.theseus.cheese.player.play.CheesePlayRepository;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.HashSet;
import javax.inject.Inject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/publisher/t.class */
@StabilityInferred(parameters = 0)
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final p f89892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C4911a f89893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PageReportService f89894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Context f89895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final CheesePlayRepository f89896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screensize.a f89897f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.cheese.biz.intro.series.c f89898g;

    @NotNull
    public final IntroContentSizeRepository h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f89900j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f89901k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final HashSet<Integer> f89899i = new HashSet<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final HashSet<Integer> f89902l = new HashSet<>();

    @Inject
    public t(@NotNull p pVar, @NotNull C4911a c4911a, @NotNull PageReportService pageReportService, @NotNull Context context, @NotNull CheesePlayRepository cheesePlayRepository, @NotNull com.bilibili.ship.theseus.united.page.screensize.a aVar, @NotNull com.bilibili.ship.theseus.cheese.biz.intro.series.c cVar, @NotNull IntroContentSizeRepository introContentSizeRepository) {
        this.f89892a = pVar;
        this.f89893b = c4911a;
        this.f89894c = pageReportService;
        this.f89895d = context;
        this.f89896e = cheesePlayRepository;
        this.f89897f = aVar;
        this.f89898g = cVar;
        this.h = introContentSizeRepository;
    }

    public final void a() {
        PageReportService.g(this.f89894c, "pugv.detail.sku-select.0.click", null, 6);
    }

    public final void b(int i7) {
        if (this.f89902l.add(Integer.valueOf(i7))) {
            PageReportService.i(this.f89894c, "pugv.detail.sku-select.0.show", null, 6);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(boolean r6) {
        /*
            r5 = this;
            r0 = r5
            com.bilibili.ship.theseus.cheese.biz.intro.publisher.p r0 = r0.f89892a
            r9 = r0
            r0 = r9
            kotlinx.coroutines.flow.StateFlow<com.bilibili.ship.theseus.cheese.biz.intro.publisher.B> r0 = r0.f89879b
            java.lang.Object r0 = r0.getValue()
            com.bilibili.ship.theseus.cheese.biz.intro.publisher.B r0 = (com.bilibili.ship.theseus.cheese.biz.intro.publisher.B) r0
            r10 = r0
            r0 = r10
            if (r0 == 0) goto L26
            r0 = r10
            com.bilibili.ship.theseus.cheese.biz.intro.publisher.A r0 = r0.h
            long r0 = r0.f89792b
            r7 = r0
            goto L28
        L26:
            r0 = 0
            r7 = r0
        L28:
            r0 = r5
            com.bilibili.ship.theseus.united.page.report.PageReportService r0 = r0.f89894c
            r11 = r0
            r0 = r7
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L45
            r0 = r6
            if (r0 == 0) goto L45
            r0 = r11
            java.lang.String r1 = "pugv.detail.intro.live-avatar.click"
            r2 = 0
            r3 = 6
            com.bilibili.ship.theseus.united.page.report.PageReportService.g(r0, r1, r2, r3)
            goto L82
        L45:
            r0 = r9
            kotlinx.coroutines.flow.StateFlow<com.bilibili.ship.theseus.cheese.biz.intro.publisher.B> r0 = r0.f89879b
            java.lang.Object r0 = r0.getValue()
            com.bilibili.ship.theseus.cheese.biz.intro.publisher.B r0 = (com.bilibili.ship.theseus.cheese.biz.intro.publisher.B) r0
            r9 = r0
            r0 = r9
            if (r0 == 0) goto L6c
            r0 = r9
            long r0 = r0.f89803j
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r10 = r0
            r0 = r10
            r9 = r0
            r0 = r10
            if (r0 != 0) goto L70
        L6c:
            java.lang.String r0 = ""
            r9 = r0
        L70:
            r0 = r11
            java.lang.String r1 = "pugv.detail.intro.0.click"
            java.lang.String r2 = "up_mid"
            r3 = r9
            kotlin.Pair r2 = kotlin.TuplesKt.to(r2, r3)
            java.util.Map r2 = kotlin.collections.MapsKt.mapOf(r2)
            r3 = 4
            com.bilibili.ship.theseus.united.page.report.PageReportService.g(r0, r1, r2, r3)
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.intro.publisher.t.c(boolean):void");
    }
}
