package com.bilibili.ship.theseus.ugc.intro.ugcpartyinfo;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.YieldKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/ugcpartyinfo/UgcPartyInfoService$create$syncPlayerCardStatusFromFavorite$1.class */
final class UgcPartyInfoService$create$syncPlayerCardStatusFromFavorite$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Ref.ObjectRef<e> $componentChanel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UgcPartyInfoService$create$syncPlayerCardStatusFromFavorite$1(Ref.ObjectRef<e> objectRef, Continuation<? super UgcPartyInfoService$create$syncPlayerCardStatusFromFavorite$1> continuation) {
        super(2, continuation);
        this.$componentChanel = objectRef;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UgcPartyInfoService$create$syncPlayerCardStatusFromFavorite$1(this.$componentChanel, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            if (YieldKt.yield(this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        e eVar = (e) this.$componentChanel.element;
        if (eVar != null) {
            eVar.a();
        }
        return Unit.INSTANCE;
    }
}
