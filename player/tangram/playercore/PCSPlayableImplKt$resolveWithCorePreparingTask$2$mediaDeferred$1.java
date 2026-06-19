package com.bilibili.player.tangram.playercore;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSPlayableImplKt$resolveWithCorePreparingTask$2$mediaDeferred$1.class */
public final class PCSPlayableImplKt$resolveWithCorePreparingTask$2$mediaDeferred$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<Object>, Object> {
    final Function1<Continuation<Object>, Object> $resolve;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PCSPlayableImplKt$resolveWithCorePreparingTask$2$mediaDeferred$1(Function1<? super Continuation<Object>, ? extends Object> function1, Continuation<? super PCSPlayableImplKt$resolveWithCorePreparingTask$2$mediaDeferred$1> continuation) {
        super(2, continuation);
        this.$resolve = function1;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PCSPlayableImplKt$resolveWithCorePreparingTask$2$mediaDeferred$1(this.$resolve, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<Object> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Function1<Continuation<Object>, Object> function1 = this.$resolve;
            this.label = 1;
            Object objInvoke = function1.invoke(this);
            obj = objInvoke;
            if (objInvoke == coroutine_suspended) {
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
