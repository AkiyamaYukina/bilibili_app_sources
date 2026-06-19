package com.bilibili.player.tangram.basic;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/basic/CompoundPlayStateProviderImpl$associateWith$2.class */
public final class CompoundPlayStateProviderImpl$associateWith$2 extends SuspendLambda implements Function2<PlayerAvailability, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final CompoundPlayStateProviderImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompoundPlayStateProviderImpl$associateWith$2(CompoundPlayStateProviderImpl compoundPlayStateProviderImpl, Continuation<? super CompoundPlayStateProviderImpl$associateWith$2> continuation) {
        super(2, continuation);
        this.this$0 = compoundPlayStateProviderImpl;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        CompoundPlayStateProviderImpl$associateWith$2 compoundPlayStateProviderImpl$associateWith$2 = new CompoundPlayStateProviderImpl$associateWith$2(this.this$0, continuation);
        compoundPlayStateProviderImpl$associateWith$2.L$0 = obj;
        return compoundPlayStateProviderImpl$associateWith$2;
    }

    public final Object invoke(PlayerAvailability playerAvailability, Continuation<? super Unit> continuation) {
        return create(playerAvailability, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.f79286c.setValue((PlayerAvailability) this.L$0);
        return Unit.INSTANCE;
    }
}
