package com.bilibili.ogv.opbase;

import Ak0.b;
import I.E;
import android.graphics.drawable.GradientDrawable;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.adcommon.data.model.SourceContent;
import com.bilibili.bson.adapter.StringIntColorTypeAdapter;
import com.bilibili.bson.adapter.a;
import com.bilibili.bson.common.Bson;
import com.bilibili.ogvcommon.bangumibadge.BangumiBadgeInfo;
import com.bilibili.ogvcommon.play.BangumiDimension;
import com.bilibili.studio.centerplus.util.blink.BlinkEffectManager;
import com.google.gson.JsonObject;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import e4.c;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.C8770a;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/CommonCard.class */
@StabilityInferred(parameters = 0)
@Bson
public final class CommonCard {

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public long f69695A0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @SerializedName("stat")
    @Nullable
    private CountInfo f69698C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    @SerializedName("video")
    @Nullable
    private VideoInfo f69699C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public long f69700D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    @Nullable
    public Map<String, String> f69701D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public long f69702E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public int f69703E0;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public int f69705F0;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public int f69707G0;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    @SerializedName("dynamic_banner")
    @Nullable
    private VideoBannerInfo f69709H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f69710I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    @Nullable
    public String f69711I0;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public int f69712J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    @Nullable
    public BangumiBadgeInfo f69714K;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    @Nullable
    public SourceContent f69715K0;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @Nullable
    public List<Tag> f69716L;

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    @Nullable
    public RoomInfo f69717L0;

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public transient boolean f69719M0;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    @Nullable
    public Skin f69721N0;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    @Nullable
    public String f69724P;

    /* JADX INFO: renamed from: P0, reason: collision with root package name */
    public boolean f69725P0;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public long f69726Q;

    /* JADX INFO: renamed from: Q0, reason: collision with root package name */
    @Nullable
    public UpInfo f69727Q0;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    @Nullable
    public String f69728R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    @Nullable
    public String f69730S;

    /* JADX INFO: renamed from: S0, reason: collision with root package name */
    @Nullable
    public transient RecommendModule f69731S0;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    @Nullable
    public String f69732T;

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public int f69733T0;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    @Nullable
    public FollowInCard f69734U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public transient boolean f69736V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public transient boolean f69738W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f69740X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f69742Y;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    @SerializedName("supplementary_drama")
    @Nullable
    private JsonObject f69743Y0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    @Nullable
    public NewestEp f69751b1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Tag f69756e;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f69762h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public String f69763i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public BangumiCardType f69765j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    public Progress f69767k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public int f69768k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @Nullable
    public String f69769l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public int f69770l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f69771m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f69773n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public long f69774n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f69775o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f69776o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @SerializedName("badge_info")
    @Nullable
    private BangumiBadgeInfo f69777p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public long f69778p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @SerializedName("progress_percent")
    private int f69779q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public long f69780q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @SerializedName("top_left_badge")
    @Nullable
    private BangumiBadgeInfo f69781r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @SerializedName("bottom_left_badge")
    @Nullable
    private BangumiBadgeInfo f69783s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @SerializedName("item_style")
    @Nullable
    private BadgeInfo f69784s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @SerializedName("icons")
    @Nullable
    private List<String> f69785t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @SerializedName("title_right_badge")
    @Nullable
    private BangumiBadgeInfo f69786t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @SerializedName("bottom_right_badge")
    @Nullable
    private BangumiBadgeInfo f69787u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @Nullable
    public BadgeControll f69788u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @SerializedName("desc_badge")
    @Nullable
    private BangumiBadgeInfo f69789v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    @Nullable
    public BangumiDimension f69790v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @SerializedName("sub_title_left_badge")
    @Nullable
    private BangumiBadgeInfo f69791w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @SerializedName("player_info")
    @Nullable
    private String f69792w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @SerializedName("is_new")
    private boolean f69793x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @SerializedName("episode_id")
    private long f69794x0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    @SerializedName("preview_episode_id")
    private long f69798z0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public String f69746a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public String f69749b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public String f69752c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public String f69754d = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f69758f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public String f69760g = "";

