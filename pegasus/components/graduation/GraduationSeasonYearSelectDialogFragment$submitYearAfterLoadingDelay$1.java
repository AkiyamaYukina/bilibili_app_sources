package com.bilibili.pegasus.components.graduation;

import com.bilibili.pegasus.components.graduation.GraduationSeasonYearSelectDialogFragment;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/GraduationSeasonYearSelectDialogFragment$submitYearAfterLoadingDelay$1.class */
final class GraduationSeasonYearSelectDialogFragment$submitYearAfterLoadingDelay$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final GraduationSeasonYearSelectDialogFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraduationSeasonYearSelectDialogFragment$submitYearAfterLoadingDelay$1(GraduationSeasonYearSelectDialogFragment graduationSeasonYearSelectDialogFragment, Continuation<? super GraduationSeasonYearSelectDialogFragment$submitYearAfterLoadingDelay$1> continuation) {
        super(2, continuation);
        this.this$0 = graduationSeasonYearSelectDialogFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GraduationSeasonYearSelectDialogFragment$submitYearAfterLoadingDelay$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invokeSuspend(Object obj) {
        Integer num;
        com.bilibili.column.ui.manager.draft.h hVar;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            long jCoerceAtLeast = RangesKt.coerceAtLeast(this.this$0.f76038j - 200, 0L);
            this.label = 1;
            if (DelayKt.delay(jCoerceAtLeast, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        GraduationSeasonYearSelectDialogFragment graduationSeasonYearSelectDialogFragment = this.this$0;
        GraduationSeasonYearSelectDialogFragment.a aVar = GraduationSeasonYearSelectDialogFragment.f76030o;
        if (((Boolean) graduationSeasonYearSelectDialogFragment.f76034e.getValue()).booleanValue() && !graduationSeasonYearSelectDialogFragment.h && (num = graduationSeasonYearSelectDialogFragment.f76041m) != null && (hVar = graduationSeasonYearSelectDialogFragment.f76042n) != null) {
            graduationSeasonYearSelectDialogFragment.h = true;
            hVar.invoke(num, graduationSeasonYearSelectDialogFragment);
        }
        return Unit.INSTANCE;
    }
}
