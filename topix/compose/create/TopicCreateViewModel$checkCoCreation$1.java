package com.bilibili.topix.compose.create;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/compose/create/TopicCreateViewModel$checkCoCreation$1.class */
final class TopicCreateViewModel$checkCoCreation$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final boolean $checked;
    int label;
    final TopicCreateViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopicCreateViewModel$checkCoCreation$1(TopicCreateViewModel topicCreateViewModel, boolean z6, Continuation<? super TopicCreateViewModel$checkCoCreation$1> continuation) {
        super(2, continuation);
        this.this$0 = topicCreateViewModel;
        this.$checked = z6;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TopicCreateViewModel$checkCoCreation$1(this.this$0, this.$checked, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableStateFlow<C> mutableStateFlow = this.this$0.f112485d;
            C cA = C.a((C) mutableStateFlow.getValue(), null, null, null, null, null, this.$checked, null, 191);
            this.label = 1;
            if (mutableStateFlow.emit(cA, this) == coroutine_suspended) {
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
