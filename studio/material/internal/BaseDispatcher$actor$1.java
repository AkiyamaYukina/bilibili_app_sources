package com.bilibili.studio.material.internal;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ActorScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/material/internal/BaseDispatcher$actor$1.class */
public final class BaseDispatcher$actor$1 extends SuspendLambda implements Function2<ActorScope<d>, Continuation<? super Unit>, Object> {
    private Object L$0;
    int label;
    final BaseDispatcher this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDispatcher$actor$1(BaseDispatcher baseDispatcher, Continuation<? super BaseDispatcher$actor$1> continuation) {
        super(2, continuation);
        this.this$0 = baseDispatcher;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BaseDispatcher$actor$1 baseDispatcher$actor$1 = new BaseDispatcher$actor$1(this.this$0, continuation);
        baseDispatcher$actor$1.L$0 = obj;
        return baseDispatcher$actor$1;
    }

    public final Object invoke(ActorScope<d> actorScope, Continuation<? super Unit> continuation) {
        return create(actorScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x005c -> B:14:0x0062). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r9 = r0
            r0 = r4
            int r0 = r0.label
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L2c
            r0 = r6
            r1 = 1
            if (r0 != r1) goto L22
            r0 = r4
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.channels.ChannelIterator r0 = (kotlinx.coroutines.channels.ChannelIterator) r0
            r7 = r0
            r0 = r5
            kotlin.ResultKt.throwOnFailure(r0)
            goto L62
        L22:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L2c:
            r0 = r5
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r4
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.channels.ActorScope r0 = (kotlinx.coroutines.channels.ActorScope) r0
            kotlinx.coroutines.channels.Channel r0 = r0.getChannel()
            kotlinx.coroutines.channels.ChannelIterator r0 = r0.iterator()
            r7 = r0
        L42:
            r0 = r4
            r1 = r7
            r0.L$0 = r1
            r0 = r4
            r1 = 1
            r0.label = r1
            r0 = r7
            r1 = r4
            java.lang.Object r0 = r0.hasNext(r1)
            r8 = r0
            r0 = r8
            r5 = r0
            r0 = r8
            r1 = r9
            if (r0 != r1) goto L62
            r0 = r9
            return r0
        L62:
            r0 = r5
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lb3
            r0 = r7
            java.lang.Object r0 = r0.next()
            com.bilibili.studio.material.internal.d r0 = (com.bilibili.studio.material.internal.d) r0
            kotlinx.coroutines.CompletableDeferred<com.bilibili.studio.material.i> r0 = r0.f108544a
            r5 = r0
            r0 = r4
            com.bilibili.studio.material.internal.BaseDispatcher r0 = r0.this$0
            r8 = r0
            r0 = r8
            com.bilibili.studio.material.i r0 = r0.f108531d
            r10 = r0
            r0 = r10
            r1 = r8
            java.util.concurrent.atomic.AtomicLong r1 = r1.f108529b
            long r1 = r1.get()
            r0.f108526b = r1
            r0 = r10
            r1 = r8
            long r1 = r1.f108528a
            r0.f108527c = r1
            r0 = r10
            r1 = r8
            float r1 = r1.f108530c
            r0.f108525a = r1
            r0 = r5
            r1 = r10
            boolean r0 = r0.complete(r1)
            goto L42
        Lb3:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.material.internal.BaseDispatcher$actor$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
