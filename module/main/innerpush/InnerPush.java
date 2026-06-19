package com.bilibili.module.main.innerpush;

import G0.d;
import Vn.A;
import X1.F;
import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.core.app.o;
import androidx.core.view.GravityCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.paging.M;
import androidx.room.B;
import c6.O;
import cf.i;
import cf.n;
import com.bilibili.ad.adview.liveroom.answer.fragment.vm.v;
import com.bilibili.mobile.BLMobileHumanActionNative;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.bilibili.studio.videoeditor.capturev3.schema.CaptureSchema;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/module/main/innerpush/InnerPush.class */
@Keep
public final class InnerPush {

    @SerializedName("bid")
    private final int bid;

    @SerializedName("target_resource")
    @Nullable
    private final BizParams bizParams;

    @SerializedName("display_type")
    private final int displayType;

    @SerializedName(EditCustomizeSticker.TAG_DURATION)
    private final long duration;

    @SerializedName("expire")
    private final long expire;

    @SerializedName(CaptureSchema.JUMP_PARAMS_EXTRA)
    @Nullable
    private String extra;

    @SerializedName("hide_arrow")
    private final boolean hideArrow;

    @SerializedName("img")
    @Nullable
    private final String icon;

    @SerializedName("image_frame")
    private final int imageFrame;

    @SerializedName("image_marker")
    private final int imageMarker;

    @SerializedName("job")
    private final long job;

    @SerializedName("level")
    private final int level;

    @SerializedName("link")
    @Nullable
    private final String link;

    @SerializedName("summary")
    @Nullable
    private final String message;

    @SerializedName("metadata")
    @Nullable
    private final Map<String, String> metaData;

    @SerializedName("msg_source")
    @Nullable
    private final String msgSource;

    @SerializedName("msg_type")
    private int msgType;

    @SerializedName("page_blackList")
    @Nullable
    private final List<String> pageBlackList;

    @SerializedName("page_view")
    @Nullable
    private final List<String> pagePvBlackList;

    @SerializedName("page_whiteList")
    @Nullable
    private final List<String> pageWhiteList;

    @SerializedName("pop_type")
    private final int popType;

    @SerializedName("push_priority")
    private final int priority;

    @SerializedName("pure_img")
    @Nullable
    private final String pureImage;

    @SerializedName("query")
    private final boolean query;

    @SerializedName("receive_time")
    private long receiveTime;

    @SerializedName("reserve")
    private final int reserve;

    @SerializedName("taskid")
    @Nullable
    private final String taskId;

    @SerializedName("title")
    @Nullable
    private final String title;

    @SerializedName("type")
    private final int type;

    public InnerPush() {
        this(0, 0, null, null, null, 0L, 0L, null, null, 0, null, 0, null, null, null, null, 0, 0, 0L, null, false, 0, null, 0, 0, false, 0L, null, 0, 536870911, null);
    }

    public InnerPush(int i7, int i8, @Nullable String str, @Nullable String str2, @Nullable String str3, long j7, long j8, @Nullable String str4, @Nullable String str5, int i9, @Nullable String str6, int i10, @Nullable List<String> list, @Nullable List<String> list2, @Nullable List<String> list3, @Nullable BizParams bizParams, int i11, int i12, long j9, @Nullable String str7, boolean z6, int i13, @Nullable Map<String, String> map, int i14, int i15, boolean z7, long j10, @Nullable String str8, int i16) {
        this.bid = i7;
        this.type = i8;
        this.title = str;
        this.message = str2;
        this.link = str3;
        this.duration = j7;
        this.expire = j8;
        this.icon = str4;
        this.taskId = str5;
        this.displayType = i9;
        this.pureImage = str6;
        this.popType = i10;
        this.pageBlackList = list;
        this.pageWhiteList = list2;
        this.pagePvBlackList = list3;
        this.bizParams = bizParams;
        this.imageFrame = i11;
        this.imageMarker = i12;
        this.job = j9;
        this.msgSource = str7;
        this.hideArrow = z6;
        this.reserve = i13;
        this.metaData = map;
        this.priority = i14;
        this.level = i15;
        this.query = z7;
        this.receiveTime = j10;
        this.extra = str8;
        this.msgType = i16;
    }

