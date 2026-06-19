package com.bilibili.ship.theseus.ogv.activity;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.B;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvInvitationActivitySuccessVo.class */
@StabilityInferred(parameters = 1)
@Bson
public final class OgvInvitationActivitySuccessVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f91473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("bg_img")
    @NotNull
    private final String f91474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("face")
    @NotNull
    private final String f91475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("invitee_face")
    @NotNull
    private final String f91476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final OgvActivityTextVo f91477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final OgvActivityTextVo f91478f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final OgvActivityTextVo f91479g;

    public OgvInvitationActivitySuccessVo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull OgvActivityTextVo ogvActivityTextVo, @NotNull OgvActivityTextVo ogvActivityTextVo2, @NotNull OgvActivityTextVo ogvActivityTextVo3) {
        this.f91473a = str;
        this.f91474b = str2;
        this.f91475c = str3;
        this.f91476d = str4;
        this.f91477e = ogvActivityTextVo;
        this.f91478f = ogvActivityTextVo2;
        this.f91479g = ogvActivityTextVo3;
    }

    @NotNull
    public final String a() {
        return this.f91475c;
    }

    @NotNull
    public final String b() {
        return this.f91474b;
    }

    @NotNull
    public final String c() {
        return this.f91476d;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OgvInvitationActivitySuccessVo)) {
            return false;
        }
        OgvInvitationActivitySuccessVo ogvInvitationActivitySuccessVo = (OgvInvitationActivitySuccessVo) obj;
        return Intrinsics.areEqual(this.f91473a, ogvInvitationActivitySuccessVo.f91473a) && Intrinsics.areEqual(this.f91474b, ogvInvitationActivitySuccessVo.f91474b) && Intrinsics.areEqual(this.f91475c, ogvInvitationActivitySuccessVo.f91475c) && Intrinsics.areEqual(this.f91476d, ogvInvitationActivitySuccessVo.f91476d) && Intrinsics.areEqual(this.f91477e, ogvInvitationActivitySuccessVo.f91477e) && Intrinsics.areEqual(this.f91478f, ogvInvitationActivitySuccessVo.f91478f) && Intrinsics.areEqual(this.f91479g, ogvInvitationActivitySuccessVo.f91479g);
    }

    public final int hashCode() {
        int iA = E.a(E.a(E.a(this.f91473a.hashCode() * 31, 31, this.f91474b), 31, this.f91475c), 31, this.f91476d);
        int iHashCode = this.f91477e.hashCode();
        return this.f91479g.hashCode() + ((this.f91478f.hashCode() + ((iHashCode + iA) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        String str = this.f91474b;
        String str2 = this.f91475c;
        String str3 = this.f91476d;
        StringBuilder sb = new StringBuilder("OgvInvitationActivitySuccessVo(componentId=");
        B.a(this.f91473a, ", backgroundImage=", str, ", avatar=", sb);
        B.a(str2, ", inviteeAvatar=", str3, ", title=", sb);
        sb.append(this.f91477e);
        sb.append(", subtitle=");
        sb.append(this.f91478f);
        sb.append(", subtitleTip=");
        sb.append(this.f91479g);
        sb.append(")");
        return sb.toString();
    }
}
