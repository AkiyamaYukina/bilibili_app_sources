package com.bilibili.pegasus.data.card;

import B0.b;
import G0.d;
import H0.e;
import J1.z;
import androidx.compose.animation.core.I;
import androidx.compose.foundation.C3554n0;
import androidx.core.view.GravityCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.media3.exoplayer.analytics.T;
import androidx.room.B;
import cf.h;
import com.bilibili.ad.adview.pegasus.banner.topview.res.n;
import com.bilibili.adcommon.data.AdInfo;
import com.bilibili.app.comm.list.common.api.model.PlayerArgs;
import com.bilibili.app.comm.list.common.data.DislikeReason;
import com.bilibili.app.comm.list.common.data.ThreePointItem;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.pegasus.HolderExtra;
import com.bilibili.pegasus.HolderStyle;
import com.bilibili.pegasus.data.FeedbackType;
import com.bilibili.pegasus.data.base.BasePegasusData;
import com.bilibili.pegasus.data.card.DislikeRequestRecord;
import com.bilibili.pegasus.data.component.ArgsData;
import com.bilibili.pegasus.data.component.UpArgsData;
import com.bilibili.search2.api.SearchBangumiItem;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.google.gson.annotations.SerializedName;
import fp0.C7136a;
import fp0.C7137b;
import fp0.C7138c;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/pegasus/data/card/DislikeItemData.class */
public final class DislikeItemData implements BasePegasusData {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    @NotNull
    public final HolderExtra f77283A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    @Nullable
    public final transient BasePegasusData f77284B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public transient long f77285C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public transient int f77286D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    @Nullable
    public transient DislikeReason f77287E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    @Nullable
    public transient DislikeReason f77288F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    @Nullable
    public transient List<? extends DislikeReason> f77289G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    @Nullable
    public transient List<? extends DislikeReason> f77290H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    @NotNull
    public transient FeedbackType f77291I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    @Nullable
    public transient DislikeRequestRecord f77292J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public transient int f77293K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    @NotNull
    public final HolderStyle f77294L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f77295M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("idx")
    private final long f77296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("card_type")
    @Nullable
    private final String f77297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("title")
    @Nullable
    private final String f77298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("cover")
    @Nullable
    private final String f77299d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName("dalao_feature")
    @Nullable
    private final String f77300e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName(EditCustomizeSticker.TAG_URI)
    @Nullable
    private final String f77301f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("subtitle")
    @Nullable
    private final String f77302g;

    @SerializedName("card_goto")
    @Nullable
    private final String h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SerializedName("goto")
    @Nullable
    private final String f77303i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SerializedName("track_id")
    @Nullable
    private final String f77304j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @SerializedName("pos_rec_unique_id")
    @Nullable
    private final String f77305k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @SerializedName("material_id")
    private final long f77306l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @SerializedName("dislike_report_data")
    @Nullable
    private final String f77307m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @SerializedName("dislike_info")
    @Nullable
    private final String f77308n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @SerializedName("av_feature")
    @Nullable
    private final String f77309o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @SerializedName("three_point_v2")
    @Nullable
    private final List<ThreePointItem> f77310p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @SerializedName("three_point_v")
    @Nullable
    private String f77311q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @SerializedName("extra_rpt_fields")
    @Nullable
    private final Map<String, String> f77312r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @SerializedName("ad_info")
    @Nullable
    private final AdInfo f77313s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @SerializedName("player_args")
    @Nullable
    private final PlayerArgs f77314t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @SerializedName("up_args")
    @Nullable
    private final UpArgsData f77315u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @SerializedName("id")
    private final long f77316v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @SerializedName("args")
    @Nullable
    private final ArgsData f77317w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @SerializedName("param")
    @Nullable
    private final String f77318x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @SerializedName("from_type")
    @Nullable
    private final String f77319y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @SerializedName("zero_signal")
    private final int f77320z;

    public DislikeItemData() {
        this(0L, null, null, null, null, null, null, null, null, null, null, 0L, null, null, null, null, null, null, null, null, null, 0L, null, null, null, 0, null, null, 0L, 0, null, null, null, null, null, null, 0, null, false, -1, SearchBangumiItem.TYPE_FULLNET_BANGUMI, null);
    }

