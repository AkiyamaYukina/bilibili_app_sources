package com.bilibili.ogv.review.reviewpublish;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/reviewpublish/ShortReviewPublishFragment$delete$1.class */
final class ShortReviewPublishFragment$delete$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final ShortReviewPublishFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortReviewPublishFragment$delete$1(ShortReviewPublishFragment shortReviewPublishFragment, Continuation<? super ShortReviewPublishFragment$delete$1> continuation) {
        super(2, continuation);
        this.this$0 = shortReviewPublishFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShortReviewPublishFragment$delete$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0176  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 515
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ogv.review.reviewpublish.ShortReviewPublishFragment$delete$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
