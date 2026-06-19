package com.bilibili.tgwt.chatroom;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.bilibili.chatroomsdk.ChatMsg;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/chatroom/ActionData.class */
@StabilityInferred(parameters = 0)
@Bson
public final class ActionData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("action_type")
    private int f110866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("action_message")
    @Nullable
    private ChatMsg f110867b;

    public ActionData(int i7, @Nullable ChatMsg chatMsg) {
        this.f110866a = i7;
        this.f110867b = chatMsg;
    }

    @Nullable
    public final ChatMsg a() {
        return this.f110867b;
    }

    public final int b() {
        return this.f110866a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionData)) {
            return false;
        }
        ActionData actionData = (ActionData) obj;
        return this.f110866a == actionData.f110866a && Intrinsics.areEqual(this.f110867b, actionData.f110867b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f110866a);
        ChatMsg chatMsg = this.f110867b;
        return (iHashCode * 31) + (chatMsg == null ? 0 : chatMsg.hashCode());
    }

    @NotNull
    public final String toString() {
        return "ActionData(actionType=" + this.f110866a + ", actionMessage=" + this.f110867b + ")";
    }
}
