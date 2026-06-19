package com.bilibili.ship.theseus.cheese.biz.intro.recommend;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.biligame.ui.strategy.x0;
import com.bilibili.framework.exposure.core.ExposureEntry;
import com.bilibili.ship.theseus.cheese.biz.intro.recommend.e;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import java.util.HashSet;
import javax.inject.Inject;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/recommend/o.class */
@StabilityInferred(parameters = 0)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f89980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f89981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.g f89982c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f89983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final PageReportService f89984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Context f89985f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final HashSet<Integer> f89986g = new HashSet<>();

    @NotNull
    public final HashSet<Integer> h = new HashSet<>();

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/recommend/o$a.class */
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int[] f89987a;

        static {
            int[] iArr = new int[RecommendUIStyle.values().length];
            try {
                iArr[RecommendUIStyle.PUGV_SEASON_RECOMMEND_SHOW_STYLE_FEED.ordinal()] = 1;
            } catch (NoSuchFieldError e7) {
            }
            f89987a = iArr;
        }
    }

    @Inject
    public o(@NotNull CoroutineScope coroutineScope, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull com.bilibili.ship.theseus.united.page.playingarea.g gVar, @NotNull IntroContentSizeRepository introContentSizeRepository, @NotNull PageReportService pageReportService, @NotNull Context context) {
        this.f89980a = coroutineScope;
        this.f89981b = theseusFloatLayerService;
        this.f89982c = gVar;
        this.f89983d = introContentSizeRepository;
        this.f89984e = pageReportService;
        this.f89985f = context;
    }

    public final void a(t tVar) {
        BuildersKt.launch$default(this.f89980a, (CoroutineContext) null, (CoroutineStart) null, new CheeseRecommendService$runRecommendFloatLayer$1(new RunningUIComponent(new e(new e.d(StateFlowKt.MutableStateFlow(new w(tVar, new ExposureEntry(com.bilibili.ship.theseus.cheese.biz.report.c.f90463a, new x0(1, this, tVar)), new n(0, this, tVar))), this.f89983d.f100021b)), 0, (Function1) null, 6), this, null), 3, (Object) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(com.bilibili.ship.theseus.cheese.biz.intro.recommend.u r7, int r8) {
        /*
            r6 = this;
            r0 = r7
            if (r0 == 0) goto L12
            r0 = r7
            long r0 = r0.f90007f
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r9 = r0
            r0 = r9
            r7 = r0
            r0 = r9
            if (r0 != 0) goto L15
        L12:
            java.lang.String r0 = "0"
            r7 = r0
        L15:
            r0 = 2
            kotlin.Pair[] r0 = new kotlin.Pair[r0]
            r1 = r0
            r2 = 0
            java.lang.String r3 = "to_season_id"
            r4 = r7
            kotlin.Pair r3 = kotlin.TuplesKt.to(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            java.lang.String r3 = "order_id"
            r4 = r8
            java.lang.String r4 = com.bilibili.ship.theseus.cheese.biz.report.c.a(r4)
            kotlin.Pair r3 = kotlin.TuplesKt.to(r3, r4)
            r1[r2] = r3
            java.util.Map r0 = kotlin.collections.MapsKt.mapOf(r0)
            r7 = r0
            r0 = r6
            com.bilibili.ship.theseus.united.page.report.PageReportService r0 = r0.f89984e
            java.lang.String r1 = "pugv.detail.pugv-related.0.click"
            r2 = r7
            r3 = 4
            com.bilibili.ship.theseus.united.page.report.PageReportService.g(r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.intro.recommend.o.b(com.bilibili.ship.theseus.cheese.biz.intro.recommend.u, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(com.bilibili.ship.theseus.cheese.biz.intro.recommend.u r7, int r8) {
        /*
            r6 = this;
            r0 = r6
            java.util.HashSet<java.lang.Integer> r0 = r0.f89986g
            r1 = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r0 = r0.add(r1)
            if (r0 == 0) goto L4b
            r0 = r7
            if (r0 == 0) goto L20
            r0 = r7
            long r0 = r0.f90007f
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r9 = r0
            r0 = r9
            r7 = r0
            r0 = r9
            if (r0 != 0) goto L23
        L20:
            java.lang.String r0 = "0"
            r7 = r0
        L23:
            r0 = 2
            kotlin.Pair[] r0 = new kotlin.Pair[r0]
            r1 = r0
            r2 = 0
            java.lang.String r3 = "to_season_id"
            r4 = r7
            kotlin.Pair r3 = kotlin.TuplesKt.to(r3, r4)
            r1[r2] = r3
            r1 = r0
            r2 = 1
            java.lang.String r3 = "order_id"
            r4 = r8
            java.lang.String r4 = com.bilibili.ship.theseus.cheese.biz.report.c.a(r4)
            kotlin.Pair r3 = kotlin.TuplesKt.to(r3, r4)
            r1[r2] = r3
            java.util.Map r0 = kotlin.collections.MapsKt.mapOf(r0)
            r7 = r0
            r0 = r6
            com.bilibili.ship.theseus.united.page.report.PageReportService r0 = r0.f89984e
            java.lang.String r1 = "pugv.detail.pugv-related.0.show"
            r2 = r7
            r3 = 4
            com.bilibili.ship.theseus.united.page.report.PageReportService.i(r0, r1, r2, r3)
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.intro.recommend.o.c(com.bilibili.ship.theseus.cheese.biz.intro.recommend.u, int):void");
    }
}
