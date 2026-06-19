package com.bilibili.lib.projection.internal.api.model;

import I.E;
import I1.C2157f0;
import O4.a;
import androidx.annotation.Keep;
import androidx.compose.animation.z;
import androidx.compose.foundation.C3554n0;
import com.bilibili.studio.editor.moudle.sticker.v1.EditCustomizeSticker;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/LinkPlayInfoTotal.class */
@Keep
public final class LinkPlayInfoTotal {

    @SerializedName("danmakuState")
    private boolean danmakuState;

    @SerializedName(EditCustomizeSticker.TAG_DURATION)
    private long duration;

    @SerializedName("playItem")
    @Nullable
    private CloudPlayInfo playItem;

    @SerializedName("playState")
    private int playState;

    @SerializedName("position")
    private long position;

    @SerializedName("qn")
    @Nullable
    private QualityDescInfoV2 qnDesc;

    @SerializedName("title")
    @NotNull
    private String title;

    @SerializedName("volume")
    @NotNull
    private String volume;

    public LinkPlayInfoTotal() {
        this(0, 0L, 0L, false, null, null, null, null, 255, null);
    }

    public LinkPlayInfoTotal(int i7, long j7, long j8, boolean z6, @NotNull String str, @NotNull String str2, @Nullable CloudPlayInfo cloudPlayInfo, @Nullable QualityDescInfoV2 qualityDescInfoV2) {
        this.playState = i7;
        this.position = j7;
        this.duration = j8;
        this.danmakuState = z6;
        this.title = str;
        this.volume = str2;
        this.playItem = cloudPlayInfo;
        this.qnDesc = qualityDescInfoV2;
    }