    @Nullable
    public String h = "";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    public String f69795y = "";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @SerializedName(BlinkEffectManager.EFFECT_BYTEEFFECT_MOD_POOL)
    @Nullable
    private String f69797z = "";

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public Status f69694A = new Status(0, 0, 6, false);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f69696B = true;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @Nullable
    public String f69704F = "";

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @Nullable
    public String f69706G = "";

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @NotNull
    public OGVInlineActionType f69708H = OGVInlineActionType.UNKNOWN;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    @Nullable
    public String f69718M = "";

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    @Nullable
    public String f69720N = "";

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    @Nullable
    public String f69722O = "";

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    @NotNull
    public String f69744Z = "";

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    @NotNull
    public String f69747a0 = "";

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    @Nullable
    public String f69750b0 = "";

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    @Nullable
    public String f69753c0 = "";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    @Nullable
    public String f69755d0 = "";

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    @NotNull
    public String f69757e0 = "";

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    @NotNull
    public String f69759f0 = "";

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    @NotNull
    public String f69761g0 = "";

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    @NotNull
    public String f69764i0 = "";

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    @NotNull
    public String f69766j0 = "";

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    @NotNull
    public String f69772m0 = "";

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @SerializedName("static_cover")
    @NotNull
    private String f69782r0 = "";

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public String f69796y0 = "";

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    @SerializedName("is_preview")
    private boolean f69697B0 = true;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    @NotNull
    public String f69713J0 = "";

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    @SerializedName("items")
    @NotNull
    private List<CommonCard> f69723O0 = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: R0, reason: collision with root package name */
    @SerializedName("intervene_placeholder")
    @NotNull
    private HomeBannerInterveneType f69729R0 = HomeBannerInterveneType.NONE;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    @Nullable
    public String f69735U0 = "";

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    @Nullable
    public String f69737V0 = "";

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    @Nullable
    public String f69739W0 = "";

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    @Nullable
    public String f69741X0 = "";

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    @Nullable
    public String f69745Z0 = "";

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    @Nullable
    public String f69748a1 = "";

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/CommonCard$BangumiCardType.class */
    public static final class BangumiCardType implements a<String> {
        private static final EnumEntries $ENTRIES;
        private static final BangumiCardType[] $VALUES;

        @NotNull
        private final String value;
        public static final BangumiCardType UGC_TYPE = new BangumiCardType("UGC_TYPE", 0, "UGC");
        public static final BangumiCardType OGV_TYPE = new BangumiCardType("OGV_TYPE", 1, "OGV");

        private static final /* synthetic */ BangumiCardType[] $values() {
            return new BangumiCardType[]{UGC_TYPE, OGV_TYPE};
        }

        static {
            BangumiCardType[] bangumiCardTypeArr$values = $values();
            $VALUES = bangumiCardTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(bangumiCardTypeArr$values);
        }

        private BangumiCardType(String str, int i7, String str2) {
            this.value = str2;
        }

        @NotNull
        public static EnumEntries<BangumiCardType> getEntries() {
            return $ENTRIES;
        }

        public static BangumiCardType valueOf(String str) {
            return (BangumiCardType) Enum.valueOf(BangumiCardType.class, str);
        }

        public static BangumiCardType[] values() {
            return (BangumiCardType[]) $VALUES.clone();
        }

        @NotNull
        public String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/CommonCard$HomeBannerInterveneType.class */
    public static final class HomeBannerInterveneType implements a<String> {
        private static final EnumEntries $ENTRIES;
        private static final HomeBannerInterveneType[] $VALUES;

        @NotNull
        private final String value;
        public static final HomeBannerInterveneType NONE = new HomeBannerInterveneType("NONE", 0, "");
        public static final HomeBannerInterveneType NEW_USER_TYPE = new HomeBannerInterveneType("NEW_USER_TYPE", 1, "play_list");

        private static final /* synthetic */ HomeBannerInterveneType[] $values() {
            return new HomeBannerInterveneType[]{NONE, NEW_USER_TYPE};
        }

        static {
            HomeBannerInterveneType[] homeBannerInterveneTypeArr$values = $values();
            $VALUES = homeBannerInterveneTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(homeBannerInterveneTypeArr$values);
        }

        private HomeBannerInterveneType(String str, int i7, String str2) {
            this.value = str2;
        }

        @NotNull
        public static EnumEntries<HomeBannerInterveneType> getEntries() {
            return $ENTRIES;
        }

        public static HomeBannerInterveneType valueOf(String str) {
            return (HomeBannerInterveneType) Enum.valueOf(HomeBannerInterveneType.class, str);
        }

        public static HomeBannerInterveneType[] values() {
            return (HomeBannerInterveneType[]) $VALUES.clone();
        }

