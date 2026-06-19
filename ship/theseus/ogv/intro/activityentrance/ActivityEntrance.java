package com.bilibili.ship.theseus.ogv.intro.activityentrance;

import I.E;
import J2.g;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.B;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/intro/activityentrance/ActivityEntrance.class */
@StabilityInferred(parameters = 0)
@Bson
public final class ActivityEntrance {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("activity_cover")
    @NotNull
    private final String f92292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("activity_title")
    @NotNull
    private final String f92293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("activity_subtitle")
    @NotNull
    private final String f92294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("word_tag")
    @NotNull
    private final String f92295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("activity_link")
    @NotNull
    private final String f92296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("activity_type")
    @NotNull
    private final ActivityEntranceType f92297f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f92298g;

    @SerializedName("order_report_params")
    @NotNull
    private final Map<String, String> h;

    public ActivityEntrance() {
        throw null;
    }

    public ActivityEntrance(String str, String str2, String str3, String str4, String str5, ActivityEntranceType activityEntranceType, Map map, Map map2, int i7) {
        activityEntranceType = (i7 & 32) != 0 ? ActivityEntranceType.NORMAL_ACTIVITY : activityEntranceType;
        map2 = (i7 & 128) != 0 ? MapsKt.emptyMap() : map2;
        this.f92292a = str;
        this.f92293b = str2;
        this.f92294c = str3;
        this.f92295d = str4;
        this.f92296e = str5;
        this.f92297f = activityEntranceType;
        this.f92298g = map;
        this.h = map2;
    }

    @NotNull
    public final String a() {
        return this.f92296e;
    }

    @NotNull
    public final ActivityEntranceType b() {
        return this.f92297f;
    }

    @NotNull
    public final String c() {
        return this.f92292a;
    }

    @NotNull
    public final Map<String, String> d() {
        return this.h;
    }

    @NotNull
    public final String e() {
        return this.f92294c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityEntrance)) {
            return false;
        }
        ActivityEntrance activityEntrance = (ActivityEntrance) obj;
        return Intrinsics.areEqual(this.f92292a, activityEntrance.f92292a) && Intrinsics.areEqual(this.f92293b, activityEntrance.f92293b) && Intrinsics.areEqual(this.f92294c, activityEntrance.f92294c) && Intrinsics.areEqual(this.f92295d, activityEntrance.f92295d) && Intrinsics.areEqual(this.f92296e, activityEntrance.f92296e) && this.f92297f == activityEntrance.f92297f && Intrinsics.areEqual(this.f92298g, activityEntrance.f92298g) && Intrinsics.areEqual(this.h, activityEntrance.h);
    }

    @NotNull
    public final String f() {
        return this.f92293b;
    }

    @NotNull
    public final String g() {
        return this.f92295d;
    }

    public final int hashCode() {
        return this.h.hashCode() + g.a((this.f92297f.hashCode() + E.a(E.a(E.a(E.a(this.f92292a.hashCode() * 31, 31, this.f92293b), 31, this.f92294c), 31, this.f92295d), 31, this.f92296e)) * 31, this.f92298g, 31);
    }

    @NotNull
    public final String toString() {
        String str = this.f92292a;
        String str2 = this.f92293b;
        String str3 = this.f92294c;
        String str4 = this.f92295d;
        String str5 = this.f92296e;
        ActivityEntranceType activityEntranceType = this.f92297f;
        Map<String, String> map = this.f92298g;
        Map<String, String> map2 = this.h;
        StringBuilder sbA = G0.b.a("ActivityEntrance(cover=", str, ", title=", str2, ", subtitle=");
        B.a(str3, ", wordTag=", str4, ", activityLink=", sbA);
        sbA.append(str5);
        sbA.append(", activityType=");
        sbA.append(activityEntranceType);
        sbA.append(", report=");
        sbA.append(map);
        sbA.append(", orderReportParams=");
        sbA.append(map2);
        sbA.append(")");
        return sbA.toString();
    }
}
