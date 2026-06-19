package com.bilibili.playset.editor.utils;

import androidx.compose.runtime.MutableState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/editor/utils/ClickExtKt$debounceClick$1$1$1.class */
final class ClickExtKt$debounceClick$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final MutableState<Boolean> $canClick$delegate;
    final long $timeout;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClickExtKt$debounceClick$1$1$1(long j7, MutableState<Boolean> mutableState, Continuation<? super ClickExtKt$debounceClick$1$1$1> continuation) {
        super(2, continuation);
        this.$timeout = j7;
        this.$canClick$delegate = mutableState;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ClickExtKt$debounceClick$1$1$1(this.$timeout, this.$canClick$delegate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.$canClick$delegate.getValue().booleanValue()) {
                long j7 = this.$timeout;
                this.label = 1;
                if (DelayKt.delay(j7, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        if (i7 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.$canClick$delegate.setValue(Boolean.TRUE);
        return Unit.INSTANCE;
    }
}
