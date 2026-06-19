package com.bilibili.ogv.operation2;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.bilibili.ogv.operation2.BangumiHomeFlowFragmentV5;
import kntr.base.android.legacy.context.ContextUtilKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/BangumiHomeFlowFragmentV5$PageModelHolder$init$1$2$1.class */
public final class BangumiHomeFlowFragmentV5$PageModelHolder$init$1$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final boolean $enabled;
    int label;
    final BangumiHomeFlowFragmentV5.PageModelHolder this$0;

    /* JADX INFO: renamed from: com.bilibili.ogv.operation2.BangumiHomeFlowFragmentV5$PageModelHolder$init$1$2$1$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/operation2/BangumiHomeFlowFragmentV5$PageModelHolder$init$1$2$1$1.class */
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final boolean $enabled;
        int label;
        final BangumiHomeFlowFragmentV5.PageModelHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(BangumiHomeFlowFragmentV5.PageModelHolder pageModelHolder, boolean z6, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = pageModelHolder;
            this.$enabled = z6;
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, this.$enabled, continuation);
        }

        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                com.bilibili.ogv.bpf.lifecycle.e uiEnvironmentHolder = this.this$0.getUiEnvironmentHolder();
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
            ContextUtilKt.requireActivity(((com.bilibili.ogv.bpf.lifecycle.c) obj).f67494a).getWindow().setColorMode(this.$enabled ? 2 : 0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BangumiHomeFlowFragmentV5$PageModelHolder$init$1$2$1(BangumiHomeFlowFragmentV5.PageModelHolder pageModelHolder, boolean z6, Continuation<? super BangumiHomeFlowFragmentV5$PageModelHolder$init$1$2$1> continuation) {
        super(2, continuation);
        this.this$0 = pageModelHolder;
        this.$enabled = z6;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BangumiHomeFlowFragmentV5$PageModelHolder$init$1$2$1(this.this$0, this.$enabled, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            BangumiHomeFlowFragmentV5.PageModelHolder pageModelHolder = this.this$0;
            Lifecycle.State state = Lifecycle.State.STARTED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(pageModelHolder, this.$enabled, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(pageModelHolder, state, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) anonymousClass1, (Continuation<? super Unit>) this) == coroutine_suspended) {
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
