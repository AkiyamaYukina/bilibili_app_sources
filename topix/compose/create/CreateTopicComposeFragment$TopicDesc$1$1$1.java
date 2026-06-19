package com.bilibili.topix.compose.create;

import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Rect;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/topix/compose/create/CreateTopicComposeFragment$TopicDesc$1$1$1.class */
public final class CreateTopicComposeFragment$TopicDesc$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final MutableState<Rect> $cursorRect$delegate;
    final MutableState<Integer> $parentCoordinatesHeight$delegate;
    final ScrollState $scrollState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateTopicComposeFragment$TopicDesc$1$1$1(ScrollState scrollState, MutableState<Rect> mutableState, MutableState<Integer> mutableState2, Continuation<? super CreateTopicComposeFragment$TopicDesc$1$1$1> continuation) {
        super(2, continuation);
        this.$scrollState = scrollState;
        this.$cursorRect$delegate = mutableState;
        this.$parentCoordinatesHeight$delegate = mutableState2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CreateTopicComposeFragment$TopicDesc$1$1$1(this.$scrollState, this.$cursorRect$delegate, this.$parentCoordinatesHeight$delegate, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            int bottom = (int) this.$cursorRect$delegate.getValue().getBottom();
            int value = this.$scrollState.getValue();
            if (bottom > this.$parentCoordinatesHeight$delegate.getValue().intValue() + this.$scrollState.getValue() || value > bottom) {
                ScrollState scrollState = this.$scrollState;
                int bottom2 = (int) this.$cursorRect$delegate.getValue().getBottom();
                this.label = 1;
                if (scrollState.scrollTo(bottom2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
