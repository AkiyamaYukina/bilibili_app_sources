package com.bilibili.tgwt.service;

import com.bilibili.chatroom.vo.ChatEmote;
import com.bilibili.chatroom.vo.ChatMessageVo;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/service/ChatService$sendMsg$1.class */
public final class ChatService$sendMsg$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final ChatMessageVo $chatMessageVo;
    final Map<String, ChatEmote> $emoteMap;
    final long $roomId;
    final String $sendMsg;
    Object L$0;
    int label;
    final ChatService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatService$sendMsg$1(ChatService chatService, long j7, ChatMessageVo chatMessageVo, String str, Map<String, ChatEmote> map, Continuation<? super ChatService$sendMsg$1> continuation) {
        super(2, continuation);
        this.this$0 = chatService;
        this.$roomId = j7;
        this.$chatMessageVo = chatMessageVo;
        this.$sendMsg = str;
        this.$emoteMap = map;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatService$sendMsg$1(this.this$0, this.$roomId, this.$chatMessageVo, this.$sendMsg, this.$emoteMap, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 595
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tgwt.service.ChatService$sendMsg$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