    public DislikeItemData(long j7, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, long j8, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable List<? extends ThreePointItem> list, @Nullable String str14, @Nullable Map<String, String> map, @Nullable AdInfo adInfo, @Nullable PlayerArgs playerArgs, @Nullable UpArgsData upArgsData, long j9, @Nullable ArgsData argsData, @Nullable String str15, @Nullable String str16, int i7, @NotNull HolderExtra holderExtra, @Nullable BasePegasusData basePegasusData, long j10, int i8, @Nullable DislikeReason dislikeReason, @Nullable DislikeReason dislikeReason2, @Nullable List<? extends DislikeReason> list2, @Nullable List<? extends DislikeReason> list3, @NotNull FeedbackType feedbackType, @Nullable DislikeRequestRecord dislikeRequestRecord, int i9, @NotNull HolderStyle holderStyle, boolean z6) {
        this.f77296a = j7;
        this.f77297b = str;
        this.f77298c = str2;
        this.f77299d = str3;
        this.f77300e = str4;
        this.f77301f = str5;
        this.f77302g = str6;
        this.h = str7;
        this.f77303i = str8;
        this.f77304j = str9;
        this.f77305k = str10;
        this.f77306l = j8;
        this.f77307m = str11;
        this.f77308n = str12;
        this.f77309o = str13;
        this.f77310p = list;
        this.f77311q = str14;
        this.f77312r = map;
        this.f77313s = adInfo;
        this.f77314t = playerArgs;
        this.f77315u = upArgsData;
        this.f77316v = j9;
        this.f77317w = argsData;
        this.f77318x = str15;
        this.f77319y = str16;
        this.f77320z = i7;
        this.f77283A = holderExtra;
        this.f77284B = basePegasusData;
        this.f77285C = j10;
        this.f77286D = i8;
        this.f77287E = dislikeReason;
        this.f77288F = dislikeReason2;
        this.f77289G = list2;
        this.f77290H = list3;
        this.f77291I = feedbackType;
        this.f77292J = dislikeRequestRecord;
        this.f77293K = i9;
        this.f77294L = holderStyle;
        this.f77295M = z6;
    }

