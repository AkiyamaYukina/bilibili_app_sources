package com.bilibili.tgwt.service;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatService$voiceModeWatchTimeObservable$1.class */
final class ChatService$voiceModeWatchTimeObservable$1 extends SuspendLambda implements Function2<FlowCollector<? super Unit>, Continuation<? super Unit>, Object> {
    private Object L$0;
    int label;

    public ChatService$voiceModeWatchTimeObservable$1(Continuation<? super ChatService$voiceModeWatchTimeObservable$1> continuation) {
        super(2, continuation);
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatService$voiceModeWatchTimeObservable$1 chatService$voiceModeWatchTimeObservable$1 = new ChatService$voiceModeWatchTimeObservable$1(continuation);
        chatService$voiceModeWatchTimeObservable$1.L$0 = obj;
        return chatService$voiceModeWatchTimeObservable$1;
    }

    public final Object invoke(FlowCollector<? super Unit> flowCollector, Continuation<? super Unit> continuation) {
        return create(flowCollector, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0084  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0081 -> B:14:0x0050). Please report as a decompilation issue!!! */
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
            r8 = r0
            r0 = r4
            int r0 = r0.label
            r6 = r0
            r0 = r6
            if (r0 == 0) goto L44
            r0 = r6
            r1 = 1
            if (r0 == r1) goto L33
            r0 = r6
            r1 = 2
            if (r0 != r1) goto L29
            r0 = r4
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            r7 = r0
            r0 = r5
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r7
            r5 = r0
        L26:
            goto L50
        L29:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r1 = r0
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r0
        L33:
            r0 = r4
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            r7 = r0
            r0 = r5
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r7
            r5 = r0
            goto L6e
        L44:
            r0 = r5
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r4
            java.lang.Object r0 = r0.L$0
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            r5 = r0
        L50:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            r7 = r0
            r0 = r4
            r1 = r5
            r0.L$0 = r1
            r0 = r4
            r1 = 1
            r0.label = r1
            r0 = r5
            r1 = r7
            r2 = r4
            java.lang.Object r0 = r0.emit(r1, r2)
            r1 = r8
            if (r0 != r1) goto L6e
            r0 = r8
            return r0
        L6e:
            r0 = r4
            r1 = r5
            r0.L$0 = r1
            r0 = r4
            r1 = 2
            r0.label = r1
            r0 = 5000(0x1388, double:2.4703E-320)
            r1 = r4
            java.lang.Object r0 = kotlinx.coroutines.DelayKt.delay(r0, r1)
            r1 = r8
            if (r0 != r1) goto L26
            r0 = r8
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tgwt.service.ChatService$voiceModeWatchTimeObservable$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
