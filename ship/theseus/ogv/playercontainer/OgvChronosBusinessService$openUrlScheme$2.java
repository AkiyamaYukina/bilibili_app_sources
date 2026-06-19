package com.bilibili.ship.theseus.ogv.playercontainer;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/playercontainer/OgvChronosBusinessService$openUrlScheme$2.class */
final class OgvChronosBusinessService$openUrlScheme$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final String $actUrl;
    final String $biz;
    final String $type;
    int label;
    final OgvChronosBusinessService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OgvChronosBusinessService$openUrlScheme$2(OgvChronosBusinessService ogvChronosBusinessService, String str, String str2, String str3, Continuation<? super OgvChronosBusinessService$openUrlScheme$2> continuation) {
        super(2, continuation);
        this.this$0 = ogvChronosBusinessService;
        this.$actUrl = str;
        this.$biz = str2;
        this.$type = str3;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new OgvChronosBusinessService$openUrlScheme$2(this.this$0, this.$actUrl, this.$biz, this.$type, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            com.bilibili.ship.theseus.ogv.web.b bVar = this.this$0.f94277c;
            String strA = com.bilibili.ship.theseus.ogv.web.b.a(bVar, this.$actUrl, false, Intrinsics.areEqual(this.$biz, "web"), this.$type, 2);
            this.label = 1;
            if (bVar.b(strA, false, this) == coroutine_suspended) {
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
