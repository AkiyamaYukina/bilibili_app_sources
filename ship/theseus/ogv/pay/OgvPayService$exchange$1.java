package com.bilibili.ship.theseus.ogv.pay;

import androidx.activity.ComponentActivity;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/pay/OgvPayService$exchange$1.class */
public final class OgvPayService$exchange$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final long $epId;
    final String $exchangeToken;
    final long $oType;
    int label;
    final OgvPayService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvPayService$exchange$1(OgvPayService ogvPayService, long j7, String str, long j8, Continuation<? super OgvPayService$exchange$1> continuation) {
        super(2, continuation);
        this.this$0 = ogvPayService;
        this.$epId = j7;
        this.$exchangeToken = str;
        this.$oType = j8;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvPayService$exchange$1(this.this$0, this.$epId, this.$exchangeToken, this.$oType, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            com.bilibili.ogv.pub.payment.paycenter.c cVar = com.bilibili.ogv.pub.payment.paycenter.c.f71591a;
            OgvPayService ogvPayService = this.this$0;
            ComponentActivity componentActivity = ogvPayService.f94155d;
            long j7 = this.$epId;
            String str = this.$exchangeToken;
            long j8 = this.$oType;
            this.label = 1;
            Object objB = cVar.b(componentActivity, ogvPayService.f94161k, j7, str, j8, this);
            obj = objB;
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            OgvPayService ogvPayService2 = this.this$0;
            if (ogvPayService2.f94158g.isLogin()) {
                ogvPayService2.f94157f.a();
            }
        }
        return Unit.INSTANCE;
    }
}
