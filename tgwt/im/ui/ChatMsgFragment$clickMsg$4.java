package com.bilibili.tgwt.im.ui;

import android.content.Context;
import com.bilibili.chatroomsdk.ChatRoomMember;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/im/ui/ChatMsgFragment$clickMsg$4.class */
final class ChatMsgFragment$clickMsg$4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final Context $context;
    final long $msgId;
    final long $roomId;
    final ChatRoomMember $targetMember;
    int label;
    final ChatMsgFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatMsgFragment$clickMsg$4(ChatMsgFragment chatMsgFragment, ChatRoomMember chatRoomMember, long j7, long j8, Context context, Continuation<? super ChatMsgFragment$clickMsg$4> continuation) {
        super(2, continuation);
        this.this$0 = chatMsgFragment;
        this.$targetMember = chatRoomMember;
        this.$roomId = j7;
        this.$msgId = j8;
        this.$context = context;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ChatMsgFragment$clickMsg$4(this.this$0, this.$targetMember, this.$roomId, this.$msgId, this.$context, continuation);
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return create(coroutineScope, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws kotlin.NoWhenBranchMatchedException {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tgwt.im.ui.ChatMsgFragment$clickMsg$4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
