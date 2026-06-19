package com.bilibili.ship.theseus.ogv.chathall;

import com.bilibili.chatroom.widget.userDialog.ChatUserFollowStatus;
import com.bilibili.chatroomsdk.ChatRoomMember;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/m.class */
public final class m implements com.bilibili.chatroom.widget.userDialog.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableSharedFlow<ChatUserFollowStatus> f91784a = SharedFlowKt.MutableSharedFlow$default(0, 1, (BufferOverflow) null, 5, (Object) null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ChatHallService f91785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ChatRoomMember f91786c;

    public m(ChatHallService chatHallService, ChatRoomMember chatRoomMember) {
        this.f91785b = chatHallService;
        this.f91786c = chatRoomMember;
    }

    public final Flow<ChatUserFollowStatus> a() {
        return this.f91784a;
    }

    public final void b() {
    }

    public final void c() {
        fV.i iVar = this.f91785b.f91717o;
        fV.i iVar2 = iVar;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mChatExternalService");
            iVar2 = null;
        }
        ChatRoomMember chatRoomMember = this.f91786c;
        long mid = chatRoomMember.getMid();
        String nickname = chatRoomMember.getNickname();
        String str = nickname;
        if (nickname == null) {
            str = "";
        }
        fV.l lVar = iVar2.i;
        if (lVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("panelState");
            lVar = null;
        }
        lVar.d.onNext(new Pair(Long.valueOf(mid), str));
    }

    public final void d(Map<String, String> map) {
    }

    public final void e(ChatUserFollowStatus chatUserFollowStatus) {
        this.f91784a.tryEmit(chatUserFollowStatus);
    }
}
