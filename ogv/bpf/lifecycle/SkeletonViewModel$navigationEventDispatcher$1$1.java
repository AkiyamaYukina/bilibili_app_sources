package com.bilibili.ogv.bpf.lifecycle;

import kntr.common.compose.launcher.u;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/bpf/lifecycle/SkeletonViewModel$navigationEventDispatcher$1$1.class */
public final class SkeletonViewModel$navigationEventDispatcher$1$1 extends SuspendLambda implements Function2<c, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final SkeletonViewModel<Model> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkeletonViewModel$navigationEventDispatcher$1$1(SkeletonViewModel<Model> skeletonViewModel, Continuation<? super SkeletonViewModel$navigationEventDispatcher$1$1> continuation) {
        super(2, continuation);
        this.this$0 = skeletonViewModel;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SkeletonViewModel$navigationEventDispatcher$1$1 skeletonViewModel$navigationEventDispatcher$1$1 = new SkeletonViewModel$navigationEventDispatcher$1$1(this.this$0, continuation);
        skeletonViewModel$navigationEventDispatcher$1$1.L$0 = obj;
        return skeletonViewModel$navigationEventDispatcher$1$1;
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
        u uVar = ((SkeletonViewModel) this.this$0).navigationEventBridge;
        L2.b bVar = cVar != null ? cVar.f67496c : null;
        u.a aVar = uVar.f;
        aVar.l();
        uVar.e = bVar;
        if (uVar.d && bVar != null) {
            L2.b.a(bVar, aVar);
            aVar.m(bVar.f13947b);
        }
        return Unit.INSTANCE;
    }
}
