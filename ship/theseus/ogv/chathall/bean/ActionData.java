package com.bilibili.ship.theseus.ogv.chathall.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.bilibili.chatroomsdk.ChatMsg;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/bean/ActionData.class */
@StabilityInferred(parameters = 0)
@Bson
public final class ActionData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("action_type")
    private final int f91735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("action_message")
    @Nullable
    private final ChatMsg f91736b;

    public ActionData(int i7, @Nullable ChatMsg chatMsg) {
        this.f91735a = i7;
        this.f91736b = chatMsg;
    }

    @Nullable
    public final ChatMsg a() {
        return this.f91736b;
    }

    public final int b() {
        return this.f91735a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionData)) {
            return false;
        }
        ActionData actionData = (ActionData) obj;
        return this.f91735a == actionData.f91735a && Intrinsics.areEqual(this.f91736b, actionData.f91736b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f91735a);
        ChatMsg chatMsg = this.f91736b;
        return (iHashCode * 31) + (chatMsg == null ? 0 : chatMsg.hashCode());
    }

    @NotNull
    public final String toString() {
        return "ActionData(actionType=" + this.f91735a + ", actionMessage=" + this.f91736b + ")";
    }
}
