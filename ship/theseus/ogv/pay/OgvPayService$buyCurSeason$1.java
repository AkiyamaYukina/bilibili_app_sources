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

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/pay/OgvPayService$buyCurSeason$1.class */
final class OgvPayService$buyCurSeason$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $couponToken;
    final String $payChannel;
    final Long $payChannelId;
    final String $section;
    int label;
    final OgvPayService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvPayService$buyCurSeason$1(OgvPayService ogvPayService, String str, String str2, Long l7, String str3, Continuation<? super OgvPayService$buyCurSeason$1> continuation) {
        super(2, continuation);
        this.this$0 = ogvPayService;
        this.$couponToken = str;
        this.$payChannel = str2;
        this.$payChannelId = l7;
        this.$section = str3;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvPayService$buyCurSeason$1(this.this$0, this.$couponToken, this.$payChannel, this.$payChannelId, this.$section, continuation);
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
            String str = this.$couponToken;
            String str2 = this.$payChannel;
            Long l7 = this.$payChannelId;
            String str3 = this.$section;
            this.label = 1;
            Object objA = cVar.a(componentActivity, ogvPayService.f94161k, ogvPayService.f94162l, str, str2, l7, str3, this);
            obj = objA;
            if (objA == coroutine_suspended) {
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
