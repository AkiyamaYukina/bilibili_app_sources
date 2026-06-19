package com.bilibili.tgwt.player.widget;

import com.bilibili.chatroom.vo.ChatMessageVo;
import com.bilibili.chatroomsdk.ChatMsg;
import com.google.gson.reflect.TypeToken;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/PlayerChatPopupLayer$onAddView$1.class */
public final class PlayerChatPopupLayer$onAddView$1 extends SuspendLambda implements Function2<ChatMsg, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final PlayerChatPopupLayer this$0;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/player/widget/PlayerChatPopupLayer$onAddView$1$a.class */
    public static final class a extends TypeToken<ChatMessageVo> {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerChatPopupLayer$onAddView$1(PlayerChatPopupLayer playerChatPopupLayer, Continuation<? super PlayerChatPopupLayer$onAddView$1> continuation) {
        super(2, continuation);
        this.this$0 = playerChatPopupLayer;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        PlayerChatPopupLayer$onAddView$1 playerChatPopupLayer$onAddView$1 = new PlayerChatPopupLayer$onAddView$1(this.this$0, continuation);
        playerChatPopupLayer$onAddView$1.L$0 = obj;
        return playerChatPopupLayer$onAddView$1;
    }

    public final Object invoke(ChatMsg chatMsg, Continuation<? super Unit> continuation) {
        return create(chatMsg, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            Method dump skipped, instruction units count: 469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bilibili.tgwt.player.widget.PlayerChatPopupLayer$onAddView$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