    public /* synthetic */ DislikeItemData(long j7, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, long j8, String str11, String str12, String str13, List list, String str14, Map map, AdInfo adInfo, PlayerArgs playerArgs, UpArgsData upArgsData, long j9, ArgsData argsData, String str15, String str16, int i7, HolderExtra holderExtra, BasePegasusData basePegasusData, long j10, int i8, DislikeReason dislikeReason, DislikeReason dislikeReason2, List list2, List list3, FeedbackType feedbackType, DislikeRequestRecord dislikeRequestRecord, int i9, HolderStyle holderStyle, boolean z6, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j7, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4, (i10 & 32) != 0 ? null : str5, (i10 & 64) != 0 ? null : str6, (i10 & 128) != 0 ? null : str7, (i10 & 256) != 0 ? null : str8, (i10 & 512) != 0 ? null : str9, (i10 & 1024) != 0 ? null : str10, (i10 & 2048) != 0 ? 0L : j8, (i10 & 4096) != 0 ? null : str11, (i10 & 8192) != 0 ? null : str12, (i10 & 16384) != 0 ? null : str13, (i10 & 32768) != 0 ? null : list, (i10 & 65536) != 0 ? null : str14, (i10 & 131072) != 0 ? null : map, (i10 & 262144) != 0 ? null : adInfo, (i10 & AccessibilityNodeInfoCompat.ACTION_COLLAPSE) != 0 ? null : playerArgs, (i10 & AccessibilityNodeInfoCompat.ACTION_DISMISS) != 0 ? null : upArgsData, (i10 & AccessibilityNodeInfoCompat.ACTION_SET_TEXT) != 0 ? 0L : j9, (i10 & 4194304) != 0 ? null : argsData, (i10 & GravityCompat.RELATIVE_LAYOUT_DIRECTION) != 0 ? null : str15, (i10 & 16777216) != 0 ? null : str16, (i10 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_HAND_SKELETON_KEYPOINTS_3D) != 0 ? 0 : i7, (i10 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_MULTI_SEGMENT) != 0 ? new HolderExtra(0, false, false, false, false, 0L, 0L, 0L, false, BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKY_RESULT_ROTATE, (DefaultConstructorMarker) null) : holderExtra, (i10 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_GAZE_DETECT) != 0 ? null : basePegasusData, (i10 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_DYNAMIC_GESTURE) != 0 ? 0L : j10, (i10 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_AVATAR_HELPER) != 0 ? -1 : i8, (i10 & BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE) != 0 ? null : dislikeReason, (i10 & Integer.MIN_VALUE) != 0 ? null : dislikeReason2, (i11 & 1) != 0 ? null : list2, (i11 & 2) != 0 ? null : list3, (i11 & 4) != 0 ? FeedbackType.NO_SELECTED : feedbackType, (i11 & 8) != 0 ? null : dislikeRequestRecord, (i11 & 16) != 0 ? 0 : i9, (i11 & 32) != 0 ? HolderStyle.Companion.getDOUBLE_COLUMN_SMALL_CARD() : holderStyle, (i11 & 64) != 0 ? false : z6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DislikeItemData copy$default(DislikeItemData dislikeItemData, long j7, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, long j8, String str11, String str12, String str13, List list, String str14, Map map, AdInfo adInfo, PlayerArgs playerArgs, UpArgsData upArgsData, long j9, ArgsData argsData, String str15, String str16, int i7, HolderExtra holderExtra, BasePegasusData basePegasusData, long j10, int i8, DislikeReason dislikeReason, DislikeReason dislikeReason2, List list2, List list3, FeedbackType feedbackType, DislikeRequestRecord dislikeRequestRecord, int i9, HolderStyle holderStyle, boolean z6, int i10, int i11, Object obj) {
        if ((i10 & 1) != 0) {
            j7 = dislikeItemData.f77296a;
        }
        if ((i10 & 2) != 0) {
            str = dislikeItemData.f77297b;
        }
        if ((i10 & 4) != 0) {
            str2 = dislikeItemData.f77298c;
        }
        if ((i10 & 8) != 0) {
            str3 = dislikeItemData.f77299d;
        }
        if ((i10 & 16) != 0) {
            str4 = dislikeItemData.f77300e;
        }
        if ((i10 & 32) != 0) {
            str5 = dislikeItemData.f77301f;
        }
        if ((i10 & 64) != 0) {
            str6 = dislikeItemData.f77302g;
        }
        if ((i10 & 128) != 0) {
            str7 = dislikeItemData.h;
        }
        if ((i10 & 256) != 0) {
            str8 = dislikeItemData.f77303i;
        }
        if ((i10 & 512) != 0) {
            str9 = dislikeItemData.f77304j;
        }
        if ((i10 & 1024) != 0) {
            str10 = dislikeItemData.f77305k;
        }
        if ((i10 & 2048) != 0) {
            j8 = dislikeItemData.f77306l;
        }
        if ((i10 & 4096) != 0) {
            str11 = dislikeItemData.f77307m;
        }
        if ((i10 & 8192) != 0) {
            str12 = dislikeItemData.f77308n;
        }
        if ((i10 & 16384) != 0) {
            str13 = dislikeItemData.f77309o;
        }
        if ((i10 & 32768) != 0) {
            list = dislikeItemData.f77310p;
        }
        if ((i10 & 65536) != 0) {
            str14 = dislikeItemData.f77311q;
        }
        if ((i10 & 131072) != 0) {
            map = dislikeItemData.f77312r;
        }
        if ((i10 & 262144) != 0) {
            adInfo = dislikeItemData.f77313s;
        }
        if ((i10 & AccessibilityNodeInfoCompat.ACTION_COLLAPSE) != 0) {
            playerArgs = dislikeItemData.f77314t;
        }
        if ((i10 & AccessibilityNodeInfoCompat.ACTION_DISMISS) != 0) {
            upArgsData = dislikeItemData.f77315u;
        }
        if ((i10 & AccessibilityNodeInfoCompat.ACTION_SET_TEXT) != 0) {
            j9 = dislikeItemData.f77316v;
        }
        if ((i10 & 4194304) != 0) {
            argsData = dislikeItemData.f77317w;
        }
        if ((8388608 & i10) != 0) {
            str15 = dislikeItemData.f77318x;
        }
        if ((i10 & 16777216) != 0) {
            str16 = dislikeItemData.f77319y;
        }
        if ((i10 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_HAND_SKELETON_KEYPOINTS_3D) != 0) {
            i7 = dislikeItemData.f77320z;
        }
        if ((i10 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_MULTI_SEGMENT) != 0) {
            holderExtra = dislikeItemData.f77283A;
        }
        if ((i10 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_GAZE_DETECT) != 0) {
            basePegasusData = dislikeItemData.f77284B;
        }
        if ((i10 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_DYNAMIC_GESTURE) != 0) {
            j10 = dislikeItemData.f77285C;
        }
        if ((i10 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_AVATAR_HELPER) != 0) {
            i8 = dislikeItemData.f77286D;
        }
        if ((1073741824 & i10) != 0) {
            dislikeReason = dislikeItemData.f77287E;
        }
        if ((i10 & Integer.MIN_VALUE) != 0) {
            dislikeReason2 = dislikeItemData.f77288F;
        }
        if ((i11 & 1) != 0) {
            list2 = dislikeItemData.f77289G;
        }
        if ((i11 & 2) != 0) {
            list3 = dislikeItemData.f77290H;
        }
        if ((i11 & 4) != 0) {
            feedbackType = dislikeItemData.f77291I;
        }
        if ((i11 & 8) != 0) {
            dislikeRequestRecord = dislikeItemData.f77292J;
        }
        if ((i11 & 16) != 0) {
            i9 = dislikeItemData.f77293K;
        }
        if ((i11 & 32) != 0) {
            holderStyle = dislikeItemData.f77294L;
        }
        if ((i11 & 64) != 0) {
            z6 = dislikeItemData.f77295M;
        }
        return dislikeItemData.copy(j7, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, j8, str11, str12, str13, list, str14, map, adInfo, playerArgs, upArgsData, j9, argsData, str15, str16, i7, holderExtra, basePegasusData, j10, i8, dislikeReason, dislikeReason2, list2, list3, feedbackType, dislikeRequestRecord, i9, holderStyle, z6);
    }

    public final long component1() {
        return this.f77296a;
    }

    @Nullable
    public final String component10() {
        return this.f77304j;
    }

    @Nullable
    public final String component11() {
        return this.f77305k;
    }

    public final long component12() {
        return this.f77306l;
    }

    @Nullable
    public final String component13() {
        return this.f77307m;
    }

    @Nullable
    public final String component14() {
        return this.f77308n;
    }

    @Nullable
    public final String component15() {
        return this.f77309o;
    }

    @Nullable
    public final List<ThreePointItem> component16() {
        return this.f77310p;
    }

    @Nullable
    public final String component17() {
        return this.f77311q;
    }

    @Nullable
    public final Map<String, String> component18() {
        return this.f77312r;
    }

    @Nullable
    public final AdInfo component19() {
        return this.f77313s;
    }

    @Nullable
    public final String component2() {
        return this.f77297b;
    }

    @Nullable
    public final PlayerArgs component20() {
        return this.f77314t;
    }

    @Nullable
    public final UpArgsData component21() {
        return this.f77315u;
    }

    public final long component22() {
        return this.f77316v;
    }

    @Nullable
    public final ArgsData component23() {
        return this.f77317w;
    }

    @Nullable
    public final String component24() {
        return this.f77318x;
    }

    @Nullable
    public final String component25() {
        return this.f77319y;
    }

    public final int component26() {
        return this.f77320z;
    }

    @NotNull
    public final HolderExtra component27() {
        return this.f77283A;
    }

    @Nullable
    public final BasePegasusData component28() {
        return this.f77284B;
    }

    public final long component29() {
        return this.f77285C;
    }

    @Nullable
    public final String component3() {
        return this.f77298c;
    }

    public final int component30() {
        return this.f77286D;
    }

    @Nullable
    public final DislikeReason component31() {
        return this.f77287E;
    }

    @Nullable
    public final DislikeReason component32() {
        return this.f77288F;
    }

    @Nullable
    public final List<DislikeReason> component33() {
        return this.f77289G;
    }

    @Nullable
    public final List<DislikeReason> component34() {
        return this.f77290H;
    }

    @NotNull
    public final FeedbackType component35() {
        return this.f77291I;
    }

    @Nullable
    public final DislikeRequestRecord component36() {
        return this.f77292J;
    }

    public final int component37() {
        return this.f77293K;
    }

    @NotNull
    public final HolderStyle component38() {
        return this.f77294L;
    }

    public final boolean component39() {
        return this.f77295M;
    }

    @Nullable
    public final String component4() {
        return this.f77299d;
    }

    @Nullable
    public final String component5() {
        return this.f77300e;
    }

    @Nullable
    public final String component6() {
        return this.f77301f;
    }

    @Nullable
    public final String component7() {
        return this.f77302g;
    }

    @Nullable
    public final String component8() {
        return this.h;
    }

    @Nullable
    public final String component9() {
        return this.f77303i;
    }

    @NotNull
    public final DislikeItemData copy(long j7, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, long j8, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable List<? extends ThreePointItem> list, @Nullable String str14, @Nullable Map<String, String> map, @Nullable AdInfo adInfo, @Nullable PlayerArgs playerArgs, @Nullable UpArgsData upArgsData, long j9, @Nullable ArgsData argsData, @Nullable String str15, @Nullable String str16, int i7, @NotNull HolderExtra holderExtra, @Nullable BasePegasusData basePegasusData, long j10, int i8, @Nullable DislikeReason dislikeReason, @Nullable DislikeReason dislikeReason2, @Nullable List<? extends DislikeReason> list2, @Nullable List<? extends DislikeReason> list3, @NotNull FeedbackType feedbackType, @Nullable DislikeRequestRecord dislikeRequestRecord, int i9, @NotNull HolderStyle holderStyle, boolean z6) {
        return new DislikeItemData(j7, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, j8, str11, str12, str13, list, str14, map, adInfo, playerArgs, upArgsData, j9, argsData, str15, str16, i7, holderExtra, basePegasusData, j10, i8, dislikeReason, dislikeReason2, list2, list3, feedbackType, dislikeRequestRecord, i9, holderStyle, z6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DislikeItemData)) {
            return false;
        }
        DislikeItemData dislikeItemData = (DislikeItemData) obj;
        return this.f77296a == dislikeItemData.f77296a && Intrinsics.areEqual(this.f77297b, dislikeItemData.f77297b) && Intrinsics.areEqual(this.f77298c, dislikeItemData.f77298c) && Intrinsics.areEqual(this.f77299d, dislikeItemData.f77299d) && Intrinsics.areEqual(this.f77300e, dislikeItemData.f77300e) && Intrinsics.areEqual(this.f77301f, dislikeItemData.f77301f) && Intrinsics.areEqual(this.f77302g, dislikeItemData.f77302g) && Intrinsics.areEqual(this.h, dislikeItemData.h) && Intrinsics.areEqual(this.f77303i, dislikeItemData.f77303i) && Intrinsics.areEqual(this.f77304j, dislikeItemData.f77304j) && Intrinsics.areEqual(this.f77305k, dislikeItemData.f77305k) && this.f77306l == dislikeItemData.f77306l && Intrinsics.areEqual(this.f77307m, dislikeItemData.f77307m) && Intrinsics.areEqual(this.f77308n, dislikeItemData.f77308n) && Intrinsics.areEqual(this.f77309o, dislikeItemData.f77309o) && Intrinsics.areEqual(this.f77310p, dislikeItemData.f77310p) && Intrinsics.areEqual(this.f77311q, dislikeItemData.f77311q) && Intrinsics.areEqual(this.f77312r, dislikeItemData.f77312r) && Intrinsics.areEqual(this.f77313s, dislikeItemData.f77313s) && Intrinsics.areEqual(this.f77314t, dislikeItemData.f77314t) && Intrinsics.areEqual(this.f77315u, dislikeItemData.f77315u) && this.f77316v == dislikeItemData.f77316v && Intrinsics.areEqual(this.f77317w, dislikeItemData.f77317w) && Intrinsics.areEqual(this.f77318x, dislikeItemData.f77318x) && Intrinsics.areEqual(this.f77319y, dislikeItemData.f77319y) && this.f77320z == dislikeItemData.f77320z && Intrinsics.areEqual(this.f77283A, dislikeItemData.f77283A) && Intrinsics.areEqual(this.f77284B, dislikeItemData.f77284B) && this.f77285C == dislikeItemData.f77285C && this.f77286D == dislikeItemData.f77286D && Intrinsics.areEqual(this.f77287E, dislikeItemData.f77287E) && Intrinsics.areEqual(this.f77288F, dislikeItemData.f77288F) && Intrinsics.areEqual(this.f77289G, dislikeItemData.f77289G) && Intrinsics.areEqual(this.f77290H, dislikeItemData.f77290H) && this.f77291I == dislikeItemData.f77291I && Intrinsics.areEqual(this.f77292J, dislikeItemData.f77292J) && this.f77293K == dislikeItemData.f77293K && Intrinsics.areEqual(this.f77294L, dislikeItemData.f77294L) && this.f77295M == dislikeItemData.f77295M;
    }

