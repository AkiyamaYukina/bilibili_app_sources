package com.bilibili.ship.theseus.ogv.playviewextra;

import I.E;
import J2.g;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.paging.M;
import androidx.room.B;
import cf.p;
import com.bilibili.bson.adapter.FirstFromListAdapter;
import com.bilibili.bson.adapter.a;
import com.bilibili.bson.common.Bson;
import com.bilibili.ship.theseus.united.page.restrictionlayer.ReportVo;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/playviewextra/PayTip.class */
@StabilityInferred(parameters = 0)
@Bson
public final class PayTip {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f94355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("url")
    @NotNull
    private final String f94356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("url_open_type")
    private final int f94357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("icon")
    @NotNull
    private final String f94358d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("type")
    @Nullable
    private final PrimaryNavType f94359e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("show_type")
    @NotNull
    private final ShowType f94360f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("img")
    @NotNull
    private final String f94361g;

    @SerializedName("bg_day_color")
    @Nullable
    private final Integer h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SerializedName("bg_night_color")
    @Nullable
    private final Integer f94362i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SerializedName("bg_line_color")
    @Nullable
    private final Integer f94363j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @SerializedName("bg_night_line_color")
    @Nullable
    private final Integer f94364k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @SerializedName("text_color")
    @Nullable
    private final Integer f94365l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @SerializedName("text_night_color")
    @Nullable
    private final Integer f94366m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @JsonAdapter(FirstFromListAdapter.class)
    @Nullable
    public final BadgeButtonVo f94367n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final ReportVo f94368o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @SerializedName("order_report_params")
    @NotNull
    private final Map<String, String> f94369p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @SerializedName("giant_screen_img")
    @NotNull
    private final String f94370q;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/playviewextra/PayTip$ShowType.class */
    public static final class ShowType implements a<Integer> {
        private static final EnumEntries $ENTRIES;
        private static final ShowType[] $VALUES;
        private final int value;
        public static final ShowType PAY = new ShowType("PAY", 0, -1);
        public static final ShowType SINGLE_TEXT = new ShowType("SINGLE_TEXT", 1, 1);
        public static final ShowType NORMAL = new ShowType("NORMAL", 2, 2);
        public static final ShowType SINGLE_IMAGE = new ShowType("SINGLE_IMAGE", 3, 3);
        public static final ShowType LEFT_TEXT_RIGHT_BUTTON = new ShowType("LEFT_TEXT_RIGHT_BUTTON", 4, 4);

        private static final /* synthetic */ ShowType[] $values() {
            return new ShowType[]{PAY, SINGLE_TEXT, NORMAL, SINGLE_IMAGE, LEFT_TEXT_RIGHT_BUTTON};
        }

        static {
            ShowType[] showTypeArr$values = $values();
            $VALUES = showTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(showTypeArr$values);
        }

        private ShowType(String str, int i7, int i8) {
            this.value = i8;
        }

        @NotNull
        public static EnumEntries<ShowType> getEntries() {
            return $ENTRIES;
        }

        public static ShowType valueOf(String str) {
            return (ShowType) Enum.valueOf(ShowType.class, str);
        }

        public static ShowType[] values() {
            return (ShowType[]) $VALUES.clone();
        }

        @NotNull
        /* JADX INFO: renamed from: getValue, reason: merged with bridge method [inline-methods] */
        public Integer m9124getValue() {
            return Integer.valueOf(this.value);
        }
    }

    public PayTip() {
        throw null;
    }

    public PayTip(String str, String str2, int i7, String str3, PrimaryNavType primaryNavType, ShowType showType, String str4, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, BadgeButtonVo badgeButtonVo, ReportVo reportVo, Map map, String str5, int i8) {
        showType = (i8 & 32) != 0 ? ShowType.NORMAL : showType;
        num2 = (i8 & 256) != 0 ? num : num2;
        num4 = (i8 & 1024) != 0 ? num3 : num4;
        num6 = (i8 & 4096) != 0 ? num5 : num6;
        this.f94355a = str;
        this.f94356b = str2;
        this.f94357c = i7;
        this.f94358d = str3;
        this.f94359e = primaryNavType;
        this.f94360f = showType;
        this.f94361g = str4;
        this.h = num;
        this.f94362i = num2;
        this.f94363j = num3;
        this.f94364k = num4;
        this.f94365l = num5;
        this.f94366m = num6;
        this.f94367n = badgeButtonVo;
        this.f94368o = reportVo;
        this.f94369p = map;
        this.f94370q = str5;
    }

    @NotNull
    public final String a() {
        return this.f94361g;
    }

    @Nullable
    public final Integer b() {
        return this.h;
    }

    @Nullable
    public final Integer c() {
        return this.f94362i;
    }

    @Nullable
    public final Integer d() {
        return this.f94363j;
    }

