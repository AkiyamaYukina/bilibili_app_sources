package com.bilibili.ogv.review.detailpage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/BangumiReviewFragment$menuVm$2$1.class */
public final class BangumiReviewFragment$menuVm$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final BangumiReviewFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BangumiReviewFragment$menuVm$2$1(BangumiReviewFragment bangumiReviewFragment, Continuation<? super BangumiReviewFragment$menuVm$2$1> continuation) {
        super(2, continuation);
        this.this$0 = bangumiReviewFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BangumiReviewFragment$menuVm$2$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            OGVReviewService oGVReviewService = this.this$0.f72241m;
            OGVReviewService oGVReviewService2 = oGVReviewService;
            if (oGVReviewService == null) {
                Intrinsics.throwUninitializedPropertyAccessException("reviewService");
                oGVReviewService2 = null;
            }
            BangumiReviewFragment bangumiReviewFragment = this.this$0;
            this.label = 1;
            if (oGVReviewService2.a(bangumiReviewFragment, true, this) == coroutine_suspended) {
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
