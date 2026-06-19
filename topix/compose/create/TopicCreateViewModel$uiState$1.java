package com.bilibili.topix.compose.create;

import androidx.lifecycle.SavedStateHandle;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/compose/create/TopicCreateViewModel$uiState$1.class */
public final class TopicCreateViewModel$uiState$1 extends SuspendLambda implements Function2<C, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final TopicCreateViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopicCreateViewModel$uiState$1(TopicCreateViewModel topicCreateViewModel, Continuation<? super TopicCreateViewModel$uiState$1> continuation) {
        super(2, continuation);
        this.this$0 = topicCreateViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TopicCreateViewModel$uiState$1 topicCreateViewModel$uiState$1 = new TopicCreateViewModel$uiState$1(this.this$0, continuation);
        topicCreateViewModel$uiState$1.L$0 = obj;
        return topicCreateViewModel$uiState$1;
    }

    public final Object invoke(C c7, Continuation<? super Unit> continuation) {
        return create(c7, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        C c7 = (C) this.L$0;
        SavedStateHandle savedStateHandle = this.this$0.f112482a;
        c7.getClass();
        savedStateHandle.set("topic_create_save", new TopicCreationSaveState(c7.f112454c.f112477a.f45498a.getText(), c7.f112455d.f112472a.f45498a.getText(), c7.f112452a, c7.f112453b, c7.f112458g));
        return Unit.INSTANCE;
    }
}
