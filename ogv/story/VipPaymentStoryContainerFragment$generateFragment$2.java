package com.bilibili.ogv.story;

import androidx.fragment.app.Fragment;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/story/VipPaymentStoryContainerFragment$generateFragment$2.class */
final class VipPaymentStoryContainerFragment$generateFragment$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Fragment $fragment;
    int label;
    final VipPaymentStoryContainerFragment this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/story/VipPaymentStoryContainerFragment$generateFragment$2$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final VipPaymentStoryContainerFragment f73052a;

        public a(VipPaymentStoryContainerFragment vipPaymentStoryContainerFragment) {
            this.f73052a = vipPaymentStoryContainerFragment;
        }

        public final Object emit(Object obj, Continuation continuation) {
            if (((Boolean) obj).booleanValue()) {
                this.f73052a.dismiss();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VipPaymentStoryContainerFragment$generateFragment$2(Fragment fragment, VipPaymentStoryContainerFragment vipPaymentStoryContainerFragment, Continuation<? super VipPaymentStoryContainerFragment$generateFragment$2> continuation) {
        super(2, continuation);
        this.$fragment = fragment;
        this.this$0 = vipPaymentStoryContainerFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VipPaymentStoryContainerFragment$generateFragment$2(this.$fragment, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowJe = this.$fragment.je();
            a aVar = new a(this.this$0);
            this.label = 1;
            if (flowJe.collect(aVar, this) == coroutine_suspended) {
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
