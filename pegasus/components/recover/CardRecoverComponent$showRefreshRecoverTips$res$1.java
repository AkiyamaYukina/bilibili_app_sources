package com.bilibili.pegasus.components.recover;

import android.view.ViewGroup;
import com.bilibili.pegasus.data.config.FlushRecoverConfig;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/components/recover/CardRecoverComponent$showRefreshRecoverTips$res$1.class */
final class CardRecoverComponent$showRefreshRecoverTips$res$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final FlushRecoverConfig $config;
    final int $flushType;
    final ViewGroup $rootView;
    int label;
    final CardRecoverComponent this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardRecoverComponent$showRefreshRecoverTips$res$1(CardRecoverComponent cardRecoverComponent, ViewGroup viewGroup, int i7, FlushRecoverConfig flushRecoverConfig, Continuation<? super CardRecoverComponent$showRefreshRecoverTips$res$1> continuation) {
        super(2, continuation);
        this.this$0 = cardRecoverComponent;
        this.$rootView = viewGroup;
        this.$flushType = i7;
        this.$config = flushRecoverConfig;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CardRecoverComponent$showRefreshRecoverTips$res$1(this.this$0, this.$rootView, this.$flushType, this.$config, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowCallbackFlow = FlowKt.callbackFlow(new CardRecoverComponent$showRefreshRecoverTips$res$1$result$1(this.this$0, this.$rootView, this.$flushType, this.$config, null));
            this.label = 1;
            Object objFirstOrNull = FlowKt.firstOrNull(flowCallbackFlow, this);
            obj = objFirstOrNull;
            if (objFirstOrNull == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return (Boolean) obj;
    }
}