    public /* synthetic */ InnerPush(int i7, int i8, String str, String str2, String str3, long j7, long j8, String str4, String str5, int i9, String str6, int i10, List list, List list2, List list3, BizParams bizParams, int i11, int i12, long j9, String str7, boolean z6, int i13, Map map, int i14, int i15, boolean z7, long j10, String str8, int i16, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this((i17 & 1) != 0 ? 0 : i7, (i17 & 2) != 0 ? 0 : i8, (i17 & 4) != 0 ? "" : str, (i17 & 8) != 0 ? "" : str2, (i17 & 16) != 0 ? null : str3, (i17 & 32) != 0 ? 5L : j7, (i17 & 64) != 0 ? 0L : j8, (i17 & 128) != 0 ? null : str4, (i17 & 256) != 0 ? null : str5, (i17 & 512) != 0 ? 0 : i9, (i17 & 1024) != 0 ? null : str6, (i17 & 2048) != 0 ? 0 : i10, (i17 & 4096) != 0 ? CollectionsKt.emptyList() : list, (i17 & 8192) != 0 ? CollectionsKt.emptyList() : list2, (i17 & 16384) != 0 ? CollectionsKt.emptyList() : list3, (i17 & 32768) != 0 ? null : bizParams, (i17 & 65536) != 0 ? 0 : i11, (i17 & 131072) != 0 ? 0 : i12, (i17 & 262144) != 0 ? 0L : j9, (i17 & AccessibilityNodeInfoCompat.ACTION_COLLAPSE) != 0 ? null : str7, (i17 & AccessibilityNodeInfoCompat.ACTION_DISMISS) != 0 ? false : z6, (i17 & AccessibilityNodeInfoCompat.ACTION_SET_TEXT) != 0 ? 0 : i13, (i17 & 4194304) != 0 ? null : map, (i17 & GravityCompat.RELATIVE_LAYOUT_DIRECTION) != 0 ? 1 : i14, (i17 & 16777216) != 0 ? 99 : i15, (i17 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_HAND_SKELETON_KEYPOINTS_3D) != 0 ? false : z7, (i17 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_MULTI_SEGMENT) != 0 ? 0L : j10, (i17 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_GAZE_DETECT) != 0 ? null : str8, (i17 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_DYNAMIC_GESTURE) != 0 ? 0 : i16);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InnerPush copy$default(InnerPush innerPush, int i7, int i8, String str, String str2, String str3, long j7, long j8, String str4, String str5, int i9, String str6, int i10, List list, List list2, List list3, BizParams bizParams, int i11, int i12, long j9, String str7, boolean z6, int i13, Map map, int i14, int i15, boolean z7, long j10, String str8, int i16, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            i7 = innerPush.bid;
        }
        if ((i17 & 2) != 0) {
            i8 = innerPush.type;
        }
        if ((i17 & 4) != 0) {
            str = innerPush.title;
        }
        if ((i17 & 8) != 0) {
            str2 = innerPush.message;
        }
        if ((i17 & 16) != 0) {
            str3 = innerPush.link;
        }
        if ((i17 & 32) != 0) {
            j7 = innerPush.duration;
        }
        if ((i17 & 64) != 0) {
            j8 = innerPush.expire;
        }
        if ((i17 & 128) != 0) {
            str4 = innerPush.icon;
        }
        if ((i17 & 256) != 0) {
            str5 = innerPush.taskId;
        }
        if ((i17 & 512) != 0) {
            i9 = innerPush.displayType;
        }
        if ((i17 & 1024) != 0) {
            str6 = innerPush.pureImage;
        }
        if ((i17 & 2048) != 0) {
            i10 = innerPush.popType;
        }
        if ((i17 & 4096) != 0) {
            list = innerPush.pageBlackList;
        }
        if ((i17 & 8192) != 0) {
            list2 = innerPush.pageWhiteList;
        }
        if ((i17 & 16384) != 0) {
            list3 = innerPush.pagePvBlackList;
        }
        if ((i17 & 32768) != 0) {
            bizParams = innerPush.bizParams;
        }
        if ((i17 & 65536) != 0) {
            i11 = innerPush.imageFrame;
        }
        if ((i17 & 131072) != 0) {
            i12 = innerPush.imageMarker;
        }
        if ((i17 & 262144) != 0) {
            j9 = innerPush.job;
        }
        if ((i17 & AccessibilityNodeInfoCompat.ACTION_COLLAPSE) != 0) {
            str7 = innerPush.msgSource;
        }
        if ((1048576 & i17) != 0) {
            z6 = innerPush.hideArrow;
        }
        if ((i17 & AccessibilityNodeInfoCompat.ACTION_SET_TEXT) != 0) {
            i13 = innerPush.reserve;
        }
        if ((i17 & 4194304) != 0) {
            map = innerPush.metaData;
        }
        if ((i17 & GravityCompat.RELATIVE_LAYOUT_DIRECTION) != 0) {
            i14 = innerPush.priority;
        }
        if ((i17 & 16777216) != 0) {
            i15 = innerPush.level;
        }
        if ((i17 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_HAND_SKELETON_KEYPOINTS_3D) != 0) {
            z7 = innerPush.query;
        }
        if ((i17 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_MULTI_SEGMENT) != 0) {
            j10 = innerPush.receiveTime;
        }
        if ((i17 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_GAZE_DETECT) != 0) {
            str8 = innerPush.extra;
        }
        if ((i17 & BLMobileHumanActionNative.BL_MOBILE_ENABLE_DYNAMIC_GESTURE) != 0) {
            i16 = innerPush.msgType;
        }
        return innerPush.copy(i7, i8, str, str2, str3, j7, j8, str4, str5, i9, str6, i10, list, list2, list3, bizParams, i11, i12, j9, str7, z6, i13, map, i14, i15, z7, j10, str8, i16);
    }

