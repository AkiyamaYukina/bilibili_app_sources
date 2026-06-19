package com.bilibili.player.tangram.playercore;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSFacadeImpl$seekTo$2.class */
public final class PCSFacadeImpl$seekTo$2 extends SuspendLambda implements Function2<Integer, Continuation<? super Boolean>, Object> {
    int I$0;
    int label;

    public PCSFacadeImpl$seekTo$2(Continuation<? super PCSFacadeImpl$seekTo$2> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PCSFacadeImpl$seekTo$2 pCSFacadeImpl$seekTo$2 = new PCSFacadeImpl$seekTo$2(continuation);
        pCSFacadeImpl$seekTo$2.I$0 = ((Number) obj).intValue();
        return pCSFacadeImpl$seekTo$2;
    }

    public final Object invoke(int i7, Continuation<? super Boolean> continuation) {
        return create(Integer.valueOf(i7), continuation).invokeSuspend(Unit.INSTANCE);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), (Continuation<? super Boolean>) obj2);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Boxing.boxBoolean(this.I$0 >= 3);
    }
}
