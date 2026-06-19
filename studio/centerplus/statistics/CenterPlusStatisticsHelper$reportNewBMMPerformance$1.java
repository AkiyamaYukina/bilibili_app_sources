package com.bilibili.studio.centerplus.statistics;

import HC0.b;
import android.text.TextUtils;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/centerplus/statistics/CenterPlusStatisticsHelper$reportNewBMMPerformance$1.class */
public final class CenterPlusStatisticsHelper$reportNewBMMPerformance$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $fps;
    final String $relationFrom;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CenterPlusStatisticsHelper$reportNewBMMPerformance$1(long j7, String str, Continuation<? super CenterPlusStatisticsHelper$reportNewBMMPerformance$1> continuation) {
        super(2, continuation);
        this.$fps = j7;
        this.$relationFrom = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CenterPlusStatisticsHelper$reportNewBMMPerformance$1(this.$fps, this.$relationFrom, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        String str = CenterPlusStatisticsHelper.f105195a;
        long j7 = this.$fps;
        long jA = CenterPlusStatisticsHelper.a();
        if (TextUtils.isEmpty(CenterPlusStatisticsHelper.f105195a)) {
            CenterPlusStatisticsHelper.f105195a = b.a();
        }
        CenterPlusStatisticsHelper.l(j7, jA, CenterPlusStatisticsHelper.f105195a, this.$relationFrom);
        return Unit.INSTANCE;
    }
}
