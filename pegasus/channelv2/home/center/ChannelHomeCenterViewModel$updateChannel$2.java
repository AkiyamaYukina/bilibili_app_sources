package com.bilibili.pegasus.channelv2.home.center;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/channelv2/home/center/ChannelHomeCenterViewModel$updateChannel$2.class */
final class ChannelHomeCenterViewModel$updateChannel$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final ChannelHomeCenterViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelHomeCenterViewModel$updateChannel$2(ChannelHomeCenterViewModel channelHomeCenterViewModel, Continuation<? super ChannelHomeCenterViewModel$updateChannel$2> continuation) {
        super(2, continuation);
        this.this$0 = channelHomeCenterViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChannelHomeCenterViewModel$updateChannel$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            ChannelHomeCenterViewModel channelHomeCenterViewModel = this.this$0;
            this.label = 1;
            Object objJ0 = channelHomeCenterViewModel.J0(this);
            obj = objJ0;
            if (objJ0 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.this$0.f75267d.setValue((List) obj);
        return Unit.INSTANCE;
    }
}
