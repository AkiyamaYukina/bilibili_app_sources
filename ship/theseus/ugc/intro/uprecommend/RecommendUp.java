package com.bilibili.ship.theseus.ugc.intro.uprecommend;

import I.E;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.B;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ugc/intro/uprecommend/RecommendUp.class */
@StabilityInferred(parameters = 0)
@Bson
public final class RecommendUp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("param")
    @NotNull
    private final String f97747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("cover")
    @NotNull
    private final String f97748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("title")
    @NotNull
    private final String f97749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("desc")
    @NotNull
    private final String f97750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("desc_button")
    @Nullable
    private final RecommendUpDescButton f97751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("official_icon")
    private final int f97752f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("handle")
    @Nullable
    private final String f97753g;

    @Nullable
    public transient String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public transient int f97754i = 1;

    public RecommendUp(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable RecommendUpDescButton recommendUpDescButton, int i7, @Nullable String str5) {
        this.f97747a = str;
        this.f97748b = str2;
        this.f97749c = str3;
        this.f97750d = str4;
        this.f97751e = recommendUpDescButton;
        this.f97752f = i7;
        this.f97753g = str5;
    }

    public static RecommendUp a(RecommendUp recommendUp, RecommendUpDescButton recommendUpDescButton) {
        String str = recommendUp.f97747a;
        String str2 = recommendUp.f97748b;
        String str3 = recommendUp.f97749c;
        String str4 = recommendUp.f97750d;
        int i7 = recommendUp.f97752f;
        String str5 = recommendUp.f97753g;
        recommendUp.getClass();
        return new RecommendUp(str, str2, str3, str4, recommendUpDescButton, i7, str5);
    }

    @NotNull
    public final String b() {
        return this.f97748b;
    }

    @NotNull
    public final String c() {
        return this.f97750d;
    }

    @Nullable
    public final RecommendUpDescButton d() {
        return this.f97751e;
    }

    @Nullable
    public final String e() {
        return this.f97753g;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendUp)) {
            return false;
        }
        RecommendUp recommendUp = (RecommendUp) obj;
        return Intrinsics.areEqual(this.f97747a, recommendUp.f97747a) && Intrinsics.areEqual(this.f97748b, recommendUp.f97748b) && Intrinsics.areEqual(this.f97749c, recommendUp.f97749c) && Intrinsics.areEqual(this.f97750d, recommendUp.f97750d) && Intrinsics.areEqual(this.f97751e, recommendUp.f97751e) && this.f97752f == recommendUp.f97752f && Intrinsics.areEqual(this.f97753g, recommendUp.f97753g);
    }

    public final int f() {
        return this.f97752f;
    }

    @NotNull
    public final String g() {
        return this.f97747a;
    }

    @NotNull
    public final String h() {
        return this.f97749c;
    }

    public final int hashCode() {
        int iA = E.a(E.a(E.a(this.f97747a.hashCode() * 31, 31, this.f97748b), 31, this.f97749c), 31, this.f97750d);
        RecommendUpDescButton recommendUpDescButton = this.f97751e;
        int iA2 = I.a(this.f97752f, (iA + (recommendUpDescButton == null ? 0 : recommendUpDescButton.hashCode())) * 31, 31);
        String str = this.f97753g;
        return iA2 + (str == null ? 0 : str.hashCode());
    }

    public final long i() {
        Long longOrNull = StringsKt.toLongOrNull(this.f97747a);
        return longOrNull != null ? longOrNull.longValue() : 0L;
    }

    @NotNull
    public final String toString() {
        String str = this.f97747a;
        String str2 = this.f97748b;
        String str3 = this.f97749c;
        String str4 = this.f97750d;
        RecommendUpDescButton recommendUpDescButton = this.f97751e;
        int i7 = this.f97752f;
        String str5 = this.f97753g;
        StringBuilder sbA = G0.b.a("RecommendUp(param=", str, ", cover=", str2, ", title=");
        B.a(str3, ", desc=", str4, ", descButton=", sbA);
        sbA.append(recommendUpDescButton);
        sbA.append(", officialIcon=");
        sbA.append(i7);
        sbA.append(", handle=");
        return C8770a.a(sbA, str5, ")");
    }
}
