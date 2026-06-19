package com.bilibili.lib.projection.internal.link;

import I.E;
import W60.F;
import androidx.compose.animation.core.I;
import androidx.compose.animation.n;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import androidx.core.view.GravityCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.media3.common.G;
import androidx.media3.common.util.C4638g;
import androidx.room.B;
import cf.l;
import com.bilibili.ad.adview.liveroom.answer.fragment.vm.w;
import com.bilibili.bplus.followingpublish.fragments.publish.c;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/link/NvaExtContent.class */
public final class NvaExtContent implements Serializable {

    @SerializedName("key")
    @Nullable
    private String accessKey;

    @SerializedName("aid")
    private long aid;

    @SerializedName("an")
    private boolean autoNext;

    @SerializedName("bid")
    private long bizId;

    @SerializedName("biz_session_id")
    @Nullable
    private String bizSessionId;

    @SerializedName("cid")
    private long cid;

    @SerializedName("ct")
    private int contentType;

    @SerializedName("danmakuSwitchSave")
    private boolean danmakuSwitchSave;

    @SerializedName("desc")
    private int desc;

    @SerializedName("eid")
    private long epId;

    @SerializedName("ignore_direct")
    private boolean ignoreDirect;

    @SerializedName("io")
    private boolean isOpen;

    @SerializedName("mv")
    private int mobileVersion;

    @SerializedName("nl")
    @Nullable
    private NvaLink nvaLink;

    @SerializedName("oid")
    private long oid;

    @SerializedName("projection_buried_extra")
    @Nullable
    private String projectionBuriedExtra;

    @SerializedName("proj_type")
    private int projectionType;

    @SerializedName("qn")
    private int qn;

    @SerializedName("roomId")
    @Nullable
    private String roomId;

    @SerializedName("sid")
    private long seasonId;

    @SerializedName("sk")
    @NotNull
    private String seekTs;

    @SerializedName("sed")
    @Nullable
    private String sessionId;

    @SerializedName("tp")
    private int type;

    @SerializedName("userDesireQn")
    private int userDesiredQn;

    @SerializedName("userDesireSpeed")
    private float userDesiredSpeed;

    public NvaExtContent(long j7, long j8, int i7, boolean z6, boolean z7, long j9, long j10, boolean z8, @Nullable String str, @Nullable String str2, int i8, @NotNull String str3, int i9, int i10, float f7, int i11, long j11, long j12, int i12, int i13, @Nullable NvaLink nvaLink, boolean z9, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.aid = j7;
        this.cid = j8;
        this.contentType = i7;
        this.isOpen = z6;
        this.danmakuSwitchSave = z7;
        this.seasonId = j9;
        this.epId = j10;
        this.autoNext = z8;
        this.sessionId = str;
        this.accessKey = str2;
        this.mobileVersion = i8;
        this.seekTs = str3;
        this.qn = i9;
        this.userDesiredQn = i10;
        this.userDesiredSpeed = f7;
        this.type = i11;
        this.bizId = j11;
        this.oid = j12;
        this.desc = i12;
        this.projectionType = i13;
        this.nvaLink = nvaLink;
        this.ignoreDirect = z9;
        this.roomId = str4;
        this.bizSessionId = str5;
        this.projectionBuriedExtra = str6;
    }

