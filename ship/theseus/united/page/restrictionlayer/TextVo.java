package com.bilibili.ship.theseus.united.page.restrictionlayer;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bapis.bilibili.playershared.TextInfo;
import com.bilibili.bson.adapter.StringIntColorTypeAdapter;
import com.bilibili.bson.common.Bson;
import com.bilibili.okretro.call.json.JsonUtilKt;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/TextVo.class */
@StabilityInferred(parameters = 0)
@Bson
@JsonAdapter(TextVoTypeAdapterFactory.class)
public final class TextVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f102705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("text_color")
    @JsonAdapter(StringIntColorTypeAdapter.class)
    private final int f102706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("text_color_night")
    @JsonAdapter(StringIntColorTypeAdapter.class)
    @Nullable
    private final Integer f102707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("bg_color")
    @JsonAdapter(StringIntColorTypeAdapter.class)
    @Nullable
    private final Integer f102708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("bg_color_night")
    @JsonAdapter(StringIntColorTypeAdapter.class)
    @Nullable
    private final Integer f102709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("frame_color")
    @JsonAdapter(StringIntColorTypeAdapter.class)
    @Nullable
    private final Integer f102710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("icon")
    @Nullable
    private final String f102711g;

    @SerializedName("report")
    @Nullable
    private final ReportVo h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SerializedName("link")
    @Nullable
    private final String f102712i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final s f102713j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @SerializedName("badge_info")
    @Nullable
    private final TextVo f102714k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @SerializedName("font_size")
    @Nullable
    private final Integer f102715l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @SerializedName("left_strikethrough_text")
    @Nullable
    private final String f102716m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @SerializedName("simple_text_info")
    @Nullable
    private final TextVo f102717n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @SerializedName("bg_gradient_color")
    @Nullable
    private final GradientColorVo f102718o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public final String f102719p;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/TextVo$a.class */
    public static final class a {

        /* JADX INFO: renamed from: com.bilibili.ship.theseus.united.page.restrictionlayer.TextVo$a$a, reason: collision with other inner class name */
        /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/restrictionlayer/TextVo$a$a.class */
        public static final class C1109a extends TypeToken<TextVo> {
        }

        @Nullable
        public static TextVo a(@NotNull TextInfo textInfo) {
            String text = textInfo.getText();
            if (text == null || text.length() == 0) {
                return null;
            }
            return (TextVo) JsonUtilKt.parseJson(Pj0.e.a(textInfo), new C1109a().getType());
        }
    }

    public TextVo(@NotNull String str, int i7, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable String str2, @Nullable ReportVo reportVo, @Nullable String str3, @Nullable s sVar, @Nullable TextVo textVo, @Nullable Integer num5, @Nullable String str4, @Nullable TextVo textVo2, @Nullable GradientColorVo gradientColorVo, @Nullable String str5) {
        this.f102705a = str;
        this.f102706b = i7;
        this.f102707c = num;
        this.f102708d = num2;
        this.f102709e = num3;
        this.f102710f = num4;
        this.f102711g = str2;
        this.h = reportVo;
        this.f102712i = str3;
        this.f102713j = sVar;
        this.f102714k = textVo;
        this.f102715l = num5;
        this.f102716m = str4;
        this.f102717n = textVo2;
        this.f102718o = gradientColorVo;
        this.f102719p = str5;
    }

    public static TextVo a(TextVo textVo, String str, ReportVo reportVo, int i7) {
        if ((i7 & 1) != 0) {
            str = textVo.f102705a;
        }
        int i8 = textVo.f102706b;
        Integer num = textVo.f102707c;
        Integer num2 = textVo.f102708d;
        Integer num3 = textVo.f102709e;
        Integer num4 = textVo.f102710f;
        String str2 = textVo.f102711g;
        if ((i7 & 128) != 0) {
            reportVo = textVo.h;
        }
        String str3 = textVo.f102712i;
        s sVar = textVo.f102713j;
        TextVo textVo2 = textVo.f102714k;
        Integer num5 = textVo.f102715l;
        String str4 = textVo.f102716m;
        TextVo textVo3 = textVo.f102717n;
        GradientColorVo gradientColorVo = textVo.f102718o;
        String str5 = textVo.f102719p;
        textVo.getClass();
        return new TextVo(str, i8, num, num2, num3, num4, str2, reportVo, str3, sVar, textVo2, num5, str4, textVo3, gradientColorVo, str5);
    }

    @Nullable
    public final Integer b() {
        return this.f102708d;
    }

    @Nullable
    public final Integer c() {
        return this.f102709e;
    }

    @JvmOverloads
    @Nullable
    public final Drawable d(@NotNull Context context, @NotNull GradientDrawable.Orientation orientation) {
        GradientDrawable gradientDrawable;
        GradientColorVo gradientColorVo = this.f102718o;
        if ((gradientColorVo != null ? gradientColorVo.b() : null) == null || this.f102718o.a() == null) {
            gradientDrawable = null;
            if (this.f102708d != null) {
                gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(Uj0.c.a(22.0f, context));
                gradientDrawable.setColor(this.f102708d.intValue());
            }
        } else {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setOrientation(orientation);
            gradientDrawable2.setCornerRadius(Uj0.c.a(22.0f, context));
            gradientDrawable2.setColors(new int[]{this.f102718o.b().intValue(), this.f102718o.a().intValue()});
            gradientDrawable = gradientDrawable2;
        }
        return gradientDrawable;
    }

    @Nullable
    public final TextVo e() {
        return this.f102714k;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextVo)) {
            return false;
        }
        TextVo textVo = (TextVo) obj;
        return Intrinsics.areEqual(this.f102705a, textVo.f102705a) && this.f102706b == textVo.f102706b && Intrinsics.areEqual(this.f102707c, textVo.f102707c) && Intrinsics.areEqual(this.f102708d, textVo.f102708d) && Intrinsics.areEqual(this.f102709e, textVo.f102709e) && Intrinsics.areEqual(this.f102710f, textVo.f102710f) && Intrinsics.areEqual(this.f102711g, textVo.f102711g) && Intrinsics.areEqual(this.h, textVo.h) && Intrinsics.areEqual(this.f102712i, textVo.f102712i) && Intrinsics.areEqual(this.f102713j, textVo.f102713j) && Intrinsics.areEqual(this.f102714k, textVo.f102714k) && Intrinsics.areEqual(this.f102715l, textVo.f102715l) && Intrinsics.areEqual(this.f102716m, textVo.f102716m) && Intrinsics.areEqual(this.f102717n, textVo.f102717n) && Intrinsics.areEqual(this.f102718o, textVo.f102718o) && Intrinsics.areEqual(this.f102719p, textVo.f102719p);
    }

    @Nullable
    public final GradientColorVo f() {
        return this.f102718o;
    }

    @Nullable
    public final Integer g() {
        return this.f102715l;
    }

    @Nullable
    public final Integer h() {
        return this.f102710f;
    }

    public final int hashCode() {
        int iA = androidx.compose.animation.core.I.a(this.f102706b, this.f102705a.hashCode() * 31, 31);
        Integer num = this.f102707c;
        int iHashCode = 0;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        Integer num2 = this.f102708d;
        int iHashCode3 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.f102709e;
        int iHashCode4 = num3 == null ? 0 : num3.hashCode();
        Integer num4 = this.f102710f;
        int iHashCode5 = num4 == null ? 0 : num4.hashCode();
        String str = this.f102711g;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        ReportVo reportVo = this.h;
        int iHashCode7 = reportVo == null ? 0 : reportVo.hashCode();
        String str2 = this.f102712i;
        int iHashCode8 = str2 == null ? 0 : str2.hashCode();
        s sVar = this.f102713j;
        int iHashCode9 = sVar == null ? 0 : sVar.hashCode();
        TextVo textVo = this.f102714k;
        int iHashCode10 = textVo == null ? 0 : textVo.hashCode();
        Integer num5 = this.f102715l;
        int iHashCode11 = num5 == null ? 0 : num5.hashCode();
        String str3 = this.f102716m;
        int iHashCode12 = str3 == null ? 0 : str3.hashCode();
        TextVo textVo2 = this.f102717n;
        int iHashCode13 = textVo2 == null ? 0 : textVo2.hashCode();
        GradientColorVo gradientColorVo = this.f102718o;
        int iHashCode14 = gradientColorVo == null ? 0 : gradientColorVo.hashCode();
        String str4 = this.f102719p;
        if (str4 != null) {
            iHashCode = str4.hashCode();
        }
        return ((((((((((((((((((((((((((iA + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode;
    }

    @Nullable
    public final String i() {
        return this.f102711g;
    }

    @Nullable
    public final String j() {
        return this.f102716m;
    }

    @Nullable
    public final String k() {
        return this.f102712i;
    }

    @Nullable
    public final ReportVo l() {
        return this.h;
    }

    @Nullable
    public final TextVo m() {
        return this.f102717n;
    }

    public final int n() {
        return this.f102706b;
    }

    @Nullable
    public final Integer o() {
        return this.f102707c;
    }

    public final int p(@NotNull Context context) {
        Integer num;
        return (!Cj0.a.a(context) || (num = this.f102707c) == null) ? this.f102706b : num.intValue();
    }

    @NotNull
    public final String toString() {
        int i7 = this.f102706b;
        Integer num = this.f102707c;
        Integer num2 = this.f102708d;
        Integer num3 = this.f102709e;
        Integer num4 = this.f102710f;
        String str = this.f102711g;
        ReportVo reportVo = this.h;
        String str2 = this.f102712i;
        TextVo textVo = this.f102714k;
        Integer num5 = this.f102715l;
        String str3 = this.f102716m;
        TextVo textVo2 = this.f102717n;
        GradientColorVo gradientColorVo = this.f102718o;
        StringBuilder sb = new StringBuilder("TextVo(text=");
        H0.e.b(i7, this.f102705a, ", textColor=", ", textColorNight=", sb);
        Ul.a.a(sb, num, ", backgroundColor=", num2, ", backgroundColorNight=");
        Ul.a.a(sb, num3, ", frameColor=", num4, ", iconUrl=");
        sb.append(str);
        sb.append(", report=");
        sb.append(reportVo);
        sb.append(", link=");
        sb.append(str2);
        sb.append(", action=");
        sb.append(this.f102713j);
        sb.append(", badge=");
        sb.append(textVo);
        sb.append(", fontSize=");
        y3.c.a(num5, ", leftStrikeThroughText=", str3, ", simpleTextInfo=", sb);
        sb.append(textVo2);
        sb.append(", bgGradientColor=");
        sb.append(gradientColorVo);
        sb.append(", tips_link=");
        return C8770a.a(sb, this.f102719p, ")");
    }
}
