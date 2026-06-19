package com.bilibili.tgwt.detail.chat;

import com.bilibili.chatroomsdk.ChatRoomMember;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/detail/chat/ChatFragment$initView$9$2.class */
final class ChatFragment$initView$9$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final ChatRoomMember $targetMember;
    int label;
    final ChatFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatFragment$initView$9$2(ChatFragment chatFragment, ChatRoomMember chatRoomMember, Continuation<? super ChatFragment$initView$9$2> continuation) {
        super(2, continuation);
        this.this$0 = chatFragment;
        this.$targetMember = chatRoomMember;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatFragment$initView$9$2(this.this$0, this.$targetMember, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0156  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tgwt.detail.chat.ChatFragment$initView$9$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
