package com.bilibili.pegasus.components.interestv2.host;

import A50.r;
import F3.C1699b6;
import F3.V5;
import F3.W5;
import F3.X5;
import Fe1.O;
import Fe1.o;
import androidx.compose.animation.C3357h;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.lib.fasthybrid.runtime.C;
import com.bilibili.search2.api.SearchBangumiItem;
import java.util.Arrays;
import kntr.base.localization.DateTimeStringID;
import kntr.common.compose.utils.ResourcesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q91.m;
import tv.danmaku.bili.interest.v2.entry.InterestChooseEntrySource;
import tv.danmaku.bili.splash.ad.model.SplashOrder;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/interestv2/host/c.class */
@StabilityInferred(parameters = 1)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f77036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f77037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f77038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Function1<Integer, Unit> f77039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Function1<InterestChooseEntrySource, Unit> f77040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Function1<InterestChooseEntrySource, Unit> f77041f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f77042g;

    public c() {
        this(null, null, null, null, null, null, null, SearchBangumiItem.TYPE_FULLNET_BANGUMI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [kotlin.jvm.functions.Function1<tv.danmaku.bili.interest.v2.entry.InterestChooseEntrySource, kotlin.Unit>] */
    public c(A50.g gVar, Function0 function0, r rVar, YP0.a aVar, com.bilibili.biligame.ui.feed.widget.bottomtip.d dVar, PH.a aVar2, A50.j jVar, int i7) {
        gVar = (i7 & 1) != 0 ? new V5(6) : gVar;
        function0 = (i7 & 2) != 0 ? new W5(5) : function0;
        rVar = (i7 & 4) != 0 ? new X5(7) : rVar;
        if ((i7 & 8) != 0) {
            final int i8 = 0;
            aVar = new Function1(i8) { // from class: com.bilibili.pegasus.components.interestv2.host.a

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final int f77035a;

                {
                    this.f77035a = i8;
                }

                public final Object invoke(Object obj) {
                    switch (this.f77035a) {
                        case 0:
                            ((Integer) obj).intValue();
                            return Unit.INSTANCE;
                        case 1:
                            m mVar = (m) obj;
                            return ResourcesKt.c(kntr.base.localization.i.a(DateTimeStringID.YearMonthDay), Arrays.copyOf(new Object[]{Integer.valueOf(mVar.a.getYear()), Integer.valueOf(mVar.a.getMonthValue()), Integer.valueOf(mVar.a.getDayOfMonth())}, 3));
                        default:
                            O.a((SplashOrder) null, "splash_serialize", new o(0, (String) obj, true));
                            return Unit.INSTANCE;
                    }
                }
            };
        }
        dVar = (i7 & 16) != 0 ? new C(1) : dVar;
        Object obj = (i7 & 32) != 0 ? new Object() : aVar2;
        jVar = (i7 & 64) != 0 ? new C1699b6(6) : jVar;
        this.f77036a = gVar;
        this.f77037b = function0;
        this.f77038c = rVar;
        this.f77039d = aVar;
        this.f77040e = dVar;
        this.f77041f = obj;
        this.f77042g = jVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f77036a, cVar.f77036a) && Intrinsics.areEqual(this.f77037b, cVar.f77037b) && Intrinsics.areEqual(this.f77038c, cVar.f77038c) && Intrinsics.areEqual(this.f77039d, cVar.f77039d) && Intrinsics.areEqual(this.f77040e, cVar.f77040e) && Intrinsics.areEqual(this.f77041f, cVar.f77041f) && Intrinsics.areEqual(this.f77042g, cVar.f77042g);
    }

    public final int hashCode() {
        return this.f77042g.hashCode() + O4.b.a(O4.b.a(O4.b.a(C3357h.a(C3357h.a(this.f77036a.hashCode() * 31, 31, this.f77037b), 31, this.f77038c), 31, this.f77039d), 31, this.f77040e), 31, this.f77041f);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidInterestChooseCallbacks(onBeforeApplyCompletion=");
        sb.append(this.f77036a);
        sb.append(", onAfterInterestChooseDismiss=");
        sb.append(this.f77037b);
        sb.append(", onShowAgeGate=");
        sb.append(this.f77038c);
        sb.append(", onHandleCloseSmallWindow=");
        sb.append(this.f77039d);
        sb.append(", onPausePegasusExpose=");
        sb.append(this.f77040e);
        sb.append(", onResumePegasusExpose=");
        sb.append(this.f77041f);
        sb.append(", onRelease=");
        return Y0.c.a(sb, this.f77042g, ")");
    }
}
