package com.bilibili.ship.theseus.ogv.vip;

import com.bilibili.lib.brouter.uri.Uri;
import com.bilibili.ship.theseus.ogv.intro.Q;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/vip/VipCashierRouter$createVipCashierInterceptor$1$intercept$1.class */
public final class VipCashierRouter$createVipCashierInterceptor$1$intercept$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Ref.ObjectRef<Uri> $uri;
    int label;
    final d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VipCashierRouter$createVipCashierInterceptor$1$intercept$1(d dVar, Ref.ObjectRef<Uri> objectRef, Continuation<? super VipCashierRouter$createVipCashierInterceptor$1$intercept$1> continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$uri = objectRef;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new VipCashierRouter$createVipCashierInterceptor$1$intercept$1(this.this$0, this.$uri, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Q q7 = this.this$0.f94842c;
            String string = this.$uri.element.toString();
            this.label = 1;
            if (q7.c(string, this) == coroutine_suspended) {
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
