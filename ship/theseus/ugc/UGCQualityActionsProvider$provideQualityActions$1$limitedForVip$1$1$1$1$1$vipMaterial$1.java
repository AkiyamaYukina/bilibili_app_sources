package com.bilibili.ship.theseus.ugc;

import Vr0.b;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/UGCQualityActionsProvider$provideQualityActions$1$limitedForVip$1$1$1$1$1$vipMaterial$1.class */
public final class UGCQualityActionsProvider$provideQualityActions$1$limitedForVip$1$1$1$1$1$vipMaterial$1 extends SuspendLambda implements Function2<b.C0134b, Continuation<? super Boolean>, Object> {
    Object L$0;
    int label;

    public UGCQualityActionsProvider$provideQualityActions$1$limitedForVip$1$1$1$1$1$vipMaterial$1(Continuation<? super UGCQualityActionsProvider$provideQualityActions$1$limitedForVip$1$1$1$1$1$vipMaterial$1> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        UGCQualityActionsProvider$provideQualityActions$1$limitedForVip$1$1$1$1$1$vipMaterial$1 uGCQualityActionsProvider$provideQualityActions$1$limitedForVip$1$1$1$1$1$vipMaterial$1 = new UGCQualityActionsProvider$provideQualityActions$1$limitedForVip$1$1$1$1$1$vipMaterial$1(continuation);
        uGCQualityActionsProvider$provideQualityActions$1$limitedForVip$1$1$1$1$1$vipMaterial$1.L$0 = obj;
        return uGCQualityActionsProvider$provideQualityActions$1$limitedForVip$1$1$1$1$1$vipMaterial$1;
    }

    public final Object invoke(b.C0134b c0134b, Continuation<? super Boolean> continuation) {
        return create(c0134b, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Boxing.boxBoolean(((b.C0134b) this.L$0) != null);
    }
}
