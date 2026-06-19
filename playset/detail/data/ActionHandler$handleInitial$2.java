package com.bilibili.playset.detail.data;

import com.bilibili.playset.detail.MultiTypeListDetailViewModel;
import com.bilibili.playset.detail.data.f;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/ActionHandler$handleInitial$2.class */
final class ActionHandler$handleInitial$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final f.l $action;
    int label;
    final b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionHandler$handleInitial$2(b bVar, f.l lVar, Continuation<? super ActionHandler$handleInitial$2> continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$action = lVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ActionHandler$handleInitial$2(this.this$0, this.$action, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            MultiTypeListDetailViewModel multiTypeListDetailViewModel = this.this$0.f84456c;
            if (multiTypeListDetailViewModel != null) {
                long j7 = this.$action.f84483a;
                this.label = 1;
                if (multiTypeListDetailViewModel.R0(j7, true) == coroutine_suspended) {
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
