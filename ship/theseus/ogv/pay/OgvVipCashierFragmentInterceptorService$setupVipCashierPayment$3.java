package com.bilibili.ship.theseus.ogv.pay;

import com.bilibili.ship.theseus.united.page.ReloadOnAccountInfoChangeService;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/pay/OgvVipCashierFragmentInterceptorService$setupVipCashierPayment$3.class */
final class OgvVipCashierFragmentInterceptorService$setupVipCashierPayment$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Object $fragment;
    int label;
    final OgvVipCashierFragmentInterceptorService this$0;

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.pay.OgvVipCashierFragmentInterceptorService$setupVipCashierPayment$3$1, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/pay/OgvVipCashierFragmentInterceptorService$setupVipCashierPayment$3$1.class */
    public static final /* synthetic */ class AnonymousClass1 extends AdaptedFunctionReference implements Function3<Boolean, Boolean, Continuation<? super Boolean>, Object>, SuspendFunction {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(3, Boolean.TYPE, "or", "or(Z)Z", 4);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (Continuation<? super Boolean>) obj3);
        }

        public final Object invoke(boolean z6, boolean z7, Continuation<? super Boolean> continuation) {
            return OgvVipCashierFragmentInterceptorService$setupVipCashierPayment$3.invokeSuspend$or(z6, z7, continuation);
        }
    }

    /* JADX INFO: renamed from: com.bilibili.ship.theseus.ogv.pay.OgvVipCashierFragmentInterceptorService$setupVipCashierPayment$3$2, reason: invalid class name */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/pay/OgvVipCashierFragmentInterceptorService$setupVipCashierPayment$3$2.class */
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<Boolean, Continuation<? super Boolean>, Object> {
        boolean Z$0;
        int label;

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
            anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass2;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (Continuation<? super Boolean>) obj2);
        }

        public final Object invoke(boolean z6, Continuation<? super Boolean> continuation) {
            return create(Boolean.valueOf(z6), continuation).invokeSuspend(Unit.INSTANCE);
        }

        public final Object invokeSuspend(Object obj) {
            boolean z6;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i7 = this.label;
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                z6 = this.Z$0;
                this.Z$0 = z6;
                this.label = 1;
                if (YieldKt.yield(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z6 = this.Z$0;
                ResultKt.throwOnFailure(obj);
            }
            return Boxing.boxBoolean(z6);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/pay/OgvVipCashierFragmentInterceptorService$setupVipCashierPayment$3$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final OgvVipCashierFragmentInterceptorService f94172a;

        public a(OgvVipCashierFragmentInterceptorService ogvVipCashierFragmentInterceptorService) {
            this.f94172a = ogvVipCashierFragmentInterceptorService;
        }

        public final Object emit(Object obj, Continuation continuation) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            this.f94172a.f94167d.f98797a.setValue(bool);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvVipCashierFragmentInterceptorService$setupVipCashierPayment$3(Object obj, OgvVipCashierFragmentInterceptorService ogvVipCashierFragmentInterceptorService, Continuation<? super OgvVipCashierFragmentInterceptorService$setupVipCashierPayment$3> continuation) {
        super(2, continuation);
        this.$fragment = obj;
        this.this$0 = ogvVipCashierFragmentInterceptorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object invokeSuspend$or(boolean z6, boolean z7, Continuation continuation) {
        return Boxing.boxBoolean(z6 | z7);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.fragment.app.Fragment, java.lang.Object] */
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvVipCashierFragmentInterceptorService$setupVipCashierPayment$3(this.$fragment, this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        try {
            if (i7 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowMapLatest = FlowKt.mapLatest(FlowKt.combine(((uK0.e) this.$fragment).F1(), ((uK0.e) this.$fragment).R4(), AnonymousClass1.INSTANCE), new AnonymousClass2(null));
                a aVar = new a(this.this$0);
                this.label = 1;
                if (flowMapLatest.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ReloadOnAccountInfoChangeService reloadOnAccountInfoChangeService = this.this$0.f94167d;
            reloadOnAccountInfoChangeService.f98797a.setValue(Boolean.FALSE);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            ReloadOnAccountInfoChangeService reloadOnAccountInfoChangeService2 = this.this$0.f94167d;
            reloadOnAccountInfoChangeService2.f98797a.setValue(Boolean.FALSE);
            throw th;
        }
    }
}
