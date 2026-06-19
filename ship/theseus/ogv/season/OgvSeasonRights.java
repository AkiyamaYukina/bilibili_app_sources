package com.bilibili.ship.theseus.ogv.season;

import androidx.appcompat.app.i;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import c6.P;
import c6.Q;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/season/OgvSeasonRights.class */
@StabilityInferred(parameters = 1)
@Bson
public final class OgvSeasonRights {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("allow_bp")
    private final boolean f94487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("allow_download")
    private final boolean f94488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("only_vip_download")
    private final boolean f94489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("area_limit")
    private final boolean f94490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("allow_review")
    private final boolean f94491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("is_cover_show")
    private final boolean f94492f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("can_watch")
    private final boolean f94493g;

    public OgvSeasonRights(boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.f94487a = z6;
        this.f94488b = z7;
        this.f94489c = z8;
        this.f94490d = z9;
        this.f94491e = z10;
        this.f94492f = z11;
        this.f94493g = z12;
    }

    public final boolean a() {
        return this.f94487a;
    }

    public final boolean b() {
        return this.f94488b;
    }

    public final boolean c() {
        return this.f94491e;
    }

    public final boolean d() {
        return this.f94490d;
    }

    public final boolean e() {
        return this.f94493g;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OgvSeasonRights)) {
            return false;
        }
        OgvSeasonRights ogvSeasonRights = (OgvSeasonRights) obj;
        return this.f94487a == ogvSeasonRights.f94487a && this.f94488b == ogvSeasonRights.f94488b && this.f94489c == ogvSeasonRights.f94489c && this.f94490d == ogvSeasonRights.f94490d && this.f94491e == ogvSeasonRights.f94491e && this.f94492f == ogvSeasonRights.f94492f && this.f94493g == ogvSeasonRights.f94493g;
    }

    public final boolean f() {
        return this.f94489c;
    }

    public final boolean g() {
        return this.f94492f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f94493g) + z.a(z.a(z.a(z.a(z.a(Boolean.hashCode(this.f94487a) * 31, 31, this.f94488b), 31, this.f94489c), 31, this.f94490d), 31, this.f94491e), 31, this.f94492f);
    }

    @NotNull
    public final String toString() {
        boolean z6 = this.f94487a;
        boolean z7 = this.f94488b;
        boolean z8 = this.f94489c;
        boolean z9 = this.f94490d;
        boolean z10 = this.f94491e;
        boolean z11 = this.f94492f;
        boolean z12 = this.f94493g;
        StringBuilder sbA = Q.a("OgvSeasonRights(allowBp=", ", allowDownload=", ", onlyVipDownload=", z6, z7);
        P.a(", areaLimit=", ", allowReview=", sbA, z8, z9);
        P.a(", isCoverShow=", ", canWatch=", sbA, z10, z11);
        return i.a(sbA, z12, ")");
    }
}
