package com.bilibili.mediastreaming.audio.croutine;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/croutine/BiliAudioCoroutineKt$innerInvoke$1.class */
public final class BiliAudioCoroutineKt$innerInvoke$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Job $job;
    final String $jobName;
    long J$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliAudioCoroutineKt$innerInvoke$1(String str, Job job, Continuation<? super BiliAudioCoroutineKt$innerInvoke$1> continuation) {
        super(2, continuation);
        this.$jobName = str;
        this.$job = job;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliAudioCoroutineKt$innerInvoke$1(this.$jobName, this.$job, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            long jCurrentTimeMillis = System.currentTimeMillis();
            Job job = this.$job;
            this.J$0 = jCurrentTimeMillis;
            this.label = 1;
            if (job.join(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
