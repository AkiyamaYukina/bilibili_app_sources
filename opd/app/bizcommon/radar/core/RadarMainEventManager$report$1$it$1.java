package com.bilibili.opd.app.bizcommon.radar.core;

import com.bilibili.opd.app.bizcommon.radar.data.RadarReportWrapper;
import com.bilibili.opd.app.bizcommon.radar.data.RadarTriggerEvent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/core/RadarMainEventManager$report$1$it$1.class */
public final class RadarMainEventManager$report$1$it$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super RadarTriggerEvent>, Object> {
    final RadarReportWrapper $reportData;
    int label;
    final RadarMainEventManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RadarMainEventManager$report$1$it$1(RadarMainEventManager radarMainEventManager, RadarReportWrapper radarReportWrapper, Continuation<? super RadarMainEventManager$report$1$it$1> continuation) {
        super(2, continuation);
        this.this$0 = radarMainEventManager;
        this.$reportData = radarReportWrapper;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RadarMainEventManager$report$1$it$1(this.this$0, this.$reportData, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super RadarTriggerEvent> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            fn0.a aVar = this.this$0.f74173b;
            RadarReportWrapper radarReportWrapper = this.$reportData;
            this.label = 1;
            Object objC = aVar.c(radarReportWrapper, this);
            obj = objC;
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