    @Override // com.bilibili.pegasus.data.base.BasePegasusData
    @Nullable
    public AdInfo getAdInfo() {
        return this.f77313s;
    }

    @Override // com.bilibili.pegasus.data.base.BasePegasusData
    @Nullable
    public ArgsData getArgs() {
        return this.f77317w;
    }

    @Override // com.bilibili.pegasus.data.base.BasePegasusData
    @Nullable
    public String getAvFeature() {
        return this.f77309o;
    }

    @Override // com.bilibili.pegasus.data.base.BasePegasusData
    @Nullable
    public String getCardGoto() {
        return this.h;
    }

    @Override // com.bilibili.pegasus.data.base.BasePegasusData
    @Nullable
    public String getCardType() {
        return this.f77297b;
    }

    @Override // com.bilibili.pegasus.data.base.BasePegasusData
    @Nullable
    public String getCover() {
        return this.f77299d;
    }

    @Override // com.bilibili.pegasus.data.base.BasePegasusData
    @Nullable
    public String getDalaoFeature() {
        return this.f77300e;
    }

    @Nullable
    public final BasePegasusData getDislikeAnchor() {
        return this.f77284B;
    }

    public final int getDislikeCardHeight() {
        return this.f77293K;
    }

    @Override // com.bilibili.pegasus.data.base.BasePegasusData
    @Nullable
    public String getDislikeInfo() {
        return this.f77308n;
    }

