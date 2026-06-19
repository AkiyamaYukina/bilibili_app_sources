package com.bilibili.ship.theseus.ogv.intro.role;

import I.E;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.analytics.C4665g;
import androidx.room.B;
import com.bilibili.bson.common.Bson;
import com.bilibili.lib.accountinfo.model.OfficialVerify;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/role/Role.class */
@StabilityInferred(parameters = 0)
@Bson
public final class Role {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f93428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f93429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f93430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f93431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("desc")
    @NotNull
    private final String f93432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("is_follow")
    private final boolean f93433f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("official")
    @Nullable
    private final OfficialVerify f93434g;

    @Nullable
    public final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f93435i;

    public Role(long j7, long j8, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z6, @Nullable OfficialVerify officialVerify, @Nullable String str4, @NotNull Map<String, String> map) {
        this.f93428a = j7;
        this.f93429b = j8;
        this.f93430c = str;
        this.f93431d = str2;
        this.f93432e = str3;
        this.f93433f = z6;
        this.f93434g = officialVerify;
        this.h = str4;
        this.f93435i = map;
    }

    @NotNull
    public final String a() {
        return this.f93432e;
    }

    public final boolean b() {
        return this.f93433f;
    }

    @Nullable
    public final OfficialVerify c() {
        return this.f93434g;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Role)) {
            return false;
        }
        Role role = (Role) obj;
        return this.f93428a == role.f93428a && this.f93429b == role.f93429b && Intrinsics.areEqual(this.f93430c, role.f93430c) && Intrinsics.areEqual(this.f93431d, role.f93431d) && Intrinsics.areEqual(this.f93432e, role.f93432e) && this.f93433f == role.f93433f && Intrinsics.areEqual(this.f93434g, role.f93434g) && Intrinsics.areEqual(this.h, role.h) && Intrinsics.areEqual(this.f93435i, role.f93435i);
    }

    public final int hashCode() {
        int iA = z.a(E.a(E.a(E.a(C3554n0.a(Long.hashCode(this.f93428a) * 31, 31, this.f93429b), 31, this.f93430c), 31, this.f93431d), 31, this.f93432e), 31, this.f93433f);
        OfficialVerify officialVerify = this.f93434g;
        int iHashCode = 0;
        int iHashCode2 = officialVerify == null ? 0 : officialVerify.hashCode();
        String str = this.h;
        if (str != null) {
            iHashCode = str.hashCode();
        }
        return this.f93435i.hashCode() + ((((iA + iHashCode2) * 31) + iHashCode) * 31);
    }

    @NotNull
    public final String toString() {
        String str = this.f93432e;
        boolean z6 = this.f93433f;
        OfficialVerify officialVerify = this.f93434g;
        Map<String, String> map = this.f93435i;
        StringBuilder sb = new StringBuilder("Role(id=");
        sb.append(this.f93428a);
        sb.append(", mid=");
        sb.append(this.f93429b);
        sb.append(", avatar=");
        sb.append(this.f93430c);
        sb.append(", name=");
        B.a(this.f93431d, ", description=", str, ", hasFollowed=", sb);
        sb.append(z6);
        sb.append(", verifyType=");
        sb.append(officialVerify);
        sb.append(", link=");
        return C4665g.a(sb, this.h, ", report=", map, ")");
    }
}
