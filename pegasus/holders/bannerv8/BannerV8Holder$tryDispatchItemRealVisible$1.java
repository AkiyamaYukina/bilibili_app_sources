package com.bilibili.pegasus.holders.bannerv8;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import q4.C8379B;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/holders/bannerv8/BannerV8Holder$tryDispatchItemRealVisible$1.class */
final class BannerV8Holder$tryDispatchItemRealVisible$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final int $adapterPosition;
    final long $delay;
    int label;
    final BannerV8Holder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerV8Holder$tryDispatchItemRealVisible$1(long j7, BannerV8Holder bannerV8Holder, int i7, Continuation<? super BannerV8Holder$tryDispatchItemRealVisible$1> continuation) {
        super(2, continuation);
        this.$delay = j7;
        this.this$0 = bannerV8Holder;
        this.$adapterPosition = i7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BannerV8Holder$tryDispatchItemRealVisible$1(this.$delay, this.this$0, this.$adapterPosition, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            long j7 = this.$delay;
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
        f fVar = this.this$0.f77684i;
        C8379B.a("tryDispatchItemVisible失败重试 result:", fVar != null ? Boxing.boxBoolean(fVar.dispatchItemRealShow(this.$adapterPosition)) : null, "BannerV8Holder");
        return Unit.INSTANCE;
    }
}
