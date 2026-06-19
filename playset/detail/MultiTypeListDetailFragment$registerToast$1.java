package com.bilibili.playset.detail;

import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/MultiTypeListDetailFragment$registerToast$1.class */
final class MultiTypeListDetailFragment$registerToast$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final MultiTypeListDetailFragment this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/playset/detail/MultiTypeListDetailFragment$registerToast$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MultiTypeListDetailFragment f84270a;

        public a(MultiTypeListDetailFragment multiTypeListDetailFragment) {
            this.f84270a = multiTypeListDetailFragment;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        /* JADX WARN: Removed duplicated region for block: B:139:0x069b  */
        /* JADX WARN: Removed duplicated region for block: B:195:0x0851  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r18, kotlin.coroutines.Continuation r19) throws kotlin.NoWhenBranchMatchedException {
            /*
                Method dump skipped, instruction units count: 2143
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.playset.detail.MultiTypeListDetailFragment$registerToast$1.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiTypeListDetailFragment$registerToast$1(MultiTypeListDetailFragment multiTypeListDetailFragment, Continuation<? super MultiTypeListDetailFragment$registerToast$1> continuation) {
        super(2, continuation);
        this.this$0 = multiTypeListDetailFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MultiTypeListDetailFragment$registerToast$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            SharedFlow sharedFlow = (SharedFlow) this.this$0.mf().f84281l.getValue();
            a aVar = new a(this.this$0);
            this.label = 1;
            if (sharedFlow.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
