package com.bilibili.ship.theseus.ogv.intro.coupon;

import com.bilibili.ship.theseus.ogv.intro.coupon.e;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import zu0.r;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/coupon/OgvTicketPaySelectorFactory$createDialog$1.class */
final class OgvTicketPaySelectorFactory$createDialog$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final e.a $component;
    final com.bilibili.app.gemini.ui.d<r> $viewEntry;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvTicketPaySelectorFactory$createDialog$1(e.a aVar, com.bilibili.app.gemini.ui.d<r> dVar, Continuation<? super OgvTicketPaySelectorFactory$createDialog$1> continuation) {
        super(2, continuation);
        this.$component = aVar;
        this.$viewEntry = dVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvTicketPaySelectorFactory$createDialog$1(this.$component, this.$viewEntry, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            e.a aVar = this.$component;
            com.bilibili.app.gemini.ui.d<r> dVar = this.$viewEntry;
            this.label = 1;
            if (aVar.c(dVar, this) == coroutine_suspended) {
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
