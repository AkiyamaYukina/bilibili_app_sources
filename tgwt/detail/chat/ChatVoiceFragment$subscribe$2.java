package com.bilibili.tgwt.detail.chat;

import com.bilibili.chatroomsdk.ChatRoomMember;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/ChatVoiceFragment$subscribe$2.class */
final class ChatVoiceFragment$subscribe$2 extends SuspendLambda implements Function2<List<? extends ChatRoomMember>, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final ChatVoiceFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatVoiceFragment$subscribe$2(ChatVoiceFragment chatVoiceFragment, Continuation<? super ChatVoiceFragment$subscribe$2> continuation) {
        super(2, continuation);
        this.this$0 = chatVoiceFragment;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChatVoiceFragment$subscribe$2 chatVoiceFragment$subscribe$2 = new ChatVoiceFragment$subscribe$2(this.this$0, continuation);
        chatVoiceFragment$subscribe$2.L$0 = obj;
        return chatVoiceFragment$subscribe$2;
    }

    public final Object invoke(List<ChatRoomMember> list, Continuation<? super Unit> continuation) {
        return create(list, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            Method dump skipped, instruction units count: 986
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tgwt.detail.chat.ChatVoiceFragment$subscribe$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
