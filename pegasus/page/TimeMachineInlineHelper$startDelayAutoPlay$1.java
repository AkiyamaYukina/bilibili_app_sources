package com.bilibili.pegasus.page;

import com.bilibili.inline.control.IInlineControl;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/page/TimeMachineInlineHelper$startDelayAutoPlay$1.class */
final class TimeMachineInlineHelper$startDelayAutoPlay$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final x this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeMachineInlineHelper$startDelayAutoPlay$1(x xVar, Continuation<? super TimeMachineInlineHelper$startDelayAutoPlay$1> continuation) {
        super(2, continuation);
        this.this$0 = xVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TimeMachineInlineHelper$startDelayAutoPlay$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (DelayKt.delay(300L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        BLog.i("TimeMachineInlineHelper", "startDelayAutoPlay retry");
        IInlineControl iInlineControl = this.this$0.h;
        if (iInlineControl != null) {
            IInlineControl.startAutoPlay$default(iInlineControl, false, 1, (Object) null);
        }
        this.this$0.f78452j = null;
        return Unit.INSTANCE;
    }
}
