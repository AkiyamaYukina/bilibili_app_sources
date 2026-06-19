package com.bilibili.lib.projection.internal.api.model;

import G0.b;
import I.E;
import androidx.annotation.Keep;
import androidx.fragment.app.A;
import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/lib/projection/internal/api/model/CloudPlayInfo.class */
@Keep
public final class CloudPlayInfo {

    @SerializedName("aid")
    @NotNull
    private String aid;

    @SerializedName("cid")
    @NotNull
    private String cid;

    @SerializedName("epId")
    @NotNull
    private String epId;

    @SerializedName("seasonId")
    @NotNull
    private String seasonId;

    public CloudPlayInfo() {
        this(null, null, null, null, 15, null);
    }

    public CloudPlayInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        this.aid = str;
        this.cid = str2;
        this.seasonId = str3;
        this.epId = str4;
    }

    public /* synthetic */ CloudPlayInfo(String str, String str2, String str3, String str4, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? "" : str, (i7 & 2) != 0 ? "" : str2, (i7 & 4) != 0 ? "" : str3, (i7 & 8) != 0 ? "" : str4);
    }

    public static /* synthetic */ CloudPlayInfo copy$default(CloudPlayInfo cloudPlayInfo, String str, String str2, String str3, String str4, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = cloudPlayInfo.aid;
        }
        if ((i7 & 2) != 0) {
            str2 = cloudPlayInfo.cid;
        }
        if ((i7 & 4) != 0) {
            str3 = cloudPlayInfo.seasonId;
        }
        if ((i7 & 8) != 0) {
            str4 = cloudPlayInfo.epId;
        }
        return cloudPlayInfo.copy(str, str2, str3, str4);
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

    @NotNull
    public final CloudPlayInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        return new CloudPlayInfo(str, str2, str3, str4);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CloudPlayInfo)) {
            return false;
        }
        CloudPlayInfo cloudPlayInfo = (CloudPlayInfo) obj;
        return Intrinsics.areEqual(this.aid, cloudPlayInfo.aid) && Intrinsics.areEqual(this.cid, cloudPlayInfo.cid) && Intrinsics.areEqual(this.seasonId, cloudPlayInfo.seasonId) && Intrinsics.areEqual(this.epId, cloudPlayInfo.epId);
    }

    @NotNull
    public final String getAid() {
        return this.aid;
    }

    @NotNull
    public final String getCid() {
        return this.cid;
    }

    @NotNull
    public final String getEpId() {
        return this.epId;
    }

    @NotNull
    public final String getSeasonId() {
        return this.seasonId;
    }

    public int hashCode() {
        return this.epId.hashCode() + E.a(E.a(this.aid.hashCode() * 31, 31, this.cid), 31, this.seasonId);
    }

    public final void setAid(@NotNull String str) {
        this.aid = str;
    }

    public final void setCid(@NotNull String str) {
        this.cid = str;
    }

    public final void setEpId(@NotNull String str) {
        this.epId = str;
    }

    public final void setSeasonId(@NotNull String str) {
        this.seasonId = str;
    }

    @NotNull
    public String toString() {
        return A.a(this.seasonId, ", epId=", this.epId, ")", b.a("CloudPlayInfo(aid=", this.aid, ", cid=", this.cid, ", seasonId="));
    }
}
