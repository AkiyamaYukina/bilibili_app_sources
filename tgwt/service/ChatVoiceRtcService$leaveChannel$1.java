package com.bilibili.tgwt.service;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatVoiceRtcService$leaveChannel$1.class */
public final class ChatVoiceRtcService$leaveChannel$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    final ChatVoiceRtcService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatVoiceRtcService$leaveChannel$1(ChatVoiceRtcService chatVoiceRtcService, Continuation<? super ChatVoiceRtcService$leaveChannel$1> continuation) {
        super(2, continuation);
        this.this$0 = chatVoiceRtcService;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatVoiceRtcService$leaveChannel$1(this.this$0, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ba A[PHI: r8
  0x00ba: PHI (r8v7 com.bilibili.tgwt.service.u) = (r8v6 com.bilibili.tgwt.service.u), (r8v8 com.bilibili.tgwt.service.u) binds: [B:27:0x00e8, B:22:0x00b7] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tgwt.service.ChatVoiceRtcService$leaveChannel$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
