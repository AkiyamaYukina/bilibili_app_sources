package com.bilibili.playset.detail;

import fs0.InterfaceC7170a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/MultiTypeListDetailViewModel$reportShareCount$1.class */
final class MultiTypeListDetailViewModel$reportShareCount$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $playlistId;
    int label;
    final MultiTypeListDetailViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiTypeListDetailViewModel$reportShareCount$1(MultiTypeListDetailViewModel multiTypeListDetailViewModel, long j7, Continuation<? super MultiTypeListDetailViewModel$reportShareCount$1> continuation) {
        super(2, continuation);
        this.this$0 = multiTypeListDetailViewModel;
        this.$playlistId = j7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MultiTypeListDetailViewModel$reportShareCount$1(this.this$0, this.$playlistId, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            InterfaceC7170a interfaceC7170a = this.this$0.f84273c;
            long j7 = this.$playlistId;
            this.label = 1;
            if (interfaceC7170a.b(j7) == coroutine_suspended) {
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
