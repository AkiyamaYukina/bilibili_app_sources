package com.bilibili.ship.theseus.ogv.activity;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.B;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvInvitationActivityForegroundVo.class */
@StabilityInferred(parameters = 1)
@Bson
public final class OgvInvitationActivityForegroundVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f91456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("bg_img")
    @NotNull
    private final String f91457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final OgvActivityTextVo f91458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final OgvActivityTextVo f91459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f91460e;

    public OgvInvitationActivityForegroundVo(@NotNull String str, @NotNull String str2, @NotNull OgvActivityTextVo ogvActivityTextVo, @NotNull OgvActivityTextVo ogvActivityTextVo2, long j7) {
        this.f91456a = str;
        this.f91457b = str2;
        this.f91458c = ogvActivityTextVo;
        this.f91459d = ogvActivityTextVo2;
        this.f91460e = j7;
    }

    @NotNull
    public final String a() {
        return this.f91457b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OgvInvitationActivityForegroundVo)) {
            return false;
        }
        OgvInvitationActivityForegroundVo ogvInvitationActivityForegroundVo = (OgvInvitationActivityForegroundVo) obj;
        return Intrinsics.areEqual(this.f91456a, ogvInvitationActivityForegroundVo.f91456a) && Intrinsics.areEqual(this.f91457b, ogvInvitationActivityForegroundVo.f91457b) && Intrinsics.areEqual(this.f91458c, ogvInvitationActivityForegroundVo.f91458c) && Intrinsics.areEqual(this.f91459d, ogvInvitationActivityForegroundVo.f91459d) && this.f91460e == ogvInvitationActivityForegroundVo.f91460e;
    }

    public final int hashCode() {
        int iA = E.a(this.f91456a.hashCode() * 31, 31, this.f91457b);
        int iHashCode = this.f91458c.hashCode();
        return Long.hashCode(this.f91460e) + ((this.f91459d.hashCode() + ((iHashCode + iA) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        String str = this.f91457b;
        StringBuilder sb = new StringBuilder("OgvInvitationActivityForegroundVo(componentId=");
        B.a(this.f91456a, ", headerImage=", str, ", title=", sb);
        sb.append(this.f91458c);
        sb.append(", subtitle=");
        sb.append(this.f91459d);
        sb.append(", showTime=");
        return android.support.v4.media.session.a.a(sb, this.f91460e, ")");
    }
}
