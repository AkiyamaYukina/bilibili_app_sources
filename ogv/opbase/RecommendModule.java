package com.bilibili.ogv.opbase;

import H0.e;
import I.E;
import M6.f;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.e0;
import androidx.core.view.GravityCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.room.B;
import com.bilibili.bson.adapter.StringIntColorTypeAdapter;
import com.bilibili.bson.adapter.a;
import com.bilibili.bson.common.Bson;
import com.bilibili.live.streaming.source.TextSource;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import e4.c;
import h6.C7416u;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/RecommendModule.class */
@StabilityInferred(parameters = 0)
@Bson
public final class RecommendModule {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @Nullable
    public final String f69891A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @Nullable
    public final String f69892B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @Nullable
    public final String f69893C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @Nullable
    public final Integer f69894D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @Nullable
    public final String f69895E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @NotNull
    public final List<Intervene> f69896F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @NotNull
    public final Exp f69897G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public transient boolean f69898H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public transient boolean f69899I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f69900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("sub_title")
    @Nullable
    private final String f69901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f69902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f69903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("wid")
    @NotNull
    private final List<Long> f69904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final String f69905f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public final String f69906g;

    @SerializedName(TextSource.CFG_SIZE)
    private int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final ModuleAttr f69907i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public List<ModuleHeader> f69908j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final OGVHeaderType f69909k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @SerializedName("items")
    @NotNull
    private List<CommonCard> f69910l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @Nullable
    public final FollowInModule f69911m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    public final Skin f69912n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    public final String f69913o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @SerializedName("jump_module_id")
    private final int f69914p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    public final String f69915q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @Nullable
    public final String f69916r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public final String f69917s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public final Map<String, String> f69918t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f69919u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @SerializedName("color_control")
    @NotNull
    private final OGVRankThemeType f69920v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @SerializedName("topic_info")
    @Nullable
    private final Topic f69921w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f69922x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public final OGVCinemaSubscribeType f69923y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @Nullable
    public final OGVMultiCardType f69924z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/RecommendModule$OGVCinemaSubscribeType.class */
    public static final class OGVCinemaSubscribeType implements a<Integer> {
        private static final EnumEntries $ENTRIES;
        private static final OGVCinemaSubscribeType[] $VALUES;
        public static final OGVCinemaSubscribeType HIDE = new OGVCinemaSubscribeType("HIDE", 0, 0);
        public static final OGVCinemaSubscribeType NOT_SUBSCRIBED = new OGVCinemaSubscribeType("NOT_SUBSCRIBED", 1, 1);
        public static final OGVCinemaSubscribeType SUBSCRIBED = new OGVCinemaSubscribeType("SUBSCRIBED", 2, 2);
        private final int value;

        private static final /* synthetic */ OGVCinemaSubscribeType[] $values() {
            return new OGVCinemaSubscribeType[]{HIDE, NOT_SUBSCRIBED, SUBSCRIBED};
        }

        static {
            OGVCinemaSubscribeType[] oGVCinemaSubscribeTypeArr$values = $values();
            $VALUES = oGVCinemaSubscribeTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(oGVCinemaSubscribeTypeArr$values);
        }

        private OGVCinemaSubscribeType(String str, int i7, int i8) {
            this.value = i8;
        }

        @NotNull
        public static EnumEntries<OGVCinemaSubscribeType> getEntries() {
            return $ENTRIES;
        }

        public static OGVCinemaSubscribeType valueOf(String str) {
            return (OGVCinemaSubscribeType) Enum.valueOf(OGVCinemaSubscribeType.class, str);
        }

        public static OGVCinemaSubscribeType[] values() {
            return (OGVCinemaSubscribeType[]) $VALUES.clone();
        }

