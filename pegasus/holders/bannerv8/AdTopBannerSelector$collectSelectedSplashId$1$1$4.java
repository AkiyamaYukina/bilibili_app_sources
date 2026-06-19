package com.bilibili.pegasus.holders.bannerv8;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/AdTopBannerSelector$collectSelectedSplashId$1$1$4.class */
public final class AdTopBannerSelector$collectSelectedSplashId$1$1$4 extends SuspendLambda implements Function2<Long, Continuation<? super Unit>, Object> {
    long J$0;
    int label;
    final c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdTopBannerSelector$collectSelectedSplashId$1$1$4(c cVar, Continuation<? super AdTopBannerSelector$collectSelectedSplashId$1$1$4> continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AdTopBannerSelector$collectSelectedSplashId$1$1$4 adTopBannerSelector$collectSelectedSplashId$1$1$4 = new AdTopBannerSelector$collectSelectedSplashId$1$1$4(this.this$0, continuation);
        adTopBannerSelector$collectSelectedSplashId$1$1$4.J$0 = ((Number) obj).longValue();
        return adTopBannerSelector$collectSelectedSplashId$1$1$4;
    }

    public final Object invoke(long j7, Continuation<? super Unit> continuation) {
        return create(Long.valueOf(j7), continuation).invokeSuspend(Unit.INSTANCE);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).longValue(), (Continuation<? super Unit>) obj2);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.a(this.J$0);
        return Unit.INSTANCE;
    }
}
