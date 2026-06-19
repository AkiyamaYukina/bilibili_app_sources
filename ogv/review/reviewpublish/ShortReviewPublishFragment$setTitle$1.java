package com.bilibili.ogv.review.reviewpublish;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/review/reviewpublish/ShortReviewPublishFragment$setTitle$1.class */
final class ShortReviewPublishFragment$setTitle$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $title;
    int label;
    final ShortReviewPublishFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortReviewPublishFragment$setTitle$1(ShortReviewPublishFragment shortReviewPublishFragment, String str, Continuation<? super ShortReviewPublishFragment$setTitle$1> continuation) {
        super(2, continuation);
        this.this$0 = shortReviewPublishFragment;
        this.$title = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShortReviewPublishFragment$setTitle$1(this.this$0, this.$title, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableSharedFlow<String> mutableSharedFlow = this.this$0.f72509w;
            String str = this.$title;
            String str2 = str;
            if (str == null) {
                str2 = "";
            }
            this.label = 1;
            if (mutableSharedFlow.emit(str2, this) == coroutine_suspended) {
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
