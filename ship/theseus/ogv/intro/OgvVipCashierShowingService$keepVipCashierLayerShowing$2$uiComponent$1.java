package com.bilibili.ship.theseus.ogv.intro;

import androidx.fragment.app.Fragment;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/OgvVipCashierShowingService$keepVipCashierLayerShowing$2$uiComponent$1.class */
public final class OgvVipCashierShowingService$keepVipCashierLayerShowing$2$uiComponent$1 extends SuspendLambda implements Function2<Fragment, Continuation<? super Unit>, Object> {
    final CoroutineScope $$this$coroutineScope;
    Object L$0;
    int label;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/OgvVipCashierShowingService$keepVipCashierLayerShowing$2$uiComponent$1$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CoroutineScope f92255a;

        public a(CoroutineScope coroutineScope) {
            this.f92255a = coroutineScope;
        }

        public final Object emit(Object obj, Continuation continuation) {
            CoroutineScopeKt.cancel$default(this.f92255a, (CancellationException) null, 1, (Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvVipCashierShowingService$keepVipCashierLayerShowing$2$uiComponent$1(CoroutineScope coroutineScope, Continuation<? super OgvVipCashierShowingService$keepVipCashierLayerShowing$2$uiComponent$1> continuation) {
        super(2, continuation);
        this.$$this$coroutineScope = coroutineScope;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OgvVipCashierShowingService$keepVipCashierLayerShowing$2$uiComponent$1 ogvVipCashierShowingService$keepVipCashierLayerShowing$2$uiComponent$1 = new OgvVipCashierShowingService$keepVipCashierLayerShowing$2$uiComponent$1(this.$$this$coroutineScope, continuation);
        ogvVipCashierShowingService$keepVipCashierLayerShowing$2$uiComponent$1.L$0 = obj;
        return ogvVipCashierShowingService$keepVipCashierLayerShowing$2$uiComponent$1;
    }

    public final Object invoke(Fragment fragment, Continuation<? super Unit> continuation) {
        return create(fragment, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowF4 = ((Fragment) this.L$0).F4();
            a aVar = new a(this.$$this$coroutineScope);
            this.label = 1;
            if (flowF4.collect(aVar, this) == coroutine_suspended) {
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
