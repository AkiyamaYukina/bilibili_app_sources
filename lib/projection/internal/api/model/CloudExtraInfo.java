package com.bilibili.lib.projection.internal.api.model;

import I.E;
import androidx.annotation.Keep;
import androidx.compose.animation.core.I;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.core.app.o;
import androidx.core.view.GravityCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.paging.M;
import androidx.room.B;
import bilibili.live.app.service.resolver.a;
import c6.P;
import com.alipay.alipaysecuritysdk.common.config.Constant;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z4.d;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/CloudExtraInfo.class */
@Keep
public final class CloudExtraInfo {

    @SerializedName("accessCode")
    @Nullable
    private String accessCode;

    @SerializedName("accessKey")
    @Nullable
    private String accessKey;

    @SerializedName("autoNext")
    private boolean autoNext;

    @SerializedName("bizSessionId")
    @Nullable
    private String bizSessionId;

    @SerializedName("biz_id")
    private long biz_id;

    @SerializedName("buvid")
    @NotNull
    private String buvid;

    @SerializedName("danmaku_switch")
    private boolean danmakuSwitch;

    @SerializedName("danmakuSwitchSave")
    private boolean danmakuSwitchSave;

    @SerializedName("desc")
    private int desc;

    @SerializedName(EditCustomizeSticker.TAG_DURATION)
    private int duration;

    @SerializedName("mobileVersion")
    private int mobileVersion;

    @SerializedName("oid")
    private long oid;

    @SerializedName("playInfo")
    @Nullable
    private CloudPlayInfo playInfo;

    @SerializedName("speed")
    @Nullable
    private CloudSpeedInfo playSpeed;

    @SerializedName("proj_type")
    private int projType;

    @SerializedName("qn")
    @Nullable
    private QualityDescInfo qn;

    @SerializedName("quality")
    private int quality;

    @SerializedName("room_id")
    @NotNull
    private String room_id;

    @SerializedName("send_danmaku")
    @Nullable
    private DanmakuDescInfo sendDanmaku;

    @SerializedName(Constant.IN_KEY_SESSION_ID)
    @Nullable
    private String sessionId;

    @SerializedName("startKey")
    @Nullable
    private String startKey;

    @SerializedName("userDesireSpeed")
    @Nullable
    private Float startupSpeed;

    @SerializedName("type")
    private int type;

    @SerializedName("userVipInfo")
    private int userVipInfo;

    @SerializedName("volume")
    private int volume;

    public CloudExtraInfo() {
        this(0, null, 0, null, false, false, null, null, 0, false, 0, null, null, null, null, 0, 0, 0L, 0L, 0, null, 0, null, null, null, 33554431, null);
    }

    public CloudExtraInfo(int i7, @NotNull String str, int i8, @Nullable QualityDescInfo qualityDescInfo, boolean z6, boolean z7, @Nullable DanmakuDescInfo danmakuDescInfo, @Nullable String str2, int i9, boolean z8, int i10, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable CloudPlayInfo cloudPlayInfo, int i11, int i12, long j7, long j8, int i13, @NotNull String str6, int i14, @Nullable CloudSpeedInfo cloudSpeedInfo, @Nullable Float f7, @Nullable String str7) {
        this.volume = i7;
        this.buvid = str;
        this.duration = i8;
        this.qn = qualityDescInfo;
        this.danmakuSwitch = z6;
        this.danmakuSwitchSave = z7;
        this.sendDanmaku = danmakuDescInfo;
        this.sessionId = str2;
        this.mobileVersion = i9;
        this.autoNext = z8;
        this.quality = i10;
        this.accessKey = str3;
        this.accessCode = str4;
        this.bizSessionId = str5;
        this.playInfo = cloudPlayInfo;
        this.userVipInfo = i11;
        this.type = i12;
        this.biz_id = j7;
        this.oid = j8;
        this.desc = i13;
        this.room_id = str6;
        this.projType = i14;
        this.playSpeed = cloudSpeedInfo;
        this.startupSpeed = f7;
        this.startKey = str7;
    }

