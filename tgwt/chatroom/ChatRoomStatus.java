package com.bilibili.tgwt.chatroom;

import I1.C2157f0;
import W60.F;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/chatroom/ChatRoomStatus.class */
@StabilityInferred(parameters = 0)
@Bson
public final class ChatRoomStatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private int f110947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(NotificationCompat.CATEGORY_PROGRESS)
    private long f110948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("allow_auto_start")
    private int f110949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("had_started")
    private int f110950d;

    public ChatRoomStatus(int i7, int i8, int i9, long j7) {
        this.f110947a = i7;
        this.f110948b = j7;
        this.f110949c = i8;
        this.f110950d = i9;
    }

    public final int a() {
        return this.f110949c;
    }

    public final int b() {
        return this.f110950d;
    }

    public final long c() {
        return this.f110948b;
    }

    public final int d() {
        return this.f110947a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatRoomStatus)) {
            return false;
        }
        ChatRoomStatus chatRoomStatus = (ChatRoomStatus) obj;
        return this.f110947a == chatRoomStatus.f110947a && this.f110948b == chatRoomStatus.f110948b && this.f110949c == chatRoomStatus.f110949c && this.f110950d == chatRoomStatus.f110950d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f110950d) + I.a(this.f110949c, C3554n0.a(Integer.hashCode(this.f110947a) * 31, 31, this.f110948b), 31);
    }

    @NotNull
    public final String toString() {
        int i7 = this.f110947a;
        long j7 = this.f110948b;
        int i8 = this.f110949c;
        int i9 = this.f110950d;
        StringBuilder sbA = C2157f0.a(i7, j7, "ChatRoomStatus(status=", ", progress=");
        F.b(i8, i9, ", allowAutoStart=", ", hadStarted=", sbA);
        sbA.append(")");
        return sbA.toString();
    }
}
