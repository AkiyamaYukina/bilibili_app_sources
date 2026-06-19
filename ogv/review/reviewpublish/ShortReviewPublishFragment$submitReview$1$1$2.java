package com.bilibili.ogv.review.reviewpublish;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/reviewpublish/ShortReviewPublishFragment$submitReview$1$1$2.class */
public final class ShortReviewPublishFragment$submitReview$1$1$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final ShortReviewPublishFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortReviewPublishFragment$submitReview$1$1$2(ShortReviewPublishFragment shortReviewPublishFragment, Continuation<? super ShortReviewPublishFragment$submitReview$1$1$2> continuation) {
        super(2, continuation);
        this.this$0 = shortReviewPublishFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShortReviewPublishFragment$submitReview$1$1$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            String str = this.this$0.f72503q;
            this.label = 1;
            Object objEmit = c.f72526a.emit(str, this);
            if (objEmit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                objEmit = Unit.INSTANCE;
            }
            if (objEmit == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
