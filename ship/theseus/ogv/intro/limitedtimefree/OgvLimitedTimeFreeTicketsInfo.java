package com.bilibili.ship.theseus.ogv.intro.limitedtimefree;

import I.E;
import a5.C3188c;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.bilibili.ship.theseus.ogv.activity.OgvActivityDeliveryResult;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/limitedtimefree/OgvLimitedTimeFreeTicketsInfo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class OgvLimitedTimeFreeTicketsInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f93232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("login")
    private final boolean f93233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f93234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f93235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f93236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f93237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final LimitedTimeFreeImages f93238g;

    @NotNull
    public final LimitedTimeFreeTextInfo h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SerializedName("sub_title")
    @NotNull
    private final LimitedTimeFreeTextInfo f93239i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final OgvActivityDeliveryResult.Button f93240j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f93241k;

    public OgvLimitedTimeFreeTicketsInfo(@NotNull String str, boolean z6, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull LimitedTimeFreeImages limitedTimeFreeImages, @NotNull LimitedTimeFreeTextInfo limitedTimeFreeTextInfo, @NotNull LimitedTimeFreeTextInfo limitedTimeFreeTextInfo2, @NotNull OgvActivityDeliveryResult.Button button, @NotNull Map<String, String> map) {
        this.f93232a = str;
        this.f93233b = z6;
        this.f93234c = str2;
        this.f93235d = str3;
        this.f93236e = str4;
        this.f93237f = str5;
        this.f93238g = limitedTimeFreeImages;
        this.h = limitedTimeFreeTextInfo;
        this.f93239i = limitedTimeFreeTextInfo2;
        this.f93240j = button;
        this.f93241k = map;
    }

    public final boolean a() {
        return this.f93233b;
    }

    @NotNull
    public final LimitedTimeFreeTextInfo b() {
        return this.f93239i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OgvLimitedTimeFreeTicketsInfo)) {
            return false;
        }
        OgvLimitedTimeFreeTicketsInfo ogvLimitedTimeFreeTicketsInfo = (OgvLimitedTimeFreeTicketsInfo) obj;
        return Intrinsics.areEqual(this.f93232a, ogvLimitedTimeFreeTicketsInfo.f93232a) && this.f93233b == ogvLimitedTimeFreeTicketsInfo.f93233b && Intrinsics.areEqual(this.f93234c, ogvLimitedTimeFreeTicketsInfo.f93234c) && Intrinsics.areEqual(this.f93235d, ogvLimitedTimeFreeTicketsInfo.f93235d) && Intrinsics.areEqual(this.f93236e, ogvLimitedTimeFreeTicketsInfo.f93236e) && Intrinsics.areEqual(this.f93237f, ogvLimitedTimeFreeTicketsInfo.f93237f) && Intrinsics.areEqual(this.f93238g, ogvLimitedTimeFreeTicketsInfo.f93238g) && Intrinsics.areEqual(this.h, ogvLimitedTimeFreeTicketsInfo.h) && Intrinsics.areEqual(this.f93239i, ogvLimitedTimeFreeTicketsInfo.f93239i) && Intrinsics.areEqual(this.f93240j, ogvLimitedTimeFreeTicketsInfo.f93240j) && Intrinsics.areEqual(this.f93241k, ogvLimitedTimeFreeTicketsInfo.f93241k);
    }

    public final int hashCode() {
        int iA = E.a(E.a(E.a(E.a(z.a(this.f93232a.hashCode() * 31, 31, this.f93233b), 31, this.f93234c), 31, this.f93235d), 31, this.f93236e), 31, this.f93237f);
        int iHashCode = this.f93238g.hashCode();
        int iHashCode2 = this.h.hashCode();
        int iHashCode3 = this.f93239i.hashCode();
        return this.f93241k.hashCode() + ((this.f93240j.hashCode() + ((iHashCode3 + ((iHashCode2 + ((iHashCode + iA) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        boolean z6 = this.f93233b;
        LimitedTimeFreeTextInfo limitedTimeFreeTextInfo = this.f93239i;
        Map<String, String> map = this.f93241k;
        StringBuilder sb = new StringBuilder("OgvLimitedTimeFreeTicketsInfo(winId=");
        C3188c.a(this.f93232a, ", needLogin=", ", showTime=", sb, z6);
        sb.append(this.f93234c);
        sb.append(", action=");
        sb.append(this.f93235d);
        sb.append(", url=");
        sb.append(this.f93236e);
        sb.append(", closeType=");
        sb.append(this.f93237f);
        sb.append(", images=");
        sb.append(this.f93238g);
        sb.append(", title=");
        sb.append(this.h);
        sb.append(", subtitle=");
        sb.append(limitedTimeFreeTextInfo);
        sb.append(", button=");
        sb.append(this.f93240j);
        sb.append(", report=");
        sb.append(map);
        sb.append(")");
        return sb.toString();
    }
}
