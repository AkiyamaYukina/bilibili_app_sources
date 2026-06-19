package com.bilibili.ogv.bpf.lifecycle;

import kntr.common.trio.toast.ToastDuration;
import kntr.common.trio.toast.ToastGravity;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/bpf/lifecycle/SkeletonViewModel$toaster$2$1$showToast$1.class */
public final class SkeletonViewModel$toaster$2$1$showToast$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final ToastDuration $duration;
    final ToastGravity $gravity;
    final String $message;
    int label;
    final SkeletonViewModel<Model> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkeletonViewModel$toaster$2$1$showToast$1(SkeletonViewModel<Model> skeletonViewModel, String str, ToastDuration toastDuration, ToastGravity toastGravity, Continuation<? super SkeletonViewModel$toaster$2$1$showToast$1> continuation) {
        super(2, continuation);
        this.this$0 = skeletonViewModel;
        this.$message = str;
        this.$duration = toastDuration;
        this.$gravity = toastGravity;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SkeletonViewModel$toaster$2$1$showToast$1(this.this$0, this.$message, this.$duration, this.$gravity, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            e uiEnvironmentHolder = this.this$0.getUiEnvironmentHolder();
            this.label = 1;
            Object objFirst = FlowKt.first(FlowKt.filterNotNull(uiEnvironmentHolder.f67498a), this);
            obj = objFirst;
            if (objFirst == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        new U71.a(((c) obj).f67494a).showToast(this.$message, this.$duration, this.$gravity);
        return Unit.INSTANCE;
    }
}
