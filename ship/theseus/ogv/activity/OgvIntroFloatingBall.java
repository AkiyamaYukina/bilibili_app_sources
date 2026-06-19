package com.bilibili.ship.theseus.ogv.activity;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.B;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u5.C8711a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/activity/OgvIntroFloatingBall.class */
@StabilityInferred(parameters = 0)
@Bson
public final class OgvIntroFloatingBall {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("win_id")
    @NotNull
    private final String f91426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("day_img")
    @NotNull
    private final String f91427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("dark_img")
    @NotNull
    private final String f91428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("url")
    @NotNull
    private final String f91429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f91430e;

    public OgvIntroFloatingBall() {
        throw null;
    }

    public OgvIntroFloatingBall(String str, String str2, int i7, String str3, String str4, Map map) {
        map = (i7 & 16) != 0 ? MapsKt.emptyMap() : map;
        this.f91426a = str;
        this.f91427b = str2;
        this.f91428c = str3;
        this.f91429d = str4;
        this.f91430e = map;
    }

    @NotNull
    public final String a() {
        return this.f91427b;
    }

    @NotNull
    public final String b() {
        return this.f91426a;
    }

    @NotNull
    public final String c() {
        return this.f91429d;
    }

    @NotNull
    public final String d() {
        return this.f91428c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OgvIntroFloatingBall)) {
            return false;
        }
        OgvIntroFloatingBall ogvIntroFloatingBall = (OgvIntroFloatingBall) obj;
        return Intrinsics.areEqual(this.f91426a, ogvIntroFloatingBall.f91426a) && Intrinsics.areEqual(this.f91427b, ogvIntroFloatingBall.f91427b) && Intrinsics.areEqual(this.f91428c, ogvIntroFloatingBall.f91428c) && Intrinsics.areEqual(this.f91429d, ogvIntroFloatingBall.f91429d) && Intrinsics.areEqual(this.f91430e, ogvIntroFloatingBall.f91430e);
    }

    public final int hashCode() {
        return this.f91430e.hashCode() + E.a(E.a(E.a(this.f91426a.hashCode() * 31, 31, this.f91427b), 31, this.f91428c), 31, this.f91429d);
    }

    @NotNull
    public final String toString() {
        String str = this.f91426a;
        String str2 = this.f91427b;
        String str3 = this.f91428c;
        String str4 = this.f91429d;
        Map<String, String> map = this.f91430e;
        StringBuilder sbA = G0.b.a("OgvIntroFloatingBall(id=", str, ", dayImage=", str2, ", nightImage=");
        B.a(str3, ", link=", str4, ", report=", sbA);
        return C8711a.a(sbA, map, ")");
    }
}
