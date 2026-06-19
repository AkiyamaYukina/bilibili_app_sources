package com.bilibili.lib.projection.internal.api.model;

import G0.b;
import H0.e;
import I.E;
import androidx.compose.animation.core.I;
import androidx.compose.runtime.C4277b;
import androidx.room.B;
import com.bilibili.mobile.BLHumanActionParamsType;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/ProjectionPlayInfo.class */
public final class ProjectionPlayInfo implements Serializable {

    @SerializedName("aid")
    @NotNull
    private String aid;

    @SerializedName("cid")
    @NotNull
    private String cid;

    @SerializedName("danmakuStatus")
    private int danmakuState;

    @SerializedName(EditCustomizeSticker.TAG_DURATION)
    @NotNull
    private String duration;

    @SerializedName("epId")
    @NotNull
    private String epId;

    @SerializedName("playerStatus")
    private int playerState;

    @SerializedName("position")
    @NotNull
    private String position;

    @SerializedName("qn")
    @Nullable
    private QualityDescInfo qn;

    @SerializedName("seasonId")
    @NotNull
    private String seasonId;

    public ProjectionPlayInfo() {
        this(null, null, null, null, null, null, null, 0, 0, BLHumanActionParamsType.BL_HUMAN_ACTION_PARAM_SKY_RESULT_ROTATE, null);
    }

