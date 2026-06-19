package com.bilibili.ship.theseus.ugc.intro.kingposition;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/kingposition/UgcKingPositionService$onlineNumbersShareGuide$3.class */
final class UgcKingPositionService$onlineNumbersShareGuide$3 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
    boolean Z$0;
    int label;

    public UgcKingPositionService$onlineNumbersShareGuide$3(Continuation<? super UgcKingPositionService$onlineNumbersShareGuide$3> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UgcKingPositionService$onlineNumbersShareGuide$3 ugcKingPositionService$onlineNumbersShareGuide$3 = new UgcKingPositionService$onlineNumbersShareGuide$3(continuation);
        ugcKingPositionService$onlineNumbersShareGuide$3.Z$0 = ((Boolean) obj).booleanValue();
        return ugcKingPositionService$onlineNumbersShareGuide$3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Boolean>) obj2);
    }

    public final Object invoke(boolean z6, Continuation<? super Boolean> continuation) {
        return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Boxing.boxBoolean(this.Z$0);
    }
}
