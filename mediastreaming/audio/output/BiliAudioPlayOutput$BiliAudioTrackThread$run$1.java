package com.bilibili.mediastreaming.audio.output;

import com.bilibili.mediastreaming.audio.output.BiliAudioPlayOutput;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nh0.C8093a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mediastreaming/audio/output/BiliAudioPlayOutput$BiliAudioTrackThread$run$1.class */
public final class BiliAudioPlayOutput$BiliAudioTrackThread$run$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final BiliAudioPlayOutput this$0;
    final BiliAudioPlayOutput.BiliAudioTrackThread this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BiliAudioPlayOutput$BiliAudioTrackThread$run$1(BiliAudioPlayOutput biliAudioPlayOutput, BiliAudioPlayOutput.BiliAudioTrackThread biliAudioTrackThread, Continuation<? super BiliAudioPlayOutput$BiliAudioTrackThread$run$1> continuation) {
        super(2, continuation);
        this.this$0 = biliAudioPlayOutput;
        this.this$1 = biliAudioTrackThread;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BiliAudioPlayOutput$BiliAudioTrackThread$run$1(this.this$0, this.this$1, continuation);
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
        iC.f fVar = this.this$0.f65721d;
        if (fVar != null) {
            C8093a c8093a = this.this$1.f65726e;
            Iterator it = fVar.a.values().iterator();
            while (it.hasNext()) {
                ((iC.b) it.next()).b(c8093a);
            }
        }
        return Unit.INSTANCE;
    }
}
