package com.bilibili.ogv.opbase;

import Id.a;
import androidx.compose.animation.z;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.B;
import com.bilibili.bson.adapter.StringIntColorTypeAdapter;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/BannerStyle.class */
@StabilityInferred(parameters = 1)
@Bson
public final class BannerStyle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("top_color")
    @Nullable
    private final String f69677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("tab_text_select_color")
    @JsonAdapter(StringIntColorTypeAdapter.class)
    @Nullable
    private final Integer f69678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("tab_text_unselect_color")
    @JsonAdapter(StringIntColorTypeAdapter.class)
    @Nullable
    private final Integer f69679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("status_bar_color_type")
    private final boolean f69680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("pinned")
    private final boolean f69681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("bg_color")
    @Nullable
    private final String f69682f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("text_title_color")
    @Nullable
    private final String f69683g;

    @SerializedName("text_content_color")
    @Nullable
    private final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SerializedName("text_highlight_color")
    @Nullable
    private final String f69684i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SerializedName("split_line_color")
    @Nullable
    private final String f69685j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @SerializedName("bg_mask_color")
    @Nullable
    private final String f69686k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @SerializedName("bg_mask_start_color")
    @Nullable
    private final String f69687l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @SerializedName("bg_mask_end_color")
    @Nullable
    private final String f69688m;

    public BannerStyle(@Nullable String str, @Nullable Integer num, @Nullable Integer num2, boolean z6, boolean z7, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9) {
        this.f69677a = str;
        this.f69678b = num;
        this.f69679c = num2;
        this.f69680d = z6;
        this.f69681e = z7;
        this.f69682f = str2;
        this.f69683g = str3;
        this.h = str4;
        this.f69684i = str5;
        this.f69685j = str6;
        this.f69686k = str7;
        this.f69687l = str8;
        this.f69688m = str9;
    }

    @Nullable
    public final String a() {
        return this.f69682f;
    }

    @Nullable
    public final String b() {
        return this.f69686k;
    }

    @Nullable
    public final String c() {
        return this.f69688m;
    }

    @Nullable
    public final String d() {
        return this.f69687l;
    }

    public final boolean e() {
        return this.f69681e;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerStyle)) {
            return false;
        }
        BannerStyle bannerStyle = (BannerStyle) obj;
        return Intrinsics.areEqual(this.f69677a, bannerStyle.f69677a) && Intrinsics.areEqual(this.f69678b, bannerStyle.f69678b) && Intrinsics.areEqual(this.f69679c, bannerStyle.f69679c) && this.f69680d == bannerStyle.f69680d && this.f69681e == bannerStyle.f69681e && Intrinsics.areEqual(this.f69682f, bannerStyle.f69682f) && Intrinsics.areEqual(this.f69683g, bannerStyle.f69683g) && Intrinsics.areEqual(this.h, bannerStyle.h) && Intrinsics.areEqual(this.f69684i, bannerStyle.f69684i) && Intrinsics.areEqual(this.f69685j, bannerStyle.f69685j) && Intrinsics.areEqual(this.f69686k, bannerStyle.f69686k) && Intrinsics.areEqual(this.f69687l, bannerStyle.f69687l) && Intrinsics.areEqual(this.f69688m, bannerStyle.f69688m);
    }

    @Nullable
    public final String f() {
        return this.f69685j;
    }

    @Nullable
    public final Integer g() {
        return this.f69678b;
    }

    @Nullable
    public final Integer h() {
        return this.f69679c;
    }

    public final int hashCode() {
        String str = this.f69677a;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Integer num = this.f69678b;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        Integer num2 = this.f69679c;
        int iA = z.a(z.a(((((iHashCode2 * 31) + iHashCode3) * 31) + (num2 == null ? 0 : num2.hashCode())) * 31, 31, this.f69680d), 31, this.f69681e);
        String str2 = this.f69682f;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.f69683g;
        int iHashCode5 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.h;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.f69684i;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.f69685j;
        int iHashCode8 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.f69686k;
        int iHashCode9 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.f69687l;
        int iHashCode10 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.f69688m;
        if (str9 != null) {
            iHashCode = str9.hashCode();
        }
        return ((((((((((((((iA + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode;
    }

    @Nullable
    public final String i() {
        return this.h;
    }

    @Nullable
    public final String j() {
        return this.f69684i;
    }

    @Nullable
    public final String k() {
        return this.f69683g;
    }

    @Nullable
    public final String l() {
        return this.f69677a;
    }

    public final boolean m() {
        return this.f69680d;
    }

    @NotNull
    public final String toString() {
        String str = this.f69677a;
        Integer num = this.f69678b;
        Integer num2 = this.f69679c;
        boolean z6 = this.f69680d;
        boolean z7 = this.f69681e;
        String str2 = this.f69682f;
        String str3 = this.f69683g;
        String str4 = this.h;
        String str5 = this.f69684i;
        String str6 = this.f69685j;
        String str7 = this.f69686k;
        String str8 = this.f69687l;
        String str9 = this.f69688m;
        StringBuilder sbA = a.a("BannerStyle(topColor=", num, str, ", tabColorSelected=", ", tabColorUnselected=");
        sbA.append(num2);
        sbA.append(", whiteStatusBar=");
        sbA.append(z6);
        sbA.append(", pinned=");
        O4.a.d(", bgColor=", str2, ", textTitleColor=", sbA, z7);
        B.a(str3, ", textContentColor=", str4, ", textHighlightColor=", sbA);
        B.a(str5, ", splitLineColor=", str6, ", bgMaskColor=", sbA);
        B.a(str7, ", bgMaskStartColor=", str8, ", bgMaskEndColor=", sbA);
        return C8770a.a(sbA, str9, ")");
    }
}
