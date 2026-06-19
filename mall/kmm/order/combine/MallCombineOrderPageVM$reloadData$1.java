package com.bilibili.mall.kmm.order.combine;

import dh0.C6813a;
import fh0.X;
import j$.time.Clock;
import kntr.base.log.ILogger;
import kntr.base.log.KLog_androidKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import q91.i;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/mall/kmm/order/combine/MallCombineOrderPageVM$reloadData$1.class */
public final class MallCombineOrderPageVM$reloadData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final MallCombineOrderPageVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MallCombineOrderPageVM$reloadData$1(MallCombineOrderPageVM mallCombineOrderPageVM, Continuation<? super MallCombineOrderPageVM$reloadData$1> continuation) {
        super(2, continuation);
        this.this$0 = mallCombineOrderPageVM;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MallCombineOrderPageVM$reloadData$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            X x6 = this.this$0.d().f65660a;
            if (x6 != null) {
                MallCombineOrderPageVM mallCombineOrderPageVM = this.this$0;
                ILogger kLog = KLog_androidKt.getKLog();
                i.a aVar = i.Companion;
                aVar.getClass();
                kLog.e("CombineOrderPerf", "③ reloadData MallCombineOrderInfoViewModel before: " + new i(Clock.systemUTC().instant()).e());
                C6813a c6813a = new C6813a(x6, mallCombineOrderPageVM.f65650f, mallCombineOrderPageVM.d());
                ILogger kLog2 = KLog_androidKt.getKLog();
                aVar.getClass();
                kLog2.e("CombineOrderPerf", "③ reloadData MallCombineOrderInfoViewModel after: " + new i(Clock.systemUTC().instant()).e());
                this.L$0 = SpillingKt.nullOutSpilledVariable(x6);
                this.L$1 = SpillingKt.nullOutSpilledVariable(c6813a);
                this.I$0 = 0;
                this.label = 1;
                if (MallCombineOrderPageVM.a(mallCombineOrderPageVM, mallCombineOrderPageVM.f65649e, c6813a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
