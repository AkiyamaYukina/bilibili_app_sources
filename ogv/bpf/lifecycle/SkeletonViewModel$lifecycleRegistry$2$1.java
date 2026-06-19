package com.bilibili.ogv.bpf.lifecycle;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/bpf/lifecycle/SkeletonViewModel$lifecycleRegistry$2$1.class */
public final class SkeletonViewModel$lifecycleRegistry$2$1 extends SuspendLambda implements Function2<c, Continuation<? super Unit>, Object> {
    final LifecycleRegistry $registry;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkeletonViewModel$lifecycleRegistry$2$1(LifecycleRegistry lifecycleRegistry, Continuation<? super SkeletonViewModel$lifecycleRegistry$2$1> continuation) {
        super(2, continuation);
        this.$registry = lifecycleRegistry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$0(LifecycleRegistry lifecycleRegistry, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        lifecycleRegistry.setCurrentState((Lifecycle.State) RangesKt.coerceAtLeast(event.getTargetState(), Lifecycle.State.CREATED));
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SkeletonViewModel$lifecycleRegistry$2$1 skeletonViewModel$lifecycleRegistry$2$1 = new SkeletonViewModel$lifecycleRegistry$2$1(this.$registry, continuation);
        skeletonViewModel$lifecycleRegistry$2$1.L$0 = obj;
        return skeletonViewModel$lifecycleRegistry$2$1;
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
            this.$registry.setCurrentState(Lifecycle.State.CREATED);
        } else {
            final LifecycleRegistry lifecycleRegistry = this.$registry;
            cVar.f67495b.addObserver(new LifecycleEventObserver(lifecycleRegistry) { // from class: com.bilibili.ogv.bpf.lifecycle.b

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final LifecycleRegistry f67493a;

                {
                    this.f67493a = lifecycleRegistry;
                }

                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    SkeletonViewModel$lifecycleRegistry$2$1.invokeSuspend$lambda$0(this.f67493a, lifecycleOwner, event);
                }
            });
        }
        return Unit.INSTANCE;
    }
}