    public /* synthetic */ CloudExtraInfo(int i7, String str, int i8, QualityDescInfo qualityDescInfo, boolean z6, boolean z7, DanmakuDescInfo danmakuDescInfo, String str2, int i9, boolean z8, int i10, String str3, String str4, String str5, CloudPlayInfo cloudPlayInfo, int i11, int i12, long j7, long j8, int i13, String str6, int i14, CloudSpeedInfo cloudSpeedInfo, Float f7, String str7, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this((i15 & 1) != 0 ? 0 : i7, (i15 & 2) != 0 ? "" : str, (i15 & 4) != 0 ? 0 : i8, (i15 & 8) != 0 ? null : qualityDescInfo, (i15 & 16) != 0 ? false : z6, (i15 & 32) != 0 ? false : z7, (i15 & 64) != 0 ? null : danmakuDescInfo, (i15 & 128) != 0 ? null : str2, (i15 & 256) != 0 ? 0 : i9, (i15 & 512) != 0 ? false : z8, (i15 & 1024) != 0 ? 0 : i10, (i15 & 2048) != 0 ? null : str3, (i15 & 4096) != 0 ? null : str4, (i15 & 8192) != 0 ? null : str5, (i15 & 16384) != 0 ? null : cloudPlayInfo, (i15 & 32768) != 0 ? -1 : i11, (i15 & 65536) != 0 ? -1 : i12, (i15 & 131072) != 0 ? -1L : j7, (i15 & 262144) != 0 ? -1L : j8, (i15 & AccessibilityNodeInfoCompat.ACTION_COLLAPSE) != 0 ? -1 : i13, (i15 & AccessibilityNodeInfoCompat.ACTION_DISMISS) != 0 ? "" : str6, (i15 & AccessibilityNodeInfoCompat.ACTION_SET_TEXT) != 0 ? -1 : i14, (i15 & 4194304) != 0 ? null : cloudSpeedInfo, (i15 & GravityCompat.RELATIVE_LAYOUT_DIRECTION) != 0 ? null : f7, (i15 & 16777216) != 0 ? null : str7);
    }