    public final int component1() {
        return this.bid;
    }

    public final int component10() {
        return this.displayType;
    }

    @Nullable
    public final String component11() {
        return this.pureImage;
    }

    public final int component12() {
        return this.popType;
    }

    @Nullable
    public final List<String> component13() {
        return this.pageBlackList;
    }

    @Nullable
    public final List<String> component14() {
        return this.pageWhiteList;
    }

    @Nullable
    public final List<String> component15() {
        return this.pagePvBlackList;
    }

    @Nullable
    public final BizParams component16() {
        return this.bizParams;
    }

    public final int component17() {
        return this.imageFrame;
    }

    public final int component18() {
        return this.imageMarker;
    }

    public final long component19() {
        return this.job;
    }

    public final int component2() {
        return this.type;
    }

    @Nullable
    public final String component20() {
        return this.msgSource;
    }

    public final boolean component21() {
        return this.hideArrow;
    }

    public final int component22() {
        return this.reserve;
    }

    @Nullable
    public final Map<String, String> component23() {
        return this.metaData;
    }

    public final int component24() {
        return this.priority;
    }

    public final int component25() {
        return this.level;
    }

    public final boolean component26() {
        return this.query;
    }

    public final long component27() {
        return this.receiveTime;
    }

    @Nullable
    public final String component28() {
        return this.extra;
    }

    public final int component29() {
        return this.msgType;
    }

    @Nullable
    public final String component3() {
        return this.title;
    }

    @Nullable
    public final String component4() {
        return this.message;
    }

    @Nullable
    public final String component5() {
        return this.link;
    }

    public final long component6() {
        return this.duration;
    }

    public final long component7() {
        return this.expire;
    }

    @Nullable
    public final String component8() {
        return this.icon;
    }

    @Nullable
    public final String component9() {
        return this.taskId;
    }