    @Override // com.bilibili.pegasus.data.base.BasePegasusData
    @Nullable
    public String getDislikeReportData() {
        return this.f77307m;
    }

    @Nullable
    public final DislikeRequestRecord getDislikeRequestRecord() {
        return this.f77292J;
    }

    public final int getDislikeState() {
        return this.f77286D;
    }

    public final long getDislikeTimestamp() {
        return this.f77285C;
    }

    @NotNull
    public HolderExtra getExtra() {
        return this.f77283A;
    }

    @Override // com.bilibili.pegasus.data.base.BasePegasusData
    @Nullable
    public Map<String, String> getExtraRptFields() {
        return this.f77312r;
    }

    @Override // com.bilibili.pegasus.data.base.BasePegasusData
    @Nullable
    public String getFromType() {
        return this.f77319y;
    }

    @Override // com.bilibili.pegasus.data.base.BasePegasusData
    @Nullable
    public String getGoTo() {
        return this.f77303i;
    }

    public final boolean getHasSecondPanel() {
        return this.f77295M;
    }

    @NotNull
    public HolderStyle getHolderStyle() {
        return this.f77294L;
    }

    @Override // com.bilibili.pegasus.data.base.BasePegasusData
    public long getId() {
        return this.f77316v;
    }

    public long getIdx() {
        return this.f77296a;
    }

