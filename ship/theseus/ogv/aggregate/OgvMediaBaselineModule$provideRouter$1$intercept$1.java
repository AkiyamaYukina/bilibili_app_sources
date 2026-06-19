package com.bilibili.ship.theseus.ogv.aggregate;

import Y31.a;
import com.bilibili.ship.theseus.ogv.vip.VipCashierRouter$createVipCashierInterceptor$1;
import ev0.j;
import ev0.k;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import tv.danmaku.android.log.BLog;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/aggregate/OgvMediaBaselineModule$provideRouter$1$intercept$1.class */
public final class OgvMediaBaselineModule$provideRouter$1$intercept$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final a.a $chain;
    final j.a $mediaParam;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvMediaBaselineModule$provideRouter$1$intercept$1(j.a aVar, a.a aVar2, Continuation<? super OgvMediaBaselineModule$provideRouter$1$intercept$1> continuation) {
        super(2, continuation);
        this.$mediaParam = aVar;
        this.$chain = aVar2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvMediaBaselineModule$provideRouter$1$intercept$1(this.$mediaParam, this.$chain, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Deferred deferred = (Deferred) k.f117670a.a(this.$mediaParam);
            if (deferred != null) {
                this.label = 1;
                Object objAwait = deferred.await(this);
                obj = objAwait;
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                obj = null;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        b bVar = obj instanceof b ? (b) obj : null;
        if (bVar == null) {
            BLog.e("OgvMediaBaselineModule$provideRouter$1$intercept$1-invokeSuspend", "[theseus-ogv-OgvMediaBaselineModule$provideRouter$1$intercept$1-invokeSuspend] Not in OGV business?", (Throwable) null);
            return Unit.INSTANCE;
        }
        com.bilibili.ship.theseus.ogv.vip.d dVarA = bVar.a();
        dVarA.getClass();
        new VipCashierRouter$createVipCashierInterceptor$1(dVarA).a(this.$chain);
        return Unit.INSTANCE;
    }
}
