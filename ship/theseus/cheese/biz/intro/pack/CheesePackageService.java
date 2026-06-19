package com.bilibili.ship.theseus.cheese.biz.intro.pack;

import android.app.Activity;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import au0.C4911a;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.RouteRequest;
import com.bilibili.ship.theseus.cheese.biz.intro.pack.CheesePackageComponent;
import com.bilibili.ship.theseus.cheese.biz.intro.pack.CheesePackageLayerComponent;
import com.bilibili.ship.theseus.cheese.biz.intro.pack.v;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import eu0.C6982a;
import java.util.HashSet;
import java.util.List;
import javax.inject.Inject;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/pack/CheesePackageService.class */
@StabilityInferred(parameters = 0)
public final class CheesePackageService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f89506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Activity f89507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final PageReportService f89508c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final C4911a f89509d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f89510e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.g f89511f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f89512g;

    @NotNull
    public final C6982a h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final HashSet<Long> f89513i = new HashSet<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final HashSet<Long> f89514j = new HashSet<>();

    @Inject
    public CheesePackageService(@NotNull CoroutineScope coroutineScope, @NotNull Activity activity, @NotNull PageReportService pageReportService, @NotNull C4911a c4911a, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull com.bilibili.ship.theseus.united.page.playingarea.g gVar, @NotNull IntroContentSizeRepository introContentSizeRepository, @NotNull C6982a c6982a) {
        this.f89506a = coroutineScope;
        this.f89507b = activity;
        this.f89508c = pageReportService;
        this.f89509d = c4911a;
        this.f89510e = theseusFloatLayerService;
        this.f89511f = gVar;
        this.f89512g = introContentSizeRepository;
        this.h = c6982a;
    }

    @NotNull
    public final RunningUIComponent a(@NotNull s sVar) {
        Integer num = this.h.f117502a.get("pugv_view_pack");
        CheesePackageComponent cheesePackageComponent = new CheesePackageComponent(new CheesePackageComponent.w(sVar, num != null && num.intValue() == 2, this.f89512g.f100021b));
        return new RunningUIComponent(cheesePackageComponent, 0, new CheesePackageService$createPackage$1(cheesePackageComponent, this, sVar, null), 2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void b(v vVar, s sVar, int i7) throws NoWhenBranchMatchedException {
        String str;
        Pair pair;
        if (Intrinsics.areEqual(vVar, v.b.f89579a)) {
            Integer num = this.h.f117502a.get("pugv_view_pack");
            CheesePackageLayerComponent cheesePackageLayerComponent = new CheesePackageLayerComponent(new CheesePackageLayerComponent.o(sVar, num != null && num.intValue() == 2, this.f89512g.f100021b));
            BuildersKt.launch$default(this.f89506a, (CoroutineContext) null, (CoroutineStart) null, new CheesePackageService$runPackageFloatLayer$1(new RunningUIComponent(cheesePackageLayerComponent, 0, new CheesePackageService$createPackageFloatLayerComponent$runningUIComponent$1(cheesePackageLayerComponent, this, sVar, null), 2), this, null), 3, (Object) null);
            return;
        }
        boolean z6 = vVar instanceof v.a;
        PageReportService pageReportService = this.f89508c;
        str = "";
        if (z6) {
            v.a aVar = (v.a) vVar;
            t tVar = (t) CollectionsKt.getOrNull(sVar.f89568b, aVar.f89578a);
            if (tVar == null) {
                return;
            }
            String strA = r.a("http://m.bilibili.com/cheese/packageCourseDetail?", "productId", String.valueOf(tVar.f89569a));
            C4911a c4911a = this.f89509d;
            BLRouter.routeTo(new RouteRequest.Builder(Uri.parse("bilibili://cheese/web")).data(Uri.parse(r.a(r.a(r.a(r.a(strA, "fromSeasonId", String.valueOf(c4911a.f54237a)), "csource", c4911a.f54238b), "fromSpmid", c4911a.f54247l), "navhide", "1"))).requestCode(1001).build(), this.f89507b);
            List<t> list = sVar.f89568b;
            int i8 = aVar.f89578a;
            t tVar2 = (t) CollectionsKt.getOrNull(list, i8);
            String str2 = i7 == 0 ? "pugv.detail.course-plan.0.click" : "pugv.course-plan-aggregation.course-plan-list.0.click";
            String strValueOf = null;
            if (tVar2 != null) {
                strValueOf = String.valueOf(tVar2.f89569a);
            }
            if (strValueOf == null) {
                strValueOf = str;
            }
            PageReportService.g(pageReportService, str2, MapsKt.mapOf(new Pair[]{TuplesKt.to("toscpid", strValueOf), TuplesKt.to("orderid", String.valueOf(i8))}), 4);
            return;
        }
        if (!(vVar instanceof v.c)) {
            throw new NoWhenBranchMatchedException();
        }
        v.c cVar = (v.c) vVar;
        t tVar3 = (t) CollectionsKt.getOrNull(sVar.f89568b, cVar.f89580a);
        long j7 = 0;
        if (i7 == 0) {
            HashSet<Long> hashSet = this.f89513i;
            if (tVar3 != null) {
                j7 = tVar3.f89569a;
            }
            pair = new Pair(Boolean.valueOf(hashSet.add(Long.valueOf(j7))), "pugv.detail.course-plan.card.show");
        } else {
            HashSet<Long> hashSet2 = this.f89514j;
            if (tVar3 != null) {
                j7 = tVar3.f89569a;
            }
            pair = new Pair(Boolean.valueOf(hashSet2.add(Long.valueOf(j7))), "pugv.course-plan-aggregation.course-plan-list.card.show");
        }
        boolean zBooleanValue = ((Boolean) pair.component1()).booleanValue();
        String str3 = (String) pair.component2();
        if (zBooleanValue) {
            String strValueOf2 = null;
            if (tVar3 != null) {
                strValueOf2 = String.valueOf(tVar3.f89569a);
            }
            PageReportService.i(pageReportService, str3, MapsKt.mapOf(new Pair[]{TuplesKt.to("toscpid", strValueOf2 != null ? strValueOf2 : ""), TuplesKt.to("orderid", String.valueOf(cVar.f89580a))}), 4);
        }
    }
}
