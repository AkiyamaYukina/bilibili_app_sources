package com.bilibili.pegasus.holders.bannerv8;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/AdTopBannerSelector$collectSelectedSplashId$1$1$2.class */
public final class AdTopBannerSelector$collectSelectedSplashId$1$1$2 extends SuspendLambda implements Function2<Long, Continuation<? super Boolean>, Object> {
    int label;
    final c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdTopBannerSelector$collectSelectedSplashId$1$1$2(c cVar, Continuation<? super AdTopBannerSelector$collectSelectedSplashId$1$1$2> continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AdTopBannerSelector$collectSelectedSplashId$1$1$2(this.this$0, continuation);
    }

    public final Object invoke(long j7, Continuation<? super Boolean> continuation) {
        return create(Long.valueOf(j7), continuation).invokeSuspend(Unit.INSTANCE);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).longValue(), (Continuation<? super Boolean>) obj2);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Boxing.boxBoolean(!this.this$0.h.get());
    }
}
