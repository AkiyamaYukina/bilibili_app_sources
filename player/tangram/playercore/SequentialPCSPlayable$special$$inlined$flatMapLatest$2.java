package com.bilibili.player.tangram.playercore;

import com.bilibili.player.tangram.basic.ResolveAndPlayPlayable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/SequentialPCSPlayable$special$$inlined$flatMapLatest$2.class */
public final class SequentialPCSPlayable$special$$inlined$flatMapLatest$2 extends SuspendLambda implements Function3<FlowCollector<? super ResolveAndPlayPlayable.c<? extends InterfaceC5778f>>, v, Continuation<? super Unit>, Object> {
    private Object L$0;
    Object L$1;
    int label;

    public SequentialPCSPlayable$special$$inlined$flatMapLatest$2(Continuation continuation) {
        super(3, continuation);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((FlowCollector<? super ResolveAndPlayPlayable.c<? extends InterfaceC5778f>>) obj, (v) obj2, (Continuation<? super Unit>) obj3);
    }

    public final Object invoke(FlowCollector<? super ResolveAndPlayPlayable.c<? extends InterfaceC5778f>> flowCollector, v vVar, Continuation<? super Unit> continuation) {
        SequentialPCSPlayable$special$$inlined$flatMapLatest$2 sequentialPCSPlayable$special$$inlined$flatMapLatest$2 = new SequentialPCSPlayable$special$$inlined$flatMapLatest$2(continuation);
        sequentialPCSPlayable$special$$inlined$flatMapLatest$2.L$0 = flowCollector;
        sequentialPCSPlayable$special$$inlined$flatMapLatest$2.L$1 = vVar;
        return sequentialPCSPlayable$special$$inlined$flatMapLatest$2.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r8 = r0
            r0 = r4
            int r0 = r0.label
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L24
            r0 = r6
            r1 = 1
            if (r0 != r1) goto L1a
            r0 = r5
            kotlin.ResultKt.throwOnFailure(r0)
            goto L65
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L24:
            r0 = r5
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r4
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            r9 = r0
            r0 = r4
            java.lang.Object r0 = r0.L$1
            com.bilibili.player.tangram.playercore.v r0 = (com.bilibili.player.tangram.playercore.v) r0
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L4a
            r0 = r5
            kotlinx.coroutines.flow.Flow r0 = r0.C()
            r7 = r0
            r0 = r7
            r5 = r0
            r0 = r7
            if (r0 != 0) goto L51
        L4a:
            com.bilibili.player.tangram.basic.ResolveAndPlayPlayable$c$b r0 = com.bilibili.player.tangram.basic.ResolveAndPlayPlayable.c.b.f79313a
            kotlinx.coroutines.flow.Flow r0 = kotlinx.coroutines.flow.FlowKt.flowOf(r0)
            r5 = r0
        L51:
            r0 = r4
            r1 = 1
            r0.label = r1
            r0 = r9
            r1 = r5
            r2 = r4
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.emitAll(r0, r1, r2)
            r1 = r8
            if (r0 != r1) goto L65
            r0 = r8
            return r0
        L65:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.playercore.SequentialPCSPlayable$special$$inlined$flatMapLatest$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
