package com.bilibili.player.tangram.playercore;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSPlayableImpl$errorEffectOnPlay$2.class */
final class PCSPlayableImpl$errorEffectOnPlay$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final PCSPlayableImpl this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/PCSPlayableImpl$errorEffectOnPlay$2$a.class */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PCSPlayableImpl f79426a;

        public a(PCSPlayableImpl pCSPlayableImpl) {
            this.f79426a = pCSPlayableImpl;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
            /*
                r5 = this;
                r0 = r6
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L41
                r0 = r5
                com.bilibili.player.tangram.playercore.PCSPlayableImpl r0 = r0.f79426a
                r6 = r0
                r0 = r6
                com.bilibili.player.tangram.basic.ResolveAndPlayPlayable<com.bilibili.player.tangram.playercore.f> r0 = r0.f79417e
                com.bilibili.player.tangram.basic.ResolveAndPlayPlayable$c r0 = r0.h0()
                boolean r0 = r0 instanceof com.bilibili.player.tangram.basic.ResolveAndPlayPlayable.c.a
                if (r0 == 0) goto L41
                com.bilibili.player.tangram.playercore.PCSPlayableImpl$errorEffectOnPlay$2$1$1 r0 = new com.bilibili.player.tangram.playercore.PCSPlayableImpl$errorEffectOnPlay$2$1$1
                r1 = r0
                r2 = r6
                r3 = 0
                r1.<init>(r2, r3)
                r8 = r0
                r0 = r6
                com.bilibili.player.tangram.basic.ResolveAndPlayPlayable<com.bilibili.player.tangram.playercore.f> r0 = r0.f79417e
                r1 = r8
                r2 = r7
                java.lang.Object r0 = r0.e(r1, r2)
                r6 = r0
                r0 = r6
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                if (r0 != r1) goto L3a
                goto L45
            L3a:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                r6 = r0
                goto L45
            L41:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                r6 = r0
            L45:
                r0 = r6
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.playercore.PCSPlayableImpl$errorEffectOnPlay$2.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PCSPlayableImpl$errorEffectOnPlay$2(PCSPlayableImpl pCSPlayableImpl, Continuation<? super PCSPlayableImpl$errorEffectOnPlay$2> continuation) {
        super(2, continuation);
        this.this$0 = pCSPlayableImpl;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PCSPlayableImpl$errorEffectOnPlay$2(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = this.label;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow<Boolean> flowN = this.this$0.f79413a.n();
            a aVar = new a(this.this$0);
            this.label = 1;
            if (flowN.collect(aVar, this) == coroutine_suspended) {
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
