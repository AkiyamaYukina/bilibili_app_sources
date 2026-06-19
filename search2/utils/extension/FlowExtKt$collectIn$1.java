package com.bilibili.search2.utils.extension;

import androidx.lifecycle.FlowExtKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/utils/extension/FlowExtKt$collectIn$1.class */
final class FlowExtKt$collectIn$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Function1<Object, Unit> $action;
    final LifecycleOwner $lifecycleOwner;
    final Lifecycle.State $minActiveState;
    final Flow<Object> $this_collectIn;
    int label;

    /* JADX INFO: renamed from: com.bilibili.search2.utils.extension.FlowExtKt$collectIn$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/utils/extension/FlowExtKt$collectIn$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<Object, Continuation<? super Unit>, Object> {
        final Function1<Object, Unit> $action;
        Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Function1<Object, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$action = function1;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$action, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        public final Object invoke(Object obj, Continuation<? super Unit> continuation) {
            return create(obj, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$action.invoke(this.L$0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$collectIn$1(Flow<Object> flow, LifecycleOwner lifecycleOwner, Lifecycle.State state, Function1<Object, Unit> function1, Continuation<? super FlowExtKt$collectIn$1> continuation) {
        super(2, continuation);
        this.$this_collectIn = flow;
        this.$lifecycleOwner = lifecycleOwner;
        this.$minActiveState = state;
        this.$action = function1;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FlowExtKt$collectIn$1(this.$this_collectIn, this.$lifecycleOwner, this.$minActiveState, this.$action, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowOnEach = FlowKt.onEach(FlowExtKt.flowWithLifecycle(this.$this_collectIn, this.$lifecycleOwner.getLifecycle(), this.$minActiveState), new AnonymousClass1(this.$action, null));
            this.label = 1;
            if (FlowKt.collect(flowOnEach, this) == coroutine_suspended) {
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
