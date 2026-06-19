package com.bilibili.module.vip.combine;

import androidx.fragment.app.Fragment;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/combine/VipPaymentFloatContainerFragment$generateFragment$2.class */
final class VipPaymentFloatContainerFragment$generateFragment$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Fragment $fragment;
    int label;
    final VipPaymentFloatContainerFragment this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/vip/combine/VipPaymentFloatContainerFragment$generateFragment$2$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final VipPaymentFloatContainerFragment f66142a;

        public a(VipPaymentFloatContainerFragment vipPaymentFloatContainerFragment) {
            this.f66142a = vipPaymentFloatContainerFragment;
        }

        public final Object emit(Object obj, Continuation continuation) {
            if (((Boolean) obj).booleanValue()) {
                VipPaymentFloatContainerFragment vipPaymentFloatContainerFragment = this.f66142a;
                vipPaymentFloatContainerFragment.dismiss();
                Function1<? super Result<Unit>, Unit> function1 = vipPaymentFloatContainerFragment.f66141c;
                Result.Companion companion = Result.Companion;
                function1.invoke(Result.box-impl(Result.constructor-impl(Unit.INSTANCE)));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VipPaymentFloatContainerFragment$generateFragment$2(Fragment fragment, VipPaymentFloatContainerFragment vipPaymentFloatContainerFragment, Continuation<? super VipPaymentFloatContainerFragment$generateFragment$2> continuation) {
        super(2, continuation);
        this.$fragment = fragment;
        this.this$0 = vipPaymentFloatContainerFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VipPaymentFloatContainerFragment$generateFragment$2(this.$fragment, this.this$0, continuation);
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
