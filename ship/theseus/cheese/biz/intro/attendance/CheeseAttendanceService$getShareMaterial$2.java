package com.bilibili.ship.theseus.cheese.biz.intro.attendance;

import com.bilibili.okretro.response.BiliApiResponse;
import com.bilibili.okretro.response.BiliApiResponseKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/cheese/biz/intro/attendance/CheeseAttendanceService$getShareMaterial$2.class */
final class CheeseAttendanceService$getShareMaterial$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super CheeseAttendanceShareMaterial>, Object> {
    final long $seasonId;
    int label;
    final l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheeseAttendanceService$getShareMaterial$2(l lVar, long j7, Continuation<? super CheeseAttendanceService$getShareMaterial$2> continuation) {
        super(2, continuation);
        this.this$0 = lVar;
        this.$seasonId = j7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CheeseAttendanceService$getShareMaterial$2(this.this$0, this.$seasonId, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super CheeseAttendanceShareMaterial> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            o oVar = (o) this.this$0.f89332l.getValue();
            long j7 = this.$seasonId;
            this.label = 1;
            Object shareMaterial = oVar.getShareMaterial(j7, this);
            obj = shareMaterial;
            if (shareMaterial == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        Object objAsResult = BiliApiResponseKt.asResult((BiliApiResponse) obj);
        Object obj2 = objAsResult;
        if (Result.isFailure-impl(objAsResult)) {
            obj2 = null;
        }
        return obj2;
    }
}
