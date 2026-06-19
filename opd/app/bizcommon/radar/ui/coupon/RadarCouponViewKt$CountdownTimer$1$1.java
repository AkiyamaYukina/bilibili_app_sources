package com.bilibili.opd.app.bizcommon.radar.ui.coupon;

import androidx.compose.runtime.MutableState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/ui/coupon/RadarCouponViewKt$CountdownTimer$1$1.class */
public final class RadarCouponViewKt$CountdownTimer$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final MutableState<Long> $remainingSeconds$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadarCouponViewKt$CountdownTimer$1$1(MutableState<Long> mutableState, Continuation<? super RadarCouponViewKt$CountdownTimer$1$1> continuation) {
        super(2, continuation);
        this.$remainingSeconds$delegate = mutableState;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RadarCouponViewKt$CountdownTimer$1$1(this.$remainingSeconds$delegate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004a -> B:16:0x0050). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r11 = r0
            r0 = r6
            int r0 = r0.label
            r8 = r0
            r0 = r8
            if (r0 == 0) goto L24
            r0 = r8
            r1 = 1
            if (r0 != r1) goto L1a
            r0 = r7
            kotlin.ResultKt.throwOnFailure(r0)
            goto L50
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L24:
            r0 = r7
            kotlin.ResultKt.throwOnFailure(r0)
        L28:
            r0 = r6
            androidx.compose.runtime.MutableState<java.lang.Long> r0 = r0.$remainingSeconds$delegate
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L72
            r0 = r6
            r1 = 1
            r0.label = r1
            r0 = 1000(0x3e8, double:4.94E-321)
            r1 = r6
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.delay(r0, r1)
            r1 = r11
            if (r0 != r1) goto L50
            r0 = r11
            return r0
        L50:
            r0 = r6
            androidx.compose.runtime.MutableState<java.lang.Long> r0 = r0.$remainingSeconds$delegate
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r9 = r0
            r0 = r6
            androidx.compose.runtime.MutableState<java.lang.Long> r0 = r0.$remainingSeconds$delegate
            r1 = r9
            r2 = 1
            long r1 = r1 - r2
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0.setValue(r1)
            goto L28
        L72:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.radar.ui.coupon.RadarCouponViewKt$CountdownTimer$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