        @NotNull
        public String getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/CommonCard$OGVInlineActionType.class */
    public static final class OGVInlineActionType implements a<Integer> {
        private static final EnumEntries $ENTRIES;
        private static final OGVInlineActionType[] $VALUES;
        private final int value;
        public static final OGVInlineActionType UNKNOWN = new OGVInlineActionType("UNKNOWN", 0, 0);
        public static final OGVInlineActionType DETAIL = new OGVInlineActionType("DETAIL", 1, 1);
        public static final OGVInlineActionType CINEMA_FOLLOW = new OGVInlineActionType("CINEMA_FOLLOW", 2, 2);
        public static final OGVInlineActionType FULL_DETAIL = new OGVInlineActionType("FULL_DETAIL", 3, 3);
        public static final OGVInlineActionType BANGUMI_FOLLOW = new OGVInlineActionType("BANGUMI_FOLLOW", 4, 4);
        public static final OGVInlineActionType GUIDE_WANTED = new OGVInlineActionType("GUIDE_WANTED", 5, 5);
        public static final OGVInlineActionType GUIDE_INTEREST = new OGVInlineActionType("GUIDE_INTEREST", 6, 6);

        private static final /* synthetic */ OGVInlineActionType[] $values() {
            return new OGVInlineActionType[]{UNKNOWN, DETAIL, CINEMA_FOLLOW, FULL_DETAIL, BANGUMI_FOLLOW, GUIDE_WANTED, GUIDE_INTEREST};
        }

        static {
            OGVInlineActionType[] oGVInlineActionTypeArr$values = $values();
            $VALUES = oGVInlineActionTypeArr$values;
            $ENTRIES = EnumEntriesKt.enumEntries(oGVInlineActionTypeArr$values);
        }

        private OGVInlineActionType(String str, int i7, int i8) {
            this.value = i8;
        }

        @NotNull
        public static EnumEntries<OGVInlineActionType> getEntries() {
            return $ENTRIES;
        }

        public static OGVInlineActionType valueOf(String str) {
            return (OGVInlineActionType) Enum.valueOf(OGVInlineActionType.class, str);
        }

        public static OGVInlineActionType[] values() {
            return (OGVInlineActionType[]) $VALUES.clone();
        }

