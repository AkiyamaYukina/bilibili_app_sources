package com.bilibili.mediastreaming.audio.croutine;

import com.bilibili.mediastreaming.audio.IBiliAudioLoggerObserver;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/croutine/BiliAudioCoroutineKt$innerPostTask$1.class */
public final class BiliAudioCoroutineKt$innerPostTask$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Function0<Unit> $block;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliAudioCoroutineKt$innerPostTask$1(Function0<Unit> function0, Continuation<? super BiliAudioCoroutineKt$innerPostTask$1> continuation) {
        super(2, continuation);
        this.$block = function0;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliAudioCoroutineKt$innerPostTask$1(this.$block, continuation);
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
        try {
            this.$block.invoke();
        } catch (Exception e7) {
            com.bilibili.mediastreaming.audio.a.a(IBiliAudioLoggerObserver.Severity.LS_ERROR, "BiliCoroutineScope", "launch error, message:" + e7.getMessage(), e7);
        }
        return Unit.INSTANCE;
    }
}
