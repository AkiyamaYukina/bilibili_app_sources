package com.bilibili.tgwt.chatroom;

import I.E;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.z;
import androidx.compose.ui.graphics.e0;
import androidx.core.app.NotificationCompat;
import androidx.core.app.o;
import androidx.room.B;
import com.bilibili.bson.common.Bson;
import com.bilibili.chatroomsdk.ChatRoomMember;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/tgwt/chatroom/ChatRoomFullInfo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class ChatRoomFullInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("room_id")
    private long f110873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("oid")
    private long f110874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("sub_id")
    private long f110875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("is_open")
    private int f110876d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName(EditCustomizeSticker.TAG_MID)
    private long f110877e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("members")
    @NotNull
    private List<ChatRoomMember> f110878f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("limit_count")
    private int f110879g;

    @SerializedName("member_count")
    private int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SerializedName("member_count_desc_v2")
    @NotNull
    private String f110880i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SerializedName("full_mc_desc")
    @NotNull
    private String f110881j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @SerializedName("half_mc_desc")
    @NotNull
    private String f110882k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @SerializedName("title")
    @NotNull
    private String f110883l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @SerializedName("desc")
    @NotNull
    private String f110884m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    @Nullable
    private ChatRoomStatus f110885n;

    public ChatRoomFullInfo(long j7, long j8, long j9, int i7, long j10, @NotNull List<ChatRoomMember> list, int i8, int i9, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @Nullable ChatRoomStatus chatRoomStatus) {
        this.f110873a = j7;
        this.f110874b = j8;
        this.f110875c = j9;
        this.f110876d = i7;
        this.f110877e = j10;
        this.f110878f = list;
        this.f110879g = i8;
        this.h = i9;
        this.f110880i = str;
        this.f110881j = str2;
        this.f110882k = str3;
        this.f110883l = str4;
        this.f110884m = str5;
        this.f110885n = chatRoomStatus;
    }

    @NotNull
    public final String a() {
        return this.f110884m;
    }

    public final long b() {
        return this.f110875c;
    }

    @NotNull
    public final String c() {
        return this.f110881j;
    }

    @NotNull
    public final String d() {
        return this.f110882k;
    }

    public final long e() {
        return this.f110873a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatRoomFullInfo)) {
            return false;
        }
        ChatRoomFullInfo chatRoomFullInfo = (ChatRoomFullInfo) obj;
        return this.f110873a == chatRoomFullInfo.f110873a && this.f110874b == chatRoomFullInfo.f110874b && this.f110875c == chatRoomFullInfo.f110875c && this.f110876d == chatRoomFullInfo.f110876d && this.f110877e == chatRoomFullInfo.f110877e && Intrinsics.areEqual(this.f110878f, chatRoomFullInfo.f110878f) && this.f110879g == chatRoomFullInfo.f110879g && this.h == chatRoomFullInfo.h && Intrinsics.areEqual(this.f110880i, chatRoomFullInfo.f110880i) && Intrinsics.areEqual(this.f110881j, chatRoomFullInfo.f110881j) && Intrinsics.areEqual(this.f110882k, chatRoomFullInfo.f110882k) && Intrinsics.areEqual(this.f110883l, chatRoomFullInfo.f110883l) && Intrinsics.areEqual(this.f110884m, chatRoomFullInfo.f110884m) && Intrinsics.areEqual(this.f110885n, chatRoomFullInfo.f110885n);
    }

    public final int f() {
        return this.f110879g;
    }

    public final int g() {
        return this.h;
    }

    @NotNull
    public final String h() {
        return this.f110880i;
    }

    public final int hashCode() {
        int iA = E.a(E.a(E.a(E.a(E.a(I.a(this.h, I.a(this.f110879g, e0.a(C3554n0.a(I.a(this.f110876d, C3554n0.a(C3554n0.a(Long.hashCode(this.f110873a) * 31, 31, this.f110874b), 31, this.f110875c), 31), 31, this.f110877e), 31, this.f110878f), 31), 31), 31, this.f110880i), 31, this.f110881j), 31, this.f110882k), 31, this.f110883l), 31, this.f110884m);
        ChatRoomStatus chatRoomStatus = this.f110885n;
        return iA + (chatRoomStatus == null ? 0 : chatRoomStatus.hashCode());
    }

    @NotNull
    public final List<ChatRoomMember> i() {
        return this.f110878f;
    }

    public final int j() {
        return this.f110876d;
    }

    public final long k() {
        return this.f110877e;
    }

    public final long l() {
        return this.f110874b;
    }

    @Nullable
    public final ChatRoomStatus m() {
        return this.f110885n;
    }

    @NotNull
    public final String n() {
        return this.f110883l;
    }

    @NotNull
    public final String toString() {
        long j7 = this.f110873a;
        long j8 = this.f110874b;
        long j9 = this.f110875c;
        int i7 = this.f110876d;
        long j10 = this.f110877e;
        List<ChatRoomMember> list = this.f110878f;
        int i8 = this.f110879g;
        int i9 = this.h;
        String str = this.f110880i;
        String str2 = this.f110881j;
        String str3 = this.f110882k;
        String str4 = this.f110883l;
        String str5 = this.f110884m;
        ChatRoomStatus chatRoomStatus = this.f110885n;
        StringBuilder sbA = z.a(j7, "ChatRoomFullInfo(id=", ", seasonId=");
        sbA.append(j8);
        J1.z.a(j9, ", episodeId=", ", openStatus=", sbA);
        o.b(i7, j10, ", ownerId=", sbA);
        sbA.append(", members=");
        sbA.append(list);
        sbA.append(", limitCount=");
        sbA.append(i8);
        cf.l.a(i9, ", memberCount=", ", memberCountDesc=", str, sbA);
        B.a(", fullMcDesc=", str2, ", halfMcDesc=", str3, sbA);
        B.a(", title=", str4, ", desc=", str5, sbA);
        sbA.append(", status=");
        sbA.append(chatRoomStatus);
        sbA.append(")");
        return sbA.toString();
    }
}
