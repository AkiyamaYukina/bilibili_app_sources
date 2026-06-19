package com.bilibili.studio.editor.moudle.clip.player;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/studio/editor/moudle/clip/player/IjkMediaPlayerImpl$startRecord$job$1.class */
final class IjkMediaPlayerImpl$startRecord$job$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IjkMediaPlayerImpl$startRecord$job$1(d dVar, Continuation<? super IjkMediaPlayerImpl$startRecord$job$1> continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IjkMediaPlayerImpl$startRecord$job$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060 A[LOOP:0: B:15:0x0057->B:17:0x0060, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003c -> B:14:0x0042). Please report as a decompilation issue!!! */
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
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r9 = r0
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
            goto L42
        L1a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L24:
            r0 = r5
            kotlin.ResultKt.throwOnFailure(r0)
        L28:
            r0 = r4
            com.bilibili.studio.editor.moudle.clip.player.d r0 = r0.this$0
            long r0 = r0.f106044g
            r7 = r0
            r0 = r4
            r1 = 1
            r0.label = r1
            r0 = r7
            r1 = r4
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.delay(r0, r1)
            r1 = r9
            if (r0 != r1) goto L42
            r0 = r9
            return r0
        L42:
            r0 = r4
            com.bilibili.studio.editor.moudle.clip.player.d r0 = r0.this$0
            r5 = r0
            r0 = r5
            long r0 = r0.getCurrentPosition()
            r7 = r0
            r0 = r5
            java.util.List<com.bilibili.studio.editor.moudle.clip.player.j$b> r0 = r0.f106039b
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r0 = r0.iterator()
            r5 = r0
        L57:
            r0 = r5
            boolean r0 = r0.hasNext()
            if (r0 == 0) goto L28
            r0 = r5
            java.lang.Object r0 = r0.next()
            com.bilibili.studio.editor.moudle.clip.player.j$b r0 = (com.bilibili.studio.editor.moudle.clip.player.j.b) r0
            r1 = r7
            r0.a(r1)
            goto L57
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.studio.editor.moudle.clip.player.IjkMediaPlayerImpl$startRecord$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