        @NotNull
        /* JADX INFO: renamed from: getValue, reason: merged with bridge method [inline-methods] */
        public Integer m7463getValue() {
            return Integer.valueOf(this.value);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/RecommendModule$OGVHeaderType.class */
    public static final class OGVHeaderType implements a<Integer> {
        private static final EnumEntries $ENTRIES;
        private static final OGVHeaderType[] $VALUES;
        private final int value;
        public static final OGVHeaderType STATIC_MORE = new OGVHeaderType("STATIC_MORE", 0, 0);
        public static final OGVHeaderType ANIMATION_MORE = new OGVHeaderType("ANIMATION_MORE", 1, 1);

        private static final /* synthetic */ OGVHeaderType[] $values() {
            return new OGVHeaderType[]{STATIC_MORE, ANIMATION_MORE};
        }

        static {
            OGVHeaderType[] oGVHeaderTypeArr$values = $values();
            $VALUES = oGVHeaderTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(oGVHeaderTypeArr$values);
        }

        private OGVHeaderType(String str, int i7, int i8) {
            this.value = i8;
        }

        @NotNull
        public static EnumEntries<OGVHeaderType> getEntries() {
            return $ENTRIES;
        }

        public static OGVHeaderType valueOf(String str) {
            return (OGVHeaderType) Enum.valueOf(OGVHeaderType.class, str);
        }

        public static OGVHeaderType[] values() {
            return (OGVHeaderType[]) $VALUES.clone();
        }

        @NotNull
        /* JADX INFO: renamed from: getValue, reason: merged with bridge method [inline-methods] */
        public Integer m7465getValue() {
            return Integer.valueOf(this.value);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/RecommendModule$OGVMultiCardType.class */
    public static final class OGVMultiCardType implements a<String> {
        private static final EnumEntries $ENTRIES;
        private static final OGVMultiCardType[] $VALUES;
        public static final OGVMultiCardType RANK = new OGVMultiCardType("RANK", 0, "RANK");
        public static final OGVMultiCardType THEATRE = new OGVMultiCardType("THEATRE", 1, "THEATRE");
        public static final OGVMultiCardType UGC_CARD = new OGVMultiCardType("UGC_CARD", 2, "UGC_COLLECTION");

        @NotNull
        private final String value;

        private static final /* synthetic */ OGVMultiCardType[] $values() {
            return new OGVMultiCardType[]{RANK, THEATRE, UGC_CARD};
        }

        static {
            OGVMultiCardType[] oGVMultiCardTypeArr$values = $values();
            $VALUES = oGVMultiCardTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(oGVMultiCardTypeArr$values);
        }

        private OGVMultiCardType(String str, int i7, String str2) {
            this.value = str2;
        }

        @NotNull
        public static EnumEntries<OGVMultiCardType> getEntries() {
            return $ENTRIES;
        }

        public static OGVMultiCardType valueOf(String str) {
            return (OGVMultiCardType) Enum.valueOf(OGVMultiCardType.class, str);
        }

        public static OGVMultiCardType[] values() {
            return (OGVMultiCardType[]) $VALUES.clone();
        }

        @NotNull
        public String getValue() {
            return this.value;
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/RecommendModule$Skin.class */
    @StabilityInferred(parameters = 1)
    @Bson
    public static final class Skin {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f69925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f69926b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @JsonAdapter(StringIntColorTypeAdapter.class)
        @Nullable
        public final Integer f69927c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @JsonAdapter(StringIntColorTypeAdapter.class)
        @Nullable
        public final Integer f69928d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @JsonAdapter(StringIntColorTypeAdapter.class)
        @Nullable
        public final Integer f69929e;

        public Skin(int i7, @Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
            this.f69925a = i7;
            this.f69926b = str;
            this.f69927c = num;
            this.f69928d = num2;
            this.f69929e = num3;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Skin)) {
                return false;
            }
            Skin skin = (Skin) obj;
            return this.f69925a == skin.f69925a && Intrinsics.areEqual(this.f69926b, skin.f69926b) && Intrinsics.areEqual(this.f69927c, skin.f69927c) && Intrinsics.areEqual(this.f69928d, skin.f69928d) && Intrinsics.areEqual(this.f69929e, skin.f69929e);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f69925a);
            int iHashCode2 = 0;
            String str = this.f69926b;
            int iHashCode3 = str == null ? 0 : str.hashCode();
            Integer num = this.f69927c;
            int iHashCode4 = num == null ? 0 : num.hashCode();
            Integer num2 = this.f69928d;
            int iHashCode5 = num2 == null ? 0 : num2.hashCode();
            Integer num3 = this.f69929e;
            if (num3 != null) {
                iHashCode2 = num3.hashCode();
            }
            return (((((((iHashCode * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode2;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Skin(type=");
            sb.append(this.f69925a);
            sb.append(", bgImg=");
            sb.append(this.f69926b);
            sb.append(", textColor=");
            sb.append(this.f69927c);
            sb.append(", startGradientsColor=");
            sb.append(this.f69928d);
            sb.append(", endGradientsColor=");
            return c.a(sb, this.f69929e, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/RecommendModule$Topic.class */
    @StabilityInferred(parameters = 1)
    @Bson
    public static final class Topic {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f69930a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f69931b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f69932c;

        public Topic(long j7, @NotNull String str, @NotNull String str2) {
            this.f69930a = j7;
            this.f69931b = str;
            this.f69932c = str2;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Topic)) {
                return false;
            }
            Topic topic = (Topic) obj;
            return this.f69930a == topic.f69930a && Intrinsics.areEqual(this.f69931b, topic.f69931b) && Intrinsics.areEqual(this.f69932c, topic.f69932c);
        }

        public final int hashCode() {
            return this.f69932c.hashCode() + E.a(Long.hashCode(this.f69930a) * 31, 31, this.f69931b);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Topic(id=");
            sb.append(this.f69930a);
            sb.append(", desc=");
            sb.append(this.f69931b);
            sb.append(", url=");
            return C8770a.a(sb, this.f69932c, ")");
        }
    }

    public RecommendModule() {
        this(null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, null, null, null, null, 0, null, null, 0L, null, null, null, null, null, null, null, null, null, -1, 1);
    }

    public RecommendModule(String str, String str2, String str3, String str4, List list, String str5, String str6, int i7, ModuleAttr moduleAttr, List list2, OGVHeaderType oGVHeaderType, List list3, FollowInModule followInModule, Skin skin, String str7, int i8, String str8, String str9, String str10, Map map, int i9, OGVRankThemeType oGVRankThemeType, Topic topic, long j7, OGVCinemaSubscribeType oGVCinemaSubscribeType, OGVMultiCardType oGVMultiCardType, String str11, String str12, String str13, Integer num, String str14, List list4, Exp exp, int i10, int i11) {
        str = (i10 & 1) != 0 ? null : str;
        str2 = (i10 & 2) != 0 ? null : str2;
        str3 = (i10 & 4) != 0 ? null : str3;
        str4 = (i10 & 8) != 0 ? null : str4;
        list = (i10 & 16) != 0 ? CollectionsKt.emptyList() : list;
        str5 = (i10 & 32) != 0 ? null : str5;
        str6 = (i10 & 64) != 0 ? null : str6;
        i7 = (i10 & 128) != 0 ? 0 : i7;
        moduleAttr = (i10 & 256) != 0 ? new ModuleAttr(15, false, false, false, false) : moduleAttr;
        list2 = (i10 & 512) != 0 ? CollectionsKt.emptyList() : list2;
        oGVHeaderType = (i10 & 1024) != 0 ? OGVHeaderType.STATIC_MORE : oGVHeaderType;
        list3 = (i10 & 2048) != 0 ? CollectionsKt.emptyList() : list3;
        followInModule = (i10 & 4096) != 0 ? null : followInModule;
        skin = (i10 & 8192) != 0 ? null : skin;
        str7 = (i10 & 16384) != 0 ? null : str7;
        i8 = (i10 & 32768) != 0 ? 0 : i8;
        str8 = (i10 & 65536) != 0 ? null : str8;
        str9 = (i10 & 131072) != 0 ? null : str9;
        str10 = (i10 & 262144) != 0 ? null : str10;
        map = (i10 & AccessibilityNodeInfoCompat.ACTION_COLLAPSE) != 0 ? null : map;
        i9 = (i10 & AccessibilityNodeInfoCompat.ACTION_DISMISS) != 0 ? 0 : i9;
        oGVRankThemeType = (i10 & AccessibilityNodeInfoCompat.ACTION_SET_TEXT) != 0 ? OGVRankThemeType.UNKNOWN : oGVRankThemeType;
        topic = (i10 & 4194304) != 0 ? null : topic;
        j7 = (i10 & GravityCompat.RELATIVE_LAYOUT_DIRECTION) != 0 ? 0L : j7;
        oGVCinemaSubscribeType = (i10 & 16777216) != 0 ? OGVCinemaSubscribeType.HIDE : oGVCinemaSubscribeType;
        oGVMultiCardType = (i10 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_HAND_SKELETON_KEYPOINTS_3D) != 0 ? null : oGVMultiCardType;
        str11 = (i10 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_MULTI_SEGMENT) != 0 ? null : str11;
        str12 = (i10 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_GAZE_DETECT) != 0 ? null : str12;
        str13 = (i10 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_DYNAMIC_GESTURE) != 0 ? null : str13;
        num = (i10 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_AVATAR_HELPER) != 0 ? null : num;
        str14 = (i10 & BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE) != 0 ? null : str14;
        list4 = (i10 & Integer.MIN_VALUE) != 0 ? CollectionsKt.emptyList() : list4;
        exp = (i11 & 1) != 0 ? new Exp(false, 1) : exp;
        this.f69900a = str;
        this.f69901b = str2;
        this.f69902c = str3;
        this.f69903d = str4;
        this.f69904e = list;
        this.f69905f = str5;
        this.f69906g = str6;
        this.h = i7;
        this.f69907i = moduleAttr;
        this.f69908j = list2;
        this.f69909k = oGVHeaderType;
        this.f69910l = list3;
        this.f69911m = followInModule;
        this.f69912n = skin;
        this.f69913o = str7;
        this.f69914p = i8;
        this.f69915q = str8;
        this.f69916r = str9;
        this.f69917s = str10;
        this.f69918t = map;
        this.f69919u = i9;
        this.f69920v = oGVRankThemeType;
        this.f69921w = topic;
        this.f69922x = j7;
        this.f69923y = oGVCinemaSubscribeType;
        this.f69924z = oGVMultiCardType;
        this.f69891A = str11;
        this.f69892B = str12;
        this.f69893C = str13;
        this.f69894D = num;
        this.f69895E = str14;
        this.f69896F = list4;
        this.f69897G = exp;
    }

    public final int a() {
        return this.h;
    }

    @NotNull
    public final List<CommonCard> b() {
        return this.f69910l;
    }

    public final int c() {
        return this.f69914p;
    }

    @Nullable
    public final String d() {
        return this.f69901b;
    }

    @NotNull
    public final OGVRankThemeType e() {
        return this.f69920v;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecommendModule)) {
            return false;
        }
        RecommendModule recommendModule = (RecommendModule) obj;
        return Intrinsics.areEqual(this.f69900a, recommendModule.f69900a) && Intrinsics.areEqual(this.f69901b, recommendModule.f69901b) && Intrinsics.areEqual(this.f69902c, recommendModule.f69902c) && Intrinsics.areEqual(this.f69903d, recommendModule.f69903d) && Intrinsics.areEqual(this.f69904e, recommendModule.f69904e) && Intrinsics.areEqual(this.f69905f, recommendModule.f69905f) && Intrinsics.areEqual(this.f69906g, recommendModule.f69906g) && this.h == recommendModule.h && Intrinsics.areEqual(this.f69907i, recommendModule.f69907i) && Intrinsics.areEqual(this.f69908j, recommendModule.f69908j) && this.f69909k == recommendModule.f69909k && Intrinsics.areEqual(this.f69910l, recommendModule.f69910l) && Intrinsics.areEqual(this.f69911m, recommendModule.f69911m) && Intrinsics.areEqual(this.f69912n, recommendModule.f69912n) && Intrinsics.areEqual(this.f69913o, recommendModule.f69913o) && this.f69914p == recommendModule.f69914p && Intrinsics.areEqual(this.f69915q, recommendModule.f69915q) && Intrinsics.areEqual(this.f69916r, recommendModule.f69916r) && Intrinsics.areEqual(this.f69917s, recommendModule.f69917s) && Intrinsics.areEqual(this.f69918t, recommendModule.f69918t) && this.f69919u == recommendModule.f69919u && this.f69920v == recommendModule.f69920v && Intrinsics.areEqual(this.f69921w, recommendModule.f69921w) && this.f69922x == recommendModule.f69922x && this.f69923y == recommendModule.f69923y && this.f69924z == recommendModule.f69924z && Intrinsics.areEqual(this.f69891A, recommendModule.f69891A) && Intrinsics.areEqual(this.f69892B, recommendModule.f69892B) && Intrinsics.areEqual(this.f69893C, recommendModule.f69893C) && Intrinsics.areEqual(this.f69894D, recommendModule.f69894D) && Intrinsics.areEqual(this.f69895E, recommendModule.f69895E) && Intrinsics.areEqual(this.f69896F, recommendModule.f69896F) && Intrinsics.areEqual(this.f69897G, recommendModule.f69897G);
    }

    @Nullable
    public final Topic f() {
        return this.f69921w;
    }

    @NotNull
    public final List<Long> g() {
        return this.f69904e;
    }

    public final void h(int i7) {
        this.h = i7;
    }

    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f69900a;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.f69901b;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.f69902c;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.f69903d;
        int iA = e0.a(((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f69904e);
        String str5 = this.f69905f;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.f69906g;
        int iA2 = e0.a((this.f69909k.hashCode() + e0.a((this.f69907i.hashCode() + I.a(this.h, (((iA + iHashCode5) * 31) + (str6 == null ? 0 : str6.hashCode())) * 31, 31)) * 31, 31, this.f69908j)) * 31, 31, this.f69910l);
        FollowInModule followInModule = this.f69911m;
        int iHashCode6 = followInModule == null ? 0 : followInModule.hashCode();
        Skin skin = this.f69912n;
        int iHashCode7 = skin == null ? 0 : skin.hashCode();
        String str7 = this.f69913o;
        int iA3 = I.a(this.f69914p, (((((iA2 + iHashCode6) * 31) + iHashCode7) * 31) + (str7 == null ? 0 : str7.hashCode())) * 31, 31);
        String str8 = this.f69915q;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.f69916r;
        int iHashCode9 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.f69917s;
        int iHashCode10 = str10 == null ? 0 : str10.hashCode();
        Map<String, String> map = this.f69918t;
        int iA4 = I.a(this.f69919u, (((((((iA3 + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (map == null ? 0 : map.hashCode())) * 31, 31);
        int iHashCode11 = this.f69920v.hashCode();
        Topic topic = this.f69921w;
        int iA5 = C3554n0.a((((iHashCode11 + iA4) * 31) + (topic == null ? 0 : topic.hashCode())) * 31, 31, this.f69922x);
        int iHashCode12 = this.f69923y.hashCode();
        OGVMultiCardType oGVMultiCardType = this.f69924z;
        int iHashCode13 = oGVMultiCardType == null ? 0 : oGVMultiCardType.hashCode();
        String str11 = this.f69891A;
        int iHashCode14 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.f69892B;
        int iHashCode15 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.f69893C;
        int iHashCode16 = str13 == null ? 0 : str13.hashCode();
        Integer num = this.f69894D;
        int iHashCode17 = num == null ? 0 : num.hashCode();
        String str14 = this.f69895E;
        if (str14 != null) {
            iHashCode = str14.hashCode();
        }
        return this.f69897G.hashCode() + e0.a((((((((((((((iHashCode12 + iA5) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode) * 31, 31, this.f69896F);
    }

    public final void i(@NotNull List<CommonCard> list) {
        this.f69910l = list;
    }

    @NotNull
    public final String toString() {
        String str = this.f69901b;
        List<Long> list = this.f69904e;
        int i7 = this.h;
        List<ModuleHeader> list2 = this.f69908j;
        List<CommonCard> list3 = this.f69910l;
        int i8 = this.f69914p;
        Map<String, String> map = this.f69918t;
        OGVRankThemeType oGVRankThemeType = this.f69920v;
        Topic topic = this.f69921w;
        List<Intervene> list4 = this.f69896F;
        StringBuilder sb = new StringBuilder("RecommendModule(title=");
        B.a(this.f69900a, ", subtitle=", str, ", desc=", sb);
        sb.append(this.f69902c);
        sb.append(", style=");
        f.a(this.f69903d, ", wids=", ", icon=", sb, list);
        sb.append(this.f69905f);
        sb.append(", iconNight=");
        e.b(i7, this.f69906g, ", cardDisplayCount=", ", attr=", sb);
        sb.append(this.f69907i);
        sb.append(", headers=");
        sb.append(list2);
        sb.append(", headersType=");
        sb.append(this.f69909k);
        sb.append(", cards=");
        sb.append(list3);
        sb.append(", follow=");
        sb.append(this.f69911m);
        sb.append(", skin=");
        sb.append(this.f69912n);
        sb.append(", type=");
        e.b(i8, this.f69913o, ", jumpId=", ", moduleId=", sb);
        sb.append(this.f69915q);
        sb.append(", cover=");
        sb.append(this.f69916r);
        sb.append(", link=");
        C7416u.a(sb, this.f69917s, ", report=", map, ", version=");
        sb.append(this.f69919u);
        sb.append(", themeType=");
        sb.append(oGVRankThemeType);
        sb.append(", topic=");
        sb.append(topic);
        sb.append(", setId=");
        sb.append(this.f69922x);
        sb.append(", subscribeStatus=");
        sb.append(this.f69923y);
        sb.append(", multiStyle=");
        sb.append(this.f69924z);
        sb.append(", firstModuleTitle=");
        sb.append(this.f69891A);
        sb.append(", collectionButtonLink=");
        sb.append(this.f69892B);
        sb.append(", feedModuleTitle=");
        sb.append(this.f69893C);
        sb.append(", bgColor=");
        sb.append(this.f69894D);
        sb.append(", bgImg=");
        f.a(this.f69895E, ", intervenes=", ", exp=", sb, list4);
        sb.append(this.f69897G);
        sb.append(")");
        return sb.toString();
    }
}
