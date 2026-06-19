package com.bilibili.ship.theseus.ogv.pay;

import androidx.activity.ComponentActivity;
import com.bilibili.ogv.pub.payment.pay.sponsor.SponsorBuyModel;
import com.bilibili.ogv.pub.payment.pay.sponsor.SponsorCheckResult;
import com.bilibili.ogv.pub.payment.paycenter.c;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/pay/OgvPayService$sponsor$1.class */
final class OgvPayService$sponsor$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final int $money;
    int label;
    final OgvPayService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvPayService$sponsor$1(OgvPayService ogvPayService, int i7, Continuation<? super OgvPayService$sponsor$1> continuation) {
        super(2, continuation);
        this.this$0 = ogvPayService;
        this.$money = i7;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvPayService$sponsor$1(this.this$0, this.$money, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            com.bilibili.ogv.pub.payment.paycenter.c cVar = com.bilibili.ogv.pub.payment.paycenter.c.f71591a;
            OgvPayService ogvPayService = this.this$0;
            ComponentActivity componentActivity = ogvPayService.f94155d;
            int i8 = this.$money;
            this.label = 1;
            Object objC = cVar.c(componentActivity, new SponsorBuyModel(ogvPayService.f94161k, ogvPayService.f94162l, i8, componentActivity), this);
            obj = objC;
            if (objC == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        c.a aVar = (c.a) obj;
        if (aVar instanceof c.a.e) {
            c.a.e eVar = (c.a.e) aVar;
            if (((SponsorCheckResult) eVar.f71597a).f71582i) {
                OgvPayService ogvPayService2 = this.this$0;
                if (ogvPayService2.f94158g.isLogin()) {
                    ogvPayService2.f94157f.a();
                }
            }
            OgvPayService ogvPayService3 = this.this$0;
            ogvPayService3.f94160j.a(ogvPayService3.f94156e, (SponsorCheckResult) eVar.f71597a);
        }
        return Unit.INSTANCE;
    }
}