    public static /* synthetic */ CloudExtraInfo copy$default(CloudExtraInfo cloudExtraInfo, int i7, String str, int i8, QualityDescInfo qualityDescInfo, boolean z6, boolean z7, DanmakuDescInfo danmakuDescInfo, String str2, int i9, boolean z8, int i10, String str3, String str4, String str5, CloudPlayInfo cloudPlayInfo, int i11, int i12, long j7, long j8, int i13, String str6, int i14, CloudSpeedInfo cloudSpeedInfo, Float f7, String str7, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i7 = cloudExtraInfo.volume;
        }
        if ((i15 & 2) != 0) {
            str = cloudExtraInfo.buvid;
        }
        if ((i15 & 4) != 0) {
            i8 = cloudExtraInfo.duration;
        }
        if ((i15 & 8) != 0) {
            qualityDescInfo = cloudExtraInfo.qn;
        }
        if ((i15 & 16) != 0) {
            z6 = cloudExtraInfo.danmakuSwitch;
        }
        if ((i15 & 32) != 0) {
            z7 = cloudExtraInfo.danmakuSwitchSave;
        }
        if ((i15 & 64) != 0) {
            danmakuDescInfo = cloudExtraInfo.sendDanmaku;
        }
        if ((i15 & 128) != 0) {
            str2 = cloudExtraInfo.sessionId;
        }
        if ((i15 & 256) != 0) {
            i9 = cloudExtraInfo.mobileVersion;
        }
        if ((i15 & 512) != 0) {
            z8 = cloudExtraInfo.autoNext;
        }
        if ((i15 & 1024) != 0) {
            i10 = cloudExtraInfo.quality;
        }
        if ((i15 & 2048) != 0) {
            str3 = cloudExtraInfo.accessKey;
        }
        if ((i15 & 4096) != 0) {
            str4 = cloudExtraInfo.accessCode;
        }
        if ((i15 & 8192) != 0) {
            str5 = cloudExtraInfo.bizSessionId;
        }
        if ((i15 & 16384) != 0) {
            cloudPlayInfo = cloudExtraInfo.playInfo;
        }
        if ((i15 & 32768) != 0) {
            i11 = cloudExtraInfo.userVipInfo;
        }
        if ((i15 & 65536) != 0) {
            i12 = cloudExtraInfo.type;
        }
        if ((i15 & 131072) != 0) {
            j7 = cloudExtraInfo.biz_id;
        }
        if ((i15 & 262144) != 0) {
            j8 = cloudExtraInfo.oid;
        }
        if ((i15 & AccessibilityNodeInfoCompat.ACTION_COLLAPSE) != 0) {
            i13 = cloudExtraInfo.desc;
        }
        if ((1048576 & i15) != 0) {
            str6 = cloudExtraInfo.room_id;
        }
        if ((i15 & AccessibilityNodeInfoCompat.ACTION_SET_TEXT) != 0) {
            i14 = cloudExtraInfo.projType;
        }
        if ((i15 & 4194304) != 0) {
            cloudSpeedInfo = cloudExtraInfo.playSpeed;
        }
        if ((i15 & GravityCompat.RELATIVE_LAYOUT_DIRECTION) != 0) {
            f7 = cloudExtraInfo.startupSpeed;
        }
        if ((i15 & 16777216) != 0) {
            str7 = cloudExtraInfo.startKey;
        }
        return cloudExtraInfo.copy(i7, str, i8, qualityDescInfo, z6, z7, danmakuDescInfo, str2, i9, z8, i10, str3, str4, str5, cloudPlayInfo, i11, i12, j7, j8, i13, str6, i14, cloudSpeedInfo, f7, str7);
    }

    public final int component1() {
        return this.volume;
    }

    public final boolean component10() {
        return this.autoNext;
    }

    public final int component11() {
        return this.quality;
    }

    @Nullable
    public final String component12() {
        return this.accessKey;
    }

    @Nullable
    public final String component13() {
        return this.accessCode;
    }

    @Nullable
    public final String component14() {
        return this.bizSessionId;
    }

    @Nullable
    public final CloudPlayInfo component15() {
        return this.playInfo;
    }

    public final int component16() {
        return this.userVipInfo;
    }

    public final int component17() {
        return this.type;
    }

    public final long component18() {
        return this.biz_id;
    }

    public final long component19() {
        return this.oid;
    }

    @NotNull
    public final String component2() {
        return this.buvid;
    }

    public final int component20() {
        return this.desc;
    }

    @NotNull
    public final String component21() {
        return this.room_id;
    }

    public final int component22() {
        return this.projType;
    }

    @Nullable
    public final CloudSpeedInfo component23() {
        return this.playSpeed;
    }

    @Nullable
    public final Float component24() {
        return this.startupSpeed;
    }

    @Nullable
    public final String component25() {
        return this.startKey;
    }

    public final int component3() {
        return this.duration;
    }

    @Nullable
    public final QualityDescInfo component4() {
        return this.qn;
    }

    public final boolean component5() {
        return this.danmakuSwitch;
    }

    public final boolean component6() {
        return this.danmakuSwitchSave;
    }

    @Nullable
    public final DanmakuDescInfo component7() {
        return this.sendDanmaku;
    }

    @Nullable
    public final String component8() {
        return this.sessionId;
    }

    public final int component9() {
        return this.mobileVersion;
    }

    @NotNull
    public final CloudExtraInfo copy(int i7, @NotNull String str, int i8, @Nullable QualityDescInfo qualityDescInfo, boolean z6, boolean z7, @Nullable DanmakuDescInfo danmakuDescInfo, @Nullable String str2, int i9, boolean z8, int i10, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable CloudPlayInfo cloudPlayInfo, int i11, int i12, long j7, long j8, int i13, @NotNull String str6, int i14, @Nullable CloudSpeedInfo cloudSpeedInfo, @Nullable Float f7, @Nullable String str7) {
        return new CloudExtraInfo(i7, str, i8, qualityDescInfo, z6, z7, danmakuDescInfo, str2, i9, z8, i10, str3, str4, str5, cloudPlayInfo, i11, i12, j7, j8, i13, str6, i14, cloudSpeedInfo, f7, str7);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloudExtraInfo)) {
            return false;
        }
        CloudExtraInfo cloudExtraInfo = (CloudExtraInfo) obj;
        return this.volume == cloudExtraInfo.volume && Intrinsics.areEqual(this.buvid, cloudExtraInfo.buvid) && this.duration == cloudExtraInfo.duration && Intrinsics.areEqual(this.qn, cloudExtraInfo.qn) && this.danmakuSwitch == cloudExtraInfo.danmakuSwitch && this.danmakuSwitchSave == cloudExtraInfo.danmakuSwitchSave && Intrinsics.areEqual(this.sendDanmaku, cloudExtraInfo.sendDanmaku) && Intrinsics.areEqual(this.sessionId, cloudExtraInfo.sessionId) && this.mobileVersion == cloudExtraInfo.mobileVersion && this.autoNext == cloudExtraInfo.autoNext && this.quality == cloudExtraInfo.quality && Intrinsics.areEqual(this.accessKey, cloudExtraInfo.accessKey) && Intrinsics.areEqual(this.accessCode, cloudExtraInfo.accessCode) && Intrinsics.areEqual(this.bizSessionId, cloudExtraInfo.bizSessionId) && Intrinsics.areEqual(this.playInfo, cloudExtraInfo.playInfo) && this.userVipInfo == cloudExtraInfo.userVipInfo && this.type == cloudExtraInfo.type && this.biz_id == cloudExtraInfo.biz_id && this.oid == cloudExtraInfo.oid && this.desc == cloudExtraInfo.desc && Intrinsics.areEqual(this.room_id, cloudExtraInfo.room_id) && this.projType == cloudExtraInfo.projType && Intrinsics.areEqual(this.playSpeed, cloudExtraInfo.playSpeed) && Intrinsics.areEqual(this.startupSpeed, cloudExtraInfo.startupSpeed) && Intrinsics.areEqual(this.startKey, cloudExtraInfo.startKey);
    }

    @Nullable
    public final String getAccessCode() {
        return this.accessCode;
    }

    @Nullable
    public final String getAccessKey() {
        return this.accessKey;
    }

    public final boolean getAutoNext() {
        return this.autoNext;
    }

    @Nullable
    public final String getBizSessionId() {
        return this.bizSessionId;
    }

    public final long getBiz_id() {
        return this.biz_id;
    }

    @NotNull
    public final String getBuvid() {
        return this.buvid;
    }

    public final boolean getDanmakuSwitch() {
        return this.danmakuSwitch;
    }

    public final boolean getDanmakuSwitchSave() {
        return this.danmakuSwitchSave;
    }

    public final int getDesc() {
        return this.desc;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final int getMobileVersion() {
        return this.mobileVersion;
    }

    public final long getOid() {
        return this.oid;
    }

    @Nullable
    public final CloudPlayInfo getPlayInfo() {
        return this.playInfo;
    }

    @Nullable
    public final CloudSpeedInfo getPlaySpeed() {
        return this.playSpeed;
    }

    public final int getProjType() {
        return this.projType;
    }

    @Nullable
    public final QualityDescInfo getQn() {
        return this.qn;
    }

    public final int getQuality() {
        return this.quality;
    }

    @NotNull
    public final String getRoom_id() {
        return this.room_id;
    }

    @Nullable
    public final DanmakuDescInfo getSendDanmaku() {
        return this.sendDanmaku;
    }

    @Nullable
    public final String getSessionId() {
        return this.sessionId;
    }

    @Nullable
    public final String getStartKey() {
        return this.startKey;
    }

    @Nullable
    public final Float getStartupSpeed() {
        return this.startupSpeed;
    }

    public final int getType() {
        return this.type;
    }

    public final int getUserVipInfo() {
        return this.userVipInfo;
    }

    public final int getVolume() {
        return this.volume;
    }

    public int hashCode() {
        int iA = I.a(this.duration, E.a(Integer.hashCode(this.volume) * 31, 31, this.buvid), 31);
        QualityDescInfo qualityDescInfo = this.qn;
        int iA2 = z.a(z.a((iA + (qualityDescInfo == null ? 0 : qualityDescInfo.hashCode())) * 31, 31, this.danmakuSwitch), 31, this.danmakuSwitchSave);
        DanmakuDescInfo danmakuDescInfo = this.sendDanmaku;
        int iHashCode = danmakuDescInfo == null ? 0 : danmakuDescInfo.hashCode();
        String str = this.sessionId;
        int iA3 = I.a(this.quality, z.a(I.a(this.mobileVersion, (((iA2 + iHashCode) * 31) + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.autoNext), 31);
        String str2 = this.accessKey;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.accessCode;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.bizSessionId;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        CloudPlayInfo cloudPlayInfo = this.playInfo;
        int iA4 = I.a(this.projType, E.a(I.a(this.desc, C3554n0.a(C3554n0.a(I.a(this.type, I.a(this.userVipInfo, (((((((iA3 + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (cloudPlayInfo == null ? 0 : cloudPlayInfo.hashCode())) * 31, 31), 31), 31, this.biz_id), 31, this.oid), 31), 31, this.room_id), 31);
        CloudSpeedInfo cloudSpeedInfo = this.playSpeed;
        int iHashCode5 = cloudSpeedInfo == null ? 0 : cloudSpeedInfo.hashCode();
        Float f7 = this.startupSpeed;
        int iHashCode6 = f7 == null ? 0 : f7.hashCode();
        String str5 = this.startKey;
        return ((((iA4 + iHashCode5) * 31) + iHashCode6) * 31) + (str5 == null ? 0 : str5.hashCode());
    }

    public final void setAccessCode(@Nullable String str) {
        this.accessCode = str;
    }

    public final void setAccessKey(@Nullable String str) {
        this.accessKey = str;
    }

    public final void setAutoNext(boolean z6) {
        this.autoNext = z6;
    }

    public final void setBizSessionId(@Nullable String str) {
        this.bizSessionId = str;
    }

    public final void setBiz_id(long j7) {
        this.biz_id = j7;
    }

    public final void setBuvid(@NotNull String str) {
        this.buvid = str;
    }

    public final void setDanmakuSwitch(boolean z6) {
        this.danmakuSwitch = z6;
    }

    public final void setDanmakuSwitchSave(boolean z6) {
        this.danmakuSwitchSave = z6;
    }

    public final void setDesc(int i7) {
        this.desc = i7;
    }

    public final void setDuration(int i7) {
        this.duration = i7;
    }

    public final void setMobileVersion(int i7) {
        this.mobileVersion = i7;
    }

    public final void setOid(long j7) {
        this.oid = j7;
    }

    public final void setPlayInfo(@Nullable CloudPlayInfo cloudPlayInfo) {
        this.playInfo = cloudPlayInfo;
    }

    public final void setPlaySpeed(@Nullable CloudSpeedInfo cloudSpeedInfo) {
        this.playSpeed = cloudSpeedInfo;
    }

    public final void setProjType(int i7) {
        this.projType = i7;
    }

    public final void setQn(@Nullable QualityDescInfo qualityDescInfo) {
        this.qn = qualityDescInfo;
    }

    public final void setQuality(int i7) {
        this.quality = i7;
    }

    public final void setRoom_id(@NotNull String str) {
        this.room_id = str;
    }

    public final void setSendDanmaku(@Nullable DanmakuDescInfo danmakuDescInfo) {
        this.sendDanmaku = danmakuDescInfo;
    }

    public final void setSessionId(@Nullable String str) {
        this.sessionId = str;
    }

    public final void setStartKey(@Nullable String str) {
        this.startKey = str;
    }

    public final void setStartupSpeed(@Nullable Float f7) {
        this.startupSpeed = f7;
    }

    public final void setType(int i7) {
        this.type = i7;
    }

    public final void setUserVipInfo(int i7) {
        this.userVipInfo = i7;
    }

    public final void setVolume(int i7) {
        this.volume = i7;
    }

    @NotNull
    public String toString() {
        int i7 = this.volume;
        String str = this.buvid;
        int i8 = this.duration;
        QualityDescInfo qualityDescInfo = this.qn;
        boolean z6 = this.danmakuSwitch;
        boolean z7 = this.danmakuSwitchSave;
        DanmakuDescInfo danmakuDescInfo = this.sendDanmaku;
        String str2 = this.sessionId;
        int i9 = this.mobileVersion;
        boolean z8 = this.autoNext;
        int i10 = this.quality;
        String str3 = this.accessKey;
        String str4 = this.accessCode;
        String str5 = this.bizSessionId;
        CloudPlayInfo cloudPlayInfo = this.playInfo;
        int i11 = this.userVipInfo;
        int i12 = this.type;
        long j7 = this.biz_id;
        long j8 = this.oid;
        int i13 = this.desc;
        String str6 = this.room_id;
        int i14 = this.projType;
        CloudSpeedInfo cloudSpeedInfo = this.playSpeed;
        Float f7 = this.startupSpeed;
        String str7 = this.startKey;
        StringBuilder sbB = a.b(i7, "CloudExtraInfo(volume=", ", buvid=", str, ", duration=");
        sbB.append(i8);
        sbB.append(", qn=");
        sbB.append(qualityDescInfo);
        sbB.append(", danmakuSwitch=");
        P.a(", danmakuSwitchSave=", ", sendDanmaku=", sbB, z6, z7);
        sbB.append(danmakuDescInfo);
        sbB.append(", sessionId=");
        sbB.append(str2);
        sbB.append(", mobileVersion=");
        d.a(", autoNext=", ", quality=", i9, z8, sbB);
        M.a(i10, ", accessKey=", str3, ", accessCode=", sbB);
        B.a(str4, ", bizSessionId=", str5, ", playInfo=", sbB);
        sbB.append(cloudPlayInfo);
        sbB.append(", userVipInfo=");
        sbB.append(i11);
        sbB.append(", type=");
        o.b(i12, j7, ", biz_id=", sbB);
        J1.z.a(j8, ", oid=", ", desc=", sbB);
        M.a(i13, ", room_id=", str6, ", projType=", sbB);
        sbB.append(i14);
        sbB.append(", playSpeed=");
        sbB.append(cloudSpeedInfo);
        sbB.append(", startupSpeed=");
        sbB.append(f7);
        sbB.append(", startKey=");
        sbB.append(str7);
        sbB.append(")");
        return sbB.toString();
    }
}
