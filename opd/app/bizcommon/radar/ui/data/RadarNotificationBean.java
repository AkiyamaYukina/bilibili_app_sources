package com.bilibili.opd.app.bizcommon.radar.ui.data;

import G0.b;
import I.E;
import a5.C3188c;
import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.fragment.app.D;
import androidx.media3.common.G;
import androidx.room.B;
import com.bilibili.opd.app.bizcommon.radar.data.AttachPageInfo;
import com.bilibili.opd.app.bizcommon.radar.data.RadarTriggerAction;
import com.google.gson.JsonObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import on0.InterfaceC8245m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/opd/app/bizcommon/radar/ui/data/RadarNotificationBean.class */
@StabilityInferred(parameters = 0)
@Keep
public final class RadarNotificationBean {
    public static final int $stable = 8;

    @Nullable
    private RadarTriggerAction action;

    @Nullable
    private AttachPageInfo attachPageInfo;

    @Nullable
    private String bgColor;

    @NotNull
    private String content;

    @NotNull
    private String contentReplace;

    @NotNull
    private String couponAmount;

    @NotNull
    private String couponName;

    @NotNull
    private String couponNameColor;

    @Nullable
    private JsonObject dynamicViewData;

    @Nullable
    private String dynamicViewTemplate;
    private int gravity;

    @NotNull
    private String iconUrl;
    private boolean isCanDrag;

    @Nullable
    private String leftIconUrl;

    @Nullable
    private String leftTime;

    @Nullable
    private String leftTimeColor;

    @Nullable
    private InterfaceC8245m listener;

    @NotNull
    private String logo;

    @NotNull
    private String messageType;
    private long showTime;

    @NotNull
    private String title;

    public RadarNotificationBean() {
        this(null, null, null, false, 0L, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 2097151, null);
    }

    public RadarNotificationBean(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z6, long j7, int i7, @Nullable InterfaceC8245m interfaceC8245m, @Nullable RadarTriggerAction radarTriggerAction, @NotNull String str4, @NotNull String str5, @Nullable AttachPageInfo attachPageInfo, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @Nullable String str10, @Nullable JsonObject jsonObject, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14) {
        this.iconUrl = str;
        this.title = str2;
        this.content = str3;
        this.isCanDrag = z6;
        this.showTime = j7;
        this.gravity = i7;
        this.listener = interfaceC8245m;
        this.action = radarTriggerAction;
        this.logo = str4;
        this.messageType = str5;
        this.attachPageInfo = attachPageInfo;
        this.couponAmount = str6;
        this.couponName = str7;
        this.couponNameColor = str8;
        this.contentReplace = str9;
        this.dynamicViewTemplate = str10;
        this.dynamicViewData = jsonObject;
        this.leftTime = str11;
        this.leftTimeColor = str12;
        this.bgColor = str13;
        this.leftIconUrl = str14;
    }

