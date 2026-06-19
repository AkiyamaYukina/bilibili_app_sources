package com.bilibili.ship.theseus.ogv.pay;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/pay/OgvVipCashierFragmentInterceptorService$setupVipCashierPayment$1.class */
final class OgvVipCashierFragmentInterceptorService$setupVipCashierPayment$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Object $fragment;
    int label;
    final OgvVipCashierFragmentInterceptorService this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/pay/OgvVipCashierFragmentInterceptorService$setupVipCashierPayment$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OgvVipCashierFragmentInterceptorService f94170a;

        public a(OgvVipCashierFragmentInterceptorService ogvVipCashierFragmentInterceptorService) {
            this.f94170a = ogvVipCashierFragmentInterceptorService;
        }

        public final Object emit(Object obj, Continuation continuation) {
            Unit unit;
            if (((Boolean) obj).booleanValue()) {
                this.f94170a.f94165b.a();
                unit = Unit.INSTANCE;
            } else {
                unit = Unit.INSTANCE;
            }
            return unit;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvVipCashierFragmentInterceptorService$setupVipCashierPayment$1(Object obj, OgvVipCashierFragmentInterceptorService ogvVipCashierFragmentInterceptorService, Continuation<? super OgvVipCashierFragmentInterceptorService$setupVipCashierPayment$1> continuation) {
        super(2, continuation);
        this.$fragment = obj;
        this.this$0 = ogvVipCashierFragmentInterceptorService;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.fragment.app.Fragment, java.lang.Object] */
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvVipCashierFragmentInterceptorService$setupVipCashierPayment$1(this.$fragment, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowJe = ((uK0.e) this.$fragment).je();
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