    public /* synthetic */ LinkPlayInfoTotal(int i7, long j7, long j8, boolean z6, String str, String str2, CloudPlayInfo cloudPlayInfo, QualityDescInfoV2 qualityDescInfoV2, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0 : i7, (i8 & 2) != 0 ? 0L : j7, (i8 & 4) != 0 ? 0L : j8, (i8 & 8) != 0 ? false : z6, (i8 & 16) != 0 ? "" : str, (i8 & 32) != 0 ? "" : str2, (i8 & 64) != 0 ? null : cloudPlayInfo, (i8 & 128) != 0 ? null : qualityDescInfoV2);
    }

    public static /* synthetic */ LinkPlayInfoTotal copy$default(LinkPlayInfoTotal linkPlayInfoTotal, int i7, long j7, long j8, boolean z6, String str, String str2, CloudPlayInfo cloudPlayInfo, QualityDescInfoV2 qualityDescInfoV2, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i7 = linkPlayInfoTotal.playState;
        }
        if ((i8 & 2) != 0) {
            j7 = linkPlayInfoTotal.position;
        }
        if ((i8 & 4) != 0) {
            j8 = linkPlayInfoTotal.duration;
        }
        if ((i8 & 8) != 0) {
            z6 = linkPlayInfoTotal.danmakuState;
        }
        if ((i8 & 16) != 0) {
            str = linkPlayInfoTotal.title;
        }
        if ((i8 & 32) != 0) {
            str2 = linkPlayInfoTotal.volume;
        }
        if ((i8 & 64) != 0) {
            cloudPlayInfo = linkPlayInfoTotal.playItem;
        }
        if ((i8 & 128) != 0) {
            qualityDescInfoV2 = linkPlayInfoTotal.qnDesc;
        }
        return linkPlayInfoTotal.copy(i7, j7, j8, z6, str, str2, cloudPlayInfo, qualityDescInfoV2);
    }

    public final int component1() {
        return this.playState;
    }

    public final long component2() {
        return this.position;
    }

    public final long component3() {
        return this.duration;
    }

    public final boolean component4() {
        return this.danmakuState;
    }

    @NotNull
    public final String component5() {
        return this.title;
    }

    @NotNull
    public final String component6() {
        return this.volume;
    }

    @Nullable
    public final CloudPlayInfo component7() {
        return this.playItem;
    }

    @Nullable
    public final QualityDescInfoV2 component8() {
        return this.qnDesc;
    }

    @NotNull
    public final LinkPlayInfoTotal copy(int i7, long j7, long j8, boolean z6, @NotNull String str, @NotNull String str2, @Nullable CloudPlayInfo cloudPlayInfo, @Nullable QualityDescInfoV2 qualityDescInfoV2) {
        return new LinkPlayInfoTotal(i7, j7, j8, z6, str, str2, cloudPlayInfo, qualityDescInfoV2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkPlayInfoTotal)) {
            return false;
        }
        LinkPlayInfoTotal linkPlayInfoTotal = (LinkPlayInfoTotal) obj;
        return this.playState == linkPlayInfoTotal.playState && this.position == linkPlayInfoTotal.position && this.duration == linkPlayInfoTotal.duration && this.danmakuState == linkPlayInfoTotal.danmakuState && Intrinsics.areEqual(this.title, linkPlayInfoTotal.title) && Intrinsics.areEqual(this.volume, linkPlayInfoTotal.volume) && Intrinsics.areEqual(this.playItem, linkPlayInfoTotal.playItem) && Intrinsics.areEqual(this.qnDesc, linkPlayInfoTotal.qnDesc);
    }

    public final boolean getDanmakuState() {
        return this.danmakuState;
    }

    public final long getDuration() {
        return this.duration;
    }

    @Nullable
    public final CloudPlayInfo getPlayItem() {
        return this.playItem;
    }

    public final int getPlayState() {
        return this.playState;
    }

    public final long getPosition() {
        return this.position;
    }

    @Nullable
    public final QualityDescInfoV2 getQnDesc() {
        return this.qnDesc;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getVolume() {
        return this.volume;
    }

    public int hashCode() {
        int iA = E.a(E.a(z.a(C3554n0.a(C3554n0.a(Integer.hashCode(this.playState) * 31, 31, this.position), 31, this.duration), 31, this.danmakuState), 31, this.title), 31, this.volume);
        CloudPlayInfo cloudPlayInfo = this.playItem;
        int iHashCode = 0;
        int iHashCode2 = cloudPlayInfo == null ? 0 : cloudPlayInfo.hashCode();
        QualityDescInfoV2 qualityDescInfoV2 = this.qnDesc;
        if (qualityDescInfoV2 != null) {
            iHashCode = qualityDescInfoV2.hashCode();
        }
        return ((iA + iHashCode2) * 31) + iHashCode;
    }

    public final void setDanmakuState(boolean z6) {
        this.danmakuState = z6;
    }

    public final void setDuration(long j7) {
        this.duration = j7;
    }

    public final void setPlayItem(@Nullable CloudPlayInfo cloudPlayInfo) {
        this.playItem = cloudPlayInfo;
    }

    public final void setPlayState(int i7) {
        this.playState = i7;
    }

    public final void setPosition(long j7) {
        this.position = j7;
    }

    public final void setQnDesc(@Nullable QualityDescInfoV2 qualityDescInfoV2) {
        this.qnDesc = qualityDescInfoV2;
    }

    public final void setTitle(@NotNull String str) {
        this.title = str;
    }

    public final void setVolume(@NotNull String str) {
        this.volume = str;
    }

    @NotNull
    public String toString() {
        int i7 = this.playState;
        long j7 = this.position;
        long j8 = this.duration;
        boolean z6 = this.danmakuState;
        String str = this.title;
        String str2 = this.volume;
        CloudPlayInfo cloudPlayInfo = this.playItem;
        QualityDescInfoV2 qualityDescInfoV2 = this.qnDesc;
        StringBuilder sbA = C2157f0.a(i7, j7, "LinkPlayInfoTotal(playState=", ", position=");
        J1.z.a(j8, ", duration=", ", danmakuState=", sbA);
        a.d(", title=", str, ", volume=", sbA, z6);
        sbA.append(str2);
        sbA.append(", playItem=");
        sbA.append(cloudPlayInfo);
        sbA.append(", qnDesc=");
        sbA.append(qualityDescInfoV2);
        sbA.append(")");
        return sbA.toString();
    }
}
