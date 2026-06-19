package com.bilibili.mediastreaming.audio.croutine;

import com.bilibili.mediastreaming.audio.IBiliAudioLoggerObserver;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/croutine/BiliAudioCoroutineKt$innerPostTask$2.class */
final class BiliAudioCoroutineKt$innerPostTask$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Function2<CoroutineScope, Continuation<? super Unit>, Object> $action;
    private Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliAudioCoroutineKt$innerPostTask$2(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super BiliAudioCoroutineKt$innerPostTask$2> continuation) {
        super(2, continuation);
        this.$action = function2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BiliAudioCoroutineKt$innerPostTask$2 biliAudioCoroutineKt$innerPostTask$2 = new BiliAudioCoroutineKt$innerPostTask$2(this.$action, continuation);
        biliAudioCoroutineKt$innerPostTask$2.L$0 = obj;
        return biliAudioCoroutineKt$innerPostTask$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Function2<CoroutineScope, Continuation<? super Unit>, Object> function2 = this.$action;
                this.L$0 = SpillingKt.nullOutSpilledVariable(coroutineScope);
                this.label = 1;
                if (function2.invoke(coroutineScope, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e7) {
            com.bilibili.mediastreaming.audio.a.a(IBiliAudioLoggerObserver.Severity.LS_ERROR, "BiliCoroutineScope", "launch error, message:" + e7.getMessage(), e7);
        }
        return Unit.INSTANCE;
    }
}
