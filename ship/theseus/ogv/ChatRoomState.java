package com.bilibili.ship.theseus.ogv;

import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/ChatRoomState.class */
@StabilityInferred(parameters = 0)
@Bson
public final class ChatRoomState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("room_id")
    private long f91214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private int f91215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(NotificationCompat.CATEGORY_PROGRESS)
    private long f91216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("season_id")
    private long f91217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("episode_id")
    private long f91218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("init_sequence_id")
    private long f91219f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("enter_id")
    @NotNull
    private String f91220g;

    @SerializedName("tip")
    @NotNull
    private String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SerializedName("report_time")
    private long f91221i;

    public ChatRoomState(long j7, int i7, long j8, long j9, long j10, long j11, String str, String str2, long j12, int i8) {
        j11 = (i8 & 32) != 0 ? 0L : j11;
        str = (i8 & 64) != 0 ? "" : str;
        str2 = (i8 & 128) != 0 ? "" : str2;
        j12 = (i8 & 256) != 0 ? 0L : j12;
        this.f91214a = j7;
        this.f91215b = i7;
        this.f91216c = j8;
        this.f91217d = j9;
        this.f91218e = j10;
        this.f91219f = j11;
        this.f91220g = str;
        this.h = str2;
        this.f91221i = j12;
    }

    @NotNull
    public final String a() {
        return this.f91220g;
    }

    public final long b() {
        return this.f91218e;
    }

    public final long c() {
        return this.f91214a;
    }

    public final long d() {
        return this.f91219f;
    }

    public final long e() {
        return this.f91216c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatRoomState)) {
            return false;
        }
        ChatRoomState chatRoomState = (ChatRoomState) obj;
        return this.f91214a == chatRoomState.f91214a && this.f91215b == chatRoomState.f91215b && this.f91216c == chatRoomState.f91216c && this.f91217d == chatRoomState.f91217d && this.f91218e == chatRoomState.f91218e && this.f91219f == chatRoomState.f91219f && Intrinsics.areEqual(this.f91220g, chatRoomState.f91220g) && Intrinsics.areEqual(this.h, chatRoomState.h) && this.f91221i == chatRoomState.f91221i;
    }

    public final long f() {
        return this.f91221i;
    }

    public final long g() {
        return this.f91217d;
    }

    public final int h() {
        return this.f91215b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f91221i) + I.E.a(I.E.a(C3554n0.a(C3554n0.a(C3554n0.a(C3554n0.a(androidx.compose.animation.core.I.a(this.f91215b, Long.hashCode(this.f91214a) * 31, 31), 31, this.f91216c), 31, this.f91217d), 31, this.f91218e), 31, this.f91219f), 31, this.f91220g), 31, this.h);
    }

    @NotNull
    public final String i() {
        return this.h;
    }

    @NotNull
    public final String toString() {
        long j7 = this.f91214a;
        int i7 = this.f91215b;
        long j8 = this.f91216c;
        long j9 = this.f91217d;
        long j10 = this.f91218e;
        long j11 = this.f91219f;
        String str = this.f91220g;
        String str2 = this.h;
        long j12 = this.f91221i;
        StringBuilder sbB = O4.c.b(i7, j7, "ChatRoomState(id=", ", status=");
        J1.z.a(j8, ", progress=", ", seasonId=", sbB);
        sbB.append(j9);
        J1.z.a(j10, ", episodeId=", ", msgSeqId=", sbB);
        G0.d.a(j11, ", enterId=", str, sbB);
        B0.b.b(", tip=", str2, ", reportTime=", sbB);
        return android.support.v4.media.session.a.a(sbB, j12, ")");
    }
}
