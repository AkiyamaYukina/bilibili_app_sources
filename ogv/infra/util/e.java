package com.bilibili.ogv.infra.util;

import android.app.Activity;
import com.bilibili.base.BiliContext;
import com.bilibili.lib.blconfig.ConfigManager;
import com.bilibili.lib.neuron.api.Neurons;
import java.util.Map;
import kotlin.ExceptionsKt;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.random.Random;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/infra/util/e.class */
public final class e {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean a(@org.jetbrains.annotations.NotNull java.lang.Throwable r3) {
        /*
            r0 = r3
            boolean r0 = r0 instanceof java.io.IOException
            r4 = r0
            r0 = 1
            r5 = r0
            r0 = r4
            if (r0 == 0) goto L10
            r0 = r5
            r4 = r0
            goto L45
        L10:
            r0 = r3
            boolean r0 = r0 instanceof retrofit2.HttpException
            if (r0 == 0) goto L43
            r0 = r3
            retrofit2.HttpException r0 = (retrofit2.HttpException) r0
            r3 = r0
            r0 = r5
            r4 = r0
            r0 = r3
            int r0 = r0.code()
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L45
            r0 = r5
            r4 = r0
            r0 = r3
            int r0 = r0.code()
            r1 = 429(0x1ad, float:6.01E-43)
            if (r0 == r1) goto L45
            r0 = r3
            int r0 = r0.code()
            r1 = 500(0x1f4, float:7.0E-43)
            if (r0 < r1) goto L43
            r0 = r5
            r4 = r0
            goto L45
        L43:
            r0 = 0
            r4 = r0
        L45:
            r0 = r4
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.infra.util.e.a(java.lang.Throwable):boolean");
    }

    public static final void b(@NotNull Throwable th) {
        Double doubleOrNull;
        BLog.e("ErrorUtilKt-throwInDebug", "[ogv-glue-ErrorUtilKt-throwInDebug] OGV-ERROR-LOG", th);
        try {
            Pair pair = TuplesKt.to("process", BiliContext.currentProcessName());
            Pair pair2 = TuplesKt.to("thread", Thread.currentThread().getName());
            Pair pair3 = TuplesKt.to("error_type", th.getClass().getName());
            String message = th.getMessage();
            String str = message;
            if (message == null) {
                str = "";
            }
            Pair pair4 = TuplesKt.to("error_msg", str);
            Pair pair5 = TuplesKt.to("error_stack", ExceptionsKt.stackTraceToString(th));
            Pair pair6 = TuplesKt.to("reporter_stack", ExceptionsKt.stackTraceToString(new Exception("reporter_stack")));
            Pair pair7 = TuplesKt.to("last_activity", BiliContext.lastActivityName());
            Activity activity = BiliContext.topActivity();
            Map mapMapOf = MapsKt.mapOf(new Pair[]{pair, pair2, pair3, pair4, pair5, pair6, pair7, TuplesKt.to("top_activity", activity != null ? activity.getClass().getName() : ""), TuplesKt.to("activity_count", String.valueOf(BiliContext.activityCount()))});
            String str2 = (String) ConfigManager.Companion.config().get("ogv.error_sample_rate", "1.0");
            final double dDoubleValue = (str2 == null || (doubleOrNull = StringsKt.toDoubleOrNull(str2)) == null) ? 1.0d : doubleOrNull.doubleValue();
            Neurons.trackT$default(false, "ogv.mobile.infoerror", mapMapOf, 0, new Function0(dDoubleValue) { // from class: Tj0.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final double f24196a;

                {
                    this.f24196a = dDoubleValue;
                }

                public final Object invoke() {
                    return Boolean.valueOf(Random.Default.nextDouble(1.0d) < this.f24196a);
                }
            }, 8, (Object) null);
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }
}