    @Nullable
    public final Integer e() {
        return this.f94364k;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayTip)) {
            return false;
        }
        PayTip payTip = (PayTip) obj;
        return Intrinsics.areEqual(this.f94355a, payTip.f94355a) && Intrinsics.areEqual(this.f94356b, payTip.f94356b) && this.f94357c == payTip.f94357c && Intrinsics.areEqual(this.f94358d, payTip.f94358d) && this.f94359e == payTip.f94359e && this.f94360f == payTip.f94360f && Intrinsics.areEqual(this.f94361g, payTip.f94361g) && Intrinsics.areEqual(this.h, payTip.h) && Intrinsics.areEqual(this.f94362i, payTip.f94362i) && Intrinsics.areEqual(this.f94363j, payTip.f94363j) && Intrinsics.areEqual(this.f94364k, payTip.f94364k) && Intrinsics.areEqual(this.f94365l, payTip.f94365l) && Intrinsics.areEqual(this.f94366m, payTip.f94366m) && Intrinsics.areEqual(this.f94367n, payTip.f94367n) && Intrinsics.areEqual(this.f94368o, payTip.f94368o) && Intrinsics.areEqual(this.f94369p, payTip.f94369p) && Intrinsics.areEqual(this.f94370q, payTip.f94370q);
    }

    @NotNull
    public final String f() {
        return this.f94370q;
    }

    @NotNull
    public final String g() {
        return this.f94358d;
    }

    @NotNull
    public final Map<String, String> h() {
        return this.f94369p;
    }

    public final int hashCode() {
        int iA = E.a(I.a(this.f94357c, E.a(this.f94355a.hashCode() * 31, 31, this.f94356b), 31), 31, this.f94358d);
        PrimaryNavType primaryNavType = this.f94359e;
        int iHashCode = 0;
        int iA2 = E.a((this.f94360f.hashCode() + ((iA + (primaryNavType == null ? 0 : primaryNavType.hashCode())) * 31)) * 31, 31, this.f94361g);
        Integer num = this.h;
        int iHashCode2 = num == null ? 0 : num.hashCode();
        Integer num2 = this.f94362i;
        int iHashCode3 = num2 == null ? 0 : num2.hashCode();
        Integer num3 = this.f94363j;
        int iHashCode4 = num3 == null ? 0 : num3.hashCode();
        Integer num4 = this.f94364k;
        int iHashCode5 = num4 == null ? 0 : num4.hashCode();
        Integer num5 = this.f94365l;
        int iHashCode6 = num5 == null ? 0 : num5.hashCode();
        Integer num6 = this.f94366m;
        int iHashCode7 = num6 == null ? 0 : num6.hashCode();
        BadgeButtonVo badgeButtonVo = this.f94367n;
        int iHashCode8 = badgeButtonVo == null ? 0 : badgeButtonVo.hashCode();
        ReportVo reportVo = this.f94368o;
        if (reportVo != null) {
            iHashCode = reportVo.hashCode();
        }
        return this.f94370q.hashCode() + g.a((((((((((((((((iA2 + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode) * 31, this.f94369p, 31);
    }

    @NotNull
    public final ShowType i() {
        return this.f94360f;
    }

    @Nullable
    public final Integer j() {
        return this.f94365l;
    }

    @Nullable
    public final Integer k() {
        return this.f94366m;
    }

    @Nullable
    public final PrimaryNavType l() {
        return this.f94359e;
    }

    @NotNull
    public final String m() {
        return this.f94356b;
    }

    public final int n() {
        return this.f94357c;
    }

    @NotNull
    public final String toString() {
        String str = this.f94356b;
        int i7 = this.f94357c;
        String str2 = this.f94358d;
        PrimaryNavType primaryNavType = this.f94359e;
        ShowType showType = this.f94360f;
        String str3 = this.f94361g;
        Integer num = this.h;
        Integer num2 = this.f94362i;
        Integer num3 = this.f94363j;
        Integer num4 = this.f94364k;
        Integer num5 = this.f94365l;
        Integer num6 = this.f94366m;
        Map<String, String> map = this.f94369p;
        String str4 = this.f94370q;
        StringBuilder sb = new StringBuilder("PayTip(title=");
        B.a(this.f94355a, ", url=", str, ", urlOpenType=", sb);
        M.a(i7, ", icon=", str2, ", type=", sb);
        sb.append(primaryNavType);
        sb.append(", showType=");
        sb.append(showType);
        sb.append(", backImage=");
        p.a(num, str3, ", bgDayColor=", ", bgNightColor=", sb);
        Ul.a.a(sb, num2, ", bgStrokeColor=", num3, ", bgStrokeNightColor=");
        Ul.a.a(sb, num4, ", textColor=", num5, ", textColorNight=");
        sb.append(num6);
        sb.append(", button=");
        sb.append(this.f94367n);
        sb.append(", report=");
        sb.append(this.f94368o);
        sb.append(", orderReportParams=");
        sb.append(map);
        sb.append(", giantScreenImage=");
        return C8770a.a(sb, str4, ")");
    }
}
