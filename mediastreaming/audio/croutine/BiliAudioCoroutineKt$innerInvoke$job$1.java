package com.bilibili.mediastreaming.audio.croutine;

import androidx.fragment.app.z;
import com.bilibili.mediastreaming.audio.IBiliAudioLoggerObserver;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/croutine/BiliAudioCoroutineKt$innerInvoke$job$1.class */
public final class BiliAudioCoroutineKt$innerInvoke$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Function0<T> $block;
    final String $jobName;
    final Ref.ObjectRef<T> $result;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public BiliAudioCoroutineKt$innerInvoke$job$1(Ref.ObjectRef<T> objectRef, Function0<? extends T> function0, String str, Continuation<? super BiliAudioCoroutineKt$innerInvoke$job$1> continuation) {
        super(2, continuation);
        this.$result = objectRef;
        this.$block = function0;
        this.$jobName = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliAudioCoroutineKt$innerInvoke$job$1(this.$result, this.$block, this.$jobName, continuation);
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
            this.$result.element = this.$block.invoke();
        } catch (Exception e7) {
            com.bilibili.mediastreaming.audio.a.a(IBiliAudioLoggerObserver.Severity.LS_ERROR, "BiliCoroutineScope", z.a("launch jobName:", this.$jobName, ", exception, message:", e7.getMessage()), e7);
        }
        return Unit.INSTANCE;
    }
}
