package com.bilibili.ogvcommon.play.vo;

import I.E;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import androidx.room.B;
import com.bilibili.bson.common.Bson;
import com.bilibili.ogvcommon.play.vo.base.GradientColorVo;
import com.bilibili.ogvcommon.play.vo.base.ReportVo;
import com.bilibili.ogvcommon.play.vo.base.TextVo;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/vo/BangumiVipBarVo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class BangumiVipBarVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("title")
    @Nullable
    private final TextVo f73292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("sub_title")
    @Nullable
    private final TextVo f73293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("sub_title_icon")
    @Nullable
    private final String f73294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("bg_img")
    @Nullable
    private final String f73295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("bg_gradient_color")
    @Nullable
    private final GradientColorVo f73296e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("buttons")
    @NotNull
    private final List<TextVo> f73297f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final ReportVo f73298g;

    @SerializedName("full_screen_ip_icon")
    @NotNull
    private final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SerializedName("full_screen_bg_gradient_color")
    @Nullable
    private final GradientColorVo f73299i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public final transient TextVo f73300j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public final transient TextVo f73301k;

    public BangumiVipBarVo(@Nullable TextVo textVo, @Nullable TextVo textVo2, @Nullable String str, @Nullable String str2, @Nullable GradientColorVo gradientColorVo, @NotNull List<TextVo> list, @Nullable ReportVo reportVo, @NotNull String str3, @Nullable GradientColorVo gradientColorVo2) {
        this.f73292a = textVo;
        this.f73293b = textVo2;
        this.f73294c = str;
        this.f73295d = str2;
        this.f73296e = gradientColorVo;
        this.f73297f = list;
        this.f73298g = reportVo;
        this.h = str3;
        this.f73299i = gradientColorVo2;
        this.f73300j = (TextVo) CollectionsKt.getOrNull(list, 0);
        this.f73301k = (TextVo) CollectionsKt.getOrNull(list, 1);
    }

    @Nullable
    public final GradientColorVo a() {
        return this.f73296e;
    }

    @Nullable
    public final String b() {
        return this.f73295d;
    }

    @NotNull
    public final List<TextVo> c() {
        return this.f73297f;
    }

    @Nullable
    public final GradientColorVo d() {
        return this.f73299i;
    }

    @NotNull
    public final String e() {
        return this.h;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BangumiVipBarVo)) {
            return false;
        }
        BangumiVipBarVo bangumiVipBarVo = (BangumiVipBarVo) obj;
        return Intrinsics.areEqual(this.f73292a, bangumiVipBarVo.f73292a) && Intrinsics.areEqual(this.f73293b, bangumiVipBarVo.f73293b) && Intrinsics.areEqual(this.f73294c, bangumiVipBarVo.f73294c) && Intrinsics.areEqual(this.f73295d, bangumiVipBarVo.f73295d) && Intrinsics.areEqual(this.f73296e, bangumiVipBarVo.f73296e) && Intrinsics.areEqual(this.f73297f, bangumiVipBarVo.f73297f) && Intrinsics.areEqual(this.f73298g, bangumiVipBarVo.f73298g) && Intrinsics.areEqual(this.h, bangumiVipBarVo.h) && Intrinsics.areEqual(this.f73299i, bangumiVipBarVo.f73299i);
    }

    @Nullable
    public final TextVo f() {
        return this.f73293b;
    }

    @Nullable
    public final String g() {
        return this.f73294c;
    }

    @Nullable
    public final TextVo h() {
        return this.f73292a;
    }

    public final int hashCode() {
        TextVo textVo = this.f73292a;
        int iHashCode = textVo == null ? 0 : textVo.hashCode();
        TextVo textVo2 = this.f73293b;
        int iHashCode2 = textVo2 == null ? 0 : textVo2.hashCode();
        String str = this.f73294c;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.f73295d;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        GradientColorVo gradientColorVo = this.f73296e;
        int iA = e0.a(((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (gradientColorVo == null ? 0 : gradientColorVo.hashCode())) * 31, 31, this.f73297f);
        ReportVo reportVo = this.f73298g;
        int iA2 = E.a((iA + (reportVo == null ? 0 : reportVo.hashCode())) * 31, 31, this.h);
        GradientColorVo gradientColorVo2 = this.f73299i;
        return iA2 + (gradientColorVo2 == null ? 0 : gradientColorVo2.hashCode());
    }

    public final boolean i() {
        TextVo textVo = this.f73292a;
        String strL = textVo != null ? textVo.l() : null;
        boolean z6 = (strL == null || strL.length() == 0 || this.f73297f.isEmpty()) ? false : true;
        for (TextVo textVo2 : this.f73297f) {
            z6 = textVo2.l().length() > 0 && textVo2.a() != null;
        }
        return z6;
    }

    @NotNull
    public final String toString() {
        TextVo textVo = this.f73292a;
        TextVo textVo2 = this.f73293b;
        String str = this.f73294c;
        String str2 = this.f73295d;
        GradientColorVo gradientColorVo = this.f73296e;
        List<TextVo> list = this.f73297f;
        String str3 = this.h;
        GradientColorVo gradientColorVo2 = this.f73299i;
        StringBuilder sb = new StringBuilder("BangumiVipBarVo(title=");
        sb.append(textVo);
        sb.append(", subtitle=");
        sb.append(textVo2);
        sb.append(", subtitleIcon=");
        B.a(str, ", bgImg=", str2, ", bgGradientColor=", sb);
        sb.append(gradientColorVo);
        sb.append(", buttons=");
        sb.append(list);
        sb.append(", report=");
        sb.append(this.f73298g);
        sb.append(", fullScreenIpIcon=");
        sb.append(str3);
        sb.append(", fullScreenBgGradientColor=");
        sb.append(gradientColorVo2);
        sb.append(")");
        return sb.toString();
    }
}
