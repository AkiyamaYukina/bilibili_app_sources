package com.bilibili.search2.api;

import androidx.annotation.Keep;
import androidx.compose.foundation.C3554n0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import com.bapis.bilibili.polymer.app.search.v1.ShortOGVInfo;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/search2/api/IaaInfo.class */
@StabilityInferred(parameters = 0)
@Keep
public final class IaaInfo {
    public static final int $stable = 8;

    @JSONField(name = "app_id")
    @Nullable
    private String appId;

    @JSONField(name = "episode_id")
    private long episodeId;

    @JSONField(name = "season_id")
    private long seasonId;

    public IaaInfo() {
        this(null, 0L, 0L, 7, null);
    }

    public IaaInfo(@NotNull ShortOGVInfo shortOGVInfo) {
        this(null, 0L, 0L, 7, null);
        this.appId = shortOGVInfo.getAppId();
        this.seasonId = shortOGVInfo.getSeasonId();
        this.episodeId = shortOGVInfo.getEpisodeId();
    }

    public IaaInfo(@Nullable String str, long j7, long j8) {
        this.appId = str;
        this.seasonId = j7;
        this.episodeId = j8;
    }

    public /* synthetic */ IaaInfo(String str, long j7, long j8, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? null : str, (i7 & 2) != 0 ? 0L : j7, (i7 & 4) != 0 ? 0L : j8);
    }

    public static /* synthetic */ IaaInfo copy$default(IaaInfo iaaInfo, String str, long j7, long j8, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            str = iaaInfo.appId;
        }
        if ((i7 & 2) != 0) {
            j7 = iaaInfo.seasonId;
        }
        if ((i7 & 4) != 0) {
            j8 = iaaInfo.episodeId;
        }
        return iaaInfo.copy(str, j7, j8);
    }

    @Nullable
    public final String component1() {
        return this.appId;
    }

    public final long component2() {
        return this.seasonId;
    }

    public final long component3() {
        return this.episodeId;
    }

    @NotNull
    public final IaaInfo copy(@Nullable String str, long j7, long j8) {
        return new IaaInfo(str, j7, j8);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IaaInfo)) {
            return false;
        }
        IaaInfo iaaInfo = (IaaInfo) obj;
        return Intrinsics.areEqual(this.appId, iaaInfo.appId) && this.seasonId == iaaInfo.seasonId && this.episodeId == iaaInfo.episodeId;
    }

    @Nullable
    public final String getAppId() {
        return this.appId;
    }

    public final long getEpisodeId() {
        return this.episodeId;
    }

    public final long getSeasonId() {
        return this.seasonId;
    }

    @NotNull
    public final String getSid() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("season_id", Long.valueOf(this.seasonId));
        jSONObject.put("episode_id", Long.valueOf(this.episodeId));
        return jSONObject.toString();
    }

    public int hashCode() {
        String str = this.appId;
        return Long.hashCode(this.episodeId) + C3554n0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.seasonId);
    }

    public final void setAppId(@Nullable String str) {
        this.appId = str;
    }

    public final void setEpisodeId(long j7) {
        this.episodeId = j7;
    }

    public final void setSeasonId(long j7) {
        this.seasonId = j7;
    }

    @NotNull
    public String toString() {
        String str = this.appId;
        return androidx.exifinterface.media.a.a(this.episodeId, ", episodeId=", ")", com.bilibili.playerbizcommon.features.background.b.a(this.seasonId, "IaaInfo(appId=", str, ", seasonId="));
    }
}
