package com.bilibili.opd.app.bizcommon.radar.ui.coupon;

import androidx.compose.runtime.MutableState;
import com.bilibili.lib.blrouter.BLRouter;
import com.bilibili.lib.blrouter.ServicesProvider;
import com.bilibili.lib.ghost.api.Invocation;
import com.bilibili.lib.ghost.api.InvocationCategory;
import com.bilibili.opd.app.bizcommon.radar.data.RadarTriggerContent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/ui/coupon/RadarCouponViewKt$CloseButton$1$1.class */
public final class RadarCouponViewKt$CloseButton$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final RadarTriggerContent $content;
    final long $duration;
    final Function0<Unit> $onDismiss;
    final MutableState<Float> $progress$delegate;
    final long $startTimeMs;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadarCouponViewKt$CloseButton$1$1(long j7, long j8, RadarTriggerContent radarTriggerContent, Function0<Unit> function0, MutableState<Float> mutableState, Continuation<? super RadarCouponViewKt$CloseButton$1$1> continuation) {
        super(2, continuation);
        this.$duration = j7;
        this.$startTimeMs = j8;
        this.$content = radarTriggerContent;
        this.$onDismiss = function0;
        this.$progress$delegate = mutableState;
    }

    @JvmStatic
    @Invocation(category = InvocationCategory.INVOKE_NONE_STATIC, name = "getServices", owner = {"com.bilibili.lib.blrouter.BLRouter"})
    @NotNull
    private static <T> ServicesProvider<T> __Ghost$Insertion$com_bilibili_gripper_router_aop_RouterHook_getServices(@NotNull BLRouter bLRouter, @NotNull Class<T> cls) {
        o00.a.a();
        return bLRouter.getServices(cls);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RadarCouponViewKt$CloseButton$1$1(this.$duration, this.$startTimeMs, this.$content, this.$onDismiss, this.$progress$delegate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        if (r7.$duration > 0) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.opd.app.bizcommon.radar.ui.coupon.RadarCouponViewKt$CloseButton$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
