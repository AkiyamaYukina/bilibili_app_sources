package com.bilibili.playset.detail;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/MultiTypeListDetailViewModel$emitEvent$1.class */
public final class MultiTypeListDetailViewModel$emitEvent$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Function1<Continuation<? super com.bilibili.playset.detail.data.g>, Object> $builder;
    int label;
    final MultiTypeListDetailViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiTypeListDetailViewModel$emitEvent$1(Function1<? super Continuation<? super com.bilibili.playset.detail.data.g>, ? extends Object> function1, MultiTypeListDetailViewModel multiTypeListDetailViewModel, Continuation<? super MultiTypeListDetailViewModel$emitEvent$1> continuation) {
        super(2, continuation);
        this.$builder = function1;
        this.this$0 = multiTypeListDetailViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MultiTypeListDetailViewModel$emitEvent$1(this.$builder, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Function1<Continuation<? super com.bilibili.playset.detail.data.g>, Object> function1 = this.$builder;
            this.label = 1;
            Object objInvoke = function1.invoke(this);
            obj = objInvoke;
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                if (i7 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
        }
        com.bilibili.playset.detail.data.g gVar = (com.bilibili.playset.detail.data.g) obj;
        if (gVar != null) {
            MutableSharedFlow<com.bilibili.playset.detail.data.g> mutableSharedFlow = this.this$0.f84280k;
            this.label = 2;
            if (mutableSharedFlow.emit(gVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
