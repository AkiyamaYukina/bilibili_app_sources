package com.bilibili.ship.theseus.united.page.playviewextra;

import I.E;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import androidx.room.B;
import com.bilibili.bplus.followingpublish.fragments.publish.c;
import com.bilibili.bson.adapter.a;
import com.bilibili.bson.common.Bson;
import com.bilibili.ship.theseus.united.page.restrictionlayer.GradientColorVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.ReportVo;
import com.bilibili.ship.theseus.united.page.restrictionlayer.TextVo;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playviewextra/PromptBarVo.class */
@StabilityInferred(parameters = 0)
@Bson
public final class PromptBarVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final TextVo f102394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("sub_title")
    @Nullable
    private final TextVo f102395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("sub_title_icon")
    @Nullable
    private final String f102396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("bg_image")
    @Nullable
    private final String f102397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("bg_gradient_color")
    @Nullable
    private final GradientColorVo f102398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("button")
    @NotNull
    private final List<TextVo> f102399f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final ReportVo f102400g;

    @SerializedName("full_screen_ip_icon")
    @NotNull
    private final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SerializedName("full_screen_bg_gradient_color")
    @Nullable
    private final GradientColorVo f102401i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SerializedName("prompt_bar_type")
    @NotNull
    private final Type f102402j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @SerializedName("prompt_bar_style")
    @NotNull
    private final Style f102403k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @SerializedName("benefit_infos")
    @NotNull
    private final List<BenefitInfo> f102404l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @SerializedName("end_time")
    private final long f102405m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @SerializedName("show_on_paywall")
    private final boolean f102406n;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playviewextra/PromptBarVo$BenefitInfo.class */
    @StabilityInferred(parameters = 1)
    @Bson
    public static final class BenefitInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f102407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f102408b;

        public BenefitInfo(@NotNull String str, @NotNull String str2) {
            this.f102407a = str;
            this.f102408b = str2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BenefitInfo)) {
                return false;
            }
            BenefitInfo benefitInfo = (BenefitInfo) obj;
            return Intrinsics.areEqual(this.f102407a, benefitInfo.f102407a) && Intrinsics.areEqual(this.f102408b, benefitInfo.f102408b);
        }

        public final int hashCode() {
            return this.f102408b.hashCode() + (this.f102407a.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("BenefitInfo(title=");
            sb.append(this.f102407a);
            sb.append(", icon=");
            return C8770a.a(sb, this.f102408b, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playviewextra/PromptBarVo$Style.class */
    public static final class Style implements a<Integer> {
        private static final EnumEntries $ENTRIES;
        private static final Style[] $VALUES;
        private final int value;
        public static final Style Text = new Style("Text", 0, 1);
        public static final Style Benefit = new Style("Benefit", 1, 2);
        public static final Style Gifts = new Style("Gifts", 2, 3);
        public static final Style Countdown = new Style("Countdown", 3, 4);

        private static final /* synthetic */ Style[] $values() {
            return new Style[]{Text, Benefit, Gifts, Countdown};
        }

        static {
            Style[] styleArr$values = $values();
            $VALUES = styleArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(styleArr$values);
        }

        private Style(String str, int i7, int i8) {
            this.value = i8;
        }

        @NotNull
        public static EnumEntries<Style> getEntries() {
            return $ENTRIES;
        }

        public static Style valueOf(String str) {
            return (Style) Enum.valueOf(Style.class, str);
        }

        public static Style[] values() {
            return (Style[]) $VALUES.clone();
        }

        @NotNull
        /* JADX INFO: renamed from: getValue, reason: merged with bridge method [inline-methods] */
        public Integer m9563getValue() {
            return Integer.valueOf(this.value);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/united/page/playviewextra/PromptBarVo$Type.class */
    public static final class Type implements a<Integer> {
        private static final EnumEntries $ENTRIES;
        private static final Type[] $VALUES;
        public static final Type Activation = new Type("Activation", 0, 1);
        public static final Type Pay = new Type("Pay", 1, 2);
        private final int value;

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{Activation, Pay};
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(typeArr$values);
        }

        private Type(String str, int i7, int i8) {
            this.value = i8;
        }

        @NotNull
        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        @NotNull
        /* JADX INFO: renamed from: getValue, reason: merged with bridge method [inline-methods] */
        public Integer m9565getValue() {
            return Integer.valueOf(this.value);
        }
    }

    public PromptBarVo() {
        throw null;
    }

    public PromptBarVo(TextVo textVo, TextVo textVo2, String str, String str2, GradientColorVo gradientColorVo, List list, ReportVo reportVo, String str3, GradientColorVo gradientColorVo2, Type type, Style style, List list2, long j7, boolean z6, int i7) {
        textVo = (i7 & 1) != 0 ? null : textVo;
        textVo2 = (i7 & 2) != 0 ? null : textVo2;
        str = (i7 & 4) != 0 ? null : str;
        str2 = (i7 & 8) != 0 ? null : str2;
        list = (i7 & 32) != 0 ? CollectionsKt.emptyList() : list;
        reportVo = (i7 & 64) != 0 ? null : reportVo;
        type = (i7 & 512) != 0 ? Type.Pay : type;
        style = (i7 & 1024) != 0 ? Style.Text : style;
        this.f102394a = textVo;
        this.f102395b = textVo2;
        this.f102396c = str;
        this.f102397d = str2;
        this.f102398e = gradientColorVo;
        this.f102399f = list;
        this.f102400g = reportVo;
        this.h = str3;
        this.f102401i = gradientColorVo2;
        this.f102402j = type;
        this.f102403k = style;
        this.f102404l = list2;
        this.f102405m = j7;
        this.f102406n = z6;
    }

    @NotNull
    public final List<BenefitInfo> a() {
        return this.f102404l;
    }

    @Nullable
    public final GradientColorVo b() {
        return this.f102398e;
    }

    @Nullable
    public final String c() {
        return this.f102397d;
    }

    @NotNull
    public final List<TextVo> d() {
        return this.f102399f;
    }

    public final long e() {
        return this.f102405m;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromptBarVo)) {
            return false;
        }
        PromptBarVo promptBarVo = (PromptBarVo) obj;
        return Intrinsics.areEqual(this.f102394a, promptBarVo.f102394a) && Intrinsics.areEqual(this.f102395b, promptBarVo.f102395b) && Intrinsics.areEqual(this.f102396c, promptBarVo.f102396c) && Intrinsics.areEqual(this.f102397d, promptBarVo.f102397d) && Intrinsics.areEqual(this.f102398e, promptBarVo.f102398e) && Intrinsics.areEqual(this.f102399f, promptBarVo.f102399f) && Intrinsics.areEqual(this.f102400g, promptBarVo.f102400g) && Intrinsics.areEqual(this.h, promptBarVo.h) && Intrinsics.areEqual(this.f102401i, promptBarVo.f102401i) && this.f102402j == promptBarVo.f102402j && this.f102403k == promptBarVo.f102403k && Intrinsics.areEqual(this.f102404l, promptBarVo.f102404l) && this.f102405m == promptBarVo.f102405m && this.f102406n == promptBarVo.f102406n;
    }

    @Nullable
    public final GradientColorVo f() {
        return this.f102401i;
    }

    @NotNull
    public final String g() {
        return this.h;
    }

    public final boolean h() {
        return this.f102406n;
    }

    public final int hashCode() {
        TextVo textVo = this.f102394a;
        int iHashCode = textVo == null ? 0 : textVo.hashCode();
        TextVo textVo2 = this.f102395b;
        int iHashCode2 = textVo2 == null ? 0 : textVo2.hashCode();
        String str = this.f102396c;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.f102397d;
        int iHashCode4 = str2 == null ? 0 : str2.hashCode();
        GradientColorVo gradientColorVo = this.f102398e;
        int iA = e0.a(((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (gradientColorVo == null ? 0 : gradientColorVo.hashCode())) * 31, 31, this.f102399f);
        ReportVo reportVo = this.f102400g;
        int iA2 = E.a((iA + (reportVo == null ? 0 : reportVo.hashCode())) * 31, 31, this.h);
        GradientColorVo gradientColorVo2 = this.f102401i;
        return Boolean.hashCode(this.f102406n) + C3554n0.a(e0.a((this.f102403k.hashCode() + ((this.f102402j.hashCode() + ((iA2 + (gradientColorVo2 == null ? 0 : gradientColorVo2.hashCode())) * 31)) * 31)) * 31, 31, this.f102404l), 31, this.f102405m);
    }

    @NotNull
    public final Style i() {
        return this.f102403k;
    }

    @Nullable
    public final TextVo j() {
        return this.f102395b;
    }

    @Nullable
    public final String k() {
        return this.f102396c;
    }

    @NotNull
    public final Type l() {
        return this.f102402j;
    }

    @NotNull
    public final String toString() {
        TextVo textVo = this.f102395b;
        String str = this.f102396c;
        String str2 = this.f102397d;
        GradientColorVo gradientColorVo = this.f102398e;
        List<TextVo> list = this.f102399f;
        String str3 = this.h;
        GradientColorVo gradientColorVo2 = this.f102401i;
        Type type = this.f102402j;
        Style style = this.f102403k;
        List<BenefitInfo> list2 = this.f102404l;
        long j7 = this.f102405m;
        boolean z6 = this.f102406n;
        StringBuilder sb = new StringBuilder("PromptBarVo(title=");
        sb.append(this.f102394a);
        sb.append(", subtitle=");
        sb.append(textVo);
        sb.append(", subtitleIcon=");
        B.a(str, ", bgImg=", str2, ", bgGradientColor=", sb);
        sb.append(gradientColorVo);
        sb.append(", buttons=");
        sb.append(list);
        sb.append(", report=");
        sb.append(this.f102400g);
        sb.append(", fullScreenIpIcon=");
        sb.append(str3);
        sb.append(", fullScreenBgGradientColor=");
        sb.append(gradientColorVo2);
        sb.append(", type=");
        sb.append(type);
        sb.append(", style=");
        sb.append(style);
        sb.append(", benefitInfoList=");
        sb.append(list2);
        sb.append(", expireTime=");
        c.a(j7, ", showsWhenPayWallPresent=", sb, z6);
        sb.append(")");
        return sb.toString();
    }
}
