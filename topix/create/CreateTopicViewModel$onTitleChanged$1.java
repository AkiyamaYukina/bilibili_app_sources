package com.bilibili.topix.create;

import com.bilibili.topix.utils.IntervalQuerySubmitter;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/create/CreateTopicViewModel$onTitleChanged$1.class */
final class CreateTopicViewModel$onTitleChanged$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $title;
    int label;
    final CreateTopicViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateTopicViewModel$onTitleChanged$1(CreateTopicViewModel createTopicViewModel, String str, Continuation<? super CreateTopicViewModel$onTitleChanged$1> continuation) {
        super(2, continuation);
        this.this$0 = createTopicViewModel;
        this.$title = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateTopicViewModel$onTitleChanged$1(this.this$0, this.$title, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            IntervalQuerySubmitter<String> intervalQuerySubmitter = this.this$0.f112587f;
            String str = this.$title;
            this.label = 1;
            if (intervalQuerySubmitter.b(str, false, this) == coroutine_suspended) {
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
