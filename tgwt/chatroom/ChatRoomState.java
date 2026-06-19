package com.bilibili.tgwt.chatroom;

import I.E;
import J1.z;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.bilibili.ad.adview.liveroom.answer.fragment.vm.v;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/chatroom/ChatRoomState.class */
@StabilityInferred(parameters = 0)
@Bson
public final class ChatRoomState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("room_id")
    private long f110935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private int f110936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName(NotificationCompat.CATEGORY_PROGRESS)
    private long f110937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("season_id")
    private long f110938d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("episode_id")
    private long f110939e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("init_sequence_id")
    private long f110940f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("latest_seq_id")
    private long f110941g;

    @SerializedName("enter_id")
    @NotNull
    private String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SerializedName("is_new")
    private int f110942i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SerializedName("tip")
    @NotNull
    private String f110943j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @SerializedName("report_time")
    private long f110944k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @SerializedName("room_mode")
    private int f110945l;

    public ChatRoomState(int i7, int i8, int i9, long j7, long j8, long j9, long j10, long j11, long j12, long j13, @NotNull String str, @NotNull String str2) {
        this.f110935a = j7;
        this.f110936b = i7;
        this.f110937c = j8;
        this.f110938d = j9;
        this.f110939e = j10;
        this.f110940f = j11;
        this.f110941g = j12;
        this.h = str;
        this.f110942i = i8;
        this.f110943j = str2;
        this.f110944k = j13;
        this.f110945l = i9;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ChatRoomState(String str, int i7, long j7, int i8, int i9, long j8, long j9, long j10, long j11, String str2, int i10, long j12, long j13) {
        j11 = (i10 & 32) != 0 ? 0L : j11;
        j12 = (i10 & 64) != 0 ? 0L : j12;
        str = (i10 & 128) != 0 ? "" : str;
        i8 = (i10 & 256) != 0 ? 0 : i8;
        str2 = (i10 & 512) != 0 ? "" : str2;
        this(i7, i8, (i10 & 2048) != 0 ? 0 : i9, j7, j8, j9, j10, j11, j12, (i10 & 1024) != 0 ? 0L : j13, str, str2);
    }

    public static ChatRoomState a(ChatRoomState chatRoomState, long j7, int i7, long j8, long j9, long j10) {
        long j11 = chatRoomState.f110940f;
        long j12 = chatRoomState.f110941g;
        String str = chatRoomState.h;
        int i8 = chatRoomState.f110942i;
        String str2 = chatRoomState.f110943j;
        long j13 = chatRoomState.f110944k;
        int i9 = chatRoomState.f110945l;
        chatRoomState.getClass();
        return new ChatRoomState(i7, i8, i9, j7, j8, j9, j10, j11, j12, j13, str, str2);
    }

    @NotNull
    public final String b() {
        return this.h;
    }

    public final long c() {
        return this.f110939e;
    }

    public final long d() {
        return this.f110935a;
    }

    public final long e() {
        return this.f110941g;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatRoomState)) {
            return false;
        }
        ChatRoomState chatRoomState = (ChatRoomState) obj;
        return this.f110935a == chatRoomState.f110935a && this.f110936b == chatRoomState.f110936b && this.f110937c == chatRoomState.f110937c && this.f110938d == chatRoomState.f110938d && this.f110939e == chatRoomState.f110939e && this.f110940f == chatRoomState.f110940f && this.f110941g == chatRoomState.f110941g && Intrinsics.areEqual(this.h, chatRoomState.h) && this.f110942i == chatRoomState.f110942i && Intrinsics.areEqual(this.f110943j, chatRoomState.f110943j) && this.f110944k == chatRoomState.f110944k && this.f110945l == chatRoomState.f110945l;
    }

    public final long f() {
        return this.f110940f;
    }

    public final long g() {
        return this.f110937c;
    }

    public final long h() {
        return this.f110944k;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f110945l) + C3554n0.a(E.a(I.a(this.f110942i, E.a(C3554n0.a(C3554n0.a(C3554n0.a(C3554n0.a(C3554n0.a(I.a(this.f110936b, Long.hashCode(this.f110935a) * 31, 31), 31, this.f110937c), 31, this.f110938d), 31, this.f110939e), 31, this.f110940f), 31, this.f110941g), 31, this.h), 31), 31, this.f110943j), 31, this.f110944k);
    }

    public final int i() {
        return this.f110945l;
    }

    public final long j() {
        return this.f110938d;
    }

    public final int k() {
        return this.f110936b;
    }

    @NotNull
    public final String l() {
        return this.f110943j;
    }

    public final int m() {
        return this.f110942i;
    }

    @NotNull
    public final String toString() {
        long j7 = this.f110935a;
        int i7 = this.f110936b;
        long j8 = this.f110937c;
        long j9 = this.f110938d;
        long j10 = this.f110939e;
        long j11 = this.f110940f;
        long j12 = this.f110941g;
        String str = this.h;
        int i8 = this.f110942i;
        String str2 = this.f110943j;
        long j13 = this.f110944k;
        int i9 = this.f110945l;
        StringBuilder sbB = O4.c.b(i7, j7, "ChatRoomState(id=", ", status=");
        z.a(j8, ", progress=", ", seasonId=", sbB);
        sbB.append(j9);
        z.a(j10, ", episodeId=", ", msgSeqId=", sbB);
        sbB.append(j11);
        z.a(j12, ", latestMsgSeqId=", ", enterId=", sbB);
        H0.e.b(i8, str, ", isNew=", ", tip=", sbB);
        v.a(j13, str2, ", reportTime=", sbB);
        return cf.i.a(i9, ", roomMode=", ")", sbB);
    }
}
