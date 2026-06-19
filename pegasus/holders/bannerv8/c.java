package com.bilibili.pegasus.holders.bannerv8;

import androidx.appcompat.widget.C3246j;
import androidx.compose.foundation.text.C0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import com.bilibili.adcommon.utils.GsonKtKt;
import com.bilibili.adcommon.utils.ext.JSONObjectCreator;
import com.bilibili.app.comm.list.widget.swiper.SwiperBannerAdapter;
import com.bilibili.gripper.api.ad.biz.pegasus.banner.AdBannerData;
import com.bilibili.gripper.api.ad.biz.pegasus.banner.BannerItemDataMirror;
import com.bilibili.gripper.api.ad.core.GAdCoreKt;
import com.bilibili.gripper.api.ad.core.report.ReportPresetKt;
import com.bilibili.lib.homepage.splash.SplashViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pp0.C8340D;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/c.class */
@StabilityInferred(parameters = 0)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Fragment f77725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SplashViewModel f77726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final gp0.c f77727c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final List<gp0.b> f77728d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public final SwiperBannerAdapter<?> f77729e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public String f77730f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public String f77731g;

    @NotNull
    public final AtomicBoolean h = new AtomicBoolean(false);

    public c(@NotNull Fragment fragment, @NotNull SplashViewModel splashViewModel, @NotNull gp0.c cVar, @NotNull List<gp0.b> list, @Nullable SwiperBannerAdapter<?> swiperBannerAdapter) {
        this.f77725a = fragment;
        this.f77726b = splashViewModel;
        this.f77727c = cVar;
        this.f77728d = list;
        this.f77729e = swiperBannerAdapter;
    }

    public final void a(final long j7) {
        Object next;
        gp0.b bVar;
        List<gp0.b> listE;
        Object obj;
        AdBannerData adBannerDataA;
        C0.c(j7, "Splash selectedSplashId: ", "AdTopBannerSelector");
        if (Intrinsics.areEqual(this.f77730f, String.valueOf(j7))) {
            com.bilibili.ad.comm.applist.b.b(j7, "No need to update ad banner, already matched: ", "AdTopBannerSelector");
            return;
        }
        String strValueOf = String.valueOf(j7);
        gp0.c cVar = this.f77727c;
        List<gp0.b> listK = cVar.k();
        if (listK != null) {
            Iterator<T> it = listK.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                List<gp0.b> listE2 = ((gp0.b) next).e();
                if (listE2 != null && !listE2.isEmpty()) {
                    break;
                }
            }
            gp0.b bVar2 = (gp0.b) next;
            if (bVar2 != null) {
                List<gp0.b> listE3 = bVar2.e();
                gp0.b bVar3 = listE3 != null ? (gp0.b) CollectionsKt.firstOrNull(listE3) : null;
                if (j7 <= 0 || (listE = bVar2.e()) == null) {
                    bVar = null;
                } else {
                    Iterator<T> it2 = listE.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        Object next2 = it2.next();
                        gp0.b bVar4 = (gp0.b) next2;
                        if (Intrinsics.areEqual((bVar4 == null || (adBannerDataA = bVar4.a()) == null) ? null : adBannerDataA.getSplashId(), strValueOf)) {
                            obj = next2;
                            break;
                        }
                    }
                    bVar = (gp0.b) obj;
                }
                boolean z6 = bVar != null;
                if (z6) {
                    C3246j.b("Matched ad banner for splashId: ", strValueOf, "AdTopBannerSelector");
                } else {
                    C3246j.b("Missed ad banner for splashId: ", strValueOf, "AdTopBannerSelector");
                }
                if (bVar == null) {
                    bVar = bVar3;
                    if (bVar3 == null) {
                        return;
                    }
                }
                AdBannerData adBannerDataA2 = bVar.a();
                if (adBannerDataA2 == null) {
                    return;
                }
                String type = bVar.getType();
                final String str = this.f77730f;
                if (str == null) {
                    com.bilibili.ad.comm.applist.b.b(j7, "First set ad banner: ", "AdTopBannerSelector");
                } else if (!Intrinsics.areEqual(str, String.valueOf(j7)) && z6) {
                    BLog.d("AdTopBannerSelector", androidx.core.content.c.b(j7, "Replace ad banner: ", str, " -> "));
                    GAdCoreKt.getGAdReport().uiEvent("compose_topview_replaced", ReportPresetKt.toReportPreset(adBannerDataA2.getReportInfo()), new Function1(str, j7) { // from class: com.bilibili.pegasus.holders.bannerv8.a

                        /* JADX INFO: renamed from: a, reason: collision with root package name */
                        public final String f77719a;

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        public final long f77720b;

                        {
                            this.f77719a = str;
                            this.f77720b = j7;
                        }

                        public final Object invoke(Object obj2) {
                            JSONObjectCreator jSONObjectCreator = (JSONObjectCreator) obj2;
                            jSONObjectCreator.to("from_topview_id", this.f77719a);
                            jSONObjectCreator.to("to_topview_id", Long.valueOf(this.f77720b));
                            return Unit.INSTANCE;
                        }
                    });
                }
                this.f77730f = adBannerDataA2.getSplashId();
                this.f77726b.update(new fa0.e(adBannerDataA2.getSplashId()));
                defpackage.a.b("update realShowTopViewId => ", adBannerDataA2.getSplashId(), "AdTopBannerSelector");
                try {
                    String jsonString = GsonKtKt.getJsonString(bVar2);
                    bVar2.setType(type);
                    bVar2.q(adBannerDataA2);
                    bVar2.s(bVar.h());
                    bVar2.t(bVar.k());
                    bVar2.f120534m = new BannerItemDataMirror(type, adBannerDataA2, v.c(bVar2.k()), v.b(bVar2.h()), C8340D.c(this.f77727c, null, null, null, null, null, 31), jsonString);
                    bVar2.f120533l = com.bilibili.pegasus.components.topview.a.e(adBannerDataA2, cVar);
                } catch (Throwable th) {
                    bVar2.f120533l = null;
                }
                Iterator it3 = ((ArrayList) this.f77728d).iterator();
                int i7 = 0;
                while (true) {
                    if (!it3.hasNext()) {
                        i7 = -1;
                        break;
                    }
                    AdBannerData adBannerDataA3 = ((gp0.b) it3.next()).a();
                    String splashId = adBannerDataA3 != null ? adBannerDataA3.getSplashId() : null;
                    AdBannerData adBannerDataA4 = bVar2.a();
                    if (Intrinsics.areEqual(splashId, adBannerDataA4 != null ? adBannerDataA4.getSplashId() : null)) {
                        break;
                    } else {
                        i7++;
                    }
                }
                if (i7 >= 0) {
                    ((ArrayList) this.f77728d).set(i7, bVar2);
                    SwiperBannerAdapter<?> swiperBannerAdapter = this.f77729e;
                    if (swiperBannerAdapter != null) {
                        swiperBannerAdapter.notifyRealItemChanged(i7);
                    }
                }
            }
        }
    }
}
