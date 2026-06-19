package com.bilibili.ship.theseus.keel.player;

import com.bilibili.player.tangram.basic.ResolveAndPlayPlayable;
import com.bilibili.player.tangram.playercore.InterfaceC5778f;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.time.Duration;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/keel/player/TheseusPlayableImpl$masterPieceProgress$1$special$$inlined$flatMapLatest$1.class */
public final class TheseusPlayableImpl$masterPieceProgress$1$special$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<FlowCollector<? super Duration>, ResolveAndPlayPlayable.c<? extends InterfaceC5778f>, Continuation<? super Unit>, Object> {
    private Object L$0;
    Object L$1;
    int label;
    final TheseusPlayableImpl$masterPieceProgress$1 this$0;
    final k this$1$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TheseusPlayableImpl$masterPieceProgress$1$special$$inlined$flatMapLatest$1(Continuation continuation, TheseusPlayableImpl$masterPieceProgress$1 theseusPlayableImpl$masterPieceProgress$1, k kVar) {
        super(3, continuation);
        this.this$0 = theseusPlayableImpl$masterPieceProgress$1;
        this.this$1$inlined = kVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((FlowCollector<? super Duration>) obj, (ResolveAndPlayPlayable.c<? extends InterfaceC5778f>) obj2, (Continuation<? super Unit>) obj3);
    }

    public final Object invoke(FlowCollector<? super Duration> flowCollector, ResolveAndPlayPlayable.c<? extends InterfaceC5778f> cVar, Continuation<? super Unit> continuation) {
        TheseusPlayableImpl$masterPieceProgress$1$special$$inlined$flatMapLatest$1 theseusPlayableImpl$masterPieceProgress$1$special$$inlined$flatMapLatest$1 = new TheseusPlayableImpl$masterPieceProgress$1$special$$inlined$flatMapLatest$1(continuation, this.this$0, this.this$1$inlined);
        theseusPlayableImpl$masterPieceProgress$1$special$$inlined$flatMapLatest$1.L$0 = flowCollector;
        theseusPlayableImpl$masterPieceProgress$1$special$$inlined$flatMapLatest$1.L$1 = cVar;
        return theseusPlayableImpl$masterPieceProgress$1$special$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
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
            goto L80
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
            com.bilibili.player.tangram.basic.ResolveAndPlayPlayable$c r0 = (com.bilibili.player.tangram.basic.ResolveAndPlayPlayable.c) r0
            r5 = r0
            r0 = r4
            com.bilibili.ship.theseus.keel.player.TheseusPlayableImpl$masterPieceProgress$1 r0 = r0.this$0
            java.lang.Class r0 = r0.getClass()
            r0 = r5
            com.bilibili.player.tangram.playercore.FlattenedPCSFacade r0 = com.bilibili.ship.theseus.keel.player.TheseusPlayableImpl$masterPieceProgress$1.d(r0)
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L5e
            r0 = r5
            com.bilibili.player.tangram.playercore.FlattenedPCSFacade$masterPieceProgress$1 r0 = r0.f79366p
            r5 = r0
            r0 = r5
            if (r0 == 0) goto L5e
            r0 = r5
            kotlinx.coroutines.flow.Flow<kotlin.time.Duration> r0 = r0.f79382a
            r7 = r0
            r0 = r7
            r5 = r0
            r0 = r7
            if (r0 != 0) goto L6c
        L5e:
            r0 = r4
            com.bilibili.ship.theseus.keel.player.k r0 = r0.this$1$inlined
            com.bilibili.player.tangram.playercore.PCSPlayableImpl r0 = r0.f91114b
            com.bilibili.player.tangram.basic.ResolveAndPlayPlayable<com.bilibili.player.tangram.playercore.f> r0 = r0.f79417e
            kotlinx.coroutines.flow.Flow r0 = r0.J()
            r5 = r0
        L6c:
            r0 = r4
            r1 = 1
            r0.label = r1
            r0 = r9
            r1 = r5
            r2 = r4
            java.lang.Object r0 = kotlinx.coroutines.flow.FlowKt.emitAll(r0, r1, r2)
            r1 = r8
            if (r0 != r1) goto L80
            r0 = r8
            return r0
        L80:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.ship.theseus.keel.player.TheseusPlayableImpl$masterPieceProgress$1$special$$inlined$flatMapLatest$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