    public ProjectionPlayInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable QualityDescInfo qualityDescInfo, @NotNull String str5, @NotNull String str6, int i7, int i8) {
        this.aid = str;
        this.cid = str2;
        this.seasonId = str3;
        this.epId = str4;
        this.qn = qualityDescInfo;
        this.position = str5;
        this.duration = str6;
        this.playerState = i7;
        this.danmakuState = i8;
    }

    public /* synthetic */ ProjectionPlayInfo(String str, String str2, String str3, String str4, QualityDescInfo qualityDescInfo, String str5, String str6, int i7, int i8, int i9, DefaultConstructorMarker defaultConstructorMarker) {
        this((i9 & 1) != 0 ? "" : str, (i9 & 2) != 0 ? "" : str2, (i9 & 4) != 0 ? "" : str3, (i9 & 8) != 0 ? "" : str4, (i9 & 16) != 0 ? null : qualityDescInfo, (i9 & 32) != 0 ? "" : str5, (i9 & 64) != 0 ? "" : str6, (i9 & 128) != 0 ? 0 : i7, (i9 & 256) != 0 ? 0 : i8);
    }

    public static /* synthetic */ ProjectionPlayInfo copy$default(ProjectionPlayInfo projectionPlayInfo, String str, String str2, String str3, String str4, QualityDescInfo qualityDescInfo, String str5, String str6, int i7, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            str = projectionPlayInfo.aid;
        }
        if ((i9 & 2) != 0) {
            str2 = projectionPlayInfo.cid;
        }
        if ((i9 & 4) != 0) {
            str3 = projectionPlayInfo.seasonId;
        }
        if ((i9 & 8) != 0) {
            str4 = projectionPlayInfo.epId;
        }
        if ((i9 & 16) != 0) {
            qualityDescInfo = projectionPlayInfo.qn;
        }
        if ((i9 & 32) != 0) {
            str5 = projectionPlayInfo.position;
        }
        if ((i9 & 64) != 0) {
            str6 = projectionPlayInfo.duration;
        }
        if ((i9 & 128) != 0) {
            i7 = projectionPlayInfo.playerState;
        }
        if ((i9 & 256) != 0) {
            i8 = projectionPlayInfo.danmakuState;
        }
        return projectionPlayInfo.copy(str, str2, str3, str4, qualityDescInfo, str5, str6, i7, i8);
    }

    @NotNull
    public final String component1() {
        return this.aid;
    }

    @NotNull
    public final String component2() {
        return this.cid;
    }

    @NotNull
    public final String component3() {
        return this.seasonId;
    }

    @NotNull
    public final String component4() {
        return this.epId;
    }

    @Nullable
    public final QualityDescInfo component5() {
        return this.qn;
    }

    @NotNull
    public final String component6() {
        return this.position;
    }

    @NotNull
    public final String component7() {
        return this.duration;
    }

    public final int component8() {
        return this.playerState;
    }

    public final int component9() {
        return this.danmakuState;
    }

    @NotNull
    public final ProjectionPlayInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @Nullable QualityDescInfo qualityDescInfo, @NotNull String str5, @NotNull String str6, int i7, int i8) {
        return new ProjectionPlayInfo(str, str2, str3, str4, qualityDescInfo, str5, str6, i7, i8);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProjectionPlayInfo)) {
            return false;
        }
        ProjectionPlayInfo projectionPlayInfo = (ProjectionPlayInfo) obj;
        return Intrinsics.areEqual(this.aid, projectionPlayInfo.aid) && Intrinsics.areEqual(this.cid, projectionPlayInfo.cid) && Intrinsics.areEqual(this.seasonId, projectionPlayInfo.seasonId) && Intrinsics.areEqual(this.epId, projectionPlayInfo.epId) && Intrinsics.areEqual(this.qn, projectionPlayInfo.qn) && Intrinsics.areEqual(this.position, projectionPlayInfo.position) && Intrinsics.areEqual(this.duration, projectionPlayInfo.duration) && this.playerState == projectionPlayInfo.playerState && this.danmakuState == projectionPlayInfo.danmakuState;
    }

    @NotNull
    public final String getAid() {
        return this.aid;
    }

    @NotNull
    public final String getCid() {
        return this.cid;
    }

    public final int getDanmakuState() {
        return this.danmakuState;
    }

    @NotNull
    public final String getDuration() {
        return this.duration;
    }

    @NotNull
    public final String getEpId() {
        return this.epId;
    }

    public final int getPlayerState() {
        return this.playerState;
    }

    @NotNull
    public final String getPosition() {
        return this.position;
    }

    @Nullable
    public final QualityDescInfo getQn() {
        return this.qn;
    }

    @NotNull
    public final String getSeasonId() {
        return this.seasonId;
    }

    public int hashCode() {
        int iA = E.a(E.a(E.a(this.aid.hashCode() * 31, 31, this.cid), 31, this.seasonId), 31, this.epId);
        QualityDescInfo qualityDescInfo = this.qn;
        return Integer.hashCode(this.danmakuState) + I.a(this.playerState, E.a(E.a((iA + (qualityDescInfo == null ? 0 : qualityDescInfo.hashCode())) * 31, 31, this.position), 31, this.duration), 31);
    }

    public final void setAid(@NotNull String str) {
        this.aid = str;
    }

    public final void setCid(@NotNull String str) {
        this.cid = str;
    }

    public final void setDanmakuState(int i7) {
        this.danmakuState = i7;
    }

    public final void setDuration(@NotNull String str) {
        this.duration = str;
    }

    public final void setEpId(@NotNull String str) {
        this.epId = str;
    }

    public final void setPlayerState(int i7) {
        this.playerState = i7;
    }

    public final void setPosition(@NotNull String str) {
        this.position = str;
    }

    public final void setQn(@Nullable QualityDescInfo qualityDescInfo) {
        this.qn = qualityDescInfo;
    }

    public final void setSeasonId(@NotNull String str) {
        this.seasonId = str;
    }

    @NotNull
    public String toString() {
        String str = this.aid;
        String str2 = this.cid;
        String str3 = this.seasonId;
        String str4 = this.epId;
        QualityDescInfo qualityDescInfo = this.qn;
        String str5 = this.position;
        String str6 = this.duration;
        int i7 = this.playerState;
        int i8 = this.danmakuState;
        StringBuilder sbA = b.a("ProjectionPlayInfo(aid=", str, ", cid=", str2, ", seasonId=");
        B.a(str3, ", epId=", str4, ", qn=", sbA);
        sbA.append(qualityDescInfo);
        sbA.append(", position=");
        sbA.append(str5);
        sbA.append(", duration=");
        e.b(i7, str6, ", playerState=", ", danmakuState=", sbA);
        return C4277b.a(i8, ")", sbA);
    }
}
