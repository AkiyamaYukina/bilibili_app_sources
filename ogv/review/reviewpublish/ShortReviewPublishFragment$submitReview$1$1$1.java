package com.bilibili.ogv.review.reviewpublish;

import com.bilibili.lib.accounts.AccountException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/reviewpublish/ShortReviewPublishFragment$submitReview$1$1$1.class */
public final class ShortReviewPublishFragment$submitReview$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;

    public ShortReviewPublishFragment$submitReview$1$1$1(Continuation<? super ShortReviewPublishFragment$submitReview$1$1$1> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShortReviewPublishFragment$submitReview$1$1$1(continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            com.bilibili.ogv.infra.account.a.f67851a.requestForMyAccountInfo();
        } catch (AccountException e7) {
            BLog.w("ShortReviewPublishFragment$submitReview$1$1$1-invokeSuspend", "[ogv-review-ShortReviewPublishFragment$submitReview$1$1$1-invokeSuspend] " + e7.getMessage(), e7);
        }
        return Unit.INSTANCE;
    }
}