    @NotNull
    public final InnerPush copy(int i7, int i8, @Nullable String str, @Nullable String str2, @Nullable String str3, long j7, long j8, @Nullable String str4, @Nullable String str5, int i9, @Nullable String str6, int i10, @Nullable List<String> list, @Nullable List<String> list2, @Nullable List<String> list3, @Nullable BizParams bizParams, int i11, int i12, long j9, @Nullable String str7, boolean z6, int i13, @Nullable Map<String, String> map, int i14, int i15, boolean z7, long j10, @Nullable String str8, int i16) {
        return new InnerPush(i7, i8, str, str2, str3, j7, j8, str4, str5, i9, str6, i10, list, list2, list3, bizParams, i11, i12, j9, str7, z6, i13, map, i14, i15, z7, j10, str8, i16);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InnerPush)) {
            return false;
        }
        InnerPush innerPush = (InnerPush) obj;
        return this.bid == innerPush.bid && this.type == innerPush.type && Intrinsics.areEqual(this.title, innerPush.title) && Intrinsics.areEqual(this.message, innerPush.message) && Intrinsics.areEqual(this.link, innerPush.link) && this.duration == innerPush.duration && this.expire == innerPush.expire && Intrinsics.areEqual(this.icon, innerPush.icon) && Intrinsics.areEqual(this.taskId, innerPush.taskId) && this.displayType == innerPush.displayType && Intrinsics.areEqual(this.pureImage, innerPush.pureImage) && this.popType == innerPush.popType && Intrinsics.areEqual(this.pageBlackList, innerPush.pageBlackList) && Intrinsics.areEqual(this.pageWhiteList, innerPush.pageWhiteList) && Intrinsics.areEqual(this.pagePvBlackList, innerPush.pagePvBlackList) && Intrinsics.areEqual(this.bizParams, innerPush.bizParams) && this.imageFrame == innerPush.imageFrame && this.imageMarker == innerPush.imageMarker && this.job == innerPush.job && Intrinsics.areEqual(this.msgSource, innerPush.msgSource) && this.hideArrow == innerPush.hideArrow && this.reserve == innerPush.reserve && Intrinsics.areEqual(this.metaData, innerPush.metaData) && this.priority == innerPush.priority && this.level == innerPush.level && this.query == innerPush.query && this.receiveTime == innerPush.receiveTime && Intrinsics.areEqual(this.extra, innerPush.extra) && this.msgType == innerPush.msgType;
    }

    public final int getBid() {
        return this.bid;
    }

    @Nullable
    public final BizParams getBizParams() {
        return this.bizParams;
    }

    public final int getDisplayType() {
        return this.displayType;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final long getExpire() {
        return this.expire;
    }

    @Nullable
    public final String getExtra() {
        return this.extra;
    }

    public final boolean getHideArrow() {
        return this.hideArrow;
    }

    @Nullable
    public final String getIcon() {
        return this.icon;
    }

    public final int getImageFrame() {
        return this.imageFrame;
    }

    public final int getImageMarker() {
        return this.imageMarker;
    }

    public final long getJob() {
        return this.job;
    }

    public final int getLevel() {
        return this.level;
    }

    @Nullable
    public final String getLink() {
        return this.link;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    public final Map<String, String> getMetaData() {
        return this.metaData;
    }

    @Nullable
    public final String getMsgSource() {
        return this.msgSource;
    }

    public final int getMsgType() {
        return this.msgType;
    }

    @Nullable
    public final List<String> getPageBlackList() {
        return this.pageBlackList;
    }

    @Nullable
    public final List<String> getPagePvBlackList() {
        return this.pagePvBlackList;
    }

    @Nullable
    public final List<String> getPageWhiteList() {
        return this.pageWhiteList;
    }

    public final int getPopType() {
        return this.popType;
    }

    public final int getPriority() {
        return this.priority;
    }

    @Nullable
    public final String getPureImage() {
        return this.pureImage;
    }

    public final boolean getQuery() {
        return this.query;
    }

    public final long getReceiveTime() {
        return this.receiveTime;
    }

    public final int getReserve() {
        return this.reserve;
    }

    @Nullable
    public final String getTaskId() {
        return this.taskId;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        int iA = I.a(this.type, Integer.hashCode(this.bid) * 31, 31);
        String str = this.title;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.message;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.link;
        int iA2 = C3554n0.a(C3554n0.a((((((iA + iHashCode) * 31) + iHashCode2) * 31) + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.duration), 31, this.expire);
        String str4 = this.icon;
        int iHashCode3 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.taskId;
        int iA3 = I.a(this.displayType, (((iA2 + iHashCode3) * 31) + (str5 == null ? 0 : str5.hashCode())) * 31, 31);
        String str6 = this.pureImage;
        int iA4 = I.a(this.popType, (iA3 + (str6 == null ? 0 : str6.hashCode())) * 31, 31);
        List<String> list = this.pageBlackList;
        int iHashCode4 = list == null ? 0 : list.hashCode();
        List<String> list2 = this.pageWhiteList;
        int iHashCode5 = list2 == null ? 0 : list2.hashCode();
        List<String> list3 = this.pagePvBlackList;
        int iHashCode6 = list3 == null ? 0 : list3.hashCode();
        BizParams bizParams = this.bizParams;
        int iA5 = C3554n0.a(I.a(this.imageMarker, I.a(this.imageFrame, (((((((iA4 + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (bizParams == null ? 0 : bizParams.hashCode())) * 31, 31), 31), 31, this.job);
        String str7 = this.msgSource;
        int iA6 = I.a(this.reserve, z.a((iA5 + (str7 == null ? 0 : str7.hashCode())) * 31, 31, this.hideArrow), 31);
        Map<String, String> map = this.metaData;
        int iA7 = C3554n0.a(z.a(I.a(this.level, I.a(this.priority, (iA6 + (map == null ? 0 : map.hashCode())) * 31, 31), 31), 31, this.query), 31, this.receiveTime);
        String str8 = this.extra;
        return Integer.hashCode(this.msgType) + ((iA7 + (str8 == null ? 0 : str8.hashCode())) * 31);
    }

    public final void setExtra(@Nullable String str) {
        this.extra = str;
    }

    public final void setMsgType(int i7) {
        this.msgType = i7;
    }

    public final void setReceiveTime(long j7) {
        this.receiveTime = j7;
    }

    @NotNull
    public String toString() {
        int i7 = this.bid;
        int i8 = this.type;
        String str = this.title;
        String str2 = this.message;
        String str3 = this.link;
        long j7 = this.duration;
        long j8 = this.expire;
        String str4 = this.icon;
        String str5 = this.taskId;
        int i9 = this.displayType;
        String str6 = this.pureImage;
        int i10 = this.popType;
        List<String> list = this.pageBlackList;
        List<String> list2 = this.pageWhiteList;
        List<String> list3 = this.pagePvBlackList;
        BizParams bizParams = this.bizParams;
        int i11 = this.imageFrame;
        int i12 = this.imageMarker;
        long j9 = this.job;
        String str7 = this.msgSource;
        boolean z6 = this.hideArrow;
        int i13 = this.reserve;
        Map<String, String> map = this.metaData;
        int i14 = this.priority;
        int i15 = this.level;
        boolean z7 = this.query;
        long j10 = this.receiveTime;
        String str8 = this.extra;
        int i16 = this.msgType;
        StringBuilder sbB = A.b(i7, i8, "InnerPush(bid=", ", type=", ", title=");
        B.a(str, ", message=", str2, ", link=", sbB);
        v.a(j7, str3, ", duration=", sbB);
        J1.z.a(j8, ", expire=", ", icon=", sbB);
        B.a(str4, ", taskId=", str5, ", displayType=", sbB);
        M.a(i9, ", pureImage=", str6, ", popType=", sbB);
        O.b(sbB, i10, ", pageBlackList=", list, ", pageWhiteList=");
        F.c(", pagePvBlackList=", ", bizParams=", sbB, list2, list3);
        sbB.append(bizParams);
        sbB.append(", imageFrame=");
        sbB.append(i11);
        sbB.append(", imageMarker=");
        o.b(i12, j9, ", job=", sbB);
        n.a(", msgSource=", str7, ", hideArrow=", sbB, z6);
        sbB.append(", reserve=");
        sbB.append(i13);
        sbB.append(", metaData=");
        sbB.append(map);
        W60.F.b(i14, i15, ", priority=", ", level=", sbB);
        sbB.append(", query=");
        sbB.append(z7);
        sbB.append(", receiveTime=");
        d.a(j10, ", extra=", str8, sbB);
        return i.a(i16, ", msgType=", ")", sbB);
    }
}
