package com.bilibili.opd.app.bizcommon.radar.data;

import G0.b;
import H0.e;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.O;
import androidx.core.view.C4559c;
import androidx.core.view.GravityCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.paging.M;
import androidx.room.B;
import com.alibaba.fastjson.annotation.JSONField;
import com.bilibili.ad.adview.liveroom.answer.fragment.vm.v;
import com.bilibili.ad.adview.liveroom.answer.fragment.vm.w;
import com.bilibili.lib.foundation.util.Objects;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.opd.app.bizcommon.radar.ui.data.RadarPrizeBean;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/data/RadarTriggerContent.class */
@StabilityInferred(parameters = 0)
@Keep
public final class RadarTriggerContent implements Parcelable {

    @Nullable
    private List<RadarTriggerAction> actions;

    @JSONField(deserialize = false, serialize = false)
    @Nullable
    private AttachPageInfo attachInfo;

    @Nullable
    private String closeType;

    @JSONField(deserialize = false, serialize = false)
    @Nullable
    private HashMap<String, String> convertReportMap;

    @Nullable
    private String couponBgImg;

    @Nullable
    private String couponButtonImg;

    @Nullable
    private String couponTextColor;
    private long delay;
    private long duration;

    @Nullable
    private String entryType;

    @Nullable
    private String extra;

    @Nullable
    private Boolean fullScreen;

    @Nullable
    private String group;

    @Nullable
    private String id;

    @Nullable
    private String imgUrl;
    private long interval;

    @Nullable
    private List<RecommendGoodsBean> itemListObj;

    @Nullable
    private String jumpAction;

    @Nullable
    private String jumpUrl;

    @Nullable
    private String logo;

    @Nullable
    private MaCouponVO maCouponVO;

    @Nullable
    private String message;
    private int noUrlClickClose;

    @Nullable
    private String popType;
    private int position;

    @Nullable
    private RadarPrizeBean prizeDetail;

    @Nullable
    private HashMap<?, ?> reportParams;
    private boolean showClose;

    @Nullable
    private String template;

    @Nullable
    private String title;

    @Nullable
    private String triggerScene;
    private boolean userRelation;

    @Nullable
    private String uuid;

    @Nullable
    private String vibrationType;

    @NotNull
    public static final a CREATOR = new Object();
    public static final int $stable = 8;

    /* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/data/RadarTriggerContent$a.class */
    public static final class a implements Parcelable.Creator<RadarTriggerContent> {
        @Override // android.os.Parcelable.Creator
        public final RadarTriggerContent createFromParcel(Parcel parcel) {
            return new RadarTriggerContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final RadarTriggerContent[] newArray(int i7) {
            return new RadarTriggerContent[i7];
        }
    }

