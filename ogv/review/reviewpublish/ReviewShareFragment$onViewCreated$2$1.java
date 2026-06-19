package com.bilibili.ogv.review.reviewpublish;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/reviewpublish/ReviewShareFragment$onViewCreated$2$1.class */
public final class ReviewShareFragment$onViewCreated$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final ReviewShareFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewShareFragment$onViewCreated$2$1(ReviewShareFragment reviewShareFragment, Continuation<? super ReviewShareFragment$onViewCreated$2$1> continuation) {
        super(2, continuation);
        this.this$0 = reviewShareFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ReviewShareFragment$onViewCreated$2$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ReviewShareFragment reviewShareFragment = this.this$0;
            this.label = 1;
            if (ReviewShareFragment.hf(reviewShareFragment, this) == coroutine_suspended) {
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
