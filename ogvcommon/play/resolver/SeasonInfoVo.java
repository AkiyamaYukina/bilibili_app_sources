package com.bilibili.ogvcommon.play.resolver;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bilibili.bson.common.Bson;
import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: bili_base.jar:com/bilibili/ogvcommon/play/resolver/SeasonInfoVo.class */
@StabilityInferred(parameters = 1)
@Bson
public final class SeasonInfoVo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("season_id")
    private final long f73220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("season_type")
    private final int f73221b;

    public SeasonInfoVo(long j7, int i7) {
        this.f73220a = j7;
        this.f73221b = i7;
    }

    public final long a() {
        return this.f73220a;
    }

    public final int b() {
        return this.f73221b;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SeasonInfoVo)) {
            return false;
        }
        SeasonInfoVo seasonInfoVo = (SeasonInfoVo) obj;
        return this.f73220a == seasonInfoVo.f73220a && this.f73221b == seasonInfoVo.f73221b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f73221b) + (Long.hashCode(this.f73220a) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sbB = O4.c.b(this.f73221b, this.f73220a, "SeasonInfoVo(seasonId=", ", seasonType=");
        sbB.append(")");
        return sbB.toString();
    }
}
