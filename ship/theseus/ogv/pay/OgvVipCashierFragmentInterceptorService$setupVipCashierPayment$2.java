package com.bilibili.ship.theseus.ogv.pay;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/pay/OgvVipCashierFragmentInterceptorService$setupVipCashierPayment$2.class */
final class OgvVipCashierFragmentInterceptorService$setupVipCashierPayment$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Object $fragment;
    int label;
    final OgvVipCashierFragmentInterceptorService this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/pay/OgvVipCashierFragmentInterceptorService$setupVipCashierPayment$2$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OgvVipCashierFragmentInterceptorService f94171a;

        public a(OgvVipCashierFragmentInterceptorService ogvVipCashierFragmentInterceptorService) {
            this.f94171a = ogvVipCashierFragmentInterceptorService;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final Object emit(Object obj, Continuation continuation) throws NoWhenBranchMatchedException {
            uK0.b bVar = (uK0.a) obj;
            if (!(bVar instanceof uK0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            OgvPayService ogvPayService = this.f94171a.f94166c;
            uK0.b bVar2 = bVar;
            uK0.c cVar = bVar2.b;
            OgvPayService.a(ogvPayService, null, cVar != null ? cVar.b : null, cVar != null ? Boxing.boxLong(cVar.a) : null, (String) bVar2.a.get("section"), 1);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvVipCashierFragmentInterceptorService$setupVipCashierPayment$2(Object obj, OgvVipCashierFragmentInterceptorService ogvVipCashierFragmentInterceptorService, Continuation<? super OgvVipCashierFragmentInterceptorService$setupVipCashierPayment$2> continuation) {
        super(2, continuation);
        this.$fragment = obj;
        this.this$0 = ogvVipCashierFragmentInterceptorService;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.fragment.app.Fragment, java.lang.Object] */
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvVipCashierFragmentInterceptorService$setupVipCashierPayment$2(this.$fragment, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowN9 = ((uK0.e) this.$fragment).N9();
            a aVar = new a(this.this$0);
            this.label = 1;
            if (flowN9.collect(aVar, this) == coroutine_suspended) {
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
