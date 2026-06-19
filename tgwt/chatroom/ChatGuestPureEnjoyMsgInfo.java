package com.bilibili.tgwt.chatroom;

import X1.C3081k;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.bilibili.chatroomsdk.ChatMsg;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/chatroom/ChatGuestPureEnjoyMsgInfo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class ChatGuestPureEnjoyMsgInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f110869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f110870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<ChatMsg> f110871c;

    public ChatGuestPureEnjoyMsgInfo(long j7, boolean z6, @NotNull List list) {
        this.f110869a = z6;
        this.f110870b = j7;
        this.f110871c = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatGuestPureEnjoyMsgInfo)) {
            return false;
        }
        ChatGuestPureEnjoyMsgInfo chatGuestPureEnjoyMsgInfo = (ChatGuestPureEnjoyMsgInfo) obj;
        return this.f110869a == chatGuestPureEnjoyMsgInfo.f110869a && this.f110870b == chatGuestPureEnjoyMsgInfo.f110870b && Intrinsics.areEqual(this.f110871c, chatGuestPureEnjoyMsgInfo.f110871c);
    }

    public final int hashCode() {
        return this.f110871c.hashCode() + C3554n0.a(Boolean.hashCode(this.f110869a) * 31, 31, this.f110870b);
    }

    @NotNull
    public final String toString() {
        List<ChatMsg> list = this.f110871c;
        StringBuilder sb = new StringBuilder("ChatGuestPureEnjoyMsgInfo(hasNext=");
        sb.append(this.f110869a);
        sb.append(", nextSeqId=");
        C3081k.c(sb, this.f110870b, ", msgList=", list);
        sb.append(")");
        return sb.toString();
    }
}
