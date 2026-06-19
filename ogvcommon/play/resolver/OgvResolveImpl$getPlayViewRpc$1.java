package com.bilibili.ogvcommon.play.resolver;

import com.bapis.bilibili.pgc.gateway.player.v2.PlayViewReply;
import com.bilibili.ogvcommon.play.resolver.i;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/resolver/OgvResolveImpl$getPlayViewRpc$1.class */
public final class OgvResolveImpl$getPlayViewRpc$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PlayViewReply>, Object> {
    final i.a $params;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvResolveImpl$getPlayViewRpc$1(i.a aVar, Continuation<? super OgvResolveImpl$getPlayViewRpc$1> continuation) {
        super(2, continuation);
        this.$params = aVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvResolveImpl$getPlayViewRpc$1(this.$params, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super PlayViewReply> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            i iVar = i.f73268a;
            i.a aVar = this.$params;
            this.label = 1;
            Object objB = iVar.b(aVar, this);
            obj2 = objB;
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            obj2 = ((Result) obj).unbox-impl();
        }
        Object obj3 = obj2;
        if (Result.isFailure-impl(obj2)) {
            obj3 = null;
        }
        return obj3;
    }
}
