package com.bilibili.tgwt.im.ui;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import sl0.C8597a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/TogetherWatchChangeRoomFragment$dataWhenEpChange$1.class */
public final class TogetherWatchChangeRoomFragment$dataWhenEpChange$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final C8597a $data;
    int label;
    final TogetherWatchChangeRoomFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TogetherWatchChangeRoomFragment$dataWhenEpChange$1(TogetherWatchChangeRoomFragment togetherWatchChangeRoomFragment, C8597a c8597a, Continuation<? super TogetherWatchChangeRoomFragment$dataWhenEpChange$1> continuation) {
        super(2, continuation);
        this.this$0 = togetherWatchChangeRoomFragment;
        this.$data = c8597a;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new TogetherWatchChangeRoomFragment$dataWhenEpChange$1(this.this$0, this.$data, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableStateFlow<C8597a> mutableStateFlow = this.this$0.f111286m;
            C8597a c8597a = this.$data;
            this.label = 1;
            if (mutableStateFlow.emit(c8597a, this) == coroutine_suspended) {
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