        @NotNull
        /* JADX INFO: renamed from: getValue, reason: merged with bridge method [inline-methods] */
        public Integer m7442getValue() {
            return Integer.valueOf(this.value);
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/CommonCard$Skin.class */
    @StabilityInferred(parameters = 1)
    @Bson
    public static final class Skin {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f69799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @JsonAdapter(StringIntColorTypeAdapter.class)
        @Nullable
        public final Integer f69800b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f69801c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @JsonAdapter(StringIntColorTypeAdapter.class)
        @Nullable
        public final Integer f69802d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @JsonAdapter(StringIntColorTypeAdapter.class)
        @Nullable
        public final Integer f69803e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @JsonAdapter(StringIntColorTypeAdapter.class)
        @Nullable
        public final Integer f69804f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        public final String f69805g;

        @Nullable
        public final String h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @JsonAdapter(StringIntColorTypeAdapter.class)
        @Nullable
        public final Integer f69806i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @JsonAdapter(StringIntColorTypeAdapter.class)
        @Nullable
        public final Integer f69807j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @Nullable
        public final String f69808k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @JsonAdapter(StringIntColorTypeAdapter.class)
        @Nullable
        public final Integer f69809l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        @JsonAdapter(StringIntColorTypeAdapter.class)
        @Nullable
        public final Integer f69810m;

        public Skin(int i7, @Nullable Integer num, int i8, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable String str, @Nullable String str2, @Nullable Integer num5, @Nullable Integer num6, @Nullable String str3, @Nullable Integer num7, @Nullable Integer num8) {
            this.f69799a = i7;
            this.f69800b = num;
            this.f69801c = i8;
            this.f69802d = num2;
            this.f69803e = num3;
            this.f69804f = num4;
            this.f69805g = str;
            this.h = str2;
            this.f69806i = num5;
            this.f69807j = num6;
            this.f69808k = str3;
            this.f69809l = num7;
            this.f69810m = num8;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [Ak0.b] */
        /* JADX WARN: Type inference failed for: r8v0 */
        /* JADX WARN: Type inference failed for: r8v1 */
        /* JADX WARN: Type inference failed for: r8v2 */
        /* JADX WARN: Type inference failed for: r8v4, types: [Ak0.b] */
        /* JADX WARN: Type inference failed for: r8v5 */
        @Nullable
        public final b a() {
            Integer num = this.f69806i;
            ?? r8 = 0;
            if (num != null) {
                int iIntValue = num.intValue();
                Integer num2 = this.f69807j;
                r8 = 0;
                if (num2 != null) {
                    int[] iArr = {iIntValue, num2.intValue()};
                    ?? gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArr);
                    gradientDrawable.f318a = iArr;
                    r8 = gradientDrawable;
                }
            }
            return r8;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Skin)) {
                return false;
            }
            Skin skin = (Skin) obj;
            return this.f69799a == skin.f69799a && Intrinsics.areEqual(this.f69800b, skin.f69800b) && this.f69801c == skin.f69801c && Intrinsics.areEqual(this.f69802d, skin.f69802d) && Intrinsics.areEqual(this.f69803e, skin.f69803e) && Intrinsics.areEqual(this.f69804f, skin.f69804f) && Intrinsics.areEqual(this.f69805g, skin.f69805g) && Intrinsics.areEqual(this.h, skin.h) && Intrinsics.areEqual(this.f69806i, skin.f69806i) && Intrinsics.areEqual(this.f69807j, skin.f69807j) && Intrinsics.areEqual(this.f69808k, skin.f69808k) && Intrinsics.areEqual(this.f69809l, skin.f69809l) && Intrinsics.areEqual(this.f69810m, skin.f69810m);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f69799a);
            int iHashCode2 = 0;
            Integer num = this.f69800b;
            int iA = I.a(this.f69801c, ((iHashCode * 31) + (num == null ? 0 : num.hashCode())) * 31, 31);
            Integer num2 = this.f69802d;
            int iHashCode3 = num2 == null ? 0 : num2.hashCode();
            Integer num3 = this.f69803e;
            int iHashCode4 = num3 == null ? 0 : num3.hashCode();
            Integer num4 = this.f69804f;
            int iHashCode5 = num4 == null ? 0 : num4.hashCode();
            String str = this.f69805g;
            int iHashCode6 = str == null ? 0 : str.hashCode();
            String str2 = this.h;
            int iHashCode7 = str2 == null ? 0 : str2.hashCode();
            Integer num5 = this.f69806i;
            int iHashCode8 = num5 == null ? 0 : num5.hashCode();
            Integer num6 = this.f69807j;
            int iHashCode9 = num6 == null ? 0 : num6.hashCode();
            String str3 = this.f69808k;
            int iHashCode10 = str3 == null ? 0 : str3.hashCode();
            Integer num7 = this.f69809l;
            int iHashCode11 = num7 == null ? 0 : num7.hashCode();
            Integer num8 = this.f69810m;
            if (num8 != null) {
                iHashCode2 = num8.hashCode();
            }
            return ((((((((((((((((((iA + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode2;
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Skin(topBgType=");
            sb.append(this.f69799a);
            sb.append(", topStatusBarBgColor=");
            sb.append(this.f69800b);
            sb.append(", topStatusBarColorType=");
            sb.append(this.f69801c);
            sb.append(", topSearchBarBgColor=");
            sb.append(this.f69802d);
            sb.append(", topTabBarBgColor=");
            sb.append(this.f69803e);
            sb.append(", topTabTextHighlightColor=");
            sb.append(this.f69804f);
            sb.append(", topUpperBgImg=");
            sb.append(this.f69805g);
            sb.append(", topLowerBgImg=");
            sb.append(this.h);
            sb.append(", bgStartColor=");
            sb.append(this.f69806i);
            sb.append(", bgEndColor=");
            sb.append(this.f69807j);
            sb.append(", bgImg=");
            sb.append(this.f69808k);
            sb.append(", itemTabBarBgStartColor=");
            sb.append(this.f69809l);
            sb.append(", itemTabBarBgEndColor=");
            return c.a(sb, this.f69810m, ")");
        }
    }

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogv/opbase/CommonCard$VideoBannerInfo.class */
    @StabilityInferred(parameters = 1)
    @Bson
    public static final class VideoBannerInfo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final String f69811a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f69812b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final String f69813c;

        public VideoBannerInfo(@NotNull String str, @NotNull String str2, @NotNull String str3) {
            this.f69811a = str;
            this.f69812b = str2;
            this.f69813c = str3;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VideoBannerInfo)) {
                return false;
            }
            VideoBannerInfo videoBannerInfo = (VideoBannerInfo) obj;
            return Intrinsics.areEqual(this.f69811a, videoBannerInfo.f69811a) && Intrinsics.areEqual(this.f69812b, videoBannerInfo.f69812b) && Intrinsics.areEqual(this.f69813c, videoBannerInfo.f69813c);
        }

        public final int hashCode() {
            return this.f69813c.hashCode() + E.a(this.f69811a.hashCode() * 31, 31, this.f69812b);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("VideoBannerInfo(bgImg=");
            sb.append(this.f69811a);
            sb.append(", buttonImg=");
            sb.append(this.f69812b);
            sb.append(", link=");
            return C8770a.a(sb, this.f69813c, ")");
        }
    }

    public final void A(@Nullable BangumiBadgeInfo bangumiBadgeInfo) {
        this.f69787u = bangumiBadgeInfo;
    }

    public final void B(@Nullable CountInfo countInfo) {
        this.f69698C = countInfo;
    }

    public final void C(long j7) {
        this.f69794x0 = j7;
    }

    public final void D(@NotNull HomeBannerInterveneType homeBannerInterveneType) {
        this.f69729R0 = homeBannerInterveneType;
    }

    public final void E(boolean z6) {
        this.f69793x = z6;
    }

    public final void F(@NotNull String str) {
        this.f69782r0 = str;
    }

    public final void G(@Nullable String str) {
        this.f69792w0 = str;
    }

    public final void H(boolean z6) {
        this.f69697B0 = z6;
    }

    public final void I(long j7) {
        this.f69798z0 = j7;
    }

    public final void J(int i7) {
        this.f69779q = i7;
    }

    public final void K(@NotNull List<CommonCard> list) {
        this.f69723O0 = list;
    }

    public final void L(@Nullable BangumiBadgeInfo bangumiBadgeInfo) {
        this.f69789v = bangumiBadgeInfo;
    }

    public final void M(@Nullable BangumiBadgeInfo bangumiBadgeInfo) {
        this.f69791w = bangumiBadgeInfo;
    }

    public final void N(@Nullable JsonObject jsonObject) {
        this.f69743Y0 = jsonObject;
    }

    public final void O(@Nullable BangumiBadgeInfo bangumiBadgeInfo) {
        this.f69786t0 = bangumiBadgeInfo;
    }

    public final void P(@Nullable BangumiBadgeInfo bangumiBadgeInfo) {
        this.f69781r = bangumiBadgeInfo;
    }

    public final void Q(@Nullable List<String> list) {
        this.f69785t = list;
    }

    public final void R(@Nullable VideoBannerInfo videoBannerInfo) {
        this.f69709H0 = videoBannerInfo;
    }

    public final void S(@Nullable VideoInfo videoInfo) {
        this.f69699C0 = videoInfo;
    }

    public final void T(@Nullable BangumiBadgeInfo bangumiBadgeInfo) {
        this.f69777p = bangumiBadgeInfo;
    }

    @Nullable
    public final String a() {
        return this.f69797z;
    }

    @Nullable
    public final BadgeInfo b() {
        return this.f69784s0;
    }

    @Nullable
    public final BangumiBadgeInfo c() {
        return this.f69783s;
    }

    @Nullable
    public final BangumiBadgeInfo d() {
        return this.f69787u;
    }

    @Nullable
    public final CountInfo e() {
        return this.f69698C;
    }

    public final long f() {
        return this.f69794x0;
    }

    @NotNull
    public final HomeBannerInterveneType g() {
        return this.f69729R0;
    }

    @NotNull
    public final String h() {
        return this.f69782r0;
    }

    @Nullable
    public final String i() {
        return this.f69792w0;
    }

    public final long j() {
        return this.f69798z0;
    }

    public final int k() {
        return this.f69779q;
    }

    @NotNull
    public final List<CommonCard> l() {
        return this.f69723O0;
    }

    @Nullable
    public final BangumiBadgeInfo m() {
        return this.f69789v;
    }

    @Nullable
    public final BangumiBadgeInfo n() {
        return this.f69791w;
    }

    @Nullable
    public final JsonObject o() {
        return this.f69743Y0;
    }

    @Nullable
    public final BangumiBadgeInfo p() {
        return this.f69786t0;
    }

    @Nullable
    public final BangumiBadgeInfo q() {
        return this.f69781r;
    }

    @Nullable
    public final List<String> r() {
        return this.f69785t;
    }

    @Nullable
    public final VideoBannerInfo s() {
        return this.f69709H0;
    }

    @Nullable
    public final VideoInfo t() {
        return this.f69699C0;
    }

    @Nullable
    public final BangumiBadgeInfo u() {
        return this.f69777p;
    }

    public final boolean v() {
        return this.f69793x;
    }

    public final boolean w() {
        return this.f69697B0;
    }

    public final void x(@Nullable String str) {
        this.f69797z = str;
    }

    public final void y(@Nullable BadgeInfo badgeInfo) {
        this.f69784s0 = badgeInfo;
    }

    public final void z(@Nullable BangumiBadgeInfo bangumiBadgeInfo) {
        this.f69783s = bangumiBadgeInfo;
    }
}
