package com.bilibili.mediastreaming.audio.track;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/track/BiliAudioRecordTrack$runOnDefaultCoroutine$1.class */
final class BiliAudioRecordTrack$runOnDefaultCoroutine$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Function0<Unit> $block;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliAudioRecordTrack$runOnDefaultCoroutine$1(Function0<Unit> function0, Continuation<? super BiliAudioRecordTrack$runOnDefaultCoroutine$1> continuation) {
        super(2, continuation);
        this.$block = function0;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliAudioRecordTrack$runOnDefaultCoroutine$1(this.$block, continuation);
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
        this.$block.invoke();
        return Unit.INSTANCE;
    }
}
