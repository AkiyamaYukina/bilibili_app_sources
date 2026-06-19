package com.bilibili.player.tangram.playercore;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/player/tangram/playercore/SequentialPCSPlayable$runPreloading$2.class */
final class SequentialPCSPlayable$runPreloading$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<?>, Object> {
    private Object L$0;
    Object L$1;
    int label;
    final SequentialPCSPlayable this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SequentialPCSPlayable$runPreloading$2(SequentialPCSPlayable sequentialPCSPlayable, Continuation<? super SequentialPCSPlayable$runPreloading$2> continuation) {
        super(2, continuation);
        this.this$0 = sequentialPCSPlayable;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SequentialPCSPlayable$runPreloading$2 sequentialPCSPlayable$runPreloading$2 = new SequentialPCSPlayable$runPreloading$2(this.this$0, continuation);
        sequentialPCSPlayable$runPreloading$2.L$0 = obj;
        return sequentialPCSPlayable$runPreloading$2;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<?> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0090  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0073 -> B:15:0x0079). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r15 = r0
            r0 = r9
            int r0 = r0.label
            r11 = r0
            r0 = r11
            if (r0 == 0) goto L3b
            r0 = r11
            r1 = 1
            if (r0 != r1) goto L31
            r0 = r9
            java.lang.Object r0 = r0.L$1
            com.bilibili.player.tangram.playercore.SequentialPCSPlayable r0 = (com.bilibili.player.tangram.playercore.SequentialPCSPlayable) r0
            r12 = r0
            r0 = r9
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            r14 = r0
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r10
            r13 = r0
            r0 = r14
            r10 = r0
        L2e:
            goto L79
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L3b:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r9
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.CoroutineScope r0 = (kotlinx.coroutines.CoroutineScope) r0
            r10 = r0
            r0 = r9
            com.bilibili.player.tangram.playercore.SequentialPCSPlayable r0 = r0.this$0
            r12 = r0
        L4c:
            r0 = r12
            kotlinx.coroutines.channels.Channel<com.bilibili.player.tangram.playercore.SequentialPCSPlayable$a> r0 = r0.f79432c
            r13 = r0
            r0 = r9
            r1 = r10
            r0.L$0 = r1
            r0 = r9
            r1 = r12
            r0.L$1 = r1
            r0 = r9
            r1 = 1
            r0.label = r1
            r0 = r13
            r1 = r9
            java.lang.Object r0 = r0.receive(r1)
            r14 = r0
            r0 = r14
            r13 = r0
            r0 = r14
            r1 = r15
            if (r0 != r1) goto L2e
            r0 = r15
            return r0
        L79:
            r0 = r13
            com.bilibili.player.tangram.playercore.SequentialPCSPlayable$a r0 = (com.bilibili.player.tangram.playercore.SequentialPCSPlayable.a) r0
            r13 = r0
            r0 = r13
            java.lang.Class r0 = r0.getClass()
            r0 = r12
            com.bilibili.player.tangram.playercore.v r0 = r0.Q()
            if (r0 != 0) goto L90
            goto La7
        L90:
            r0 = r13
            r1 = r10
            r2 = 0
            r3 = 0
            com.bilibili.player.tangram.playercore.SequentialPCSPlayable$runPreloading$2$1$1 r4 = new com.bilibili.player.tangram.playercore.SequentialPCSPlayable$runPreloading$2$1$1
            r5 = r4
            r6 = r13
            r7 = 0
            r5.<init>(r6, r7)
            r5 = 3
            r6 = 0
            kotlinx.coroutines.Job r1 = kotlinx.coroutines.BuildersKt.launch$default(r1, r2, r3, r4, r5, r6)
            r0.f79434a = r1
        La7:
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.player.tangram.playercore.SequentialPCSPlayable$runPreloading$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
