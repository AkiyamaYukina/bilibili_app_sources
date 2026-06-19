package com.bilibili.pegasus.components.graduation;

import android.os.SystemClock;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/graduation/GraduationSeasonYearSelectDialogFragment$dismissAfterRefresh$1.class */
public final class GraduationSeasonYearSelectDialogFragment$dismissAfterRefresh$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Function0<Unit> $onDismiss;
    int label;
    final GraduationSeasonYearSelectDialogFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraduationSeasonYearSelectDialogFragment$dismissAfterRefresh$1(GraduationSeasonYearSelectDialogFragment graduationSeasonYearSelectDialogFragment, Function0<Unit> function0, Continuation<? super GraduationSeasonYearSelectDialogFragment$dismissAfterRefresh$1> continuation) {
        super(2, continuation);
        this.this$0 = graduationSeasonYearSelectDialogFragment;
        this.$onDismiss = function0;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GraduationSeasonYearSelectDialogFragment$dismissAfterRefresh$1(this.this$0, this.$onDismiss, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            GraduationSeasonYearSelectDialogFragment graduationSeasonYearSelectDialogFragment = this.this$0;
            long jCoerceAtLeast = RangesKt.coerceAtLeast(this.this$0.f76038j - (graduationSeasonYearSelectDialogFragment.f76037i > 0 ? SystemClock.elapsedRealtime() - this.this$0.f76037i : graduationSeasonYearSelectDialogFragment.f76038j), 0L);
            if (jCoerceAtLeast > 0) {
                this.label = 1;
                if (DelayKt.delay(jCoerceAtLeast, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.dismissAllowingStateLoss();
        Function0<Unit> function0 = this.$onDismiss;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
