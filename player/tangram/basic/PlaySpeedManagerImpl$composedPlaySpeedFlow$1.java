package com.bilibili.player.tangram.basic;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/PlaySpeedManagerImpl$composedPlaySpeedFlow$1.class */
public final class PlaySpeedManagerImpl$composedPlaySpeedFlow$1 extends SuspendLambda implements Function3<Float, Float, Continuation<? super Float>, Object> {
    float F$0;
    Object L$0;
    int label;

    public PlaySpeedManagerImpl$composedPlaySpeedFlow$1(Continuation<? super PlaySpeedManagerImpl$composedPlaySpeedFlow$1> continuation) {
        super(3, continuation);
    }

    public final Object invoke(float f7, Float f8, Continuation<? super Float> continuation) {
        PlaySpeedManagerImpl$composedPlaySpeedFlow$1 playSpeedManagerImpl$composedPlaySpeedFlow$1 = new PlaySpeedManagerImpl$composedPlaySpeedFlow$1(continuation);
        playSpeedManagerImpl$composedPlaySpeedFlow$1.F$0 = f7;
        playSpeedManagerImpl$composedPlaySpeedFlow$1.L$0 = f8;
        return playSpeedManagerImpl$composedPlaySpeedFlow$1.invokeSuspend(Unit.INSTANCE);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke(((Number) obj).floatValue(), (Float) obj2, (Continuation<? super Float>) obj3);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        float fFloatValue = this.F$0;
        Float f7 = (Float) this.L$0;
        if (f7 != null) {
            fFloatValue = f7.floatValue();
        }
        return Boxing.boxFloat(fFloatValue);
    }
}
