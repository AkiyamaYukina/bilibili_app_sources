package com.bilibili.opd.app.bizcommon.radar.core;

import Bc.n;
import M3.A1;
import M3.B1;
import M3.C2585h1;
import M3.C2588i1;
import M3.C2591j1;
import M3.C2594k1;
import M3.C2597l1;
import M3.C2600m1;
import M3.C2603n1;
import M3.C2606o1;
import M3.C2609p1;
import M3.C2612q1;
import M3.C2614r1;
import M3.C2617s1;
import M3.C2620t1;
import M3.C2629w1;
import M3.C2632x1;
import M3.C2635y1;
import M3.C2638z1;
import android.app.Activity;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.api.base.Config;
import com.bilibili.opd.app.bizcommon.radar.data.RadarTriggerContent;
import com.bilibili.opd.app.bizcommon.radar.data.RadarTriggerEvent;
import dn0.AbstractC6826a;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/core/i.class */
@StabilityInferred(parameters = 0)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Map<String, Function0<AbstractC6826a>> f74210a = MapsKt.mapOf(new Pair[]{TuplesKt.to("toast", new C2585h1(5)), TuplesKt.to("snackbar", new C2591j1(6)), TuplesKt.to("dialog", new C2600m1(5)), TuplesKt.to("ticketDialog", new C2603n1(5)), TuplesKt.to("goodsRecommend", new C2606o1(4)), TuplesKt.to("blindBoxDialog", new n(8)), TuplesKt.to("blindBoxSnackbar", new C2609p1(5)), TuplesKt.to("rightsDialog", new C2614r1(5)), TuplesKt.to("tabLearningDialog", new C2617s1(5)), TuplesKt.to("cardGameDialog", new C2620t1(6)), TuplesKt.to("goodsActivitySnackbar", new C2612q1(5)), TuplesKt.to("couponSnackbar", new C2629w1(5)), TuplesKt.to("couponAvailableDialog", new Jg0.f(6)), TuplesKt.to("couponItemsDialog", new C2632x1(5)), TuplesKt.to("dynamicView", new G90.b(9)), TuplesKt.to("dynamicViewV2", new C2635y1(5)), TuplesKt.to("ipSubscribeSnackbar", new C2638z1(7)), TuplesKt.to("countdownSnackbar", new A1(5)), TuplesKt.to("uidFollowSnackbarV2", new B1(8)), TuplesKt.to("itemsDetailCouponFloating", new C2588i1(5)), TuplesKt.to("ma_coupon_detail", new C2594k1(6)), TuplesKt.to("ma_coupon_amount", new Bc.h(7)), TuplesKt.to("ma_coupon_bubble", new C2597l1(5))});

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/core/i$a.class */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        public static boolean a(@Nullable Activity activity) {
            cn0.c cVar = activity instanceof cn0.c ? (cn0.c) activity : null;
            cn0.c cVarA = cVar;
            if (cVar == null) {
                cVarA = e.a(activity, null);
            }
            RadarTriggerEvent radarTriggerEventKb = cVarA != null ? cVarA.Kb() : null;
            String simpleName = activity != 0 ? activity.getClass().getSimpleName() : null;
            String simpleName2 = cVarA != null ? cVarA.getClass().getSimpleName() : null;
            String messageType = radarTriggerEventKb != null ? radarTriggerEventKb.getMessageType() : null;
            StringBuilder sbA = G0.b.a("RadarTriggerDispatcher-pageEnd activity=", simpleName, ", eventPage=", simpleName2, ", triggerEvent=");
            sbA.append(messageType);
            String string = sbA.toString();
            if (Config.isDebuggable()) {
                String str = string;
                if (string == null) {
                    str = "null";
                }
                BLog.d("nov_test", str);
            }
            if (radarTriggerEventKb == null) {
                return false;
            }
            RadarTriggerContent messageContent = radarTriggerEventKb.getMessageContent();
            if (messageContent != null) {
                messageContent.setTriggerScene(messageContent.getTriggerScene() + ".finishActivity");
            }
            new i().a(radarTriggerEventKb, null);
            cVarA.L0(null);
            return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0193, code lost:
    
        if (r0 == null) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(@org.jetbrains.annotations.Nullable com.bilibili.opd.app.bizcommon.radar.data.RadarTriggerEvent r10, @org.jetbrains.annotations.Nullable final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r11) {
        /*
            Method dump skipped, instruction units count: 1883
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.radar.core.i.a(com.bilibili.opd.app.bizcommon.radar.data.RadarTriggerEvent, kotlin.jvm.functions.Function1):boolean");
    }
}