    public /* synthetic */ NvaExtContent(long j7, long j8, int i7, boolean z6, boolean z7, long j9, long j10, boolean z8, String str, String str2, int i8, String str3, int i9, int i10, float f7, int i11, long j11, long j12, int i12, int i13, NvaLink nvaLink, boolean z9, String str4, String str5, String str6, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0L : j7, (i14 & 2) != 0 ? 0L : j8, i7, z6, z7, (i14 & 32) != 0 ? 0L : j9, (i14 & 64) != 0 ? 0L : j10, (i14 & 128) != 0 ? false : z8, (i14 & 256) != 0 ? null : str, (i14 & 512) != 0 ? null : str2, (i14 & 1024) != 0 ? 0 : i8, (i14 & 2048) != 0 ? "" : str3, (i14 & 4096) != 0 ? 0 : i9, (i14 & 8192) != 0 ? 0 : i10, (i14 & 16384) != 0 ? 1.0f : f7, (32768 & i14) != 0 ? 0 : i11, (65536 & i14) != 0 ? 0L : j11, (131072 & i14) != 0 ? 0L : j12, (262144 & i14) != 0 ? 0 : i12, (524288 & i14) != 0 ? 0 : i13, (1048576 & i14) != 0 ? null : nvaLink, (2097152 & i14) != 0 ? false : z9, (4194304 & i14) != 0 ? null : str4, (8388608 & i14) != 0 ? null : str5, (i14 & 16777216) != 0 ? null : str6);
    }

    public static /* synthetic */ NvaExtContent copy$default(NvaExtContent nvaExtContent, long j7, long j8, int i7, boolean z6, boolean z7, long j9, long j10, boolean z8, String str, String str2, int i8, String str3, int i9, int i10, float f7, int i11, long j11, long j12, int i12, int i13, NvaLink nvaLink, boolean z9, String str4, String str5, String str6, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            j7 = nvaExtContent.aid;
        }
        if ((i14 & 2) != 0) {
            j8 = nvaExtContent.cid;
        }
        if ((i14 & 4) != 0) {
            i7 = nvaExtContent.contentType;
        }
        if ((i14 & 8) != 0) {
            z6 = nvaExtContent.isOpen;
        }
        if ((i14 & 16) != 0) {
            z7 = nvaExtContent.danmakuSwitchSave;
        }
        if ((i14 & 32) != 0) {
            j9 = nvaExtContent.seasonId;
        }
        if ((i14 & 64) != 0) {
            j10 = nvaExtContent.epId;
        }
        if ((i14 & 128) != 0) {
            z8 = nvaExtContent.autoNext;
        }
        if ((i14 & 256) != 0) {
            str = nvaExtContent.sessionId;
        }
        if ((i14 & 512) != 0) {
            str2 = nvaExtContent.accessKey;
        }
        if ((i14 & 1024) != 0) {
            i8 = nvaExtContent.mobileVersion;
        }
        if ((i14 & 2048) != 0) {
            str3 = nvaExtContent.seekTs;
        }
        if ((i14 & 4096) != 0) {
            i9 = nvaExtContent.qn;
        }
        if ((i14 & 8192) != 0) {
            i10 = nvaExtContent.userDesiredQn;
        }
        if ((i14 & 16384) != 0) {
            f7 = nvaExtContent.userDesiredSpeed;
        }
        if ((i14 & 32768) != 0) {
            i11 = nvaExtContent.type;
        }
        if ((i14 & 65536) != 0) {
            j11 = nvaExtContent.bizId;
        }
        if ((i14 & 131072) != 0) {
            j12 = nvaExtContent.oid;
        }
        if ((i14 & 262144) != 0) {
            i12 = nvaExtContent.desc;
        }
        if ((524288 & i14) != 0) {
            i13 = nvaExtContent.projectionType;
        }
        if ((i14 & AccessibilityNodeInfoCompat.ACTION_DISMISS) != 0) {
            nvaLink = nvaExtContent.nvaLink;
        }
        if ((i14 & AccessibilityNodeInfoCompat.ACTION_SET_TEXT) != 0) {
            z9 = nvaExtContent.ignoreDirect;
        }
        if ((i14 & 4194304) != 0) {
            str4 = nvaExtContent.roomId;
        }
        if ((i14 & GravityCompat.RELATIVE_LAYOUT_DIRECTION) != 0) {
            str5 = nvaExtContent.bizSessionId;
        }
        if ((i14 & 16777216) != 0) {
            str6 = nvaExtContent.projectionBuriedExtra;
        }
        return nvaExtContent.copy(j7, j8, i7, z6, z7, j9, j10, z8, str, str2, i8, str3, i9, i10, f7, i11, j11, j12, i12, i13, nvaLink, z9, str4, str5, str6);
    }

    public final long component1() {
        return this.aid;
    }

    @Nullable
    public final String component10() {
        return this.accessKey;
    }

    public final int component11() {
        return this.mobileVersion;
    }

    @NotNull
    public final String component12() {
        return this.seekTs;
    }

    public final int component13() {
        return this.qn;
    }

    public final int component14() {
        return this.userDesiredQn;
    }

    public final float component15() {
        return this.userDesiredSpeed;
    }

    public final int component16() {
        return this.type;
    }

    public final long component17() {
        return this.bizId;
    }

    public final long component18() {
        return this.oid;
    }

    public final int component19() {
        return this.desc;
    }

    public final long component2() {
        return this.cid;
    }

    public final int component20() {
        return this.projectionType;
    }

    @Nullable
    public final NvaLink component21() {
        return this.nvaLink;
    }

    public final boolean component22() {
        return this.ignoreDirect;
    }

    @Nullable
    public final String component23() {
        return this.roomId;
    }

    @Nullable
    public final String component24() {
        return this.bizSessionId;
    }

    @Nullable
    public final String component25() {
        return this.projectionBuriedExtra;
    }

    public final int component3() {
        return this.contentType;
    }

    public final boolean component4() {
        return this.isOpen;
    }

    public final boolean component5() {
        return this.danmakuSwitchSave;
    }

    public final long component6() {
        return this.seasonId;
    }

    public final long component7() {
        return this.epId;
    }

    public final boolean component8() {
        return this.autoNext;
    }

    @Nullable
    public final String component9() {
        return this.sessionId;
    }

    @NotNull
    public final NvaExtContent copy(long j7, long j8, int i7, boolean z6, boolean z7, long j9, long j10, boolean z8, @Nullable String str, @Nullable String str2, int i8, @NotNull String str3, int i9, int i10, float f7, int i11, long j11, long j12, int i12, int i13, @Nullable NvaLink nvaLink, boolean z9, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        return new NvaExtContent(j7, j8, i7, z6, z7, j9, j10, z8, str, str2, i8, str3, i9, i10, f7, i11, j11, j12, i12, i13, nvaLink, z9, str4, str5, str6);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NvaExtContent)) {
            return false;
        }
        NvaExtContent nvaExtContent = (NvaExtContent) obj;
        return this.aid == nvaExtContent.aid && this.cid == nvaExtContent.cid && this.contentType == nvaExtContent.contentType && this.isOpen == nvaExtContent.isOpen && this.danmakuSwitchSave == nvaExtContent.danmakuSwitchSave && this.seasonId == nvaExtContent.seasonId && this.epId == nvaExtContent.epId && this.autoNext == nvaExtContent.autoNext && Intrinsics.areEqual(this.sessionId, nvaExtContent.sessionId) && Intrinsics.areEqual(this.accessKey, nvaExtContent.accessKey) && this.mobileVersion == nvaExtContent.mobileVersion && Intrinsics.areEqual(this.seekTs, nvaExtContent.seekTs) && this.qn == nvaExtContent.qn && this.userDesiredQn == nvaExtContent.userDesiredQn && Float.compare(this.userDesiredSpeed, nvaExtContent.userDesiredSpeed) == 0 && this.type == nvaExtContent.type && this.bizId == nvaExtContent.bizId && this.oid == nvaExtContent.oid && this.desc == nvaExtContent.desc && this.projectionType == nvaExtContent.projectionType && Intrinsics.areEqual(this.nvaLink, nvaExtContent.nvaLink) && this.ignoreDirect == nvaExtContent.ignoreDirect && Intrinsics.areEqual(this.roomId, nvaExtContent.roomId) && Intrinsics.areEqual(this.bizSessionId, nvaExtContent.bizSessionId) && Intrinsics.areEqual(this.projectionBuriedExtra, nvaExtContent.projectionBuriedExtra);
    }

    @Nullable
    public final String getAccessKey() {
        return this.accessKey;
    }

    public final long getAid() {
        return this.aid;
    }

    public final boolean getAutoNext() {
        return this.autoNext;
    }

    public final long getBizId() {
        return this.bizId;
    }

    @Nullable
    public final String getBizSessionId() {
        return this.bizSessionId;
    }

    public final long getCid() {
        return this.cid;
    }

    public final int getContentType() {
        return this.contentType;
    }

    public final boolean getDanmakuSwitchSave() {
        return this.danmakuSwitchSave;
    }

    public final int getDesc() {
        return this.desc;
    }

    public final long getEpId() {
        return this.epId;
    }

    public final boolean getIgnoreDirect() {
        return this.ignoreDirect;
    }

    public final int getMobileVersion() {
        return this.mobileVersion;
    }

    @Nullable
    public final NvaLink getNvaLink() {
        return this.nvaLink;
    }

    public final long getOid() {
        return this.oid;
    }

    @Nullable
    public final String getProjectionBuriedExtra() {
        return this.projectionBuriedExtra;
    }

    public final int getProjectionType() {
        return this.projectionType;
    }

    public final int getQn() {
        return this.qn;
    }

    @Nullable
    public final String getRoomId() {
        return this.roomId;
    }

    public final long getSeasonId() {
        return this.seasonId;
    }

    @NotNull
    public final String getSeekTs() {
        return this.seekTs;
    }

    @Nullable
    public final String getSessionId() {
        return this.sessionId;
    }

    public final int getType() {
        return this.type;
    }

    public final int getUserDesiredQn() {
        return this.userDesiredQn;
    }

    public final float getUserDesiredSpeed() {
        return this.userDesiredSpeed;
    }

    public int hashCode() {
        int iA = z.a(C3554n0.a(C3554n0.a(z.a(z.a(I.a(this.contentType, C3554n0.a(Long.hashCode(this.aid) * 31, 31, this.cid), 31), 31, this.isOpen), 31, this.danmakuSwitchSave), 31, this.seasonId), 31, this.epId), 31, this.autoNext);
        String str = this.sessionId;
        int iHashCode = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.accessKey;
        int iA2 = I.a(this.projectionType, I.a(this.desc, C3554n0.a(C3554n0.a(I.a(this.type, n.a(this.userDesiredSpeed, I.a(this.userDesiredQn, I.a(this.qn, E.a(I.a(this.mobileVersion, (((iA + iHashCode2) * 31) + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31, this.seekTs), 31), 31), 31), 31), 31, this.bizId), 31, this.oid), 31), 31);
        NvaLink nvaLink = this.nvaLink;
        int iA3 = z.a((iA2 + (nvaLink == null ? 0 : nvaLink.hashCode())) * 31, 31, this.ignoreDirect);
        String str3 = this.roomId;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.bizSessionId;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.projectionBuriedExtra;
        if (str5 != null) {
            iHashCode = str5.hashCode();
        }
        return ((((iA3 + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode;
    }

    public final boolean isOpen() {
        return this.isOpen;
    }

    public final void setAccessKey(@Nullable String str) {
        this.accessKey = str;
    }

    public final void setAid(long j7) {
        this.aid = j7;
    }

    public final void setAutoNext(boolean z6) {
        this.autoNext = z6;
    }

    public final void setBizId(long j7) {
        this.bizId = j7;
    }

    public final void setBizSessionId(@Nullable String str) {
        this.bizSessionId = str;
    }

    public final void setCid(long j7) {
        this.cid = j7;
    }

    public final void setContentType(int i7) {
        this.contentType = i7;
    }

    public final void setDanmakuSwitchSave(boolean z6) {
        this.danmakuSwitchSave = z6;
    }

    public final void setDesc(int i7) {
        this.desc = i7;
    }

    public final void setEpId(long j7) {
        this.epId = j7;
    }

    public final void setIgnoreDirect(boolean z6) {
        this.ignoreDirect = z6;
    }

    public final void setMobileVersion(int i7) {
        this.mobileVersion = i7;
    }

    public final void setNvaLink(@Nullable NvaLink nvaLink) {
        this.nvaLink = nvaLink;
    }

    public final void setOid(long j7) {
        this.oid = j7;
    }

    public final void setOpen(boolean z6) {
        this.isOpen = z6;
    }

    public final void setProjectionBuriedExtra(@Nullable String str) {
        this.projectionBuriedExtra = str;
    }

    public final void setProjectionType(int i7) {
        this.projectionType = i7;
    }

    public final void setQn(int i7) {
        this.qn = i7;
    }

    public final void setRoomId(@Nullable String str) {
        this.roomId = str;
    }

    public final void setSeasonId(long j7) {
        this.seasonId = j7;
    }

    public final void setSeekTs(@NotNull String str) {
        this.seekTs = str;
    }

    public final void setSessionId(@Nullable String str) {
        this.sessionId = str;
    }

    public final void setType(int i7) {
        this.type = i7;
    }

    public final void setUserDesiredQn(int i7) {
        this.userDesiredQn = i7;
    }

    public final void setUserDesiredSpeed(float f7) {
        this.userDesiredSpeed = f7;
    }

    @NotNull
    public String toString() {
        long j7 = this.aid;
        long j8 = this.cid;
        int i7 = this.contentType;
        boolean z6 = this.isOpen;
        boolean z7 = this.danmakuSwitchSave;
        long j9 = this.seasonId;
        long j10 = this.epId;
        boolean z8 = this.autoNext;
        String str = this.sessionId;
        String str2 = this.accessKey;
        int i8 = this.mobileVersion;
        String str3 = this.seekTs;
        int i9 = this.qn;
        int i10 = this.userDesiredQn;
        float f7 = this.userDesiredSpeed;
        int i11 = this.type;
        long j11 = this.bizId;
        long j12 = this.oid;
        int i12 = this.desc;
        int i13 = this.projectionType;
        NvaLink nvaLink = this.nvaLink;
        boolean z9 = this.ignoreDirect;
        String str4 = this.roomId;
        String str5 = this.bizSessionId;
        String str6 = this.projectionBuriedExtra;
        StringBuilder sbA = androidx.compose.runtime.snapshots.z.a(j7, "NvaExtContent(aid=", ", cid=");
        G.a(i7, j8, ", contentType=", sbA);
        C4638g.b(", isOpen=", ", danmakuSwitchSave=", sbA, z6, z7);
        J1.z.a(j9, ", seasonId=", ", epId=", sbA);
        c.a(j10, ", autoNext=", sbA, z8);
        B.a(", sessionId=", str, ", accessKey=", str2, sbA);
        l.a(i8, ", mobileVersion=", ", seekTs=", str3, sbA);
        F.b(i9, i10, ", qn=", ", userDesiredQn=", sbA);
        sbA.append(", userDesiredSpeed=");
        sbA.append(f7);
        sbA.append(", type=");
        sbA.append(i11);
        J1.z.a(j11, ", bizId=", ", oid=", sbA);
        G.a(i12, j12, ", desc=", sbA);
        sbA.append(", projectionType=");
        sbA.append(i13);
        sbA.append(", nvaLink=");
        sbA.append(nvaLink);
        w.a(", ignoreDirect=", ", roomId=", str4, sbA, z9);
        B.a(", bizSessionId=", str5, ", projectionBuriedExtra=", str6, sbA);
        sbA.append(")");
        return sbA.toString();
    }
}
