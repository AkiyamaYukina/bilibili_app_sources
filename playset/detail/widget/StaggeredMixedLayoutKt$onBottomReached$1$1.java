package com.bilibili.playset.detail.widget;

import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/widget/StaggeredMixedLayoutKt$onBottomReached$1$1.class */
final class StaggeredMixedLayoutKt$onBottomReached$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Function1<Continuation<? super Unit>, Object> $loadMore;
    final State<Boolean> $shouldLoadMore;
    int label;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/widget/StaggeredMixedLayoutKt$onBottomReached$1$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1<Continuation<? super Unit>, Object> f84623a;

        public a(Function1<? super Continuation<? super Unit>, ? extends Object> function1) {
            this.f84623a = function1;
        }

        public final Object emit(Object obj, Continuation continuation) {
            Object objInvoke;
            if (((Boolean) obj).booleanValue()) {
                objInvoke = this.f84623a.invoke(continuation);
                if (objInvoke != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objInvoke = Unit.INSTANCE;
                }
            } else {
                objInvoke = Unit.INSTANCE;
            }
            return objInvoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StaggeredMixedLayoutKt$onBottomReached$1$1(State<Boolean> state, Function1<? super Continuation<? super Unit>, ? extends Object> function1, Continuation<? super StaggeredMixedLayoutKt$onBottomReached$1$1> continuation) {
        super(2, continuation);
        this.$shouldLoadMore = state;
        this.$loadMore = function1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new StaggeredMixedLayoutKt$onBottomReached$1$1(this.$shouldLoadMore, this.$loadMore, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            final State<Boolean> state = this.$shouldLoadMore;
            Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0(state) { // from class: com.bilibili.playset.detail.widget.O

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final State f84621a;

                {
                    this.f84621a = state;
                }

                public final Object invoke() {
                    return Boolean.valueOf(StaggeredMixedLayoutKt$onBottomReached$1$1.invokeSuspend$lambda$0(this.f84621a));
                }
            });
            a aVar = new a(this.$loadMore);
            this.label = 1;
            if (flowSnapshotFlow.collect(aVar, this) == coroutine_suspended) {
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
