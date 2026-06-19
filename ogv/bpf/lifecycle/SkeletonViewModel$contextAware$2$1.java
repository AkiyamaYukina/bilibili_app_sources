package com.bilibili.ogv.bpf.lifecycle;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/bpf/lifecycle/SkeletonViewModel$contextAware$2$1.class */
public final class SkeletonViewModel$contextAware$2$1 extends SuspendLambda implements Function2<c, Continuation<? super Unit>, Object> {
    final k.b $helper;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkeletonViewModel$contextAware$2$1(k.b bVar, Continuation<? super SkeletonViewModel$contextAware$2$1> continuation) {
        super(2, continuation);
        this.$helper = bVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SkeletonViewModel$contextAware$2$1 skeletonViewModel$contextAware$2$1 = new SkeletonViewModel$contextAware$2$1(this.$helper, continuation);
        skeletonViewModel$contextAware$2$1.L$0 = obj;
        return skeletonViewModel$contextAware$2$1;
    }

    public final Object invoke(c cVar, Continuation<? super Unit> continuation) {
        return create(cVar, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        c cVar = (c) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (cVar == null) {
            this.$helper.f122668b = null;
        } else {
            this.$helper.a(cVar.f67494a);
        }
        return Unit.INSTANCE;
    }
}
