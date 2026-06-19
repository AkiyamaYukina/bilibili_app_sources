package com.bilibili.playset.detail.data;

import com.bilibili.playset.detail.MultiTypeListDetailViewModel;
import com.bilibili.playset.detail.data.f;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/data/ActionHandler$handleClearInvalidVideo$1.class */
final class ActionHandler$handleClearInvalidVideo$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final f.e $action;
    final h $state;
    int label;
    final b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionHandler$handleClearInvalidVideo$1(b bVar, f.e eVar, h hVar, Continuation<? super ActionHandler$handleClearInvalidVideo$1> continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$action = eVar;
        this.$state = hVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ActionHandler$handleClearInvalidVideo$1(this.this$0, this.$action, this.$state, continuation);
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
                com.bilibili.playset.api.c cVar = this.$action.f84473a;
                Long lBoxLong = Boxing.boxLong(this.$state.f84513a);
                this.label = 1;
                if (multiTypeListDetailViewModel.S0(cVar, lBoxLong, this) == coroutine_suspended) {
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
