package com.bilibili.ship.theseus.ogv.chathall.bean;

import B0.b;
import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.B;
import com.bilibili.ad.adview.pegasus.banner.topview.res.n;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/chathall/bean/ChatHallInfo.class */
@StabilityInferred(parameters = 1)
@Bson
public final class ChatHallInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("room_id")
    private final long f91738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("back_img")
    @NotNull
    private final String f91739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("tag_desc")
    @NotNull
    private final String f91740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("desc_tip")
    @NotNull
    private final String f91741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("desc_link")
    @NotNull
    private final String f91742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final RoomPendant f91743f;

    public ChatHallInfo(long j7, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable RoomPendant roomPendant) {
        this.f91738a = j7;
        this.f91739b = str;
        this.f91740c = str2;
        this.f91741d = str3;
        this.f91742e = str4;
        this.f91743f = roomPendant;
    }

    @NotNull
    public final String a() {
        return this.f91742e;
    }

    @NotNull
    public final String b() {
        return this.f91741d;
    }

    @NotNull
    public final String c() {
        return this.f91739b;
    }

    public final long d() {
        return this.f91738a;
    }

    @NotNull
    public final String e() {
        return this.f91740c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChatHallInfo)) {
            return false;
        }
        ChatHallInfo chatHallInfo = (ChatHallInfo) obj;
        return this.f91738a == chatHallInfo.f91738a && Intrinsics.areEqual(this.f91739b, chatHallInfo.f91739b) && Intrinsics.areEqual(this.f91740c, chatHallInfo.f91740c) && Intrinsics.areEqual(this.f91741d, chatHallInfo.f91741d) && Intrinsics.areEqual(this.f91742e, chatHallInfo.f91742e) && Intrinsics.areEqual(this.f91743f, chatHallInfo.f91743f);
    }

    public final int hashCode() {
        int iA = E.a(E.a(E.a(E.a(Long.hashCode(this.f91738a) * 31, 31, this.f91739b), 31, this.f91740c), 31, this.f91741d), 31, this.f91742e);
        RoomPendant roomPendant = this.f91743f;
        return iA + (roomPendant == null ? 0 : roomPendant.hashCode());
    }

    @NotNull
    public final String toString() {
        long j7 = this.f91738a;
        String str = this.f91739b;
        String str2 = this.f91740c;
        String str3 = this.f91741d;
        String str4 = this.f91742e;
        StringBuilder sbA = n.a(j7, "ChatHallInfo(roomId=", ", hallCover=", str);
        B.a(", tagDesc=", str2, ", descTip=", str3, sbA);
        b.b(", descLink=", str4, ", pendant=", sbA);
        sbA.append(this.f91743f);
        sbA.append(")");
        return sbA.toString();
    }
}