    @Override // com.bilibili.pegasus.data.base.BasePegasusData
    public long getMaterialId() {
        return this.f77306l;
    }

    @Override // com.bilibili.pegasus.data.base.BasePegasusData
    @Nullable
    public String getParam() {
        return this.f77318x;
    }

    @Override // com.bilibili.pegasus.data.base.BasePegasusData
    @Nullable
    public PlayerArgs getPlayerArgs() {
        return this.f77314t;
    }

    @Override // com.bilibili.pegasus.data.base.BasePegasusData
    @Nullable
    public String getPosRecUniqueId() {
        return this.f77305k;
    }

    @Nullable
    public final DislikeReason getSelectedDislikeReason() {
        return this.f77287E;
    }

    @Nullable
    public final List<DislikeReason> getSelectedDislikeReasonList() {
        return this.f77289G;
    }

    @NotNull
    public final FeedbackType getSelectedDislikeType() {
        return this.f77291I;
    }

    @Nullable
    public final DislikeReason getSelectedFeedbackReason() {
        return this.f77288F;
    }

    @Nullable
    public final List<DislikeReason> getSelectedFeedbackReasonList() {
        return this.f77290H;
    }

    @Override // com.bilibili.pegasus.data.base.BasePegasusData
    @Nullable
    public String getSubtitle() {
        return this.f77302g;
    }

    @Override // com.bilibili.pegasus.data.base.BasePegasusData
    @Nullable
    public List<ThreePointItem> getThreePoint() {
        return this.f77310p;
    }

    @Override // com.bilibili.pegasus.data.base.BasePegasusData
    @Nullable
    public String getThreePointV() {
        return this.f77311q;
    }

    @Override // com.bilibili.pegasus.data.base.BasePegasusData
    @Nullable
    public String getTitle() {
        return this.f77298c;
    }

    @Override // com.bilibili.pegasus.data.base.BasePegasusData
    @Nullable
    public String getTrackId() {
        return this.f77304j;
    }

    @Override // com.bilibili.pegasus.data.base.BasePegasusData
    @Nullable
    public UpArgsData getUpArgs() {
        return this.f77315u;
    }

    @Override // com.bilibili.pegasus.data.base.BasePegasusData
    @Nullable
    public String getUri() {
        return this.f77301f;
    }

