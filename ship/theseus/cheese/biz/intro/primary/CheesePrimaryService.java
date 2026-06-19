package com.bilibili.ship.theseus.cheese.biz.intro.primary;

import I3.C2269t;
import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import au0.C4911a;
import com.bilibili.app.gemini.ui.RunningUIComponent;
import com.bilibili.cheese.pay.model.CouponsResult;
import com.bilibili.cheese.pay.model.PayCouponVo;
import com.bilibili.lib.sharewrapper.basic.ThirdPartyExtraBuilder;
import com.bilibili.okretro.anno.RequestInterceptor;
import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.ship.theseus.cheese.biz.intro.primary.C6081b;
import com.bilibili.ship.theseus.cheese.biz.intro.primary.C6095p;
import com.bilibili.ship.theseus.cheese.pay.purchase.CheesePurchaseRepository;
import com.bilibili.ship.theseus.united.page.floatlayer.TheseusFloatLayerService;
import com.bilibili.ship.theseus.united.page.intro.IntroContentSizeRepository;
import com.bilibili.ship.theseus.united.page.report.PageReportService;
import eu0.C6982a;
import eu0.C6987f;
import ev0.InterfaceC7008a;
import java.util.List;
import javax.inject.Inject;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.BaseUrl;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/CheesePrimaryService.class */
@StabilityInferred(parameters = 0)
public final class CheesePrimaryService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f89589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final C6101w f89590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final C4911a f89591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Context f89592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f89593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final TheseusFloatLayerService f89594f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.playingarea.g f89595g;

    @NotNull
    public final CheesePurchaseRepository h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final PageReportService f89596i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final C6987f f89597j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.cheese.biz.intro.series.c f89598k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final M f89599l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    public final com.bilibili.ship.theseus.united.page.screenstate.c f89600m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final InterfaceC7008a f89601n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public final IntroContentSizeRepository f89602o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public final C6982a f89603p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f89604q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f89605r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f89606s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f89607t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public final MutableStateFlow<C6095p.d> f89608u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    public final StateFlow<C6095p.d> f89609v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    public final Lazy f89610w;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/primary/CheesePrimaryService$CheeseCouponApi.class */
    @BaseUrl("https://api.bilibili.com")
    public interface CheeseCouponApi {
        @GET("/pugv/pay/api/my/coupons/new/v2")
        @RequestInterceptor(com.bilibili.cheese.pay.api.c.class)
        @Nullable
        Object getCouponList(@Query("season_id") long j7, @NotNull Continuation<? super BiliApiResponse<CouponsResult>> continuation);

        @RequestInterceptor(com.bilibili.cheese.pay.api.c.class)
        @Nullable
        @FormUrlEncoded
        @POST("/pugv/pay/api/receive/coupon")
        Object receiveCoupon(@Field("batch_token") @NotNull String str, @Field("csource") @NotNull String str2, @Field("season_id") @NotNull String str3, @Field("spmid") @NotNull String str4, @Field("from_spmid") @NotNull String str5, @NotNull Continuation<? super BiliApiResponse<? extends Object>> continuation);
    }

    @Inject
    public CheesePrimaryService(@NotNull CoroutineScope coroutineScope, @NotNull C6101w c6101w, @NotNull C4911a c4911a, @NotNull Context context, boolean z6, @NotNull TheseusFloatLayerService theseusFloatLayerService, @NotNull com.bilibili.ship.theseus.united.page.playingarea.g gVar, @NotNull CheesePurchaseRepository cheesePurchaseRepository, @NotNull PageReportService pageReportService, @NotNull C6987f c6987f, @NotNull com.bilibili.ship.theseus.cheese.biz.intro.series.c cVar, @NotNull M m7, @NotNull com.bilibili.ship.theseus.united.page.screenstate.c cVar2, @NotNull InterfaceC7008a interfaceC7008a, @NotNull IntroContentSizeRepository introContentSizeRepository, @NotNull C6982a c6982a) {
        this.f89589a = coroutineScope;
        this.f89590b = c6101w;
        this.f89591c = c4911a;
        this.f89592d = context;
        this.f89593e = z6;
        this.f89594f = theseusFloatLayerService;
        this.f89595g = gVar;
        this.h = cheesePurchaseRepository;
        this.f89596i = pageReportService;
        this.f89597j = c6987f;
        this.f89598k = cVar;
        this.f89599l = m7;
        this.f89600m = cVar2;
        this.f89601n = interfaceC7008a;
        this.f89602o = introContentSizeRepository;
        this.f89603p = c6982a;
        MutableStateFlow<C6095p.d> MutableStateFlow = StateFlowKt.MutableStateFlow(new C6095p.d(0));
        this.f89608u = MutableStateFlow;
        this.f89609v = FlowKt.asStateFlow(MutableStateFlow);
        this.f89610w = LazyKt.lazy(new C2269t(9));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.bilibili.ship.theseus.cheese.biz.intro.primary.CheesePrimaryService r8, java.lang.String r9, kotlin.coroutines.Continuation r10) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.intro.primary.CheesePrimaryService.a(com.bilibili.ship.theseus.cheese.biz.intro.primary.CheesePrimaryService, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void b(CheesePrimaryService cheesePrimaryService, boolean z6) {
        cheesePrimaryService.getClass();
        PageReportService.g(cheesePrimaryService.f89596i, "pugv.detail.sale-activity.0.click", MapsKt.mapOf(TuplesKt.to("type", z6 ? "1" : "2")), 4);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(kotlin.coroutines.Continuation<? super kotlin.Unit> r6) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.cheese.biz.intro.primary.CheesePrimaryService.c(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @NotNull
    public final RunningUIComponent d(@NotNull V v7) {
        C6101w c6101w = this.f89590b;
        c6101w.f89786i.setValue(v7);
        C6081b c6081b = new C6081b(new C6081b.C0619b(this.f89593e, this.f89597j.f117533c == 1, c6101w.f89780b, v7, v7.h, this.f89602o.f100021b, c6101w.f89782d, this.f89603p.a()));
        return new RunningUIComponent(c6081b, 0, new CheesePrimaryService$createPrimaryComponent$1(c6081b, this, v7, null), 2);
    }

    public final void e(String str, boolean z6) {
        PageReportService.i(this.f89596i, "pugv.detail.sale-activity.result.show", MapsKt.mapOf(new Pair[]{TuplesKt.to("coupon_id", str), TuplesKt.to(ThirdPartyExtraBuilder.KEY_RESULT, z6 ? "1" : "0")}), 4);
    }

    public final void f() {
        C6101w c6101w = this.f89590b;
        List list = (List) c6101w.h.getValue();
        List listEmptyList = list;
        if (list == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        this.f89608u.setValue(new C6095p.d((List<PayCouponVo>) listEmptyList));
        C6095p c6095p = new C6095p(c6101w.f89784f, this.f89609v, c6101w.h);
        BuildersKt.launch$default(this.f89589a, (CoroutineContext) null, (CoroutineStart) null, new CheesePrimaryService$showCouponLayerComponent$1(c6095p, this, null), 3, (Object) null);
        BuildersKt.launch$default(this.f89589a, (CoroutineContext) null, (CoroutineStart) null, new CheesePrimaryService$runCouponFloatLayer$1(new RunningUIComponent(c6095p, 0, (Function1) null, 6), this, null), 3, (Object) null);
        BuildersKt.launch$default(c6101w.f89779a, (CoroutineContext) null, (CoroutineStart) null, new CheesePrimaryRepository$updateCouponLayerSelect$1(c6101w, null), 3, (Object) null);
    }
}
