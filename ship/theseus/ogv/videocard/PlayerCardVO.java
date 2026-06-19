package com.bilibili.ship.theseus.ogv.videocard;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import com.bilibili.bson.common.Bson;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.ogv.infra.gson.DurationFromMillisTypeAdapter;
import com.bilibili.ogv.infra.gson.DurationFromSecondsTypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ship/theseus/ogv/videocard/PlayerCardVO.class */
@StabilityInferred(parameters = 0)
@Bson
public final class PlayerCardVO {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f94671A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final long f94672B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    @NotNull
    public final String f94673C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    @SerializedName("order_report_params")
    @NotNull
    private final Map<String, String> f94674D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @SerializedName("frame_color")
    private final int f94675E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @SerializedName("title_color")
    private final int f94676F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("unique_id")
    @NotNull
    private final String f94677a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("win_id")
    @NotNull
    private final String f94678b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("title")
    @NotNull
    private final String f94679c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("img_url")
    @NotNull
    private final String f94680d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("from")
    @JsonAdapter(DurationFromSecondsTypeAdapter.class)
    private final long f94681e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("to")
    @JsonAdapter(DurationFromSecondsTypeAdapter.class)
    private final long f94682f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName(NotificationCompat.CATEGORY_STATUS)
    private final int f94683g;

    @SerializedName("card_type")
    private final int h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SerializedName("jump_url")
    @NotNull
    private final String f94684i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SerializedName("show_selected")
    private final boolean f94685j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @SerializedName("selected_button")
    @Nullable
    private final PlayerCardButtonVO f94686k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @SerializedName("unselected_button")
    @Nullable
    private final PlayerCardButtonVO f94687l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @SerializedName("need_login")
    private final boolean f94688m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f94689n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @SerializedName("unselected_disappear_time")
    @JsonAdapter(DurationFromMillisTypeAdapter.class)
    private final long f94690o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @SerializedName("unselected_show_time")
    @JsonAdapter(DurationFromMillisTypeAdapter.class)
    private final long f94691p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @SerializedName("business_type")
    private final int f94692q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @SerializedName("season_id")
    @Nullable
    private final Long f94693r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @SerializedName("ep_id")
    @Nullable
    private final Long f94694s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @SerializedName("activity_id")
    @Nullable
    private final Long f94695t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @SerializedName("is_support_cancel")
    private final boolean f94696u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @SerializedName("related_act_type")
    private final int f94697v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @SerializedName("unselectedSubText")
    @NotNull
    private final String f94698w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @SerializedName("follow_danmu")
    private final boolean f94699x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @SerializedName("has_close_button")
    private final boolean f94700y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @SerializedName("is_always_display")
    private final boolean f94701z;

    public PlayerCardVO() {
        throw null;
    }

    public PlayerCardVO(String str, String str2, String str3, String str4, long j7, long j8, int i7, int i8, String str5, boolean z6, PlayerCardButtonVO playerCardButtonVO, PlayerCardButtonVO playerCardButtonVO2, boolean z7, Map map, long j9, long j10, int i9, Long l7, Long l8, Long l9, boolean z8, int i10, String str6, boolean z9, boolean z10, boolean z11, int i11, long j11, String str7, Map map2, int i12, int i13, int i14) {
        z7 = (i14 & 4096) != 0 ? true : z7;
        if ((i14 & 16384) != 0) {
            Duration.Companion companion = Duration.Companion;
            j9 = DurationKt.toDuration(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_PREPROCESS_MAX_SIZE, DurationUnit.MILLISECONDS);
        }
        if ((32768 & i14) != 0) {
            Duration.Companion companion2 = Duration.Companion;
            j10 = DurationKt.toDuration(BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_PREPROCESS_MAX_SIZE, DurationUnit.MILLISECONDS);
        }
        map2 = (536870912 & i14) != 0 ? MapsKt.emptyMap() : map2;
        i12 = (1073741824 & i14) != 0 ? 0 : i12;
        i13 = (i14 & Integer.MIN_VALUE) != 0 ? -1 : i13;
        this.f94677a = str;
        this.f94678b = str2;
        this.f94679c = str3;
        this.f94680d = str4;
        this.f94681e = j7;
        this.f94682f = j8;
        this.f94683g = i7;
        this.h = i8;
        this.f94684i = str5;
        this.f94685j = z6;
        this.f94686k = playerCardButtonVO;
        this.f94687l = playerCardButtonVO2;
        this.f94688m = z7;
        this.f94689n = map;
        this.f94690o = j9;
        this.f94691p = j10;
        this.f94692q = i9;
        this.f94693r = l7;
        this.f94694s = l8;
        this.f94695t = l9;
        this.f94696u = z8;
        this.f94697v = i10;
        this.f94698w = str6;
        this.f94699x = z9;
        this.f94700y = z10;
        this.f94701z = z11;
        this.f94671A = i11;
        this.f94672B = j11;
        this.f94673C = str7;
        this.f94674D = map2;
        this.f94675E = i12;
        this.f94676F = i13;
    }

    @Nullable
    public final PlayerCardButtonVO A() {
        return this.f94687l;
    }

    @NotNull
    public final String B() {
        return this.f94678b;
    }

    public final int a() {
        return this.f94697v;
    }

    @Nullable
    public final Long b() {
        return this.f94695t;
    }

    public final boolean c() {
        return this.f94701z;
    }

    public final int d() {
        return this.f94675E;
    }

    public final int e() {
        return this.f94692q;
    }

    public final int f() {
        return this.h;
    }

    public final long g() {
        return this.f94691p;
    }

    public final long h() {
        return this.f94690o;
    }

    public final long i() {
        return this.f94682f;
    }

    @Nullable
    public final Long j() {
        return this.f94694s;
    }

    public final boolean k() {
        return this.f94699x;
    }

    public final long l() {
        return this.f94681e;
    }

    @NotNull
    public final String m() {
        return this.f94677a;
    }

    @NotNull
    public final String n() {
        return this.f94680d;
    }

    @NotNull
    public final String o() {
        return this.f94684i;
    }

    public final boolean p() {
        return this.f94688m;
    }

    @NotNull
    public final Map<String, String> q() {
        return this.f94674D;
    }

    @Nullable
    public final Long r() {
        return this.f94693r;
    }

    @Nullable
    public final PlayerCardButtonVO s() {
        return this.f94686k;
    }

    public final boolean t() {
        return this.f94700y;
    }

    public final boolean u() {
        return this.f94685j;
    }

    public final int v() {
        return this.f94683g;
    }

    @NotNull
    public final String w() {
        return this.f94698w;
    }

    public final boolean x() {
        return this.f94696u;
    }

    public final int y() {
        return this.f94676F;
    }

    @NotNull
    public final String z() {
        return this.f94679c;
    }
}
