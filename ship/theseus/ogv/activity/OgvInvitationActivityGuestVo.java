package com.bilibili.ship.theseus.ogv.activity;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.B;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvInvitationActivityGuestVo.class */
@StabilityInferred(parameters = 1)
@Bson
public final class OgvInvitationActivityGuestVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f91462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("bg_img")
    @NotNull
    private final String f91463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("face")
    @NotNull
    private final String f91464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("inviter_face")
    @NotNull
    private final String f91465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final OgvActivityTextVo f91466e;

    public OgvInvitationActivityGuestVo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull OgvActivityTextVo ogvActivityTextVo) {
        this.f91462a = str;
        this.f91463b = str2;
        this.f91464c = str3;
        this.f91465d = str4;
        this.f91466e = ogvActivityTextVo;
    }

    @NotNull
    public final String a() {
        return this.f91464c;
    }

    @NotNull
    public final String b() {
        return this.f91463b;
    }

    @NotNull
    public final String c() {
        return this.f91465d;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OgvInvitationActivityGuestVo)) {
            return false;
        }
        OgvInvitationActivityGuestVo ogvInvitationActivityGuestVo = (OgvInvitationActivityGuestVo) obj;
        return Intrinsics.areEqual(this.f91462a, ogvInvitationActivityGuestVo.f91462a) && Intrinsics.areEqual(this.f91463b, ogvInvitationActivityGuestVo.f91463b) && Intrinsics.areEqual(this.f91464c, ogvInvitationActivityGuestVo.f91464c) && Intrinsics.areEqual(this.f91465d, ogvInvitationActivityGuestVo.f91465d) && Intrinsics.areEqual(this.f91466e, ogvInvitationActivityGuestVo.f91466e);
    }

    public final int hashCode() {
        return this.f91466e.hashCode() + E.a(E.a(E.a(this.f91462a.hashCode() * 31, 31, this.f91463b), 31, this.f91464c), 31, this.f91465d);
    }

    @NotNull
    public final String toString() {
        String str = this.f91463b;
        String str2 = this.f91464c;
        String str3 = this.f91465d;
        StringBuilder sb = new StringBuilder("OgvInvitationActivityGuestVo(componentId=");
        B.a(this.f91462a, ", backgroundImage=", str, ", avatar=", sb);
        B.a(str2, ", inviterAvatar=", str3, ", title=", sb);
        sb.append(this.f91466e);
        sb.append(")");
        return sb.toString();
    }
}
