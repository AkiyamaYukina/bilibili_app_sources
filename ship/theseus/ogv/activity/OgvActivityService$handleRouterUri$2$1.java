package com.bilibili.ship.theseus.ogv.activity;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvActivityService$handleRouterUri$2$1.class */
public final class OgvActivityService$handleRouterUri$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final com.bilibili.ship.theseus.ogv.web.b $it;
    final String $link;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvActivityService$handleRouterUri$2$1(com.bilibili.ship.theseus.ogv.web.b bVar, String str, Continuation<? super OgvActivityService$handleRouterUri$2$1> continuation) {
        super(2, continuation);
        this.$it = bVar;
        this.$link = str;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvActivityService$handleRouterUri$2$1(this.$it, this.$link, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            com.bilibili.ship.theseus.ogv.web.b bVar = this.$it;
            String str = this.$link;
            this.label = 1;
            if (bVar.b(str, false, this) == coroutine_suspended) {
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