    public RadarTriggerContent() {
        this(null, null, null, null, null, 0L, 0L, null, null, null, 0, 0, null, false, 0L, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 3, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RadarTriggerContent(@NotNull Parcel parcel) {
        String string = parcel.readString();
        string = string == null ? "" : string;
        String string2 = parcel.readString();
        string2 = string2 == null ? "" : string2;
        String string3 = parcel.readString();
        string3 = string3 == null ? "" : string3;
        String string4 = parcel.readString();
        string4 = string4 == null ? "" : string4;
        String string5 = parcel.readString();
        string5 = string5 == null ? "" : string5;
        long j7 = parcel.readLong();
        long j8 = parcel.readLong();
        List listCreateTypedArrayList = parcel.createTypedArrayList(RadarTriggerAction.CREATOR);
        listCreateTypedArrayList = listCreateTypedArrayList == null ? CollectionsKt.emptyList() : listCreateTypedArrayList;
        String string6 = parcel.readString();
        string6 = string6 == null ? "" : string6;
        String string7 = parcel.readString();
        string7 = string7 == null ? "" : string7;
        int i7 = parcel.readInt();
        int i8 = parcel.readInt();
        String string8 = parcel.readString();
        string8 = string8 == null ? "" : string8;
        boolean z6 = parcel.readByte() == 1;
        long j9 = parcel.readLong();
        boolean z7 = parcel.readByte() == 1;
        String string9 = parcel.readString();
        String string10 = parcel.readString();
        String string11 = parcel.readString();
        String string12 = parcel.readString();
        String string13 = parcel.readString();
        RadarPrizeBean radarPrizeBean = (RadarPrizeBean) parcel.readParcelable(RadarPrizeBean.class.getClassLoader());
        String string14 = parcel.readString();
        List listCreateTypedArrayList2 = parcel.createTypedArrayList(RecommendGoodsBean.CREATOR);
        listCreateTypedArrayList2 = listCreateTypedArrayList2 == null ? CollectionsKt.emptyList() : listCreateTypedArrayList2;
        Object value = parcel.readValue(HashMap.class.getClassLoader());
        HashMap map = value instanceof HashMap ? (HashMap) value : null;
        boolean z8 = parcel.readByte() == 1;
        String string15 = parcel.readString();
        String string16 = parcel.readString();
        String string17 = parcel.readString();
        String string18 = parcel.readString();
        String string19 = parcel.readString();
        MaCouponVO maCouponVO = (MaCouponVO) parcel.readParcelable(MaCouponVO.class.getClassLoader());
        AttachPageInfo attachPageInfo = (AttachPageInfo) parcel.readParcelable(AttachPageInfo.class.getClassLoader());
        Object value2 = parcel.readValue(HashMap.class.getClassLoader());
        this(string, string2, string3, string4, string5, j7, j8, listCreateTypedArrayList, string6, string7, i7, i8, string8, z6, j9, z7, string9, string10, string11, string12, string13, radarPrizeBean, string14, listCreateTypedArrayList2, map, Boolean.valueOf(z8), string15, string16, string17, string18, string19, maCouponVO, attachPageInfo, value2 instanceof HashMap ? (HashMap) value2 : null);
    }

    public RadarTriggerContent(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, long j7, long j8, @Nullable List<RadarTriggerAction> list, @Nullable String str6, @Nullable String str7, int i7, int i8, @Nullable String str8, boolean z6, long j9, boolean z7, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable RadarPrizeBean radarPrizeBean, @Nullable String str14, @Nullable List<RecommendGoodsBean> list2, @Nullable HashMap<?, ?> map, @Nullable Boolean bool, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable MaCouponVO maCouponVO, @Nullable AttachPageInfo attachPageInfo, @Nullable HashMap<String, String> map2) {
        this.id = str;
        this.group = str2;
        this.jumpAction = str3;
        this.title = str4;
        this.message = str5;
        this.interval = j7;
        this.duration = j8;
        this.actions = list;
        this.uuid = str6;
        this.vibrationType = str7;
        this.position = i7;
        this.noUrlClickClose = i8;
        this.imgUrl = str8;
        this.showClose = z6;
        this.delay = j9;
        this.userRelation = z7;
        this.extra = str9;
        this.logo = str10;
        this.jumpUrl = str11;
        this.entryType = str12;
        this.closeType = str13;
        this.prizeDetail = radarPrizeBean;
        this.triggerScene = str14;
        this.itemListObj = list2;
        this.reportParams = map;
        this.fullScreen = bool;
        this.popType = str15;
        this.template = str16;
        this.couponTextColor = str17;
        this.couponBgImg = str18;
        this.couponButtonImg = str19;
        this.maCouponVO = maCouponVO;
        this.attachInfo = attachPageInfo;
        this.convertReportMap = map2;
    }

    public /* synthetic */ RadarTriggerContent(String str, String str2, String str3, String str4, String str5, long j7, long j8, List list, String str6, String str7, int i7, int i8, String str8, boolean z6, long j9, boolean z7, String str9, String str10, String str11, String str12, String str13, RadarPrizeBean radarPrizeBean, String str14, List list2, HashMap map, Boolean bool, String str15, String str16, String str17, String str18, String str19, MaCouponVO maCouponVO, AttachPageInfo attachPageInfo, HashMap map2, int i9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? "" : str, (i9 & 2) != 0 ? "" : str2, (i9 & 4) != 0 ? "" : str3, (i9 & 8) != 0 ? "" : str4, (i9 & 16) != 0 ? "" : str5, (i9 & 32) != 0 ? 0L : j7, (i9 & 64) != 0 ? 0L : j8, (i9 & 128) != 0 ? CollectionsKt.emptyList() : list, (i9 & 256) != 0 ? "" : str6, (i9 & 512) != 0 ? "" : str7, (i9 & 1024) != 0 ? 0 : i7, (i9 & 2048) != 0 ? 1 : i8, (i9 & 4096) != 0 ? "" : str8, (i9 & 8192) != 0 ? false : z6, (i9 & 16384) != 0 ? 0L : j9, (32768 & i9) != 0 ? false : z7, (i9 & 65536) != 0 ? "" : str9, (i9 & 131072) != 0 ? "" : str10, (i9 & 262144) != 0 ? "" : str11, (i9 & AccessibilityNodeInfoCompat.ACTION_COLLAPSE) != 0 ? "" : str12, (i9 & AccessibilityNodeInfoCompat.ACTION_DISMISS) != 0 ? "" : str13, (i9 & AccessibilityNodeInfoCompat.ACTION_SET_TEXT) != 0 ? null : radarPrizeBean, (i9 & 4194304) != 0 ? "" : str14, (i9 & GravityCompat.RELATIVE_LAYOUT_DIRECTION) != 0 ? null : list2, (i9 & 16777216) != 0 ? null : map, (i9 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_HAND_SKELETON_KEYPOINTS_3D) != 0 ? Boolean.FALSE : bool, (i9 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_MULTI_SEGMENT) != 0 ? null : str15, (i9 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_GAZE_DETECT) != 0 ? null : str16, (i9 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_DYNAMIC_GESTURE) != 0 ? "" : str17, (i9 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_AVATAR_HELPER) != 0 ? "" : str18, (i9 & BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE) != 0 ? "" : str19, (i9 & Integer.MIN_VALUE) != 0 ? null : maCouponVO, (i10 & 1) != 0 ? null : attachPageInfo, (i10 & 2) != 0 ? null : map2);
    }

    public static /* synthetic */ void appendEventNameReportParam$default(RadarTriggerContent radarTriggerContent, String str, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            AttachPageInfo attachPageInfo = radarTriggerContent.attachInfo;
            str = attachPageInfo != null ? attachPageInfo.getEventName() : null;
        }
        radarTriggerContent.appendEventNameReportParam(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RadarTriggerContent copy$default(RadarTriggerContent radarTriggerContent, String str, String str2, String str3, String str4, String str5, long j7, long j8, List list, String str6, String str7, int i7, int i8, String str8, boolean z6, long j9, boolean z7, String str9, String str10, String str11, String str12, String str13, RadarPrizeBean radarPrizeBean, String str14, List list2, HashMap map, Boolean bool, String str15, String str16, String str17, String str18, String str19, MaCouponVO maCouponVO, AttachPageInfo attachPageInfo, HashMap map2, int i9, int i10, Object obj) {
        if ((i9 & 1) != 0) {
            str = radarTriggerContent.id;
        }
        if ((i9 & 2) != 0) {
            str2 = radarTriggerContent.group;
        }
        if ((i9 & 4) != 0) {
            str3 = radarTriggerContent.jumpAction;
        }
        if ((i9 & 8) != 0) {
            str4 = radarTriggerContent.title;
        }
        if ((i9 & 16) != 0) {
            str5 = radarTriggerContent.message;
        }
        if ((i9 & 32) != 0) {
            j7 = radarTriggerContent.interval;
        }
        if ((i9 & 64) != 0) {
            j8 = radarTriggerContent.duration;
        }
        if ((i9 & 128) != 0) {
            list = radarTriggerContent.actions;
        }
        if ((i9 & 256) != 0) {
            str6 = radarTriggerContent.uuid;
        }
        if ((i9 & 512) != 0) {
            str7 = radarTriggerContent.vibrationType;
        }
        if ((i9 & 1024) != 0) {
            i7 = radarTriggerContent.position;
        }
        if ((i9 & 2048) != 0) {
            i8 = radarTriggerContent.noUrlClickClose;
        }
        if ((i9 & 4096) != 0) {
            str8 = radarTriggerContent.imgUrl;
        }
        if ((i9 & 8192) != 0) {
            z6 = radarTriggerContent.showClose;
        }
        if ((i9 & 16384) != 0) {
            j9 = radarTriggerContent.delay;
        }
        if ((i9 & 32768) != 0) {
            z7 = radarTriggerContent.userRelation;
        }
        if ((65536 & i9) != 0) {
            str9 = radarTriggerContent.extra;
        }
        if ((i9 & 131072) != 0) {
            str10 = radarTriggerContent.logo;
        }
        if ((i9 & 262144) != 0) {
            str11 = radarTriggerContent.jumpUrl;
        }
        if ((i9 & AccessibilityNodeInfoCompat.ACTION_COLLAPSE) != 0) {
            str12 = radarTriggerContent.entryType;
        }
        if ((i9 & AccessibilityNodeInfoCompat.ACTION_DISMISS) != 0) {
            str13 = radarTriggerContent.closeType;
        }
        if ((i9 & AccessibilityNodeInfoCompat.ACTION_SET_TEXT) != 0) {
            radarPrizeBean = radarTriggerContent.prizeDetail;
        }
        if ((i9 & 4194304) != 0) {
            str14 = radarTriggerContent.triggerScene;
        }
        if ((i9 & GravityCompat.RELATIVE_LAYOUT_DIRECTION) != 0) {
            list2 = radarTriggerContent.itemListObj;
        }
        if ((i9 & 16777216) != 0) {
            map = radarTriggerContent.reportParams;
        }
        if ((i9 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_HAND_SKELETON_KEYPOINTS_3D) != 0) {
            bool = radarTriggerContent.fullScreen;
        }
        if ((i9 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_MULTI_SEGMENT) != 0) {
            str15 = radarTriggerContent.popType;
        }
        if ((i9 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_GAZE_DETECT) != 0) {
            str16 = radarTriggerContent.template;
        }
        if ((i9 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_DYNAMIC_GESTURE) != 0) {
            str17 = radarTriggerContent.couponTextColor;
        }
        if ((i9 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_AVATAR_HELPER) != 0) {
            str18 = radarTriggerContent.couponBgImg;
        }
        if ((i9 & BLMobileHumanActionNative.BL_MOBILE_DETECT_TONGUE) != 0) {
            str19 = radarTriggerContent.couponButtonImg;
        }
        if ((i9 & Integer.MIN_VALUE) != 0) {
            maCouponVO = radarTriggerContent.maCouponVO;
        }
        if ((i10 & 1) != 0) {
            attachPageInfo = radarTriggerContent.attachInfo;
        }
        if ((i10 & 2) != 0) {
            map2 = radarTriggerContent.convertReportMap;
        }
        return radarTriggerContent.copy(str, str2, str3, str4, str5, j7, j8, list, str6, str7, i7, i8, str8, z6, j9, z7, str9, str10, str11, str12, str13, radarPrizeBean, str14, list2, map, bool, str15, str16, str17, str18, str19, maCouponVO, attachPageInfo, map2);
    }

    public final void appendEventNameReportParam(@Nullable String str) {
        if (str == null || StringsKt.isBlank(str)) {
            return;
        }
        HashMap<String, String> map = this.convertReportMap;
        HashMap<String, String> map2 = map;
        if (map == null) {
            map2 = new HashMap<>();
            this.convertReportMap = map2;
        }
        map2.put("eventName", str);
    }

    @Nullable
    public final String component1() {
        return this.id;
    }

    @Nullable
    public final String component10() {
        return this.vibrationType;
    }

    public final int component11() {
        return this.position;
    }

    public final int component12() {
        return this.noUrlClickClose;
    }

    @Nullable
    public final String component13() {
        return this.imgUrl;
    }

    public final boolean component14() {
        return this.showClose;
    }

    public final long component15() {
        return this.delay;
    }

    public final boolean component16() {
        return this.userRelation;
    }

    @Nullable
    public final String component17() {
        return this.extra;
    }

    @Nullable
    public final String component18() {
        return this.logo;
    }

    @Nullable
    public final String component19() {
        return this.jumpUrl;
    }

    @Nullable
    public final String component2() {
        return this.group;
    }

    @Nullable
    public final String component20() {
        return this.entryType;
    }

    @Nullable
    public final String component21() {
        return this.closeType;
    }

    @Nullable
    public final RadarPrizeBean component22() {
        return this.prizeDetail;
    }

    @Nullable
    public final String component23() {
        return this.triggerScene;
    }

    @Nullable
    public final List<RecommendGoodsBean> component24() {
        return this.itemListObj;
    }

    @Nullable
    public final HashMap<?, ?> component25() {
        return this.reportParams;
    }

    @Nullable
    public final Boolean component26() {
        return this.fullScreen;
    }

    @Nullable
    public final String component27() {
        return this.popType;
    }

    @Nullable
    public final String component28() {
        return this.template;
    }

    @Nullable
    public final String component29() {
        return this.couponTextColor;
    }

    @Nullable
    public final String component3() {
        return this.jumpAction;
    }

    @Nullable
    public final String component30() {
        return this.couponBgImg;
    }

    @Nullable
    public final String component31() {
        return this.couponButtonImg;
    }

    @Nullable
    public final MaCouponVO component32() {
        return this.maCouponVO;
    }

    @Nullable
    public final AttachPageInfo component33() {
        return this.attachInfo;
    }

    @Nullable
    public final HashMap<String, String> component34() {
        return this.convertReportMap;
    }

    @Nullable
    public final String component4() {
        return this.title;
    }

    @Nullable
    public final String component5() {
        return this.message;
    }

    public final long component6() {
        return this.interval;
    }

    public final long component7() {
        return this.duration;
    }

    @Nullable
    public final List<RadarTriggerAction> component8() {
        return this.actions;
    }

    @Nullable
    public final String component9() {
        return this.uuid;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final HashMap<String, String> convertReportMap(@Nullable Map<?, ?> map) {
        Set<Map.Entry<?, ?>> setEntrySet;
        HashMap<String, String> map2 = new HashMap<>();
        if (map != null && (setEntrySet = map.entrySet()) != null) {
            Iterator<T> it = setEntrySet.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Object key = entry.getKey();
                Object value = entry.getValue();
                if ((key instanceof String) && ((value instanceof String) || (value instanceof Number) || (value instanceof Map))) {
                    map2.put(key, Objects.toJsonString(value));
                }
            }
        }
        return map2;
    }

    @NotNull
    public final RadarTriggerContent copy(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, long j7, long j8, @Nullable List<RadarTriggerAction> list, @Nullable String str6, @Nullable String str7, int i7, int i8, @Nullable String str8, boolean z6, long j9, boolean z7, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable RadarPrizeBean radarPrizeBean, @Nullable String str14, @Nullable List<RecommendGoodsBean> list2, @Nullable HashMap<?, ?> map, @Nullable Boolean bool, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable MaCouponVO maCouponVO, @Nullable AttachPageInfo attachPageInfo, @Nullable HashMap<String, String> map2) {
        return new RadarTriggerContent(str, str2, str3, str4, str5, j7, j8, list, str6, str7, i7, i8, str8, z6, j9, z7, str9, str10, str11, str12, str13, radarPrizeBean, str14, list2, map, bool, str15, str16, str17, str18, str19, maCouponVO, attachPageInfo, map2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RadarTriggerContent)) {
            return false;
        }
        RadarTriggerContent radarTriggerContent = (RadarTriggerContent) obj;
        return Intrinsics.areEqual(this.id, radarTriggerContent.id) && Intrinsics.areEqual(this.group, radarTriggerContent.group) && Intrinsics.areEqual(this.jumpAction, radarTriggerContent.jumpAction) && Intrinsics.areEqual(this.title, radarTriggerContent.title) && Intrinsics.areEqual(this.message, radarTriggerContent.message) && this.interval == radarTriggerContent.interval && this.duration == radarTriggerContent.duration && Intrinsics.areEqual(this.actions, radarTriggerContent.actions) && Intrinsics.areEqual(this.uuid, radarTriggerContent.uuid) && Intrinsics.areEqual(this.vibrationType, radarTriggerContent.vibrationType) && this.position == radarTriggerContent.position && this.noUrlClickClose == radarTriggerContent.noUrlClickClose && Intrinsics.areEqual(this.imgUrl, radarTriggerContent.imgUrl) && this.showClose == radarTriggerContent.showClose && this.delay == radarTriggerContent.delay && this.userRelation == radarTriggerContent.userRelation && Intrinsics.areEqual(this.extra, radarTriggerContent.extra) && Intrinsics.areEqual(this.logo, radarTriggerContent.logo) && Intrinsics.areEqual(this.jumpUrl, radarTriggerContent.jumpUrl) && Intrinsics.areEqual(this.entryType, radarTriggerContent.entryType) && Intrinsics.areEqual(this.closeType, radarTriggerContent.closeType) && Intrinsics.areEqual(this.prizeDetail, radarTriggerContent.prizeDetail) && Intrinsics.areEqual(this.triggerScene, radarTriggerContent.triggerScene) && Intrinsics.areEqual(this.itemListObj, radarTriggerContent.itemListObj) && Intrinsics.areEqual(this.reportParams, radarTriggerContent.reportParams) && Intrinsics.areEqual(this.fullScreen, radarTriggerContent.fullScreen) && Intrinsics.areEqual(this.popType, radarTriggerContent.popType) && Intrinsics.areEqual(this.template, radarTriggerContent.template) && Intrinsics.areEqual(this.couponTextColor, radarTriggerContent.couponTextColor) && Intrinsics.areEqual(this.couponBgImg, radarTriggerContent.couponBgImg) && Intrinsics.areEqual(this.couponButtonImg, radarTriggerContent.couponButtonImg) && Intrinsics.areEqual(this.maCouponVO, radarTriggerContent.maCouponVO) && Intrinsics.areEqual(this.attachInfo, radarTriggerContent.attachInfo) && Intrinsics.areEqual(this.convertReportMap, radarTriggerContent.convertReportMap);
    }

    @Nullable
    public final List<RadarTriggerAction> getActions() {
        return this.actions;
    }

    @Nullable
    public final AttachPageInfo getAttachInfo() {
        return this.attachInfo;
    }

    @Nullable
    public final String getCloseType() {
        return this.closeType;
    }

    @Nullable
    public final HashMap<String, String> getConvertReportMap() {
        return this.convertReportMap;
    }

    @Nullable
    public final String getCouponBgImg() {
        return this.couponBgImg;
    }

    @Nullable
    public final String getCouponButtonImg() {
        return this.couponButtonImg;
    }

    @Nullable
    public final String getCouponTextColor() {
        return this.couponTextColor;
    }

    public final long getDelay() {
        return this.delay;
    }

    public final long getDuration() {
        return this.duration;
    }

    @Nullable
    public final String getEntryType() {
        return this.entryType;
    }

    @Nullable
    public final String getExtra() {
        return this.extra;
    }

    @Nullable
    public final Boolean getFullScreen() {
        return this.fullScreen;
    }

    @Nullable
    public final String getGroup() {
        return this.group;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getImgUrl() {
        return this.imgUrl;
    }

    public final long getInterval() {
        return this.interval;
    }

    @Nullable
    public final List<RecommendGoodsBean> getItemListObj() {
        return this.itemListObj;
    }

    @Nullable
    public final String getJumpAction() {
        return this.jumpAction;
    }

    @Nullable
    public final String getJumpUrl() {
        return this.jumpUrl;
    }

    @Nullable
    public final String getLogo() {
        return this.logo;
    }

    @Nullable
    public final MaCouponVO getMaCouponVO() {
        return this.maCouponVO;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    public final int getNoUrlClickClose() {
        return this.noUrlClickClose;
    }

    @Nullable
    public final String getPopType() {
        return this.popType;
    }

    public final int getPosition() {
        return this.position;
    }

    @Nullable
    public final RadarPrizeBean getPrizeDetail() {
        return this.prizeDetail;
    }

    @Nullable
    public final HashMap<?, ?> getReportParams() {
        return this.reportParams;
    }

    public final boolean getShowClose() {
        return this.showClose;
    }

    @Nullable
    public final String getTemplate() {
        return this.template;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getTriggerScene() {
        return this.triggerScene;
    }

    public final boolean getUserRelation() {
        return this.userRelation;
    }

    @Nullable
    public final String getUuid() {
        return this.uuid;
    }

    @Nullable
    public final String getVibrationType() {
        return this.vibrationType;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.group;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.jumpAction;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.title;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.message;
        int iA = C3554n0.a(C3554n0.a(((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.interval), 31, this.duration);
        List<RadarTriggerAction> list = this.actions;
        int iHashCode6 = list == null ? 0 : list.hashCode();
        String str6 = this.uuid;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.vibrationType;
        int iA2 = I.a(this.noUrlClickClose, I.a(this.position, (((((iA + iHashCode6) * 31) + iHashCode7) * 31) + (str7 == null ? 0 : str7.hashCode())) * 31, 31), 31);
        String str8 = this.imgUrl;
        int iA3 = z.a(C3554n0.a(z.a((iA2 + (str8 == null ? 0 : str8.hashCode())) * 31, 31, this.showClose), 31, this.delay), 31, this.userRelation);
        String str9 = this.extra;
        int iHashCode8 = str9 == null ? 0 : str9.hashCode();
        String str10 = this.logo;
        int iHashCode9 = str10 == null ? 0 : str10.hashCode();
        String str11 = this.jumpUrl;
        int iHashCode10 = str11 == null ? 0 : str11.hashCode();
        String str12 = this.entryType;
        int iHashCode11 = str12 == null ? 0 : str12.hashCode();
        String str13 = this.closeType;
        int iHashCode12 = str13 == null ? 0 : str13.hashCode();
        RadarPrizeBean radarPrizeBean = this.prizeDetail;
        int iHashCode13 = radarPrizeBean == null ? 0 : radarPrizeBean.hashCode();
        String str14 = this.triggerScene;
        int iHashCode14 = str14 == null ? 0 : str14.hashCode();
        List<RecommendGoodsBean> list2 = this.itemListObj;
        int iHashCode15 = list2 == null ? 0 : list2.hashCode();
        HashMap<?, ?> map = this.reportParams;
        int iHashCode16 = map == null ? 0 : map.hashCode();
        Boolean bool = this.fullScreen;
        int iHashCode17 = bool == null ? 0 : bool.hashCode();
        String str15 = this.popType;
        int iHashCode18 = str15 == null ? 0 : str15.hashCode();
        String str16 = this.template;
        int iHashCode19 = str16 == null ? 0 : str16.hashCode();
        String str17 = this.couponTextColor;
        int iHashCode20 = str17 == null ? 0 : str17.hashCode();
        String str18 = this.couponBgImg;
        int iHashCode21 = str18 == null ? 0 : str18.hashCode();
        String str19 = this.couponButtonImg;
        int iHashCode22 = str19 == null ? 0 : str19.hashCode();
        MaCouponVO maCouponVO = this.maCouponVO;
        int iHashCode23 = maCouponVO == null ? 0 : maCouponVO.hashCode();
        AttachPageInfo attachPageInfo = this.attachInfo;
        int iHashCode24 = attachPageInfo == null ? 0 : attachPageInfo.hashCode();
        HashMap<String, String> map2 = this.convertReportMap;
        if (map2 != null) {
            iHashCode = map2.hashCode();
        }
        return ((((((((((((((((((((((((((((((((((iA3 + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode;
    }

    public final void setActions(@Nullable List<RadarTriggerAction> list) {
        this.actions = list;
    }

    public final void setAttachInfo(@Nullable AttachPageInfo attachPageInfo) {
        this.attachInfo = attachPageInfo;
    }

    public final void setCloseType(@Nullable String str) {
        this.closeType = str;
    }

    public final void setConvertReportMap(@Nullable HashMap<String, String> map) {
        this.convertReportMap = map;
    }

    public final void setCouponBgImg(@Nullable String str) {
        this.couponBgImg = str;
    }

    public final void setCouponButtonImg(@Nullable String str) {
        this.couponButtonImg = str;
    }

    public final void setCouponTextColor(@Nullable String str) {
        this.couponTextColor = str;
    }

    public final void setDelay(long j7) {
        this.delay = j7;
    }

    public final void setDuration(long j7) {
        this.duration = j7;
    }

    public final void setEntryType(@Nullable String str) {
        this.entryType = str;
    }

    public final void setExtra(@Nullable String str) {
        this.extra = str;
    }

    public final void setFullScreen(@Nullable Boolean bool) {
        this.fullScreen = bool;
    }

    public final void setGroup(@Nullable String str) {
        this.group = str;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setImgUrl(@Nullable String str) {
        this.imgUrl = str;
    }

    public final void setInterval(long j7) {
        this.interval = j7;
    }

    public final void setItemListObj(@Nullable List<RecommendGoodsBean> list) {
        this.itemListObj = list;
    }

    public final void setJumpAction(@Nullable String str) {
        this.jumpAction = str;
    }

    public final void setJumpUrl(@Nullable String str) {
        this.jumpUrl = str;
    }

    public final void setLogo(@Nullable String str) {
        this.logo = str;
    }

    public final void setMaCouponVO(@Nullable MaCouponVO maCouponVO) {
        this.maCouponVO = maCouponVO;
    }

    public final void setMessage(@Nullable String str) {
        this.message = str;
    }

    public final void setNoUrlClickClose(int i7) {
        this.noUrlClickClose = i7;
    }

    public final void setPopType(@Nullable String str) {
        this.popType = str;
    }

    public final void setPosition(int i7) {
        this.position = i7;
    }

    public final void setPrizeDetail(@Nullable RadarPrizeBean radarPrizeBean) {
        this.prizeDetail = radarPrizeBean;
    }

    public final void setReportParams(@Nullable HashMap<?, ?> map) {
        this.reportParams = map;
    }

    public final void setShowClose(boolean z6) {
        this.showClose = z6;
    }

    public final void setTemplate(@Nullable String str) {
        this.template = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setTriggerScene(@Nullable String str) {
        this.triggerScene = str;
    }

    public final void setUserRelation(boolean z6) {
        this.userRelation = z6;
    }

    public final void setUuid(@Nullable String str) {
        this.uuid = str;
    }

    public final void setVibrationType(@Nullable String str) {
        this.vibrationType = str;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.group;
        String str3 = this.jumpAction;
        String str4 = this.title;
        String str5 = this.message;
        long j7 = this.interval;
        long j8 = this.duration;
        List<RadarTriggerAction> list = this.actions;
        String str6 = this.uuid;
        String str7 = this.vibrationType;
        int i7 = this.position;
        int i8 = this.noUrlClickClose;
        String str8 = this.imgUrl;
        boolean z6 = this.showClose;
        long j9 = this.delay;
        boolean z7 = this.userRelation;
        String str9 = this.extra;
        String str10 = this.logo;
        String str11 = this.jumpUrl;
        String str12 = this.entryType;
        String str13 = this.closeType;
        RadarPrizeBean radarPrizeBean = this.prizeDetail;
        String str14 = this.triggerScene;
        List<RecommendGoodsBean> list2 = this.itemListObj;
        HashMap<?, ?> map = this.reportParams;
        Boolean bool = this.fullScreen;
        String str15 = this.popType;
        String str16 = this.template;
        String str17 = this.couponTextColor;
        String str18 = this.couponBgImg;
        String str19 = this.couponButtonImg;
        MaCouponVO maCouponVO = this.maCouponVO;
        AttachPageInfo attachPageInfo = this.attachInfo;
        HashMap<String, String> map2 = this.convertReportMap;
        StringBuilder sbA = b.a("RadarTriggerContent(id=", str, ", group=", str2, ", jumpAction=");
        B.a(str3, ", title=", str4, ", message=", sbA);
        v.a(j7, str5, ", interval=", sbA);
        J1.z.a(j8, ", duration=", ", actions=", sbA);
        O.b(", uuid=", str6, ", vibrationType=", sbA, list);
        e.b(i7, str7, ", position=", ", noUrlClickClose=", sbA);
        M.a(i8, ", imgUrl=", str8, ", showClose=", sbA);
        C4559c.a(j9, ", delay=", sbA, z6);
        w.a(", userRelation=", ", extra=", str9, sbA, z7);
        B.a(", logo=", str10, ", jumpUrl=", str11, sbA);
        B.a(", entryType=", str12, ", closeType=", str13, sbA);
        sbA.append(", prizeDetail=");
        sbA.append(radarPrizeBean);
        sbA.append(", triggerScene=");
        sbA.append(str14);
        sbA.append(", itemListObj=");
        sbA.append(list2);
        sbA.append(", reportParams=");
        sbA.append(map);
        sbA.append(", fullScreen=");
        sbA.append(bool);
        sbA.append(", popType=");
        sbA.append(str15);
        B.a(", template=", str16, ", couponTextColor=", str17, sbA);
        B.a(", couponBgImg=", str18, ", couponButtonImg=", str19, sbA);
        sbA.append(", maCouponVO=");
        sbA.append(maCouponVO);
        sbA.append(", attachInfo=");
        sbA.append(attachPageInfo);
        sbA.append(", convertReportMap=");
        sbA.append(map2);
        sbA.append(")");
        return sbA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i7) {
        parcel.writeString(this.id);
        parcel.writeString(this.group);
        parcel.writeString(this.jumpAction);
        parcel.writeString(this.title);
        parcel.writeString(this.message);
        parcel.writeLong(this.interval);
        parcel.writeLong(this.duration);
        parcel.writeTypedList(this.actions);
        parcel.writeString(this.uuid);
        parcel.writeString(this.vibrationType);
        parcel.writeInt(this.position);
        parcel.writeInt(this.noUrlClickClose);
        parcel.writeString(this.imgUrl);
        parcel.writeByte(this.showClose ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.delay);
        parcel.writeByte(this.userRelation ? (byte) 1 : (byte) 0);
        parcel.writeString(this.extra);
        parcel.writeString(this.logo);
        parcel.writeString(this.jumpUrl);
        parcel.writeString(this.entryType);
        parcel.writeString(this.closeType);
        parcel.writeParcelable(this.prizeDetail, i7);
        parcel.writeString(this.triggerScene);
        parcel.writeTypedList(this.itemListObj);
        parcel.writeValue(this.reportParams);
        parcel.writeByte(Intrinsics.areEqual(this.fullScreen, Boolean.TRUE) ? (byte) 1 : (byte) 0);
        parcel.writeString(this.popType);
        parcel.writeString(this.template);
        parcel.writeString(this.couponTextColor);
        parcel.writeString(this.couponBgImg);
        parcel.writeString(this.couponButtonImg);
        parcel.writeParcelable(this.maCouponVO, i7);
        parcel.writeParcelable(this.attachInfo, i7);
        parcel.writeValue(this.convertReportMap);
    }
}