    @Override // com.bilibili.pegasus.data.base.BasePegasusData
    public int getZeroSignal() {
        return this.f77320z;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.f77296a);
        String str = this.f77297b;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.f77298c;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.f77299d;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.f77300e;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.f77301f;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.f77302g;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.h;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.f77303i;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.f77304j;
        int iHashCode10 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.f77305k;
        int iA = C3554n0.a(((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str10 == null ? 0 : str10.hashCode())) * 31, 31, this.f77306l);
        String str11 = this.f77307m;
        int iHashCode11 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.f77308n;
        int iHashCode12 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.f77309o;
        int iHashCode13 = str13 == null ? 0 : str13.hashCode();
        List<ThreePointItem> list = this.f77310p;
        int iHashCode14 = list == null ? 0 : list.hashCode();
        String str14 = this.f77311q;
        int iHashCode15 = str14 == null ? 0 : str14.hashCode();
        Map<String, String> map = this.f77312r;
        int iHashCode16 = map == null ? 0 : map.hashCode();
        AdInfo adInfo = this.f77313s;
        int iHashCode17 = adInfo == null ? 0 : adInfo.hashCode();
        PlayerArgs playerArgs = this.f77314t;
        int iHashCode18 = playerArgs == null ? 0 : playerArgs.hashCode();
        UpArgsData upArgsData = this.f77315u;
        int iA2 = C3554n0.a((((((((((((((((((iA + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + (upArgsData == null ? 0 : upArgsData.hashCode())) * 31, 31, this.f77316v);
        ArgsData argsData = this.f77317w;
        int iHashCode19 = argsData == null ? 0 : argsData.hashCode();
        String str15 = this.f77318x;
        int iHashCode20 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.f77319y;
        int iA3 = T.a(this.f77283A, I.a(this.f77320z, (((((iA2 + iHashCode19) * 31) + iHashCode20) * 31) + (str16 == null ? 0 : str16.hashCode())) * 31, 31), 31);
        BasePegasusData basePegasusData = this.f77284B;
        int iA4 = I.a(this.f77286D, C3554n0.a((iA3 + (basePegasusData == null ? 0 : basePegasusData.hashCode())) * 31, 31, this.f77285C), 31);
        DislikeReason dislikeReason = this.f77287E;
        int iHashCode21 = dislikeReason == null ? 0 : dislikeReason.hashCode();
        DislikeReason dislikeReason2 = this.f77288F;
        int iHashCode22 = dislikeReason2 == null ? 0 : dislikeReason2.hashCode();
        List<? extends DislikeReason> list2 = this.f77289G;
        int iHashCode23 = list2 == null ? 0 : list2.hashCode();
        List<? extends DislikeReason> list3 = this.f77290H;
        int iHashCode24 = list3 == null ? 0 : list3.hashCode();
        int iHashCode25 = this.f77291I.hashCode();
        DislikeRequestRecord dislikeRequestRecord = this.f77292J;
        return Boolean.hashCode(this.f77295M) + C7136a.a(this.f77294L, I.a(this.f77293K, (((iHashCode25 + ((((((((iA4 + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31)) * 31) + (dislikeRequestRecord == null ? 0 : dislikeRequestRecord.hashCode())) * 31, 31), 31);
    }

    public final void mutateDislikeRequestRecord(@NotNull DislikeRequestRecord dislikeRequestRecord) {
        DislikeRequestRecord dislikeRequestRecordA = dislikeRequestRecord;
        if (dislikeRequestRecord instanceof DislikeRequestRecord.d) {
            DislikeRequestRecord dislikeRequestRecord2 = this.f77292J;
            dislikeRequestRecordA = dislikeRequestRecord2 instanceof DislikeRequestRecord.d ? ((DislikeRequestRecord.d) dislikeRequestRecord2).a((DislikeRequestRecord.d) dislikeRequestRecord) : (DislikeRequestRecord.d) dislikeRequestRecord;
        }
        this.f77292J = dislikeRequestRecordA;
    }

    public final void setDislikeCardHeight(int i7) {
        this.f77293K = i7;
    }

    public final void setDislikeRequestRecord(@Nullable DislikeRequestRecord dislikeRequestRecord) {
        this.f77292J = dislikeRequestRecord;
    }

    public final void setDislikeState(int i7) {
        this.f77286D = i7;
    }

    public final void setDislikeTimestamp(long j7) {
        this.f77285C = j7;
    }

    public final void setHasSecondPanel(boolean z6) {
        this.f77295M = z6;
    }

    public final void setSelectedDislikeReason(@Nullable DislikeReason dislikeReason) {
        this.f77287E = dislikeReason;
    }

    public final void setSelectedDislikeReasonList(@Nullable List<? extends DislikeReason> list) {
        this.f77289G = list;
    }

    public final void setSelectedDislikeType(@NotNull FeedbackType feedbackType) {
        this.f77291I = feedbackType;
    }

    public final void setSelectedFeedbackReason(@Nullable DislikeReason dislikeReason) {
        this.f77288F = dislikeReason;
    }

    public final void setSelectedFeedbackReasonList(@Nullable List<? extends DislikeReason> list) {
        this.f77290H = list;
    }

    public void setThreePointV(@Nullable String str) {
        this.f77311q = str;
    }

    @NotNull
    public String toString() {
        long j7 = this.f77296a;
        String str = this.f77297b;
        String str2 = this.f77298c;
        String str3 = this.f77299d;
        String str4 = this.f77300e;
        String str5 = this.f77301f;
        String str6 = this.f77302g;
        String str7 = this.h;
        String str8 = this.f77303i;
        String str9 = this.f77304j;
        String str10 = this.f77305k;
        long j8 = this.f77306l;
        String str11 = this.f77307m;
        String str12 = this.f77308n;
        String str13 = this.f77309o;
        List<ThreePointItem> list = this.f77310p;
        String str14 = this.f77311q;
        Map<String, String> map = this.f77312r;
        AdInfo adInfo = this.f77313s;
        PlayerArgs playerArgs = this.f77314t;
        UpArgsData upArgsData = this.f77315u;
        long j9 = this.f77316v;
        ArgsData argsData = this.f77317w;
        String str15 = this.f77318x;
        String str16 = this.f77319y;
        int i7 = this.f77320z;
        long j10 = this.f77285C;
        int i8 = this.f77286D;
        DislikeReason dislikeReason = this.f77287E;
        DislikeReason dislikeReason2 = this.f77288F;
        List<? extends DislikeReason> list2 = this.f77289G;
        List<? extends DislikeReason> list3 = this.f77290H;
        FeedbackType feedbackType = this.f77291I;
        DislikeRequestRecord dislikeRequestRecord = this.f77292J;
        int i9 = this.f77293K;
        boolean z6 = this.f77295M;
        StringBuilder sbA = n.a(j7, "DislikeItemData(idx=", ", cardType=", str);
        B.a(", title=", str2, ", cover=", str3, sbA);
        B.a(", dalaoFeature=", str4, ", uri=", str5, sbA);
        B.a(", subtitle=", str6, ", cardGoto=", str7, sbA);
        B.a(", goTo=", str8, ", trackId=", str9, sbA);
        b.b(", posRecUniqueId=", str10, ", materialId=", sbA);
        d.a(j8, ", dislikeReportData=", str11, sbA);
        B.a(", dislikeInfo=", str12, ", avFeature=", str13, sbA);
        h.a(", threePoint=", ", threePointV=", str14, sbA, list);
        fp0.d.a(sbA, ", extraRptFields=", map, ", adInfo=", adInfo);
        C7138c.a(sbA, ", playerArgs=", playerArgs, ", upArgs=", upArgsData);
        z.a(j9, ", id=", ", args=", sbA);
        C7137b.a(sbA, argsData, ", param=", str15, ", fromType=");
        e.b(i7, str16, ", zeroSignal=", ", extra=", sbA);
        sbA.append(this.f77283A);
        sbA.append(", dislikeAnchor=");
        sbA.append(this.f77284B);
        sbA.append(", dislikeTimestamp=");
        sbA.append(j10);
        sbA.append(", dislikeState=");
        sbA.append(i8);
        sbA.append(", selectedDislikeReason=");
        sbA.append(dislikeReason);
        sbA.append(", selectedFeedbackReason=");
        sbA.append(dislikeReason2);
        sbA.append(", selectedDislikeReasonList=");
        sbA.append(list2);
        sbA.append(", selectedFeedbackReasonList=");
        sbA.append(list3);
        sbA.append(", selectedDislikeType=");
        sbA.append(feedbackType);
        sbA.append(", dislikeRequestRecord=");
        sbA.append(dislikeRequestRecord);
        sbA.append(", dislikeCardHeight=");
        sbA.append(i9);
        sbA.append(", holderStyle=");
        sbA.append(this.f77294L);
        sbA.append(", hasSecondPanel=");
        sbA.append(z6);
        sbA.append(")");
        return sbA.toString();
    }
}