    public /* synthetic */ RadarNotificationBean(String str, String str2, String str3, boolean z6, long j7, int i7, InterfaceC8245m interfaceC8245m, RadarTriggerAction radarTriggerAction, String str4, String str5, AttachPageInfo attachPageInfo, String str6, String str7, String str8, String str9, String str10, JsonObject jsonObject, String str11, String str12, String str13, String str14, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? "" : str, (i8 & 2) != 0 ? "" : str2, (i8 & 4) != 0 ? "" : str3, (i8 & 8) != 0 ? true : z6, (i8 & 16) != 0 ? 4000L : j7, (i8 & 32) != 0 ? 48 : i7, (i8 & 64) != 0 ? null : interfaceC8245m, (i8 & 128) != 0 ? null : radarTriggerAction, (i8 & 256) != 0 ? "" : str4, (i8 & 512) != 0 ? "" : str5, (i8 & 1024) != 0 ? null : attachPageInfo, (i8 & 2048) != 0 ? "" : str6, (i8 & 4096) != 0 ? "" : str7, (i8 & 8192) != 0 ? "" : str8, (i8 & 16384) != 0 ? "" : str9, (i8 & 32768) != 0 ? null : str10, (i8 & 65536) != 0 ? null : jsonObject, (i8 & 131072) != 0 ? null : str11, (i8 & 262144) != 0 ? null : str12, (i8 & AccessibilityNodeInfoCompat.ACTION_COLLAPSE) != 0 ? null : str13, (i8 & AccessibilityNodeInfoCompat.ACTION_DISMISS) != 0 ? null : str14);
    }

    public static /* synthetic */ RadarNotificationBean copy$default(RadarNotificationBean radarNotificationBean, String str, String str2, String str3, boolean z6, long j7, int i7, InterfaceC8245m interfaceC8245m, RadarTriggerAction radarTriggerAction, String str4, String str5, AttachPageInfo attachPageInfo, String str6, String str7, String str8, String str9, String str10, JsonObject jsonObject, String str11, String str12, String str13, String str14, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = radarNotificationBean.iconUrl;
        }
        if ((i8 & 2) != 0) {
            str2 = radarNotificationBean.title;
        }
        if ((i8 & 4) != 0) {
            str3 = radarNotificationBean.content;
        }
        if ((i8 & 8) != 0) {
            z6 = radarNotificationBean.isCanDrag;
        }
        if ((i8 & 16) != 0) {
            j7 = radarNotificationBean.showTime;
        }
        if ((i8 & 32) != 0) {
            i7 = radarNotificationBean.gravity;
        }
        if ((i8 & 64) != 0) {
            interfaceC8245m = radarNotificationBean.listener;
        }
        if ((i8 & 128) != 0) {
            radarTriggerAction = radarNotificationBean.action;
        }
        if ((i8 & 256) != 0) {
            str4 = radarNotificationBean.logo;
        }
        if ((i8 & 512) != 0) {
            str5 = radarNotificationBean.messageType;
        }
        if ((i8 & 1024) != 0) {
            attachPageInfo = radarNotificationBean.attachPageInfo;
        }
        if ((i8 & 2048) != 0) {
            str6 = radarNotificationBean.couponAmount;
        }
        if ((i8 & 4096) != 0) {
            str7 = radarNotificationBean.couponName;
        }
        if ((i8 & 8192) != 0) {
            str8 = radarNotificationBean.couponNameColor;
        }
        if ((i8 & 16384) != 0) {
            str9 = radarNotificationBean.contentReplace;
        }
        if ((i8 & 32768) != 0) {
            str10 = radarNotificationBean.dynamicViewTemplate;
        }
        if ((i8 & 65536) != 0) {
            jsonObject = radarNotificationBean.dynamicViewData;
        }
        if ((i8 & 131072) != 0) {
            str11 = radarNotificationBean.leftTime;
        }
        if ((i8 & 262144) != 0) {
            str12 = radarNotificationBean.leftTimeColor;
        }
        if ((i8 & AccessibilityNodeInfoCompat.ACTION_COLLAPSE) != 0) {
            str13 = radarNotificationBean.bgColor;
        }
        if ((i8 & AccessibilityNodeInfoCompat.ACTION_DISMISS) != 0) {
            str14 = radarNotificationBean.leftIconUrl;
        }
        return radarNotificationBean.copy(str, str2, str3, z6, j7, i7, interfaceC8245m, radarTriggerAction, str4, str5, attachPageInfo, str6, str7, str8, str9, str10, jsonObject, str11, str12, str13, str14);
    }

    @NotNull
    public final String component1() {
        return this.iconUrl;
    }

    @NotNull
    public final String component10() {
        return this.messageType;
    }

    @Nullable
    public final AttachPageInfo component11() {
        return this.attachPageInfo;
    }

    @NotNull
    public final String component12() {
        return this.couponAmount;
    }

    @NotNull
    public final String component13() {
        return this.couponName;
    }

    @NotNull
    public final String component14() {
        return this.couponNameColor;
    }

    @NotNull
    public final String component15() {
        return this.contentReplace;
    }

    @Nullable
    public final String component16() {
        return this.dynamicViewTemplate;
    }

    @Nullable
    public final JsonObject component17() {
        return this.dynamicViewData;
    }

    @Nullable
    public final String component18() {
        return this.leftTime;
    }

    @Nullable
    public final String component19() {
        return this.leftTimeColor;
    }

    @NotNull
    public final String component2() {
        return this.title;
    }

    @Nullable
    public final String component20() {
        return this.bgColor;
    }

    @Nullable
    public final String component21() {
        return this.leftIconUrl;
    }

    @NotNull
    public final String component3() {
        return this.content;
    }

    public final boolean component4() {
        return this.isCanDrag;
    }

    public final long component5() {
        return this.showTime;
    }

    public final int component6() {
        return this.gravity;
    }

    @Nullable
    public final InterfaceC8245m component7() {
        return this.listener;
    }

    @Nullable
    public final RadarTriggerAction component8() {
        return this.action;
    }

    @NotNull
    public final String component9() {
        return this.logo;
    }

    @NotNull
    public final RadarNotificationBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z6, long j7, int i7, @Nullable InterfaceC8245m interfaceC8245m, @Nullable RadarTriggerAction radarTriggerAction, @NotNull String str4, @NotNull String str5, @Nullable AttachPageInfo attachPageInfo, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @Nullable String str10, @Nullable JsonObject jsonObject, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14) {
        return new RadarNotificationBean(str, str2, str3, z6, j7, i7, interfaceC8245m, radarTriggerAction, str4, str5, attachPageInfo, str6, str7, str8, str9, str10, jsonObject, str11, str12, str13, str14);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RadarNotificationBean)) {
            return false;
        }
        RadarNotificationBean radarNotificationBean = (RadarNotificationBean) obj;
        return Intrinsics.areEqual(this.iconUrl, radarNotificationBean.iconUrl) && Intrinsics.areEqual(this.title, radarNotificationBean.title) && Intrinsics.areEqual(this.content, radarNotificationBean.content) && this.isCanDrag == radarNotificationBean.isCanDrag && this.showTime == radarNotificationBean.showTime && this.gravity == radarNotificationBean.gravity && Intrinsics.areEqual(this.listener, radarNotificationBean.listener) && Intrinsics.areEqual(this.action, radarNotificationBean.action) && Intrinsics.areEqual(this.logo, radarNotificationBean.logo) && Intrinsics.areEqual(this.messageType, radarNotificationBean.messageType) && Intrinsics.areEqual(this.attachPageInfo, radarNotificationBean.attachPageInfo) && Intrinsics.areEqual(this.couponAmount, radarNotificationBean.couponAmount) && Intrinsics.areEqual(this.couponName, radarNotificationBean.couponName) && Intrinsics.areEqual(this.couponNameColor, radarNotificationBean.couponNameColor) && Intrinsics.areEqual(this.contentReplace, radarNotificationBean.contentReplace) && Intrinsics.areEqual(this.dynamicViewTemplate, radarNotificationBean.dynamicViewTemplate) && Intrinsics.areEqual(this.dynamicViewData, radarNotificationBean.dynamicViewData) && Intrinsics.areEqual(this.leftTime, radarNotificationBean.leftTime) && Intrinsics.areEqual(this.leftTimeColor, radarNotificationBean.leftTimeColor) && Intrinsics.areEqual(this.bgColor, radarNotificationBean.bgColor) && Intrinsics.areEqual(this.leftIconUrl, radarNotificationBean.leftIconUrl);
    }

    @Nullable
    public final RadarTriggerAction getAction() {
        return this.action;
    }

    @Nullable
    public final AttachPageInfo getAttachPageInfo() {
        return this.attachPageInfo;
    }

    @Nullable
    public final String getBgColor() {
        return this.bgColor;
    }

    @NotNull
    public final String getContent() {
        return this.content;
    }

    @NotNull
    public final String getContentReplace() {
        return this.contentReplace;
    }

    @NotNull
    public final String getCouponAmount() {
        return this.couponAmount;
    }

    @NotNull
    public final String getCouponName() {
        return this.couponName;
    }

    @NotNull
    public final String getCouponNameColor() {
        return this.couponNameColor;
    }

    @Nullable
    public final JsonObject getDynamicViewData() {
        return this.dynamicViewData;
    }

    @Nullable
    public final String getDynamicViewTemplate() {
        return this.dynamicViewTemplate;
    }

    public final int getGravity() {
        return this.gravity;
    }

    @NotNull
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    public final String getLeftIconUrl() {
        return this.leftIconUrl;
    }

    @Nullable
    public final String getLeftTime() {
        return this.leftTime;
    }

    @Nullable
    public final String getLeftTimeColor() {
        return this.leftTimeColor;
    }

    @Nullable
    public final InterfaceC8245m getListener() {
        return this.listener;
    }

    @NotNull
    public final String getLogo() {
        return this.logo;
    }

    @NotNull
    public final String getMessageType() {
        return this.messageType;
    }

    public final long getShowTime() {
        return this.showTime;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iA = I.a(this.gravity, C3554n0.a(z.a(E.a(E.a(this.iconUrl.hashCode() * 31, 31, this.title), 31, this.content), 31, this.isCanDrag), 31, this.showTime), 31);
        InterfaceC8245m interfaceC8245m = this.listener;
        int iHashCode = 0;
        int iHashCode2 = interfaceC8245m == null ? 0 : interfaceC8245m.hashCode();
        RadarTriggerAction radarTriggerAction = this.action;
        int iA2 = E.a(E.a((((iA + iHashCode2) * 31) + (radarTriggerAction == null ? 0 : radarTriggerAction.hashCode())) * 31, 31, this.logo), 31, this.messageType);
        AttachPageInfo attachPageInfo = this.attachPageInfo;
        int iA3 = E.a(E.a(E.a(E.a((iA2 + (attachPageInfo == null ? 0 : attachPageInfo.hashCode())) * 31, 31, this.couponAmount), 31, this.couponName), 31, this.couponNameColor), 31, this.contentReplace);
        String str = this.dynamicViewTemplate;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        JsonObject jsonObject = this.dynamicViewData;
        int iHashCode4 = jsonObject == null ? 0 : jsonObject.hashCode();
        String str2 = this.leftTime;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.leftTimeColor;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.bgColor;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.leftIconUrl;
        if (str5 != null) {
            iHashCode = str5.hashCode();
        }
        return ((((((((((iA3 + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode;
    }

    public final boolean isCanDrag() {
        return this.isCanDrag;
    }

    public final void setAction(@Nullable RadarTriggerAction radarTriggerAction) {
        this.action = radarTriggerAction;
    }

    public final void setAttachPageInfo(@Nullable AttachPageInfo attachPageInfo) {
        this.attachPageInfo = attachPageInfo;
    }

    public final void setBgColor(@Nullable String str) {
        this.bgColor = str;
    }

    public final void setCanDrag(boolean z6) {
        this.isCanDrag = z6;
    }

    public final void setContent(@NotNull String str) {
        this.content = str;
    }

    public final void setContentReplace(@NotNull String str) {
        this.contentReplace = str;
    }

    public final void setCouponAmount(@NotNull String str) {
        this.couponAmount = str;
    }

    public final void setCouponName(@NotNull String str) {
        this.couponName = str;
    }

    public final void setCouponNameColor(@NotNull String str) {
        this.couponNameColor = str;
    }

    public final void setDynamicViewData(@Nullable JsonObject jsonObject) {
        this.dynamicViewData = jsonObject;
    }

    public final void setDynamicViewTemplate(@Nullable String str) {
        this.dynamicViewTemplate = str;
    }

    public final void setGravity(int i7) {
        this.gravity = i7;
    }

    public final void setIconUrl(@NotNull String str) {
        this.iconUrl = str;
    }

    public final void setLeftIconUrl(@Nullable String str) {
        this.leftIconUrl = str;
    }

    public final void setLeftTime(@Nullable String str) {
        this.leftTime = str;
    }

    public final void setLeftTimeColor(@Nullable String str) {
        this.leftTimeColor = str;
    }

    public final void setListener(@Nullable InterfaceC8245m interfaceC8245m) {
        this.listener = interfaceC8245m;
    }

    public final void setLogo(@NotNull String str) {
        this.logo = str;
    }

    public final void setMessageType(@NotNull String str) {
        this.messageType = str;
    }

    public final void setShowTime(long j7) {
        this.showTime = j7;
    }

    public final void setTitle(@NotNull String str) {
        this.title = str;
    }

    @NotNull
    public String toString() {
        String str = this.iconUrl;
        String str2 = this.title;
        String str3 = this.content;
        boolean z6 = this.isCanDrag;
        long j7 = this.showTime;
        int i7 = this.gravity;
        InterfaceC8245m interfaceC8245m = this.listener;
        RadarTriggerAction radarTriggerAction = this.action;
        String str4 = this.logo;
        String str5 = this.messageType;
        AttachPageInfo attachPageInfo = this.attachPageInfo;
        String str6 = this.couponAmount;
        String str7 = this.couponName;
        String str8 = this.couponNameColor;
        String str9 = this.contentReplace;
        String str10 = this.dynamicViewTemplate;
        JsonObject jsonObject = this.dynamicViewData;
        String str11 = this.leftTime;
        String str12 = this.leftTimeColor;
        String str13 = this.bgColor;
        String str14 = this.leftIconUrl;
        StringBuilder sbA = b.a("RadarNotificationBean(iconUrl=", str, ", title=", str2, ", content=");
        C3188c.a(str3, ", isCanDrag=", ", showTime=", sbA, z6);
        G.a(i7, j7, ", gravity=", sbA);
        sbA.append(", listener=");
        sbA.append(interfaceC8245m);
        sbA.append(", action=");
        sbA.append(radarTriggerAction);
        B.a(", logo=", str4, ", messageType=", str5, sbA);
        sbA.append(", attachPageInfo=");
        sbA.append(attachPageInfo);
        sbA.append(", couponAmount=");
        sbA.append(str6);
        B.a(", couponName=", str7, ", couponNameColor=", str8, sbA);
        B.a(", contentReplace=", str9, ", dynamicViewTemplate=", str10, sbA);
        sbA.append(", dynamicViewData=");
        sbA.append(jsonObject);
        sbA.append(", leftTime=");
        sbA.append(str11);
        B.a(", leftTimeColor=", str12, ", bgColor=", str13, sbA);
        return D.a(", leftIconUrl=", str14, ")", sbA);
    }
}
