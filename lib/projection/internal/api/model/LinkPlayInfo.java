package com.bilibili.lib.projection.internal.api.model;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/LinkPlayInfo.class */
@Keep
public final class LinkPlayInfo {

    @SerializedName("playItem")
    @Nullable
    private CloudPlayInfo playItem;

    @SerializedName("qnDesc")
    @Nullable
    private QualityDescInfoV2 qnDesc;

    @SerializedName("title")
    @NotNull
    private String title;

    public LinkPlayInfo() {
        this(null, null, null, 7, null);
    }

    public LinkPlayInfo(@NotNull String str, @Nullable CloudPlayInfo cloudPlayInfo, @Nullable QualityDescInfoV2 qualityDescInfoV2) {
        this.title = str;
        this.playItem = cloudPlayInfo;
        this.qnDesc = qualityDescInfoV2;
    }

    public /* synthetic */ LinkPlayInfo(String str, CloudPlayInfo cloudPlayInfo, QualityDescInfoV2 qualityDescInfoV2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? null : cloudPlayInfo, (i7 & 4) != 0 ? null : qualityDescInfoV2);
    }

    public static /* synthetic */ LinkPlayInfo copy$default(LinkPlayInfo linkPlayInfo, String str, CloudPlayInfo cloudPlayInfo, QualityDescInfoV2 qualityDescInfoV2, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = linkPlayInfo.title;
        }
        if ((i7 & 2) != 0) {
            cloudPlayInfo = linkPlayInfo.playItem;
        }
        if ((i7 & 4) != 0) {
            qualityDescInfoV2 = linkPlayInfo.qnDesc;
        }
        return linkPlayInfo.copy(str, cloudPlayInfo, qualityDescInfoV2);
    }

    @NotNull
    public final String component1() {
        return this.title;
    }

    @Nullable
    public final CloudPlayInfo component2() {
        return this.playItem;
    }

    @Nullable
    public final QualityDescInfoV2 component3() {
        return this.qnDesc;
    }

    @NotNull
    public final LinkPlayInfo copy(@NotNull String str, @Nullable CloudPlayInfo cloudPlayInfo, @Nullable QualityDescInfoV2 qualityDescInfoV2) {
        return new LinkPlayInfo(str, cloudPlayInfo, qualityDescInfoV2);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LinkPlayInfo)) {
            return false;
        }
        LinkPlayInfo linkPlayInfo = (LinkPlayInfo) obj;
        return Intrinsics.areEqual(this.title, linkPlayInfo.title) && Intrinsics.areEqual(this.playItem, linkPlayInfo.playItem) && Intrinsics.areEqual(this.qnDesc, linkPlayInfo.qnDesc);
    }

    @Nullable
    public final CloudPlayInfo getPlayItem() {
        return this.playItem;
    }

    @Nullable
    public final QualityDescInfoV2 getQnDesc() {
        return this.qnDesc;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode();
        CloudPlayInfo cloudPlayInfo = this.playItem;
        int iHashCode2 = 0;
        int iHashCode3 = cloudPlayInfo == null ? 0 : cloudPlayInfo.hashCode();
        QualityDescInfoV2 qualityDescInfoV2 = this.qnDesc;
        if (qualityDescInfoV2 != null) {
            iHashCode2 = qualityDescInfoV2.hashCode();
        }
        return (((iHashCode * 31) + iHashCode3) * 31) + iHashCode2;
    }

    public final void setPlayItem(@Nullable CloudPlayInfo cloudPlayInfo) {
        this.playItem = cloudPlayInfo;
    }

    public final void setQnDesc(@Nullable QualityDescInfoV2 qualityDescInfoV2) {
        this.qnDesc = qualityDescInfoV2;
    }

    public final void setTitle(@NotNull String str) {
        this.title = str;
    }

    @NotNull
    public String toString() {
        return "LinkPlayInfo(title=" + this.title + ", playItem=" + this.playItem + ", qnDesc=" + this.qnDesc + ")";
    }
}
