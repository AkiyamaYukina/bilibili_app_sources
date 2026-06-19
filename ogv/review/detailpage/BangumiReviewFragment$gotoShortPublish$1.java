package com.bilibili.ogv.review.detailpage;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/BangumiReviewFragment$gotoShortPublish$1.class */
final class BangumiReviewFragment$gotoShortPublish$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final BangumiReviewFragment this$0;

    /* JADX INFO: renamed from: com.bilibili.ogv.review.detailpage.BangumiReviewFragment$gotoShortPublish$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/detailpage/BangumiReviewFragment$gotoShortPublish$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<wl0.c, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final BangumiReviewFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BangumiReviewFragment bangumiReviewFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = bangumiReviewFragment;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(wl0.c cVar, Continuation<? super Unit> continuation) {
            return create(cVar, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                wl0.c cVar = (wl0.c) this.L$0;
                MutableSharedFlow<wl0.c> mutableSharedFlow = this.this$0.f72244p;
                this.label = 1;
                if (mutableSharedFlow.emit(cVar, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BangumiReviewFragment$gotoShortPublish$1(BangumiReviewFragment bangumiReviewFragment, Continuation<? super BangumiReviewFragment$gotoShortPublish$1> continuation) {
        super(2, continuation);
        this.this$0 = bangumiReviewFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BangumiReviewFragment$gotoShortPublish$1(this.this$0, continuation);
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
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
            this.label = 1;
            if (oGVReviewService2.b(false, anonymousClass1, this) == coroutine_suspended) {
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
