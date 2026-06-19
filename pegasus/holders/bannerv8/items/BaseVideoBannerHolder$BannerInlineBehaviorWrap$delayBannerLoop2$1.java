package com.bilibili.pegasus.holders.bannerv8.items;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/items/BaseVideoBannerHolder$BannerInlineBehaviorWrap$delayBannerLoop2$1.class */
final class BaseVideoBannerHolder$BannerInlineBehaviorWrap$delayBannerLoop2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $delayMs;
    int label;
    final g<Th.b> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseVideoBannerHolder$BannerInlineBehaviorWrap$delayBannerLoop2$1(long j7, g<Th.b> gVar, Continuation<? super BaseVideoBannerHolder$BannerInlineBehaviorWrap$delayBannerLoop2$1> continuation) {
        super(2, continuation);
        this.$delayMs = j7;
        this.this$0 = gVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BaseVideoBannerHolder$BannerInlineBehaviorWrap$delayBannerLoop2$1(this.$delayMs, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            long j7 = this.$delayMs;
            this.label = 1;
            if (DelayKt.delay(j7, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        g.p0(this.this$0);
        this.this$0.f77766n = null;
        return Unit.INSTANCE;
    }
}
