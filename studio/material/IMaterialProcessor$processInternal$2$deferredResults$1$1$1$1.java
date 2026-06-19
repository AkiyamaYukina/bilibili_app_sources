package com.bilibili.studio.material;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.SendChannel;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/IMaterialProcessor$processInternal$2$deferredResults$1$1$1$1.class */
public final class IMaterialProcessor$processInternal$2$deferredResults$1$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Ref.IntRef $processProgress;
    final int $progress;
    final SendChannel<h> $sendChannel;
    final float $speed;
    final int $totalProgress;
    int I$0;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public IMaterialProcessor$processInternal$2$deferredResults$1$1$1$1(int i7, int i8, SendChannel<? super h> sendChannel, float f7, Ref.IntRef intRef, Continuation<? super IMaterialProcessor$processInternal$2$deferredResults$1$1$1$1> continuation) {
        super(2, continuation);
        this.$progress = i7;
        this.$totalProgress = i8;
        this.$sendChannel = sendChannel;
        this.$speed = f7;
        this.$processProgress = intRef;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IMaterialProcessor$processInternal$2$deferredResults$1$1$1$1(this.$progress, this.$totalProgress, this.$sendChannel, this.$speed, this.$processProgress, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        int i7;
        Ref.IntRef intRef;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        if (i8 == 0) {
            ResultKt.throwOnFailure(obj);
            i7 = (int) ((this.$progress / this.$totalProgress) * 90);
            SendChannel<h> sendChannel = this.$sendChannel;
            float f7 = this.$speed;
            intRef = this.$processProgress;
            h hVar = new h(f7, i7 - intRef.element);
            this.L$0 = intRef;
            this.I$0 = i7;
            this.label = 1;
            if (sendChannel.send(hVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i8 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i7 = this.I$0;
            Ref.IntRef intRef2 = (Ref.IntRef) this.L$0;
            ResultKt.throwOnFailure(obj);
            intRef = intRef2;
        }
        intRef.element = i7;
        return Unit.INSTANCE;
    }
}
